angular.module('teacher', ['ngRoute', 'ngResource', 'components', 'globalService'])
.config(function($routeProvider, $locationProvider){

	//$locationProvider.html5Mode(true);


	$routeProvider.when('/principal', {
		templateUrl: "partials/index/login.html",
		controller: "PrincipalController"
	});
	
	$routeProvider.when('/user', {
		templateUrl: "partials/user/create-update.html",
		controller: "UserController"
	});

	$routeProvider.when('/monitor/principal', {
		templateUrl: "partials/monitor/principal.html",
		controller: "MonitorController"
	});

	$routeProvider.otherwise({redirectTo: '/principal'});

});
