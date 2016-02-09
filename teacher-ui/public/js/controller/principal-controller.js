angular.module("teacher").controller("PrincipalController", function($scope, $http, $routeParams, urlsrv) {

	$scope.people = {};

	$scope.login = function() {



		console.log('login................', urlsrv);

		if ($scope.formLogin.$valid) {
			console.log('click................', $scope.people);
		} else {
			console.log('click invalid required................', $scope.people);
		}
		
	};	

	$scope.logout = function() {
		console.log('logout................');
	};
	
	$scope.resetPassws = function() {
		
		console.log('resetPassws................');

		if ($scope.formResetPasswd.$valid) {
			console.log('click................', $scope.people);
		} else {
			console.log('click invalid required................', $scope.people);
		}

	};		

});