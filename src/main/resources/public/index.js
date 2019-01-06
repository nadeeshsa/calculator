function onAdd(){

let a = document.getElementById("a").value;
let b = document.getElementById("b").value;

      let url2 = "/add?a=" + a + "&b=" + b;

      //Fetch the content of the url using the XMLHttpRequest object
      let req2 = new XMLHttpRequest();
      req2.open("GET", url2);
      req2.send(null);

      //register an event handler function
      req2.onreadystatechange = function () {

          if (req2.readyState === 4 && req2.status === 200) {
              let response = req2.responseText;
              const answers = JSON.parse(response);

            console.log(answers.result)

            document.getElementById("ans").innerHTML = answers.result;


          }
      }

}