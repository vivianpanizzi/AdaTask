# adaTask

Projeto final do curso de POOII do Devas

O objetivo do projeto foi desenvolver uma aplicação que fizesse o Gerenciamento de tarefas via console, onde os 
usuários pudessem adicionar, editar, deletar e visualizar as tarefas nos âmbitos pessoal, trabalho e profissional.

---

### Tecnologias utilizadas:
- Java
- Maven

---

### Como utilizar a aplicação:

1. O usuário, ao inicializar deverá escolher primeiramente em qual tipo de tarefa irá gerenciar.
2. Deverá escolher qual ação executar (adicionar, editar, deletar, visualizar).
3. Dependendo da ação escolhida, o usuário será guiado por mensagens no console para fornecer as informações 
   necessárias (por exemplo, título, descrição, prazo).
4. Após a conclusão de uma ação, o usuário terá a opção de realizar outra ação ou sair do programa.

---

### Estrutura do Projeto:

O projeto está dividido nas seguintes camadas para seguir boas práticas de desenvolvimento e manutenção do código:
- Domain - Contém as classes BaseTask, PersonalTask, WorkTask, StudyTask
- Controller - Gerencia as interações com o usuário
- Service - Contem as regras de negócio
- Repository - Responsável pelos dados em lista

---

