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

});