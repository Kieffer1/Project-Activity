const greet = require('./myfunction.js')
const getdata = require('./user_details.js')

greet(getdata.name1)
greet(getdata.name2)
greet(getdata.name3)