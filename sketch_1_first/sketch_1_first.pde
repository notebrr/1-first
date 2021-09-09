
void setup(){
  size(200,200);
}

void draw(){
  int x = 0;
  //Den lod mig ikke laev while() udenfor draw()
  
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
