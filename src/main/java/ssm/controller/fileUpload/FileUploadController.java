package ssm.controller.fileUpload;

import java.io.*;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import utils.MyException;

@Controller
public class FileUploadController {
    /**
     * 文件上传
     * @param name
     * @param uploadfile
     * @param request
     * @return
     * @throws MyException
     */
    @RequestMapping("/fileUpload")
    @ResponseBody
    public Map<String,Object> handleFormUpload(@RequestParam("name") String name,
                                                            @RequestParam("uploadfile") List<MultipartFile> uploadfile,
                                                    HttpServletRequest request) throws MyException {
        Map<String, Object> map = new HashMap<String, Object>();
        // 判断所上传文件是否存在
        if (!uploadfile.isEmpty() && uploadfile.size() > 0) {
            //循环输出上传的文件
            for (MultipartFile file : uploadfile) {
                if(file.getSize()>1024*10240){
                    System.out.println(MyException.getStackTrace("文件大小超过10M无法上传！"));
                    throw new MyException("文件大小超过10M无法上传！");
                }
                // 获取上传文件的原始名称
                String originalFilename = file.getOriginalFilename();
                // 设置上传文件的保存地址目录
                String dirPath =
                        request.getServletContext().getRealPath("/upload/");
                File filePath = new File(dirPath);
                // 如果保存文件的地址不存在，就先创建目录
                if (!filePath.exists()) {
                    filePath.mkdirs();
                }
                // 使用UUID重新命名上传的文件名称(上传人_uuid_原始文件名称)
                String newFilename = name+ "_"+UUID.randomUUID() +
                        "_"+originalFilename;
                map.put("url", dirPath+newFilename);
                map.put("fileName", newFilename);
                map.put("saveAddress", dirPath);
                try {
                    // 使用MultipartFile接口的方法完成文件上传到指定位置
                    file.transferTo(new File(dirPath + newFilename));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            // 跳转到成功页面
            return  map;
        }else {
            return null;
        }
    }

    /**
     * 文件下载
     * @param request
     * @param response
     * @param filename
     */
    @RequestMapping("/download")
    public void downloadFile(HttpServletRequest request, HttpServletResponse response,
                             String filename){

        String rootDir = request.getSession().getServletContext().getRealPath("/upload/");

        //要保存的目录路径
        String path = rootDir+File.separator;
        File saveDir = new File(path);
        if (!saveDir.exists()) {
            saveDir.mkdirs();// 如果文件不存在则创建文件夹
        }
        //文件路径
        path = path + File.separator + filename;
        File tempFile = new File(path);   //初始化临时文件
        try {
            // 以流的形式下载文件。
            BufferedInputStream fis = new BufferedInputStream(
                    new FileInputStream(path));
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            // 清空response
            response.reset();
            // 设置response的Header
            response.addHeader("Content-Disposition", "attachment;filename="
                    + new String(filename.getBytes()));
            response.addHeader("Content-Length", "" + tempFile.length());
            OutputStream toClient = new BufferedOutputStream(
                    response.getOutputStream());
            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            toClient.write(buffer);
            toClient.flush();
            toClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(tempFile!=null&&tempFile.exists()){
                tempFile.delete();//删除临时文件
            }
        }

    }
}
