Sistema Bancário - Orientação a Objetos

Desenvolva um mini sistema bancário em Java utilizando conceitos de Programação Orientada a Objetos, como criação de classes, encapsulamento, construtores e sobrecarga de métodos.

Ao iniciar o programa, o sistema deve solicitar ao usuário os dados para cadastrar uma conta bancária: agência, número da conta, nome do cliente e saldo inicial. Após o cadastro, o programa deve exibir um menu de operações, permitindo que o usuário realize depósitos, saques e visualize o saldo da conta, repetindo o menu até que seja digitada a opção 0 (sair).

O sistema deve respeitar as seguintes regras: no saque, caso o usuário não informe um valor, deve ser considerado R$ 49,90 como valor padrão. Também deve existir um método de saque com antecipação, no qual o usuário informa o número de dias de antecipação e é aplicada uma taxa de 10% sobre o valor do saque para cada dia informado. Não é permitido sacar um valor maior que o saldo disponível na conta.

Para depósitos, não é permitido depositar valores menores que R$ 5,00. Além disso, após o quinto depósito realizado, cada novo depósito deve cobrar uma taxa adicional de R$ 2,99.

### Desafio: implemente também uma funcionalidade de transferência entre contas, garantindo que não seja possível transferir valores maiores que o saldo disponível.
