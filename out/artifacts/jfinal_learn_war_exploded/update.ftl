<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>index2.html</title>

    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

</head>

<body>
<form action="/student/update" method="post">
    <br />
    学号：
    <input type="text" name="student.studentId" value="${student.studentId}"/>
    <br />
    姓名：
    <input type="text" name="student.name"  value="${student.name}"/>
    <br />
    年龄：
    <input type="text" name="student.age" value="${student.age}"/>
    <br />
    性别：
    <input type="text" name="student.sex" value="${student.sex}"/>
    <br />
    班级：
    <input type="text" name="student.courseId" value="${student.courseId}" />
    <br />
    <input type="submit" value="保存" />
</form>

</body>
</html>