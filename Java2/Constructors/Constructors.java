public class Constructors{
    int width;
    int height;
    int deepth;

    public Constructors(int width, int height, int deepth){
        this.width = width;
        this.height = height;
        this.deepth = deepth;
    }    
    /*public Constructors(int width, int height, int deepth){
        this.width = width;
        this.height = height;
        this.deepth = 10;
    }*/

/*A constructor with one dimension and has 3 different variables for same values */
    public Constructors(int dimension){
        width = dimension;
        height = dimension;
        deepth = dimension;
        }

/*A constructor with no argument and same values for 3 different variables */
    public Constructors(){
        this.width = 5;
        this.height = 5;
        this.deepth = 5;
        }
        int result(){
            return width * height * deepth;
        }

        public static void main(String[] args){
            int result;
            
            Constructors standard = new Constructors(10,20,30);
            result = standard.result();
            System.out.println("A Constructor with parameters " + result);

            Constructors dimensions = new Constructors (10);
            result = dimensions.result();
            System.out.println("A Constructor with dimensions " + result);

            Constructors noParameters = new Constructors();
            result = noParameters.result();
            System.out.println("A Constructor with no parameters " + result);
        }
}