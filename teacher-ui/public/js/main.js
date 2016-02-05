angular.module('teacher', ['ngRoute', 'ngResource'])
.config(function($routeProvider, $locationProvider){

	$locationProvider.html5Mode(true);


	$routeProvider.when('/principal', {
		templateUrl: "partials/principal.html",
		controller: "PrincipalController"
	});
	

	$routeProvider.otherwise({redirectTo: '/'});

});
