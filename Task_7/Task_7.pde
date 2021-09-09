int input = -20;
if(input >=0){
  for(int i = 0; i <= input; i++){
    if(i == 6){
      println("Six");
    }
    if(i == input / 2){
      println("HALF!");
    }
    println(i);
  } 
}else{  for(int i = 0; i >= input; i--){
  if(i == 6){
    println("Six");
  }
  if(i == input / 2){
    println("HALF!");
  }
  println(i);
  if(i>100){
    break;
  }
}
}
