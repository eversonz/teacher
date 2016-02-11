angular.module("teacher").controller("PrincipalController", function($scope, $http, $routeParams, urlsrv) {

	$scope.people = {};

	$scope.login = function() {


		if ($scope.formLogin.$valid) { // Valid form

		} else { 
			angular.element('#bntModalRequiredField').trigger('click');
		}


		console.log('login................', urlsrv);
		
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