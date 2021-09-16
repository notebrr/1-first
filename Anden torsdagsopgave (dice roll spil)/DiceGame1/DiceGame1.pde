DiceCup diceCup = new DiceCup();

void setup() {
  size(800, 800);
  fill(0);
  textSize(15);
  text("Tryk på ENTER for at starte", width/2 - 80, height-100);
  doSomething();
}


void doSomething() {
  diceCup.draw(110, 100, 80);
  diceCup.draw(310, 100, 80);

  diceCup.draw(510, 100, 80);
  diceCup.draw(705, 100, 80);

  diceCup.draw(110, 300, 80);
  diceCup.draw(310, 300, 80);
}

void draw() {
  if (keyPressed) {
    println("Game started");
  }
}

void keyPressed() {
  if (key == ENTER) {
    doSomething();
  }
}
