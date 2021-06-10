$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("avalia_produto.feature");
formatter.feature({
  "line": 1,
  "name": "Avalia Produto",
  "description": "\r\n· Eu como comprador da loja, desejo fazer uma avaliação dos vestidos comprados",
  "id": "avalia-produto",
  "keyword": "Feature"
});
formatter.before({
  "duration": 26287612900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Deve Avalia Produto",
  "description": "",
  "id": "avalia-produto;deve-avalia-produto",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "que insiro os dados de login corretos",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "navego para o menu Evening Dresses",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "selecionar o vestido",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "avaliar o produto",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "envio a avaliacao",
  "keyword": "Then "
});
formatter.match({
  "location": "AvaliaProdutoSteps.que_insiro_os_dados_de_login_corretos()"
});
formatter.result({
  "duration": 6276733200,
  "status": "passed"
});
formatter.match({
  "location": "AvaliaProdutoSteps.navego_para_o_menu_Evening_Dresses()"
});
formatter.result({
  "duration": 7566217100,
  "status": "passed"
});
formatter.match({
  "location": "AvaliaProdutoSteps.selecionar_o_vestido()"
});
formatter.result({
  "duration": 7921746300,
  "status": "passed"
});
formatter.match({
  "location": "AvaliaProdutoSteps.avaliar_o_produto()"
});
formatter.result({
  "duration": 303354000,
  "status": "passed"
});
formatter.match({
  "location": "AvaliaProdutoSteps.envio_a_avaliacao()"
});
formatter.result({
  "duration": 16997957200,
  "status": "passed"
});
formatter.after({
  "duration": 641604300,
  "status": "passed"
});
formatter.uri("cria_conta.feature");
formatter.feature({
  "line": 1,
  "name": "Criar uma Conta",
  "description": "\r\n· Eu como usuário, preciso criar uma conta no site para realizar uma compra",
  "id": "criar-uma-conta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11155769000,
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
  "duration": 194017100,
  "status": "passed"
});
formatter.match({
  "location": "CriarContaSteps.insiro_um_email_valido()"
});
formatter.result({
  "duration": 172006400,
  "status": "passed"
});
formatter.match({
  "location": "CriarContaSteps.redirecionar_para_a_tela_seguinte()"
});
formatter.result({
  "duration": 6528329900,
  "status": "passed"
});
formatter.match({
  "location": "CriarContaSteps.preencho_as_informações_pessoais()"
});
