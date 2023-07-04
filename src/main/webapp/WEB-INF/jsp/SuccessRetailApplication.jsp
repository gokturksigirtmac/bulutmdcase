<%--
  Created by IntelliJ IDEA.
  User: gokturksigirtmac
  Date: 4.07.2023
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
    <style>
        body {
            background-color: #f1f1f1;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            text-align: center;
            background-color: #fff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .success-icon {
            font-size: 60px;
            color: #4CAF50;
            margin-bottom: 20px;
        }

        h1 {
            font-size: 24px;
            margin-bottom: 10px;
        }

        p {
            font-size: 16px;
            margin-bottom: 20px;
            color: #888;
        }

    </style>
</head>
<body>
<div class="container">
    <i class="success-icon">&#10004;</i>
    <h1>Form Başarıyla Kaydedildi</h1>
    <p>Başvurun bize ulaştı ${user}, değerlendirip geri dönüş yapacağız.</p>
</div>
</body>
</html>
