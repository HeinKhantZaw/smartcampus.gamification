var app = angular.module('gamificationEngine', ['ngRoute', 'ui.bootstrap', 'localization']);

app.config(
  function ($routeProvider) {
    $routeProvider.when('/login', {
      templateUrl: 'templates/login.html',
      controller: 'LoginCtrl'
    })

    .when('/home', {
      templateUrl: 'templates/home.html',
      controller: 'HomeCtrl'
    })

    .otherwise({
      redirectTo: '/login'
    });
  }
);
