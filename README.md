# das-1-2025-2-a
Repositório destinado a disciplina de Design e Arquitetura de Software

# 1º Bimestre

## 📅 04/08/25

### Abstração
Consiste em representar objetos da vida real em classes para diminuir a complexidade de problemas. Com a abstração, se destacam apenas os aspectos essenciais de um objeto, ignorando os detalhes desnecessários. Isso permite focar no que um objeto faz, e não como ele faz.

### Encapsulamento
É o ocultamento de detalhes da aplicação, privando atributos por exemplo. Protege o estado interno do objeto, permitindo que o acesso e a modificação dos dados sejam feitos apenas por meio de métodos controlados (getters e setters, por exemplo). Assim, evita-se interferência direta no funcionamento interno da classe.

### Coesão
Toda classe deve implementar uma única funcionalidade ou serviço. Especificamente, todos os métodos e atributos de uma classe devem estar voltados para a implementação do mesmo serviço. Outra forma de dizer é que um código **coeso** faz **apenas uma coisa bem feita**.
  
### Acoplamento
É a conexão de uma classe com outra, possuindo níveis de acoplamento:  

✅ Acoplamento aceitável
  - A classe **A** usa apenas métodos publicos da classe **B**.

  - A interface provida por **B** é estável do ponto de vista sintático e semântico. Isto é, as assinaturas dos métodos públicos de **B** não mudam com frequência.

❌ Acoplamento ruim
  - Quando a classe **A** realiza um acesso direto a um arquivo ou banco de dados da classe **B**.

  - Quando as classes **A** e **B** compartilham uma variável ou estrutura de dados global. Por exemplo, a classe **B** altera o valor de uma variável global que a classe **A** usa no seu código.

## 📅 05/08/25 - 📅 11/08/25 - 📅 12/08/25

### SOLID 
São regras/princípios de como implementar um código orientado objeto da melhor foma possível.

#### S - Single Responsability Principle
**Toda classe deve ser responsável por apenas uma única tarefa dentro do sistema.** Isso significa que ela deve ter um único motivo para mudar. Deixando o código fácil de entender, manter e modificar.

#### O - Open/Closed Principle  
**Uma classe deve estar aberta para extensão e fechada para modificação.** Não é necessário mudar o código para já existente para adicionar novos comportamentos e o sistema deve permitir acrescentar novos comportamentos sem mexer no que já existe.

#### L - Liskov Substitution Principle
**Objetos de uma subclasse devem poder substituir objetos da sua superclasse sem quebrar o comportamento do programa.** Quando é criada uma herança, a subclasse deve manter o contrato da superclasse. Ou seja, tudo que funciona esperando a superclasse, deve continuar funcionando mesmo que receba a subclasse.

#### I - Interface Segregation Principle 
**As interfaces devem ser pequenas, coesas e específicas para cada tipo de cliente.** O objetivo é evitar que clientes dependam de interfaces com métodos que eles não vão usar. Para evitar isso, duas ou mais interfaces específicas podem, por exemplo, substituir uma interface de propósito geral.

#### D - Dependency Inversion Principle
**Classes devem depender de abstrações (interfaces, contratos) e não de implementações concretas.** Se uma classe depende diretamente de uma classe concreta, ela fica fortemente acoplada. Por exemplo uma classe _controller_ usa uma interface de _service_ na hora da injeção de dependência para não depender da classe concreta e sim da interface.

### Prefira Composição a Herança
**Sempre que possível, prefira composição (ter objetos dentro de outros) em vez de herança (ser uma especialização de outro).** É preferível a herança somente em casos onde os filhos de uma classe pai não podem exercer o mesmo papel. Como exemplo, Uma classe Cachorro e Gato que herdam de Animal, nunca um cachorro será um gato ou vice-versa

### Princípio de Demeter
O princípio do menor conhecimento tenta evitar variáveis globais se limitando aos recursos locais ou recebidos via parâmetro. A implementação de um método deve invocar (opcionalmente) os seguintes outros métodos.  
- De sua própria classe _caso 1_
- De objetos passados como parâmetros _caso 2_
- De objetos criados pelo próprio método _caso 3_
- De atributos da classe do método _caso 4_

## 📅 26/08/25

### Características de Arquitetura  
As características definem os critérios para que um sistema seja considerado bem sucedido, mas geralmente não estão relacionadas diretamente às suas funcionalidades principais. As características são independentes da funcionalidade do sistema, e não exigem que se conheça o que o sistema faz exatamente (requisitos não funcionais). Porém são essenciais para o sistema funcionar corretamente.

### Decisôes arquiteturais
As decisões da arquitetura são regras que dizem como o sistema deve ser construído. São literalmente a escolha de uma arquitetura que vai atender a necessidade específica. Por exemplo, o arquiteto pode decidir que só algumas partes do sistema, como as camadas de negócio e serviços, pode acessar o banco de dados. Outras partes, como a camada de apresentação, não podem acessar o banco diretamente. Essas decisões criam limites para o sistema e ajudam as equipes a saber o que é permitido ou não.

### Princípios de Design
Diferente de uma decisão fixa, um princípio de design funciona como uma orientação ou recomendação para ajudar na criação do sistema, mas não é uma regra que precisa ser seguida obrigatoriamente. Por exemplo, um princípio comum em microsserviços é usar comunicação assíncrona entre os serviços, ou seja, os serviços enviam mensagens sem precisar esperar uma resposta imediata. Isso ajuda a melhorar o desempenho e a escalabilidade do sistema.

## 📅 01/09/25

### Expectativas principais para um arquiteto de software
#### Tomar decisões de arquitetura
_Um arquiteto deve estabelecer as decisões da arquitetura e os princípios do design usados para orientar as decisões de tecnologia dentro da equipe, do departamento ou em toda a empresa._
Essas decisões precisam considerar questões como desempenho, segurança, facilidade de manutenção e custo, para garantir que o sistema funcione bem hoje e no futuro.

### Analisar continuamente a arquitetura
_Um arquiteto deve orientar, não especificar as escolhas da tecnologia._  
Ele precisa estar sempre revisando a arquitetura, procurando melhorias, identificando problemas e incentivando boas práticas que ajudem o sistema a evoluir. Seu papel é estar constantemente reavaliando e promovendo melhorias.

### Manter-se atualizado com as últimas tendências
_Um arquiteto deve ficar atualizado com as últimas tendências da tecnologia e do setor._  
Não precisa saber tudo, mas é importante entender o que está vindo para preparar a arquitetura para mudanças e novas oportunidades.

### Assegurar a conformidade com as decisões
_Um arquiteto deve assegurar a conformidade com as decisões de arquitetura e os princípios de design._  
É o papel do Arquiteto de assegurar que o desenvolvedor está seguindo os princípios de design predefinidos. 

### Exposição e experiência diversificadas
_Um arquiteto deve se expor a tecnologias, estruturas, plataformas e ambientes múltiplos e diversificados._
É importante que o Arquiteto tenha diversas experiências em diversas áreas, pois assim você entende as diversas áreas e problemas que podem surgir

### Ter conhecimento sobre o domínio do negócio
_Um arquiteto deve ter certo nível de especialização no domínio do negócio._  
Ele precisa ter o conhecimento do negócio 

### Ter habilidades interpessoais
_Um arquiteto deve ter habilidades interpessoais excepcionais, inclusive trabalho em equipe, facilitação e liderança._
Tem que ser capaz de motivar pessoas, inspirar pessoas e ser como um "gestor" para a equipe

### Entender e lidar bem com questôes políticas
_Um arquiteto deve entender o clima político da empresa e conseguir lidar bem com ele._  
Tem que ser capaz de entender a hierarquia e ser capaz de negociar prazos, negociar com o cliente e saber influenciar as pessoas em decisôes.

### DevOPS
É uma forma de entregar funcionalidades de forma rápida para o cliente, uma maneira de agregar valor ao cliente. 
Participa de um processo cíclico de operações de: 
- Planejamento
- Criação
- Integração Contínua
- Implantação
- Monitamento
- Feedback

## 📅 02/09/25

### Resuma a diferença entre: Arquitetura e Design
Considerando que _profundidade técnica_ é o que alguém sabe e _amplitude técnica_ é o quanto alguém sabe. Arquitetura gira em torno de tomar decisões que combinam capacidades com restrições técnicas, onde é fundamental um grande conhecimento de soluções variadas.  

Design é sobre a profundidade do conhecimento técnico que uma pessoa possui para realizar o seu trabalho, focando em literalmente na parte prática focada.

### Como é a formação do conhecimento de um arquiteto modelo T?
A formação do conhecimento de um Arquiteto Modelo T é ocorre por uma combinação entre uma base ampla e diversificada (a parte horizontal do T) e uma profunda especialização em uma área específica.

## 📅 08/09/25

### Trade offs
Ao definir a arquitetura de um sistema, não é possível atender todos os requisitos ao mesmo tempo. É preciso fazer compromissos (trade-offs) entre atributos como desempenho, escalabilidade, segurança e manutenibilidade para alcançar um equilíbrio adequado ao contexto do projeto.

### Padrão de tópicos
Um publisher envia mensagens para um canal (stream ou broker), que distribui para múltiplos subscribers. Comunicação assíncrona, desacoplada e escalável.
Publisher --> Stream/Broker <-- <-- Subscribers (Relação um para muitos)

### Queue
Um sender envia mensagens para uma fila, onde um receiver consome. Comunicação assíncrona, garante entrega e processamento único de cada mensagem.
Sender --> Receiver (Relação um para um)

## 📅 15/09/25

### Twelve Factor App [Site](https://12factor.net/)
A metodologia twelve-factor app define boas práticas para construir aplicações SaaS modernas, com foco em portabilidade, automação, agilidade, escalabilidade e facilidade de implantação na nuvem, independente da linguagem ou serviços utilizados.

---

# 2º Bimestre

## 📅 29/09/25

### [Circuit Breaker pattern](https://learn.microsoft.com/pt-br/azure/architecture/patterns/circuit-breaker?wt.mc_id=AZ-MVP-5003638)
O Circuit Breaker é um padrão de design que visa proteger a comunicação entre sistemas, especialmente em arquiteturas distribuídas, onde chamadas remotas podem falhar ou demorar para responder. Ele ajuda a lidar com falhas transitórias e a evitar que sistemas dependentes fiquem sobrecarregados por tentativas repetidas de conexão com um serviço que está indisponível.

O Circuit Breaker possui três estados principais:

- Closed (Fechado)  
No estado fechado, as requisições são encaminhadas normalmente para o serviço dependente. O Circuit Breaker monitora as falhas e, caso o número de erros ultrapasse um limite configurado, o estado muda para aberto.

- Open (Aberto)  
No estado aberto, as requisições são bloqueadas imediatamente, evitando chamadas ao serviço que está indisponível. Após um tempo de espera configurado (timeout), o Circuit Breaker muda para o estado meio aberto.

- Half Open (Meio aberto)  
Nesse estado, o Circuit Breaker permite que um número limitado de requisições teste se o serviço dependente já está saudável novamente. Se essas requisições forem bem-sucedidas, o Circuit Breaker volta ao estado fechado. Caso contrário, volta para aberto e reinicia o ciclo.

## 📅 06/10/25

### Definições de características arquiteturais
Basicamente, é o conjunto de qualidades e decisões de design que torna um software único e funcional. Uma característica da arquitetura atende a três critérios:

- Especifica uma consideração de design fora do domínio
- Influencia algum aspecto estrutural de design
- É essencial ou importante para o sucesso da aplicação

### Características Operacionais da Arquitetura
Envolvem capacidades como desempenho, escalabilidade, elasticidade, disponibilidade e confiabilidade. 

| Termo | Definição |
| :--- | :--- |
| **Disponibilidade** | Por quanto tempo o sistema precisa ficar disponível (ex: 24/7). Requer etapas para permitir que o sistema fique ativo rapidamente no caso de qualquer falha. |
| **Continuidade** | Capacidade de recuperação de desastres. |
| **Desempenho** | Inclui teste de estresse, análise de pico, capacidade requerida e tempos de resposta. |
| **Recuperabilidade** | Requisitos de continuidade do negócio. Define a rapidez com que o sistema precisa ficar online novamente após um desastre, afetando a estratégia de *backup* e hardware duplicado. |
| **Confiabilidade / Segurança** | Avalia se o sistema precisa ser à prova de falhas ou se é de missão crítica (ex: afeta a vida das pessoas ou pode custar muito dinheiro à empresa em caso de falha). |
| **Robustez** | A capacidade de lidar com condições de erro e limites durante a execução, como queda de conexão, falta de energia ou falha no hardware. |
| **Escalabilidade** | A capacidade de o sistema rodar e operar de forma eficaz quando o número de usuários ou requisições aumenta. |

### Características Estruturais da Arquitetura
Englobam desde qualidade do código, como boa modularidade, acoplamento controlado entre os componentes, código legível até muitas outras avaliações internas da qualidade.

| Termo | Definição |
| :--- | :--- |
| **Configuração** | A facilidade com que os usuários finais podem mudar os aspectos de configuração do software, geralmente através de interfaces úteis. |
| **Extensão** | A importância e a facilidade de ligar novas partes da funcionalidade ao sistema existente. |
| **Instalabilidade** | A facilidade e rapidez com que o sistema pode ser instalado em todas as plataformas necessárias. |
| **Aproveitamento / Reutilização** | A capacidade de reutilizar componentes comuns em vários produtos ou partes do sistema. |
| **Localização** | Suporte a múltiplos idiomas (telas, dados, relatórios), requisitos de caracteres multibytes, e diferentes unidades de medidas ou moedas. |
| **Manutenção** | Quão facilmente as alterações são aplicadas e o sistema é melhorado ou corrigido. |
| **Portabilidade** | A necessidade de o sistema rodar em mais de uma plataforma ou em diferentes ambientes (ex: diferentes sistemas operacionais ou bancos de dados). |
| **Suporte** | O nível de suporte técnico necessário e as facilidades de registro (*logging*) ou depuração requeridas para diagnosticar erros no sistema. |
| **Atualização** | A capacidade de atualizar com facilidade e rapidez uma versão prévia da aplicação ou solução para uma versão mais nova, tanto nos servidores quanto nos clientes. |

### Características Transversais da Arquitetura
Muitas características estão fora ou desafiam a categorização, formando importantes restrições de design e considerações, abaixo segue exemplos.

| Termo | Definição |
| :--- | :--- |
| **Acessibilidade** | Garante o acesso a todos os usuários, incluindo aqueles com deficiências (ex: daltonismo, perda auditiva), através de *design* e recursos apropriados. |
| **Armazenamento** | Define se os dados precisarão ser armazenados ou excluídos após um período de tempo, afetando estratégias de arquivamento e desativação de contas. |
| **Autenticação** | Requisitos de segurança para assegurar que os usuários são quem afirmam ser (verificação de identidade). |
| **Autorização** | Requisitos de segurança para garantir que os usuários possam acessar apenas certas funções ou áreas da aplicação, de acordo com seu perfil ou regras de negócio. |
| **Legalidade** | Restrições legais e regulatórias sob as quais o sistema deve operar (ex: GDPR, proteção de dados), incluindo requisitos de direitos de reserva. |
| **Privacidade** | A capacidade de ocultar transações de funcionários internos da empresa, muitas vezes exigindo que os dados sejam criptografados para impedir acesso não autorizado (mesmo por administradores de sistema). |
| **Segurança** | Especifica a necessidade de criptografia de dados (no banco de dados ou em comunicação de rede) e os tipos de autenticação exigidos para o acesso. |
| **Suporte** | O nível de suporte técnico necessário e as facilidades de registro (*logging*) ou depuração requeridas para diagnosticar erros no sistema. |
| **Usabilidade / Viabilidade** | O nível de treinamento necessário para os usuários atingirem seus objetivos com a aplicação e a facilidade geral de uso. |

### A Arquitetura menos pior

A Arquitetura de Software é um exercício de trade-offs (compensações). É impossível maximizar todos os atributos de qualidade (ex: Segurança vs. Desempenho) simultaneamente, pois melhorar um quase sempre prejudica outro. O objetivo do arquiteto não é criar a "melhor arquitetura", mas sim a "arquitetura menos pior", ou seja, aquela que faz o melhor equilíbrio entre as características conflitantes para atender aos requisitos de negócio.
