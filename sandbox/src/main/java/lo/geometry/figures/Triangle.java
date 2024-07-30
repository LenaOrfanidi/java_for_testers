package lo.geometry.figures;

public class Triangle {
        double sideA;
        double sideB;
        double sideC;

    public double getSideA () {
            return sideA;
        }

        public double getSideB () {
            return sideB;
        }

        public double getSideC () {
            return sideC;
        }

    public Triangle( double sideA, double sideB, double sideC){
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        public void setSideA ( double sideA){
            this.sideA = sideA;
        }

        public void setSideB ( double sideB){
            this.sideB = sideB;
        }

        public void setSideC ( double sideC){
            this.sideC = sideC;
        }

        public double getPerimeter() {
           return sideA + sideB + sideC;
        }

        public  double getArea(){
            double p = getPerimeter()/2;
            return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
}

    public static void main(String[] args) {
            Triangle one = new Triangle(2.0,4.0, 5.0);
    System.out.println(" lo.geometry.figures.Triangle Perimeter"+ "=" + one.getPerimeter());
    System.out.println("lo.geometry.figures.Triangle Area" + "=" + one.getArea());
}
    }

