<?php
header('Content-Type: text/xml');
echo '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>'; 
echo '<response>';
$name=$_GET['name'];
echo $name;
echo '</response>';
?>