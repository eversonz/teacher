angular.module("teacher").controller("PrincipalController", function($scope	, $http, $routeParams) {

	console.log("carregou... PrincipalController");

	$scope.logout = function() {
		console.log('logout................');
	};

	 function logout() {
		console.log('exec................');
	};


	console.log("carregou... fim PrincipalController");



});