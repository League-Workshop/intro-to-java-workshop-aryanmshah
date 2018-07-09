void setup()
{
  size(800,800);
  
  
}

void draw()
{
  
  if(mousePressed)
  {
    fill(#1A2DD3);
    ellipse(mouseX,mouseY,100,100);
  }
  
  else
  {
   fill(#DE0930);
  ellipse(mouseX,mouseY,100,100);
  }
}