<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
     "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>入门程序</title>
</head>
<body>
     ${msg}
</body>

<c:forEach items="${itemList}" var="item" varStatus="status">
     <tr>
          <td> <input type="hidden" name="itemList[${status.index}].itemsId" value="${item.itemId}"/></td>
          <td> <input type="text" name="itemList[${status.index}].itemsName" value="${item.itemsName}"/></td>
     </tr>
</c:forEach>


</html> 
