int white = 255;
int red = #FF0000;
int green = #0AFF08;
int grey = #808080;

void setup(){
  size(500,500);
  background(white);
  frameRate(1);
}
int state = 0;


void draw(){
  fill(150);
  stroke(150);

  if(state == 1){
    fill(red);
    stroke(red);
    state = 0;
  }else if(state==0){
    fill(grey);
    stroke(grey);
    state = 1;
  }
  int x = 0;
  //Den lod mig ikke lave while() udenfor draw()


  circle(width/2, 150, 100);
  fill(150);
  stroke(150);
  circle(width/2, height/2, 100);

  circle(width/2, 350, 100);
  while(0 <= 20){
    if(x % 2 == 0){
      println(x);
    }
    if(x==20){
      break;
    }
    x = x+1;
  }
}
