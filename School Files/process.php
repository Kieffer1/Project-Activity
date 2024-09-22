<?php 
    include "conn.php";

    if(isset($_POST['user_profile'])){
        
        $fn = $_POST['fn'];
        $email = $_POST['email'];

        $val = mysqli_query($conn, "SELECT * FROM ren WHERE email = '$email'");
        $val_num = mysqli_num_rows($val);

        if($val_num>=1){
            ?>
            <script>
                alert("The email has already been used!");
                window.location.href="index.php";
            </script>
            <?php
        }

        else{
            $insert = mysqli_query($conn, "INSERT INTO ren VALUES ('0', '$fn', '$email')");

                if($insert == true){
                    ?>


                    <script>
                        alert("Successfully Added!");
                        window.location.href="records.php";
                    </script>

                    <?php
                }

                else{
                    ?>
                    <script>
                        alert("Unsuccesfull!");
                        window.location.href="index.php";
                    </script>
                    <?php
                }
        }
    }

        if(isset($_POST['update_profile'])){
        
        $id= $_GET['id'];
        $fn = $_POST['fn'];
        $email = $_POST['email'];

        $update = mysqli_query($conn, "UPDATE ren set fn='$fn', email='$email', WHERE Id='$id'");

            if($update == true){
                ?>
                <script>
                        alert("Data updated!");
                        window.location.href="records.php";
                    </script>
               <?php
            }
            else{
                ?>
                <script>
                        alert("Unsuccesfull!");
                        window.location.href="records.php";
                
                    </script>
            <?php
            }

        }


?>