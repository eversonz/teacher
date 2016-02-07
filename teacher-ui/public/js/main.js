angular.module('teacher', ['ngRoute', 'ngResource', 'components'])
.config(function($routeProvider, $locationProvider){

	//$locationProvider.html5Mode(true);


	$routeProvider.when('/principal', {
		templateUrl: "partials/index/login.html",
		controller: "PrincipalController"
	});
	

	$routeProvider.otherwise({redirectTo: '/principal'});

});
