angular.module('globalService', ['ngResource'])
.factory('urlsrv',function() {
	return 'http://localhost:8080/teacher-service';
});