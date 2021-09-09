//Task 7

int input = -20;
if (input >=0) {
  for (int i = 0; i <= input; i++) {
    if (i == 6) {
      println("Six");
    } else if (i == input / 2) {
      println("HALF!");
    } else {
      println(i);
    }
  }
} else {  
  for (int i = 0; i >= input; i--) {
    if (i == 6) {
      println("Six");
    } else if (i == input / 2) {
      println("HALF!");
    } else {
      println(i);
    }
  }
}
