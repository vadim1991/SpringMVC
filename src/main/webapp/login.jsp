<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>LOGIN_TITLE</title>
    <link rel="shortcut icon" href="favicon.png">
    <link href="css/login.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.1.min.js"></script>
</head>
<body>
<div class='form animated flipInX'>
    <div class='switch'>
        <i class='fa fa-pencil fa-times'></i>

        <a href="/registration">
            <div class='tooltip animated rubberBand infinite'>REGISTRATION_LINK</div>
        </a>
    </div>
    <div class='login'>
        <h2>LOGIN_FORM_TITLE</h2>

        <form action="login" method="post">
            <label class="error-label">${success}</label>
            <label class="error-label">${error}</label>
            <input placeholder='PL_LOGIN_FORM' type='text'>
            <input placeholder='PL_PASSWORD_FORM' type='password'>
            <button>BTN_LOGIN_TITLE</button>
        </form>
    </div>
</div>
</body>
</html>