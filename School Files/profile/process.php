<?php
    include "conn.php";
    session_start();

if(isset($_POST['reg_button'])){

    $name=$_POST['nm'];
    $email=$_POST['email'];
    $pass=$_POST['pass'];
    $pn=$_POST['pn'];

    $insertusers=mysqli_query($conn, "INSERT INTO profile VALUES('0','$name','$email','$pass','$pn')");

    if($insertusers==true){
        ?>
        <script>
            alert("Your Registration was Successful!");
            window.location.href="index.php";
        </script>
        <?php
    }else{
        ?>
        <script>
            alert("Error Registration\nTry Again!");
            window.location.href="reg.php";
        </script>
        <?php
    }

}


if(isset($_POST['login'])){
    $email=$_POST['login_email'];
    
    $pass=$_POST['login_pass'];

    $Check = mysqli_query($conn, "SELECT * FROM profile WHERE email='$email' AND password='$pass'");

    $num = mysqli_num_rows($Check);

    if($num >=1){

        $_SESSION['email']=$email;
        ?>
        <script>
            alert("Account Accepted! Welcome Users!");
            window.location.href="userhome.php";
        </script>
        <?php
    }else{
        ?>
        <script>
            alert("Email or Password not found!");
            window.location.href="index.php";
        </script>
        <?php


    }

}