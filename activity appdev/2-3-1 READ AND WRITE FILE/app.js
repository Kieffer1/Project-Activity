const fs = require('fs');

//read file

const sample = fs.readFileSync('sample.txt', 'utf-8');
console.log(sample);

//write file
fs.writeFileSync("mysample.txt", "Nescafe! Taste The chill");