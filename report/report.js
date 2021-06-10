$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("avalia_produto.feature");
formatter.feature({
  "line": 1,
  "name": "Avalia Produto",
  "description": "\r\n· Eu como comprador da loja, desejo fazer uma avaliação dos vestidos comprados",
  "id": "avalia-produto",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10347631900,
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
  "duration": 13353365600,
  "status": "passed"
});
formatter.match({
  "location": "AvaliaProdutoSteps.navego_para_o_menu_Evening_Dresses()"
});
formatter.result({
  "duration": 10277893500,
  "status": "passed"
});
formatter.match({
  "location": "AvaliaProdutoSteps.selecionar_o_vestido()"
});
formatter.result({
  "duration": 9592255200,
  "status": "passed"
});
formatter.match({
  "location": "AvaliaProdutoSteps.avaliar_o_produto()"
});
formatter.result({
  "duration": 316133100,
  "status": "passed"
});
formatter.match({
  "location": "AvaliaProdutoSteps.envio_a_avaliacao()"
});
formatter.result({
  "duration": 18189800900,
  "status": "passed"
});
formatter.after({
  "duration": 628914400,
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
  "duration": 1744276500,
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
  "duration": 30230950900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027center_column\u0027]/h1\"}\n  (Session info: chrome\u003d91.0.4472.77)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-DS9E2A6\u0027, ip: \u0027192.168.0.234\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.77, chrome: {chromedriverVersion: 91.0.4472.19 (1bf021f248676..., userDataDir: C:\\Users\\Tom_G\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:61562}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 5a85934e0b8dcc7ae98fc394bbdb55bc\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027center_column\u0027]/h1}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getText(Unknown Source)\r\n\tat page.AuthenticationPage.validaPaginaAutenticacao(AuthenticationPage.java:10)\r\n\tat steps.CriarContaSteps.que_estou_na_tela_de_pré_cadastro(CriarContaSteps.java:25)\r\n\tat ✽.Given que estou na tela de pré cadastro(cria_conta.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CriarContaSteps.insiro_um_email_valido()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CriarContaSteps.redirecionar_para_a_tela_seguinte()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CriarContaSteps.preencho_as_informações_pessoais()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CriarContaSteps.devo_ser_redirecionado_para_a_tela_My_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 632173100,
  "status": "passed"
});
formatter.uri("realiza_compra.feature");
formatter.feature({
  "line": 1,
  "name": "Realiza Compra",
  "description": "\r\n· Eu como usuário logado, desejo realizar uma compra de dois vestidos na loja",
  "id": "realiza-compra",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10950257300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Realiza Compra",
  "description": "",
  "id": "realiza-compra;realiza-compra",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "que estou na tela de login",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "insiro os dados de login corretos",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "navegar para o menu Evening Dresses",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "selecionar o vestido com cores e tamanhos diferentes",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "vou finalizar o pedido",
  "keyword": "Then "
});
formatter.match({
  "location": "RealizaCompraSteps.que_estou_na_tela_de_login()"
});
formatter.result({
  "duration": 30697300,
  "status": "passed"
});
formatter.match({
  "location": "RealizaCompraSteps.insiro_os_dados_de_login_corretos()"
});
formatter.result({
  "duration": 11742103800,
  "status": "passed"
});
formatter.match({
  "location": "RealizaCompraSteps.navegar_para_o_menu_Evening_Dresses()"
});
formatter.result({
  "duration": 18723988800,
  "status": "passed"
});
formatter.match({
  "location": "RealizaCompraSteps.selecionar_o_vestido_com_cores_e_tamanhos_diferentes()"
});
formatter.result({
  "duration": 12987074700,
  "status": "passed"
});
formatter.match({
  "location": "RealizaCompraSteps.vou_finalizar_o_pedido()"
});
formatter.result({
  "duration": 53994860800,
  "status": "passed"
});
formatter.after({
  "duration": 666996100,
  "status": "passed"
});
});