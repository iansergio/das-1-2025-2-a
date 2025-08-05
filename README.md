# das-1-2025-2-a
Repositório destinado a disciplina de Design e Arquitetura de Software

## Aula 04/08 

### Abstração
Consiste em representar objetos da vida real em classes para diminuir a complexidade de problemas. Com a abstração, se destacam apenas os aspectos essenciais de um objeto, ignorando os detalhes desnecessários. Isso permite focar no que um objeto faz, e não como ele faz.

### Encapsulamento
É o ocultamento de detalhes da aplicação, privando atributos por exemplo. Protege o estado interno do objeto, permitindo que o acesso e a modificação dos dados sejam feitos apenas por meio de métodos controlados (getters e setters, por exemplo). Assim, evita-se interferência direta no funcionamento interno da classe.

### Coesão
Toda classe deve implementar uma única funcionalidade ou serviço. Especificamente, todos os métodos e atributos de uma classe devem estar voltados para a implementação do mesmo serviço. Outra forma de dizer é que um código **coeso** faz **apenas uma coisa bem feita**.
  
### Acoplamento
É a conexão de uma classe com outra, possuindo níveis de acoplamento:
- Acoplamento aceitável
  - A classe **A** usa apenas métodos publicos da classe **B**.
  - A interface provida por **B** é estável do ponto de vista sintático e semântico. Isto é, as assinaturas dos métodos públicos de **B** não mudam com frequência.

- Acoplamento ruim
  - Quando a classe **A** realiza um acesso direto a um arquivo ou banco de dados da classe **B**.
  - Quando as classes **A** e **B** compartilham uma variável ou estrutura de dados global. Por exemplo, a classe **B** altera o valor de uma variável global que a classe **A** usa no seu código.

## Aula 05/08

### SOLID 
**Single Responsability Principle**
Toda classe deve ter uma única responsabilidade. Mais ainda, responsabilidade, no contexto do princípio, significa motivo para modificar uma classe. Ou seja, deve existir um único motivo para modificar qualquer classe em um sistema. Isso significa que a classe deve ser responsável por apenas uma única tarefa, deixando o código fácil de entender, manter e modificar.

Open/Closed Principle

Liskov Substitution Principle

**Interface Segregation Principle**
Define que interfaces têm que ser pequenas, coesas e, mais importante ainda, específicas para cada tipo de cliente. O objetivo é evitar que clientes dependam de interfaces com métodos que eles não vão usar. Para evitar isso, duas ou mais interfaces específicas podem, por exemplo, substituir uma interface de propósito geral.

Dependency Inversion Principle
