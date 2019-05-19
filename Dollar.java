class Dollar extends Money{
   int amount;
   Dollar(int amount) {
      this.amount= amount;
   }
   Money times(int multiplier)  {
      return new Dollar(amount * multiplier);
   }
}
