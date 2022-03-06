<?php
$link = new MySQLi("localhost","root","","team012");
if($link->connect_error){
	echo "Fail to connect data base";
}
?>