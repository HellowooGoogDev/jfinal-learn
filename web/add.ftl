<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>add.ftl</title>

    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

</head>

<body>
<form action="/student/save" method="post">
    学号：
    <input type="text" name="student.studentId" />
    <br/>
    姓名：
    <input type="text" name="student.name" />
    <br />
    年龄：
    <input type="text" name="student.age" />
    <br />
    性别：
    <input type="radio" name="student.sex" value="男" checked="checked" />男
    <input type="radio" name="student.sex"  value="女"/>女
    <br />
    班级：
    <select name="student.courseId">
        <option value ="1">C</option>
        <option value ="2">Java</option>
        <option value ="3">Ruby</option>
    </select>
    <br />
    <input type="submit" value="保存" />
</form>
</body>
</html>