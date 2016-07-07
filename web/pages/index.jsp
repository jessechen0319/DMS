<!DOCTYPE html>
<html>
<head>

<script src="js/lib/angular.min.js"></script>
<script src="js/index.js"></script>
<script src="js/lib/jquery.min.js"></script>
<script src="js/lib/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/index.css" />
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="js/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="js/css/bootstrap-theme.min.css" />
<title>Device Management System</title>
</head>

<body ng-app="dms" ng-controller="IndexController">

	<div class="page-title">Device Management System</div>
	<div class="error-message-container">
		<div class="errorMessage">
			Please input email address
		</div>
		<div class="errorMessage">
			Please input user name
		</div>
	</div>

	<div class="main-container login" ng-show="isLoginNeeded">
	
		<div class="content">
			<div class="content-title">{{contentTitle}}</div>
			<div ng-show="isLoginNeeded && isLogin" class="full-content">
				<input type="text" class="form-control login-name" name="loginName" placeholder="Login Name" />
				<input type="password" class="form-control login-password" name="loginPassword" placeholder="Login Password" />
				<input type="button" class="form-control login-submit" ng-click="submitLogin()" value="Log In" />
			</div>
			
			<div ng-show="isLoginNeeded && isRegister" class="full-content">
				<input type="email" class="form-control register-email" name="registerEmail" placeholder="Official Email Address" />
				<input type="button" class="form-control register-submit" ng-click="submitRegister()" value="Register" />
			</div>
			
		</div>
		
		<div class="menu">
			<div class="menus">
				<div class="menu-item" ng-click="showLogin()">
					Log In
				</div>
				<div class="menu-item" ng-click="showRegister()">
					Register
				</div>
			</div>
		</div>
		
		<div class="loading" ng-show="isShowLoading">loading...</div>
	</div>
	
	<!-- template for main container --> 
	<!-- <div class="main-container">
		<div class="content"></div>
		<div class="menu"></div>
		<div class="loading" ng-show="isShowLoading">loading...</div>
	</div> -->

</body>

</html>