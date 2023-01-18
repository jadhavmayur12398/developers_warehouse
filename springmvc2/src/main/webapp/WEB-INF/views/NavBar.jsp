<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student details</title>
</head>
<style>
    #m{
        border: 1px solid;
        width: 100%;
        height: 20%;
        display: flex;

    }
    .s{
        /* border: 1px solid; */
        width: 8%;
        height: 20%;
        padding: 3%;
    }
</style>
<body>
<div id="m">
        <div class="s"><a href="./home"> Home</a></div>
        <div class="s"><a href="./login"> Add Student</a></div>
        <div class="s"><a href="./remove"> Remove Student</a></div>
        <div class="s"><a href="./search"> Search Student</a></div>
        <div class="s"><a href="./update"> Update Student</a></div>
        <div class="s"><a href="./logout"> Logout</a></div>
    </div>
</body>
</html>