<%--
  Created by IntelliJ IDEA.
  User: gokturksigirtmac
  Date: 4.07.2023
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bulutmd</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap">
    <style>
        body {
            font-family: 'Roboto', sans-serif;
        }

        /* Form Styles */
        .form-container {
            border-radius: 16px;
            background: #FFF;
            padding: 20px;
            font-size: 14px;
            margin: 10px auto;
            max-width: 600px;
        }

        .form-container input[type="text"],
        .form-container input[type="number"],
        .form-container input[type="email"],
        .form-container textarea,
        .form-container select,
        .form-container input[type="date"] {
            border: none;
            border-radius: 16px;
            background: #F2F3F4;
            padding: 10px;
            font-size: 14px;
            margin-bottom: 10px;
            width: 100%;
        }

        .form-container input[type="checkbox"] {
            margin-bottom: 10px;
        }

        .form-container textarea {
            resize: vertical;
        }

        .form-container input[type="submit"] {
            border: none;
            border-radius: 16px;
            background: #000;
            color: #FFF;
            padding: 10px 20px;
            font-size: 14px;
            cursor: pointer;
            display: block;
            margin: 0 auto;
            width: 50%;
        }

        /* Responsive Styles */
        @media (max-width: 576px) {
            .form-container {
                width: 100%;
                margin: 10px 15px;
                padding: 30px;
            }
        }

        @media (min-width: 768px) {
            .form-container {
                width: 100%;
                margin: 10px auto;
                padding: 30px;
            }
        }

        @media (min-width: 992px) {
            .form-container {
                max-width: 600px;
            }
        }
        /*    We can extends and customize our screen design for other screen size such as 992, 1200 and etc.*/

    </style>
</head>
<body>
    <div class="form-container">
        <h1>Bayi üyelik formu</h1>
        <form action="/submitRetailApplicationForm" method="post">
            <input type="text" name="name" placeholder="İsim" required style="margin-top: 10px;"><br>
            <input type="text" name="surname" placeholder="Soyisim" required><br>
            <input type="number" name="identityNumber" placeholder="T.C. Kimlik numarası" minlength="11" maxlength="11" required><br>
            <textarea name="address" placeholder="Adres" required></textarea><br>
            <input type="email" name="email" placeholder="Email" required><br>
            <input type="number" name="phone" placeholder="Telefon numarası" minlength="11" maxlength="11" required><br>
            <div>
                <span>Doğum Tarihi</span>
                <input type="date" name="birthDay" placeholder="Doğum Tarihi" required>
            </div>
            <div>
                <label for="retail">Daha önce parakende ticareti ile uğraştınız mı?</label>
                <input type="checkbox" name="didRetail" id="retail"><br>
            </div>
            <textarea name="whyUs" placeholder="Lokumcu babayı tercih etme sebeiniz nedir?" required></textarea><br>
            <input type="text" name="location" id="location" placeholder="Lokumcu babayı hangi il, ilçede açmayı planlıyorsunuz?"><br>
            <input type="number" name="equityAmount" placeholder="Yatırım miktarınız nedir (TL cinsinden)" required><br>
            <textarea name="additionalInformation" placeholder="Eklemek istedikleriniz"></textarea><br>

            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
