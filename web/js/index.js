/**
 * 
 * controller js for index.jsp
 * 
 * @author: Jesse.Chen
 */

var app = angular.module('dms', []);
app.controller('IndexController', function($scope, $http) {

	$scope.showLogin = function() {
		$scope.isLoginNeeded = true;
		$scope.isLogin = true;
		$scope.isRegister = false;
		$scope.contentTitle = "Log In";
	};

	$scope.showRegister = function() {
		$scope.isLoginNeeded = true;
		$scope.isRegister = true;
		$scope.isLogin = false;
		$scope.contentTitle = "Register";
	};
	
	$scope.removeMessage = function(index){
		$scope.errorMessages.splice(index, 1);
	};

	$scope.submitRegister = function() {
		
		console.log("register start");
		$scope.isShowLoading = true;
		$http({
			method : "GET",
			url : "register/confirm",
			headers: {'Content-type': 'application/json;charset=UTF-8'},
			params : {
				'registerEmail' : $scope.registerEmail
			}
		}).success(function(data, status) {
			$scope.errorMessages.push("Your password has been sent to your email, please check.");
			$scope.isShowLoading = false;
		}).error(function(data, status) {
			$scope.errorMessages.push("error happened during sending email, please contact your admin.");
			$scope.isShowLoading = false;
		});
	};

	// initial function once the index loaded
	(function() {
		$scope.isShowLoading = false;
		$scope.isLoginNeeded = false;
		$scope.isLogin = false;
		$scope.isRegister = false;
		$scope.contentTitle = "";
		$scope.errorMessages = [];
		$scope.showLogin();
	})();

});