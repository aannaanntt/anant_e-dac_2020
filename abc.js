document.write("hello Edac"); // this will show output on the body of the pagr
console.log("hello Edac"); //this will show output on the console...
var a=10; 
var a="Hello Edac"; //this will print the next value that is assigned to it in this case it is string
a=20;
document.write("<br>");
document.write(a);

const b=30;
//b ="Hello Edac" //the value cannot be changed in case of const
//const b=40; //this will not give any output we cannot  reinitialize the variable declared by const
document.write("<br>");
document.write(b);


let c=50;
//c="Hello Edac" //value can be changed in case of let
//let c="Hello Edac" //re intitialization cannot be done in this
document.write("<br>");
document.write(c);


//Array declaration
var a=["Anant","Atul","Amit"]
document.write("<br>");
document.write(a);



//object declaration
var p=({Name: "Anant", 
Rollno:"16"});
document.write("<br>");
console.log(p);

/*---------------------------------- Demonstration of different String Methods in JavaScript------------------------------------------*/


var stringOne="Hey there! I am using WhatsApp"
var stringTwo="frontend and backend development"

//charAt
document.write(stringOne.charAt(1))

//charCodeAt
document.write("<br>");
document.write(stringOne.charCodeAt(5)) //defines the unicode of characterSet


// concat()
document.write("<br>");
document.write(stringOne.concat(stringTwo)) //it concats 2 strings

//endsWith
document.write("<br>");
document.write(stringOne.endsWith(p)) //it checks whether it ends with a particular 


//fromCharCode
document.write("<br>");
document.write(String.fromCharCode(114))  //this converts character code to values



//includes
document.write("<br>");
document.write(stringTwo.includes("development"))  //this checks that a particular string is in  thr string  or not



//indexOf
document.write("<br>");
document.write(stringTwo.indexOf("end"))    //first ocurance of the specified value 


//lastIndexOf()
document.write("<br>");
document.write(stringTwo.lastIndexOf("end"))  //LAST FOUND OCCUREMCE OF a character

//match
document.write("<br>");
document.write(stringTwo.match(/end/g))  

//repeat
document.write("<br>");
document.write(stringTwo.repeat(5)) //it repeats the given string to the given number

//replace
document.write("<br>");
document.write(stringTwo.replace(/end/g,"END"))

//search
document.write("<br>");
document.write(stringTwo.search("end"))  //search for a particular value


//slice
document.write("<br>");
document.write(stringTwo.slice(2,4))  //it slices the string anf returns the new string

//split
document.write("<br>");
document.write(stringTwo.split( ))   //it converts array to string


/*startsWith()
document.write("<br>");
document.write(stringOne.startsWith("H")) */


//substr
document.write("<br>");
document.write(stringTwo.substr(2,6)) //kind of like slice

//substring
document.write("<br>");
document.write(stringTwo.substring(2,5))  //same as substr

//toLowerCase
document.write("<br>");
document.write(stringTwo.toLowerCase())  //converts to lower case

//toUpperCase
document.write("<br>");
document.write(stringTwo.toUpperCase())


//trim
var t="                   Hello Edac             "
document.write("<br>");
document.write(t)
document.write("<br>");
document.write(t.trim()) //removes the white spaces











