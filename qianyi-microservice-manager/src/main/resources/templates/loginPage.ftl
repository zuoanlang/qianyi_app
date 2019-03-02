<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="../css/e3.css" />
    <link rel="stylesheet" type="text/css" href="../css/default.css" />
    <script type="text/javascript" src="../js/jquery-easyui-1.4.1/jquery.min.js"></script>
    <#--<script type="text/javascript" src="../js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>-->
</head>
<body >
    <div >
        <form class="login-background" id="loginForm" action="/manager/login" method="post">
            <input type="text" name="username" size="35px" id="userName" />
            <br>
            <input type="password" name="password" size="35px" id="password" />
            <br>
            <span id="resultMessage" class="resultMessage" >${result}</span>
            <input type="submit" id="submit">
        </form>

    </div>
</body>
<script>
    $(function () {
        $("#userName,#password").click(function () {
            $("#resultMessage").text("")
        })
    })
</script>
</html>