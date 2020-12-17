package utils;

import org.apache.commons.lang.exception.ExceptionUtils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class MyException extends Exception {

    public MyException(String s) {

    }

    /**
     * 获取异常的堆栈信息
     *
     * @param t
     * @return
     */
    public static String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        try {
            t.printStackTrace(pw);
            return sw.toString();
        } finally {
            pw.close();
        }
    }

    public static String getStackTrace(String string) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        try {
            new Throwable(string).printStackTrace(pw);
            return sw.toString();
        } finally {
            pw.close();
        }
    }
}
