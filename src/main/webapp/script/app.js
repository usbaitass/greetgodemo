setInterval(()=>{
    const output = document.getElementById("data1");
    $.ajax({
        url: "http://localhost:8080/hello", success: function (result) {
            output.innerHTML = result;
        }
    });
},1000);

