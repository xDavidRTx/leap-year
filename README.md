# Leap Year Public API

This is just a simple and quick exercise that I did in less than 2 hours to showcase my scala coding “skills” after a suggestion to solve this simple problem:

[CodeWars Leap Year](https://www.codewars.com/kata/526c7363236867513f0005ca)

As this was too simple to solve I overengineered an API that gets a year and queries a public API from RapidAPI to put some trivia on top of the leap year output.

To showcase this API I deployed this project to heroku. You can try it for yourself by putting in your browser this url https://leapyearapi.herokuapp.com/leap/2004 where the 2004 can be replaced for an integer that can be positive or negative (BC years)

To run this locally you need to get an authentication key from rapid api and paste it on the application.conf file

PS: As I’m using the free plan from heroku your first query can take some time as the app is put into sleep after some idle time 
