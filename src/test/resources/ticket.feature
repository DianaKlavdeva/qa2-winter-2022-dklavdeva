Feature: Ticket order

  Scenario: Ticket order for fly
    Given from RIX to SFO
    When we are buying ticket

    Then flight route:
      | from | RIX |
      | to   | SFO |

    And passenger Nr. 1 personal information is:
      | name          | Diana    |
      | surname       | Klavdeva |
      | discount_code | 12345    |
      | people_count  | 2        |
      | child_count   | 1        |
      | bag_count     | 4        |

    And travel date is:
      | date | 16-05-2018 |

    And destination is:
      | from | RIX |
      | to   | SFO |

    And ticket price is:
      | price | 700 |
      | value | EUR |

    And seat number for passenger Nr. 1 is:
      | seat | 3 |

    And successful order message is:
      | Thank You for flying with us! |