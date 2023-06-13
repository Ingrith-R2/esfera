public class figuras_3D {
    double radio;
    double pi=3.1415;

    public figuras_3D() {
        this.radio = radio;
        this.pi = pi;
    }

    public double getRadio() {return radio;}

    public void setRadio(double radio) {this.radio = radio;}

    public double getPi() {return pi;}

    public void setPi(double pi) {this.pi = pi;}

    private float area_esfera(){
        return (float) (4*pi*Math.pow(radio, 2));
    }
    private float volumen_esfera(){
        double op = (0.75*pi*Math.pow(radio,3));
        return (float) op;
    }
    public void imprimir_datos_esfera(){
        System.out.println("El area de la esfera es: "+area_esfera());
        System.out.println("El volumen de la esfera es: "+volumen_esfera());
    }


}