# Projeto Automação Web
![GitHub Workflow Status](https://img.shields.io/github/workflow/status/tomgunners/ProjetoOrbia/Java%20CI%20with%20Maven?style=plastic)

## About
<h3>O Projeto tem como finalidade executar 3 tipos de cenários de testes:</h3>

* Eu como usuário, preciso criar uma conta no site para realizar uma compra <br>
* Eu como usuário logado, desejo realizar uma compra de dois vestidos na loja<br>
* Eu como usuário da loja, desejo fazer uma avaliação dos vestidos comprados
 
## Developed
  ![GitHub contributors](https://img.shields.io/github/contributors/tomgunners/MobileAutomation?color=green&label=Wellington%20de%20Oliveira%20Francisco)
  
 
## Installation
<h3>Os programas listados abaixos são necessários para execução ou manutenção do código-fonte</h3>
    <a href="https://www.jetbrains.com/pt-br/idea/download/download-thanks.html?platform=windows&code=IIC">🔗 IDE</a>
    <a href="https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html">🔗 Java</a>
    <a href="https://www.selenium.dev/">🔗 Selenium</a>
    <a href="http://cucumber.io/">🔗 Cucumber</a>
    <a href="https://junit.org/junit4/">🔗 jUnit</a>
    <a href="https://github.com/DiUS/java-faker">🔗 Faker</a>
</h3>
 
## Run
<h3>Para executar o projeto, será necessário instalar os seguintes programas:</h3>

- [JDK 8: Necessário para executar o projeto Java](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- [Maven 3.6.3: Necessário para realizar o build do projeto Java](https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip)

*Não Esqueça de configurar as variáveis de ambiente para execução.
- [Tutorial para configuração das variáveis](https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26#:~:text=Bom%2C%20mas%20o%20que%20s%C3%A3o,arquivos%20necess%C3%A1rios%2C%20inclusive%20os%20bin%C3%A1rios.)
- [IntelliJ: Para desenvolvimento do projeto](https://www.jetbrains.com/pt-br/idea/)

*Instale também os plugins Gherkin e Cucumber for Java.

- [Git: Para versionamento e clone do projeto](https://github.com/EtechMentoria/cucumber-rerun-example)


## Execução Via Terminal

É possível executar o projeto via linha de comando. Após configurar as variáveis de ambiente abra o terminal.

```bash
# Você deverá clonar o projeto para alguma pasta ou repositório local da sua maquina e depois executar o comando
# clonando projeto do git
$ git clone https://github.com/tomgunners/ProjetoOrbia.git

# Após clonar o projeto você precisará abrir o cmd e navegar ate a pasta do projeto
# acesse a pasta do projeto
$ cd OrbiaProject

# Dentro do projeto basta executar o comando abaixo
# execute o comando do maven para execução dos testes.
$ mvn clean install && test
```

## Execução via IDE
```bash
                                                            
├───report           - Local do report html                                 
├───src                                               
│   ├───main                                          
│   │   ├───java                                      
│   │        ├───commons         - Package com classes utilitárias para todo o projeto
│   │        ├───map             - Package com id / xpath dos campos da aplicação       
│   │        ├───page            - Package com as telas da aplicação herdando os campos do map             
│   │        ├───steps           - Package responsável pela lógica automatizada
│   └───test                                          
│       ├───java                                      
│       │   └───br                                    
│       │       └───com                               
│       │           └───runTest                       - Classe de execução dos testes.
│       └───resources                                 
│           └───features                              - Cenários de Teste no formato Gherkin
```

O arquivo que deve ser executado encontra-se:

```bash
# src/test/java/runTest/RunTest.java
```

#### [IntelliJ] Para executar o projeto basta clicar com o botão direito do mouse -> Run 'RunTest'

## Technologies Used
**JDK** ![version](https://img.shields.io/badge/version-1.8-green)
 
**Maven** ![Maven Central](https://img.shields.io/maven-central/v/org.apache.maven/maven-artifact)
  
**Junit** ![version](https://img.shields.io/badge/version-4.12-green)

**Cucumber** ![Maven Central](https://img.shields.io/maven-central/v/info.cukes/cucumber-java?label=cucumber-java)

**Selenium** <img alt="Maven Central with version prefix filter" src="https://img.shields.io/maven-central/v/org.seleniumhq.selenium/selenium-java/3.141.59?label=version">
 
## Programming Language Used ![GitHub language count](https://img.shields.io/github/languages/count/tomgunners/ProjetoOrbia)
**Java**: 66.1% <br>

**JavaScript**: 27.7% <br>

**CSS**: 3.2% <br>

**Gherkin**: 2.2% <br>

**HTML**: 0.8% <br>

## Contributing

1. Fork it (<https://github.com/yourname/yourproject/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

## License
[MIT](https://choosealicense.com/licenses/mit/)
 
