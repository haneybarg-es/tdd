class Dollar extends Money{
  private int amount;
  private String currency;


  Dollar(int amount, String currency)  {
    super(amount, currency);
  }


  String currency() {
    return currency;
  }
  Money times(int multiplier)  {
    return Money.dollar(amount * multiplier);
  }
}
