function calcularFatorial(numero) {
    if (numero === 0 || numero === 1) {
      return 1;
    }
    
    let resultado = 1;
    for (let i = 2; i <= numero; i++) {
      resultado *= i;
    }
    
    return resultado;
  }
  
  const numero = 10;
  const fatorial = calcularFatorial(numero);
  console.log(`O fatorial de ${numero} é ${fatorial}.`);
  