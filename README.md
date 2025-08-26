# das-1-2025-2-a
Repositório destinado a disciplina de Design e Arquitetura de Software

## Aula 04/08/25

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

## Aulas 05/08/25 - 11/08/25 - 12/08/25

### SOLID
São regras de como implementar um código orientado objeto da melhor foma possível.

**Single Responsability Principle:**
Toda classe deve ter uma única responsabilidade. Mais ainda, responsabilidade, no contexto do princípio, significa motivo para modificar uma classe. Ou seja, deve existir um único motivo para modificar qualquer classe em um sistema. Isso significa que a classe deve ser responsável por apenas uma única tarefa, deixando o código fácil de entender, manter e modificar.

**Open/Closed Principle:** Uma classe deve estar fechada para modificações e aberta para extensões. Significa proteger a classe de possíveis bugs porém manter a classe hábil para novas implementações 

**Liskov Substitution Principle:**
Objetos de uma sub-classe devem poder substituir objetos da sua super classe em qualquer parte do código onde sua super classe é experada.

**Interface Segregation Principle:**
Define que interfaces têm que ser pequenas, coesas e, mais importante ainda, específicas para cada tipo de cliente. O objetivo é evitar que clientes dependam de interfaces com métodos que eles não vão usar. Para evitar isso, duas ou mais interfaces específicas podem, por exemplo, substituir uma interface de propósito geral.

**Dependency Inversion Principle:**
Uma classe deve depender apenas de uma abstração e não de uma implementação completa, é evitar a comunicação direta de um classe com outra. Por exemplo uma classe _controller_ usa uma interface de _service_ na hora da injeção de dependência para não depender da classe concreta e sim da interface.

---
**Prefira Composição a Herança:** 
É preferível a herança somente em casos onde os filhos de uma classe pai não podem exercer o mesmo papel. Como exemplo, Uma classe Cachorro e Gato que herdam de Animal, nunca um cachorro será um gato ou vice-versa

**Princípio de Demeter:**
"Princípio do menor conhecimento" tenta evitar variáveis globais se limitando aos recursos locais ou recebidos via parâmetro. A implementação de um método deve invocar (opcionalmente) os seguintes outros métodos.
- De sua própria classe _caso 1_
- De objetos passados como parâmetros _caso 2_
- De objetos criados pelo próprio método _caso 3_
- De atributos da classe do método _caso 4_

## Aula 26/08/25

### Características de Arquitetura  
As características definem os critérios para que um sistema seja considerado bem sucedido, mas geralmente não estão relacionadas diretamente às suas funcionalidades principais. As características são independentes da funcionalidade do sistema, e não exigem que se conheça o que o sistema faz exatamente. Porém são essenciais para o sistema funcionar corretamente.

### Decisôes arquiteturais
As decisões da arquitetura são regras que dizem como o sistema deve ser construído. Por exemplo, o arquiteto pode decidir que só algumas partes do sistema, como as camadas de negócio e serviços, pode acessar o banco de dados. Outras partes, como a camada de apresentação, não podem acessar o banco diretamente. Essas decisões criam limites para o sistema e ajudam as equipes a saber o que é permitido ou não

### Princípios de Design
Diferente de uma decisão fixa, um princípio de design funciona como uma orientação ou recomendação para ajudar na criação do sistema, mas não é uma regra que precisa ser seguida obrigatoriamente. Por exemplo, um princípio comum em arquiteturas de microsserviços é usar comunicação assíncrona entre os serviços, ou seja, os serviços enviam mensagens sem precisar esperar uma resposta imediata. Isso ajuda a melhorar o desempenho e a escalabilidade do sistema. Assim, os princípios do design guiam as equipes para construir sistemas mais eficientes, mas ainda deixam espaço para adaptação conforme a necessidade.
