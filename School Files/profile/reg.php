<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <style>
        body {
            background-color: sandybrown;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            flex-direction: column;
        }
        h1 {
            text-align: center;
            margin-top: 50px;
        }
        form {
            background-color: white;
            padding: 50px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            background-color: #de9235;
        }
    </style>
</head>
<body>
    
    <h1> Registration Form</h1>

    <form action="process.php" method="POST">
        <label>Name:</label><br>
        <input type="text" name="nm" required><br>

        <label>Email:</label><br>
        <input type="email" name="email" required><br>
        
        <label>Password:</label><br>
        <input type="password" name="pass" required><br>

        <label>Phone Number:</label><br>
        <input type="text" name="pn" required><br>

        <input type="submit" name="reg_button" value="REGISTER">
    </form>

    <p style="text-align: center;">
            <a href="index.php" style="display: inline-block; padding: 10px 20px; background-color: #4CAF50; color: white; text-decoration: none; border-radius: 5px; transition: background-color 0.3s;">Click here to Login!</a>
        </p>

</body>
</html>
