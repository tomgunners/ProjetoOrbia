$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cria_conta.feature");
formatter.feature({
  "line": 1,
  "name": "Criar uma Conta",
  "description": "\r\n· Eu como usuário, preciso criar uma conta no site para realizar uma compra",
  "id": "criar-uma-conta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6576184200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Deve criar uma conta",
  "description": "",
  "id": "criar-uma-conta;deve-criar-uma-conta",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "que estou na tela de pré cadastro",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "insiro um email valido",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "redirecionar para a tela seguinte",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "preencho as informações pessoais",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "devo ser redirecionado para a tela My Account",
  "keyword": "And "
});
formatter.match({
  "location": "CriarContaSteps.que_estou_na_tela_de_pré_cadastro()"
});
formatter.result({
  "duration": 366902200,
  "status": "passed"
});
formatter.match({
  "location": "CriarContaSteps.insiro_um_email_valido()"
});
formatter.result({
  "duration": 301335800,
  "status": "passed"
});
formatter.match({
  "location": "CriarContaSteps.redirecionar_para_a_tela_seguinte()"
});
formatter.result({
  "duration": 1258790900,
  "status": "passed"
});
formatter.match({
  "location": "CriarContaSteps.preencho_as_informações_pessoais()"
});
formatter.result({
  "duration": 3818498200,
  "status": "passed"
});
formatter.match({
  "location": "CriarContaSteps.devo_ser_redirecionado_para_a_tela_My_Account()"
});
formatter.result({
  "duration": 33423000,
  "status": "passed"
});
});