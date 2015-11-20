'use strict';

angular.module('myApp.view2', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
            $routeProvider.when('/view2', {
              templateUrl: 'app/view2/view2.html',
              controller: 'View2Ctrl'
            });
          }])

        .controller('View2Ctrl', function ($http, $scope) {
          $http({
            method: 'GET',
            url: 'api/footbaalclubs'
          }).then(function successCallback(res) {
            $scope.foot = res.data;
            console.log(res);
          }, function errorCallback(res) {
          });
          
          


        });