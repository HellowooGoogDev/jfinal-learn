<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>首页</title>

    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

</head>

<body>
<a href="/student/add">添加</a>
<table border="1">
    <tr>
        <td>
            学号
        </td>
        <td>
            姓名
        </td>
        <td>
            年龄
        </td>
        <td>
            性别
        </td>
        <td>
            班级
        </td>
        <td>
            操作
        </td>
    </tr>
<#list studentList as student>
    <tr>
        <td>
        ${student.studentId}
        </td>
        <td>
        ${student.name}
        </td>
        <td>
        ${student.age}
        </td>
        <td>
        ${student.sex}
        </td>
        <td>
        ${student.getCourse().name}
        </td>
        <td>
            <a href="/student/delete/${student.studentId}">删除</a>
            <a href="/student/get/${student.studentId}">修改</a>
        </td>
    </tr>
</#list>

</table>
</body>
</html>