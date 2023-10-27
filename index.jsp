<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tervetuloa Prisma-IT projekteihin</title>
</head>
<body>
    <h1>Tervetuloa Prisma-IT projekteihin</h1>
    <form action="/ProjektiServlet" method="post">
        Anna projektin numero: <input type="text" name="projektiNumero"><br>
        <input type="submit" value="Tarkista projektikoodi">
    </form>
</body>
</html>
