PImage mustache;
PImage friend;

void setup() {
  friend=loadImage("tiger_poster_grande.jpg");
  size(800, 600);
  friend.resize(width, height);
  mustache=loadImage("moustache-473661_960_720.png");
  mustache.resize(500,100);
}
void draw() {
  background(friend);
  if(mousePressed)
  image(mustache, mouseX, mouseY);
}