angular.module("teacher").controller("PrincipalController", function($rootScope, $scope, $http, $routeParams, urlsrv) {

	$scope.credentials = {
    	username: '',
    	password: ''
  	};

	$scope.login = function() {


		if ($scope.formLogin.$valid) { // Valid form

			$http.get(urlsrv + '/login', $scope.credentials)
				.success(function () {
					angular.element('#bntModalSuccess').trigger('click');	
			})
			.error(function(err){
				console.log(err);
				angular.element('#bntModalError').trigger('click');	
			});

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