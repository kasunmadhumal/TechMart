<style>
	footer {
    position: absolute;
    bottom: 0;
    left: 0;
    right: 0;
    color: honeydew;
    background-color: black;
    padding-bottom: 20px;
}
.iconRow {
    width: 50%;
    margin-left: 25%;
}
.about {
    margin-top: 15px;
    text-align: center;
    line-height: 200%;

}
.contact h6 {
    margin-left: 30%;
    margin-top: 15px;
    margin-bottom: 15px;
}
.iconRow {
    margin-top: 15px;
}
.icon {
    margin-top: 0;
    right: 0px;
    bottom: 20px;
}
.iconSocialMedia {
    margin-left: 20px;
}
</style>

        <div class="row conten">
            <div class="col-sm-6 about">
                <h6>About us</h6>
                <p class="aboutText">
                    We provide 100% original products with <br>
                    highest quality.We have partnered with <br>
                    AWM moters and toyota lanka. We provide<br>
                    parts for every vehicle brand
                </p>
            </div>
            <div class="col-sm-6 contact">
                <h6>Contact us</h6>
                <div class="row contactRow">
                    <div class="col-sm-2"></div>
                    <i class="fa fa-map-marker col-sm-1 icon" aria-hidden="true"></i>
                    <p class="description col-sm-5">No72, Galle Road, Dehiwala</p>
                </div>
                <div class="row contactRow">
                    <div class="col-sm-2"></div>
                    <i class="fa fa-phone col-sm-1 icon" aria-hidden="true"></i>
                    <p class="description col-sm-5">0710917571</p>
                </div>
                <div class="row contactRow">
                    <div class="col-sm-2"></div>
                    <i class="fa fa-envelope col-sm-1 icon" aria-hidden="true"></i>
                    <p class="description col-sm-5">autolak17@gmail.com</p>
                </div>
<%--				<?php--%>
<%--				$sqlAdmin="SELECT * FROM admin";--%>
<%--				$resultAdmin=$link->query($sqlAdmin);--%>
<%--				while($rowAdmin=$resultAdmin->fetch_array()){--%>
<%--					if($rowAdmin['admin_id']==$_SESSION['loginEmail']){--%>
<%--						$adminStat=1;--%>
<%--						break;--%>
<%--					}--%>
<%--					else{--%>
<%--						$adminStat=0;--%>
<%--					}--%>
<%--				}--%>
<%--				if($adminStat==1){--%>
<%--				?>--%>
				<div class="row contactRow">
                    <div class="col-sm-2"></div>
                    <i class="fa fa-user col-sm-1 icon" aria-hidden="true"></i>
                    <p class="description col-sm-5"><a href="Admin.php">Admin Login</a></p>
                </div>
                <div class="row contactRow">
                    <div class="col-sm-2"></div>
                    <i class="fa fa-user col-sm-1 icon" aria-hidden="true"></i>
                    <p class="description col-sm-5"><a href="Admin.php">Sales Manager</a></p>
                </div>
                <div class="row contactRow">
                    <div class="col-sm-2"></div>
                    <i class="fa fa-user col-sm-1 icon" aria-hidden="true"></i>
                    <p class="description col-sm-5"><a href="Admin.php">wena ekek</a></p>
                </div>
<%--				<?php --%>
<%--				} --%>
<%--				?> --%>

            </div>
        </div>
        <div class="row contactRow iconRow">
            <div class="col-sm-3"></div>
            <i class="fa fa-facebook-official fa-lg col-sm-1 iconSocialMedia" style="color: #4267B2;"  aria-hidden="true"></i>
            <i class="fa fa-instagram col-sm-1  fa-lg iconSocialMedia" style="color: #A0522D;" aria-hidden="true"></i>
            <i class="fa fa-twitter col-sm-1 fa-lg iconSocialMedia" style="color: #1DA1F2;" aria-hidden="true"></i>
            <i class="fa fa-youtube-play col-sm-1 fa-lg iconSocialMedia" style="color: #FF0000;" aria-hidden="true"></i>
        </div>

