# CaseStudy-Microserviços
 Nesse projeto de micro serviços foi utilizado as seguintes tecnologias como:

-> Spring Cloud Configuration;

-> Spring Boot Actuator;

-> Feign;

-> Service Discovery e Service Registry com Eureka;

-> Load Balancing com Eureka, Feign e Spring Cloud LoadBalancer;

-> API Gateway e RouteLocator com Spring Cloud Gateway;

-> Circuit Breaker com Resilience4j;

-> Foi configurado o Swagger OpenAPI nos microsserviços;

-> Distributed Tracing com Docker, Zipkin, Eureka e Sleuth

### Mas se manter atualizado quando se trata de microsserviços é um grande desafio. Em 2018, a Netflix anunciou que vários projetos centrais do Spring Cloud estavam entrando em modo de manutenção. O que significa que nenhuma nova funcionalidade seria feita nesses projetos, ou seja, foram depreciados. Por isso, em dezembro de 2018, a equipe da Spring Cloud recomendou várias substituições importantes: ###

- Tecnologias utilizadas anteriormente  -->  Hoje

- Hystrix   -->  Resliience4J

- Ribbon  -->  Spring Cloud Load Balancer

- Zuul 1  -->  Spring Cloud Gateway

- Archaius 1  -->  Spring Cloud Config

Foi feito o uso também de mensageria com RabbitMQ; caso o servidor de rastreamento venha a falhar ocorrerá a perda de informações dos logs ocorridos em
cada microserviço. Para evitar isso é utilizado o recurso de mensageria que guarda(em memória) essas informações de logs em uma fila, apenas aguardando o serviço de tracing server voltar e com isso retornar as informações.


Arquitetura do projeto:


