
<?php

if(isset($_REQUEST['reviewSub'])){//Get review
	
	$rate=$_REQUEST['rate'];
	$review=$_REQUEST['review'];
	
	if(!empty($rate) && !empty($review)){
		$sqlReview="INSERT INTO review VALUES('$coustemerEmail','$itemId','$review',$rate)";
		$link->query($sqlReview);
		$sqlgenre="UPDATE items SET rating=(SELECT SUM(rating)/ COUNT(user_id) AS Rate FROM review WHERE item_id='$itemId') WHERE item_id='$itemId'";
		$link->query($sqlgenre);
	}
}//end

$sqlGet="SELECT * FROM review WHERE item_id='$itemId'";
$resultGet=$link->query($sqlGet);
?>
<div class="ratingContainer row">
                <div class="reviewContainer col-7">
					<div class="review">
						<h4>Cutomer Reviews</h4>
					<?php 
					while($rowGet=$resultGet->fetch_array()){ ?>   
                            <div class="cutomerReview">
                                <h6><?php echo $rowGet['user_id'];?></h6>
                                <p><?php echo $rowGet['discription'];?></p>
								<b>&emsp;Give Rating as:&emsp;<?php echo $rowGet['rating'];?></b>
                            </div>

					<?php 
					}
					?>
                   </div>
                </div>
                <div class="addRating col-4">
					<form action="<?php echo $_SERVER['PHP_SELF']?>">
						<input type="hidden" name="itemId" value="<?php echo $itemId; ?>">
						<input type="hidden" name="path1" value="<?php echo $_SESSION['path1']; ?>">
						<input type="hidden" name="path2" value="<?php echo $_SESSION['path2']; ?>">
                        <div class="rating row">
                            <p class="col-6">Rate this product</p>
							<div class="addReview">
							<table>
								<tr>
									<th>1</th><th>2</th><th>3</th><th>4</th><th>5</th>
								</tr>
								<tr>
									<td><input type="radio" name="rate" value="1"></td>
									<td><input type="radio" name="rate" value="2"></td>
									<td><input type="radio" name="rate" value="3"></td>
									<td><input type="radio" name="rate" value="4"></td>
									<td><input type="radio" name="rate" value="5"></td>
								</tr>
							</table>
							</div>
                        </div>
                        <div class="addReview">
                            <p>Add a review</p>
                            <input type="text" name="review" class="input">
                        </div>
						<div class="addReview">
                            <input type="submit" name="reviewSub" class="btn btn-info">
                        </div>
						
					</form>
                </div>
            </div>