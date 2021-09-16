
class Die {
  color diceColor = color(255);
  color eyeColor = color(0);

  int roll() {
    float ranNum = random(1, 7);
    return parseInt(ranNum);
  }

  void draw(int x, int y, int size) {
    rectMode(CENTER);
    fill(diceColor);
    rect(x, y, size, size);
    fill(eyeColor);

    Die die = new Die();

    int getRollNum = die.roll();

    switch(getRollNum) {
    case 1:
      circle(x, y, 10);
      break;
    case 2:
      circle(x-25, y-25, 10);
      circle(x+25, y-25, 10);  
      break;
    case 3:
      circle(x-25, y-25, 10);
      circle(x, y, 10);
      circle(x+25, y+25, 10);
      break;
    case 4:
      circle(x-25, y-25, 10);
      circle(x-25, y+25, 10);

      circle(x+25, y-25, 10);
      circle(x+25, y+25, 10);
      break;
    case 5:
      circle(x-25, y-25, 10);
      circle(x-25, y+25, 10);
      circle(x, y, 10);
      circle(x+25, y-25, 10);
      circle(x+25, y+25, 10);
      break;
    case 6:
      circle(x-25, y-25, 10);
      circle(x-25, y, 10);
      circle(x-25, y+25, 10); 

      circle(x+25, y-25, 10);
      circle(x+25, y, 10);
      circle(x+25, y+25, 10);
      break;
    }

    /*
    //Middle
     circle(x, y, 10);
     
     //Left side
     circle(x-25, y-25, 10);
     circle(x-25, y, 10);
     circle(x-25, y+25, 10);
     
     //Right side
     circle(x+25, y-25, 10);
     circle(x+25, y, 10);
     circle(x+25, y+25, 10);*/
  }
}
