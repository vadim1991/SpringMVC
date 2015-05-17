<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>REGISTRATION_TITLE</title>
    <link rel="shortcut icon" href="favicon.png">
    <link href="css/login.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.1.min.js"></script>
    <style>.letter {
        color: red;
        font-size: 14pt;
    } </style>
</head>
<body>
<div class='form animated flipInX'>
    <div class='switch'>
        <i class='fa fa-pencil fa-times'></i>
    </div>
    <div class='login'>
        <h2>REGISTRATION_FORM_TITLE</h2>

        <form:form action="/registration" method="POST" modelAttribute="user">
            <span class="letter"><form:errors cssClass="letter" path="name"></form:errors></span>
            <input type="text" name="name" placeholder="name">
            <span class="letter"><form:errors cssClass="letter" path="password"></form:errors> </span>

            <input placeholder='PL_RE_PASSWORD_FORM' name="password" type='password'>

            <button>BTN_REGISTRATION_TITLE</button>
        </form:form>
    </div>
</div>
</body>
</html>