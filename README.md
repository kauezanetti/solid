Coesão:<br />
Uma classe coesa faz bem uma única coisa<br />
Classes coesas não devem ter várias responsabilidades<br />
<br />
Encapsulamento:<br />
Getters e setters não são formas eficientes de aplicar encapsulamento<br />
É interessante fornecer acesso apenas ao que é necessário em nossas classes<br />
O encapsulamento torna o uso das nossas classes mais fácil e intuitivo<br />
<br />
Acoplamento:<br />
Acoplamento é a dependência entre classes<br />
Acoplamento nem sempre é ruim, e que é impossível criar um sistema sem nenhum acoplamento<br />
Devemos controlar o nível de acoplamento na nossa aplicação (falaremos mais sobre isso)<br />
<br />
<br />
[S]ingle Responsibility Principle (Princípio da responsabilidade Única)<br />
"Uma classe deveria ter apenas um unico motivo para mudar (Robert Martin)"<br /><br />
[O]pen/Closed Principle (Princípio aberto/fechado)<br />
   "Entidades de software devem estar abertas para extensão, porém fechadas para modificação (Bertrand Meyer)"<br /><br />
[L]iskov Substitution Principle (Princípio substituição de Liskov)<br />
   "Se q(x) é uma propriedade demonstravel dos objetos x de tipo T, entao q(y) deve ser verdadeiro para objetos y de tipo S, onde S é um subtipo de T (Barbara Liskov)"<br /><br />
[I]nterface Segregation Principle (Princípio segregação de interfaces)<br />
   "Abstrações não devem depender de implementações. Implementações devem depender de abstrações (Robert Martin)"<br /><br />
[D]ependecy Inversion Principle (Princípio da inversão de dependências)<br />
   "Uma classe não deveria ser forçada a depender de metodos que nao utilizara (Robert Martin)"<br />

<br /><br />
O que aprendi?<br /><br />
Que é mais interessante e mais seguro para o nosso código depender de interfaces (classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe;<br /><br />
Que as interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento;<br /><br />
Que o Princípio de Inversão de Dependência (DIP) diz que implementações devem depender de abstrações e abstrações não devem depender de implementações;<br /><br />
Que as interfaces devem definir apenas os métodos que fazem sentido para seu contexto;<br /><br />
Que o Princípio de Segregação de Interfaces (ISP) diz que uma classe não deve ser obrigada a implementar um método que ela não precisa;<br /><br /><br />
Os conceitos aprendidos neste treinamento formam o acrônimo SOLID<br />
Single Responsibility Principle<br />
Open Closed Principle<br />
Liskov Substitution Principle<br />
Interface Segregation Principle<br />
Dependency Inversion Principle<br />
