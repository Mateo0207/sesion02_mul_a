package sesion02_mul_a;


public class Cartesiana {
    private float x;
    private float y;
    

    public Cartesiana(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Cartesiana(){
    
       
    }

public Cartesiana polar_cartesiano (float radio, float angulo) {
//float x = radio * (float)Math.cos(angulo); // implementar la formula correcta
//float y = radio * (float)Math.sin(angulo); // implementar la forumula correcta 
//return new Cartesiana(x,y);
  return new Cartesiana (radio * (float)Math.cos(angulo),radio * (float)Math.sin(angulo));  
}

public Cartesiana polar_cartesiano (Polar p){
 
   // float x = p.getRadio()*(float)Math.cos(p.getAngulo());
    //float y = p.getRadio()*(float)Math.sin(p.getAngulo());
           
     return polar_cartesiano (p.getRadio(),p.getAngulo()); // implementar procedimiento correcto
}


public Polar cartesiano_polar(float x, float y){

float radio = (float)Math.sqrt(Math.pow(x,2)+ Math.pow(y,2)); //  r = √ (x2 + y2)
float angulo = (float)Math.atan(y/x); // θ = atan( y / x )
return new Polar(radio,angulo);
}
  
   public Polar cartesiano_polar (Cartesiana c){
   
   return cartesiano_polar (c.getX(),c.getY()); // implementar prodecimiento correcto
   }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    
}
