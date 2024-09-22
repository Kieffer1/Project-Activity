<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        body {
            background-color: sandybrown;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        form {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            background-color: #de9235;
            text-position: center;
        }
    </style>
</head>
<body>
    
    <div>
        <h1> Welcome to my Login Page! </h1>
        <form action="process.php" method="POST">
    
        <label>Email</label><br>
        <input type="email" name="login_email" required placeholder="Enter your email here!.."><br><br>
    
        <label>Password</label><br>
        <input type="password" name="login_pass" required placeholder="Enter your password here!.."><br><br>
    
        <input type="submit" name="login" value="LOGIN">
    
        </form>
    
        <p style="text-align: center;">
            <a href="reg.php" style="display: inline-block; padding: 10px 20px; background-color: #4CAF50; color: white; text-decoration: none; border-radius: 5px; transition: background-color 0.3s;">Click here to Register!</a>
        </p>
    </div>

</body>
</html>
