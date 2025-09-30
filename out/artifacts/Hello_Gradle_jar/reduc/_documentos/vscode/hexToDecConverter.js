// Importa o módulo readline do Node.js
const readline = require('readline');

// Cria uma interface de leitura para receber a entrada do usuário
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Função para validar o número hexadecimal
function validarNumeroHexadecimal(numeroHexadecimal) {
  // Verifica se o número é não negativo
  if (parseInt(numeroHexadecimal, 16) < 0) {
    return false;
  }

  // Verifica se o número contém apenas algarismos de 0 a 9 e letras de A a F (maiúsculas ou minúsculas)
  var regex = /^[0-9A-Fa-f]+$/;
  return regex.test(numeroHexadecimal);
}

// Solicita ao usuário um número hexadecimal válido
function solicitarNumeroHexadecimal() {
  rl.question("Digite um número hexadecimal: ", function(numeroHexadecimal) {
    // Valida o número hexadecimal
    if (validarNumeroHexadecimal(numeroHexadecimal)) {
      // Converte o número hexadecimal para decimal
      var numeroDecimal = parseInt(numeroHexadecimal, 16);

      // Exibe o resultado da conversão
      console.log("O número decimal equivalente é: " + numeroDecimal);

      // Fecha a interface de leitura
      rl.close();
    } else {
      // Valor inválido, solicita novamente
      console.log("Número hexadecimal inválido. Tente novamente.");
      solicitarNumeroHexadecimal();
    }
  });
}

// Inicia o programa solicitando o número hexadecimal
solicitarNumeroHexadecimal();