<?php 
    include "conn.php";


    $id = $_GET['id'];

    echo $id;

    $delete = mysqli_query($conn, "DELETE FROM profile WHERE id='$id'");

        if($delete == true){
            ?>
            <script>
                alert("Date has been deleted!");
                window.location.href="records.php";
            </script>
            <?php

        }
        else{
            ?>
            <script>
                alert("No data deleted!");
                window.location.href="records.php";
            </script>
            <?php

        }


?>