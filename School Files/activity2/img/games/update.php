<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        include "conn.php";
        $id = $_GET['id'];

        $get_data = mysqli_query($conn, "SELECT * FROM profile WHERE id='$id'");
        while($row= mysqli_fetch_object($get_data)){
            $email = $row -> email;
            $password = $row -> password;
        }
        ?>

        <h1>Update Profile</h1>
        <form action="process.php?id=<?php echo $id;?>"method="POST">
            <label for="">Email</label><br>
            <input type="email" name="email" required value="<?php echo $email?>"><br>

            <label for="">Password</label><br>
            <input type="password" name="password" required value="<?php echo $password?>"><br>
            <br>
            <input type="submit" name="update_profile" value="UPDATE">


    </form>
    
</body>
</html>