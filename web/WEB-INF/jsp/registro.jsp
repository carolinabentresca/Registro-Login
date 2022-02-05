<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body style="background: #333333;color: #ffffff">
        <h3>Registro</h3>
        <hr style="background: #ffffff"/>
        <br/>
    <center>
        <form action="registro.htm" method="POST">
            Usuario (*) <br/>
            <input type="text" name="usuario"  placeholder="" required="required" style="font-size: 18px" /><br/>
            Email (*)<br/>
            <input type="email" name="email"  placeholder="" required="required"  style="font-size: 18px"/><br/>
            Password (*)<br/>
            <input type="password" name="password"  placeholder="" required="required"  style="font-size: 18px" /><br/>
            <br/>
            <input type="submit" value="Registrar"  style="background: #ff9900;color: #ffffff;font-size: 18px"/>
            <br/>
            <br/>     
            <h6>(*) Campos Obligatorios</h6>
        </form>
    </center>
</body>
</html>
