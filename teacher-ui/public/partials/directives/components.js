angular.module('components',[])
.directive('modalConfirmCancel', function() {

	var ddo = {};
	ddo.restric = 'AE';
	ddo.scope = {
		clickinfo: '@clickinfo', 
		islink: '@islink',
		exec: '&',
		title: '@title', 
		information: '@information'};

	ddo.templateUrl = 'partials/directives/modal-confirm-cancel.html';
	return ddo;
})
.directive('modalSuccess', function() {
	var ddo = {};
	ddo.restric = 'AE';

	ddo.templateUrl = 'partials/directives/modal-success.html';
	return ddo;
})
.directive('modalError', function() {
	var ddo = {};
	ddo.restric = 'AE';

	ddo.templateUrl = 'partials/directives/modal-error.html';
	return ddo;
})
.directive('modalRequiredField', function() {
	var ddo = {};
	ddo.restric = 'AE';
	ddo.templateUrl = 'partials/directives/modal-required-field.html';
	return ddo;
})