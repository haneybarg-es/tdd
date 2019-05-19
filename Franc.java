class Franc extends Money{
  private int amount;
  Franc(int amount) {
    this.amount= amount;
  }
  Money times(int multiplier)  {
    return new Franc(amount * multiplier);
  }
}
