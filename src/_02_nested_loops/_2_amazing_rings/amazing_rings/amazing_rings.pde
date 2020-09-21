int x = 300 ;
int y = 300 ;
int x2 = 899 ;
int y2 = 254 ;
int speed = 5 ;
void setup() {
  size (1000,600);
  noFill();
}
void draw() {
  background (200,230,250) ;
  for (int i=8; i>0; i--){
ellipse(x,y,i*50,i*50);
ellipse(x2,y,i*50,i*50);
}
if (mousePressed) {
 println(mouseX,mouseY);
}
x = x + speed ;
x2 = x2 -speed ;
if ( x < 3 || x2 < 3 ) {
speed = -speed ;
  
}


  // Go to the recipe to run the demonstration before starting this program
   
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
