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

	$scope.submitRegister = function() {
		
		console.log("register start");

		$http({
			method : "GET",
			url : "register/confirm",
			headers: {'Content-type': 'application/json;charset=UTF-8'},
			params : {
				'registerEmail' : 'jessetest'
			}
		}).success(function(data, status) {
			console.log("success");
		}).error(function(data, status) {
			console.log("failed");
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