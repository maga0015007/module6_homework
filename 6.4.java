const num = function(a, b){
    let i = a
    for (i; i <= b; i++)
      console.log(i)
  }
  const intervalId = setInterval(num, 1000, 4, 8)
  setTimeout(function(){
    clearInterval(intervalId)
  }, 2000)