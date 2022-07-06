<%--
  Created by IntelliJ IDEA.
  User: activ
  Date: 7/6/2022
  Time: 8:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Frame</title>
</head>
<body>
<h1>Add Frames</h1>
<form>
    <label>
        Frame Code:
        <input type="text" name="frame_code" placeholder="Enter frame code.">
    </label>
    <label>
        Frame Rate:
        <input type="text" name="frame_code" placeholder="Enter frame code.">
    </label>
    <label>
        Frame Width:
        <input type="text" name="frame_code" placeholder="Enter frame code.">
    </label>
    <label>
        Frame type:
        <select>
            <option value="None"></option>
            <option value="wooden"></option>
            <option value="fiber"></option>
            <option value="plastic"></option>
        </select>
    </label>
    <label>
        Frame image:
        <input type="file" name="frame_image" placeholder="Frame">
    </label>
    <label><input type="submit" value="insert">Insert</label>
</form>
</body>
</html>
