function number(a) {
    if (a < 1000 && a > 1) {   
      for ( let i = 2; i < a; i++) {
        if (a % i === 0) {
          return `${a} - Является простым числом`;
        } 
        return `${a} - Не является простым числом`; 
      }
    }
  }
  console.log(number(5));