let arr = [1, 7, 3, 2, 12, 2, 4, 5, 4, 6, "", NaN, undefined, "String"];
function getMas(){ 
  let result2 = 0;
  let result1 = 0;
  let result = 0;
  for (let i = 0; i < arr.length; i++) {
    if (typeof arr[i] === "number") {
      if (arr[i] % 2 === 0) {
        result2 += 1;
      } else if (arr[i] % 2 !== 0) {
        result1 += 1;
      } else {
        result += 0;
      }
    } else {
      result += 1;
    }
  }
  console.log(`Количество четных элементов: ${result2}`);
  console.log(`Количество нечетных элементов: ${result1}`);
  console.log(`Количество остальных элементов: ${result}`);
}
getMas();