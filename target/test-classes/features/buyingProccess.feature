Feature: Buying proccess MyStore

  @test2
  Scenario Outline: Login and follow correct steps of buying proccess
    Given User open browser go to Mystore page and login
    When User search <product> in to searching field
#    And User can <discountAmount> euro
    And User choose <size> size
    And User set amount <productAmount> of product and add to cart
    And User go to checkout
    And User confirm sending address
    And User choose self pick up in store
    And User choose pay by check and agree with terms of service
    Then User can see "YOUR ORDER IS CONFIRMED" and takes a screenshot

    Examples:
      | product | size | productAmount | discountAmount |
      | sweater | M    | 5             | Save 20%       |