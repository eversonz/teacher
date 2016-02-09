angular.module("teacher").controller("MonitorController", function($scope, $http, $routeParams, urlsrv) {

	$scope.monitor = {};

	$scope.searchPrincipalMonitor = function() {

		if ($scope.formSPrincMonitor.$valid) {
			console.log('click................', $scope.monitor);
		} else {
			console.log('click invalid required................', $scope.monitor);
		}


	};
});
