angular.module("teacher").controller("UserController", function($scope, $http, $routeParams, urlsrv) {

	$scope.people = {};

	$scope.createOrUpdateUser = function() {

		$scope.information = null;

		if ($scope.formUserCreateUpdate.$valid) { // Valid form
			if ($scope.people.id) { // If there is ID then UPDATE
				$http.put(urlsrv + '/people/' + $scope.people.id, $scope.people)
					.success(function () {
						$scope.information = "Welcome " + people.name;
						angular.element('#bntModalSuccess').trigger('click');	
					})
					.error(function(err){
						console.log(err);
						angular.element('#bntModalError').trigger('click');	
					});
			} else { // If there is not ID then INSERTs

				if ($scope.people.email != $scope.people.email2){
					$scope.information = 'Confirm your e-mail ' + $scope.people.email; 
					$scope.people.email2 = '';
					angular.element('#bntModalRequiredField').trigger('click');
					return;
				}

				$http.post(urlsrv + '/people', $scope.people)
					.success(function () {
						angular.element('#bntModalSuccess').trigger('click');	
					})
					.error(function(err){
						console.log(err);
						angular.element('#bntModalError').trigger('click');	
					});
			}
		} else { 
			angular.element('#bntModalRequiredField').trigger('click');
		}
	};
});
