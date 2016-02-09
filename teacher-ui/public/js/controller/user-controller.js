angular.module("teacher").controller("UserController", function($scope, $http, $routeParams, urlsrv) {

	$scope.people = {};

	$scope.createOrUpdateUser = function() {

		console.log('createOrUpdateUser................', urlsrv);

		if ($scope.formUserCreateUpdate.$valid) {
			console.log('click................', $scope.people);
		} else {
			console.log('click invalid required................', $scope.people);
		}
	};
});
