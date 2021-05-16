# SOLID

I´m using this project to train SOLID principle:

+ Single Responsability Principle. / Melhorando a coesão

A classe deve possuir uma única responsabilidade dentro do software.

Por exemplo ordem de compra:
fazer impressão, enviar e-mail, 

Fazer várias classes com o mesmo nome, porém com suas funcionalidades em classes separadas.

Fazer uma ordem de compra java:
Transforma cada uma das classes para ter uma responsabilidade.
OrdemdeCompra
OrdemdeCompraMail
OrdemdeCompraPrint


+ Open-Closed Principle / Reduzindo o Acoplamento

Você deve poder estender um comportamento de class, sem modifica-lo.

Objetos devem estar abertos para extensão, mas fechados para modificação.

Quando novos comportamentos precisam ser adicionados no software,
devem estender e não alterar o código da classe.

Evitar de adicionar novos metodos na mesma classe.

Solução: utilizar interface e fazer implements para cada caso

Ao invés de criar uma classe que tem todos os atributos como 
desconto para cada tipo de livro.

Criamos uma interface padronizada para retorno.
Um controlador que faz o calculo
E as novas classes implementam a interface.



+ Liskov Substitution Principle / Herança
//Se parece como um pato, e faz "quack" como um pato, mas usa pilhas. 
//Então você está usando uma abstração errada.

Se para cada objeto o1 do tipo S há um objeto 02 do tipo Transforma de forma que,
para todos os Programas P, o comportamento de P é inalterado quando o o1 é substituito por o2, então S é um subtipo de T.

Embora a herança favoreça o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da maneira correta;
Que o Princípio de Substituição de Liskov (LSP) diz que devemos poder substituir classes base por suas classes derivadas em qualquer lugar, sem problema.



+ Interface Segregation Principle

Uma classe não deve ser forçada a implementar interfaces e métodos que não serão utilizados.
É melhor criar interfaces mais específicas ao invés de termos uma única interface genérica.

Por exemplo ave nem todas elas sabem voar.
Ave pato voa mas pinguem não.
Para solucionar esses erros, fazer interface com atributos globais.
E cria nova interface com situações espeficas.
Na classe criada tu extende as interfaces necessárias para utilizar.



+ Depedency Inversion Principle
Um módulo de alto nível não deve depender de módulos de baixo nível,
ambos devem depender da abstração.

"Abstrações não devem depender de implementações, 
implementações que devem depender de abstrações."

Exemplo: interface ValidacaoReajuste com suas 2 classes de validacao, você pode 
criar mais classes que dependam da ValidacaoReajuste que não vai quebrar e respeitar.

