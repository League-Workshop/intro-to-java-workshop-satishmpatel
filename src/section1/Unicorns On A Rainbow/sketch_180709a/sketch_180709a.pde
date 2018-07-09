PImage rainbow;
PImage unicorn;
void setup() {
  rainbow=loadImage("Rainbow-0.jpg");
  size(800, 600);
  rainbow.resize(width, height);
  unicorn=loadImage("unicorn_PNG46.png");
  unicorn.resize(200,200);
}
void draw(){
  background(rainbow);
  image(unicorn, mouseX, mouseY);
}