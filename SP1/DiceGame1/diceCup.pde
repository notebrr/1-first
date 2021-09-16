
class DiceCup {
  void addDie(Die die, int x, int y, int size) {
    die.draw(x, y, size);
  }

  void shake() {
    Die die = new Die();
    die.roll();
  }

  void draw(int x, int y, int dieSize) {
    // Draw cup
    line(x-100, y-80, x-60, y+100);
    line(x-60, y+100, x+50, y+100);
    line(x+50, y+100, x+90, y-80);
    addDie(new Die(), x, y, dieSize);
    Die die = new Die();
    die.draw(x, y, dieSize);
  }
}
