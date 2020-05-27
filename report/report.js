$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/buyingProccess.feature");
formatter.feature({
  "name": "Buying proccess MyStore",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login and follow correct steps of buying proccess",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test2"
    }
  ]
});
formatter.step({
  "name": "User open browser go to Mystore page and login",
  "keyword": "Given "
});
formatter.step({
  "name": "User search \u003cproduct\u003e in to searching field",
  "keyword": "When "
});
formatter.step({
  "name": "User choose \u003csize\u003e size",
  "keyword": "And "
});
formatter.step({
  "name": "User set amount \u003cproductAmount\u003e of product and add to cart",
  "keyword": "And "
});
formatter.step({
  "name": "User go to checkout",
  "keyword": "And "
});
formatter.step({
  "name": "User confirm sending address",
  "keyword": "And "
});
formatter.step({
  "name": "User choose self pick up in store",
  "keyword": "And "
});
formatter.step({
  "name": "User choose pay by check and agree with terms of service",
  "keyword": "And "
});
formatter.step({
  "name": "User can see \"YOUR ORDER IS CONFIRMED\" and takes a screenshot",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product",
        "size",
        "productAmount",
        "discountAmount"
      ]
    },
    {
      "cells": [
        "sweater",
        "M",
        "5",
        "Save 20%"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login and follow correct steps of buying proccess",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test2"
    }
  ]
});
formatter.step({
  "name": "User open browser go to Mystore page and login",
  "keyword": "Given "
});
formatter.match({
  "location": "BuyingProccessDefs.userOpenBrowserGoToMystorePageAndLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search sweater in to searching field",
  "keyword": "When "
});
formatter.match({
  "location": "BuyingProccessDefs.userSearchSweaterInToSearchingField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User choose M size",
  "keyword": "And "
});
formatter.match({
  "location": "BuyingProccessDefs.userChooseSize(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User set amount 5 of product and add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "BuyingProccessDefs.userSetAmountOfProductAndAddToCart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User go to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "BuyingProccessDefs.userGoToCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User confirm sending address",
  "keyword": "And "
});
formatter.match({
  "location": "BuyingProccessDefs.userConfirmSendingAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User choose self pick up in store",
  "keyword": "And "
});
formatter.match({
  "location": "BuyingProccessDefs.userChooseSelfPickUpInStore()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User choose pay by check and agree with terms of service",
  "keyword": "And "
});
formatter.match({
  "location": "BuyingProccessDefs.userChoosePayByCheckAndAgreeWithTermsOfService()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see \"YOUR ORDER IS CONFIRMED\" and takes a screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "BuyingProccessDefs.userCanSeeAndTakesAScreenshot(String)"
});
formatter.result({
  "status": "passed"
});
});