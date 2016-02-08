angular.module("teacher").controller("MonitorController", function($scope, $http, $routeParams) {

	$scope.people = {};

	$scope.createOrUpdateUser = function() {

		console.log('createOrUpdateUser................');

		if ($scope.formUserCreateUpdate.$valid) {
			console.log('click................', $scope.people);
		} else {
			console.log('click invalid required................', $scope.people);
		}
	};
});
