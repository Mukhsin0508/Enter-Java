public class Rectangle {
    public static class rectangle {
        //create two floating point instance variables:
        // length and width
        //Create 1 default constructor
        //Create another Constructor which initializes the
        // two instance variables
        //mind that the constructor must follow the rules
        // from the setter methods


        //make setters and getters minding the condition
        // provided in the task

        //make perimeter method
        //make area method

        private float width;
        private float length;

        rectangle(){
            width = 1.0f;
            length = 1.0f;
        }

        rectangle(float width, float length){
            setWidth(width);
            setLength(length);
        }

        //setters
        public void setWidth(float width){
            if((width > 0.0f) && (width < 20.0f)){
                this.width = width;
            } else {
                this.width = 1.0f;
            }
        }
        public void setLength(float length){
            if((length > 0.0f) && (length < 20.0f)){
                this.length = length;
            } else {
                this.length = 1.0f;
            }
        }

        //getters
        public float getWidth(){
            return width;
        }
        public float getLength(){
            return length;
        }

        //behavioral methods
        //calculates perimeter
        public float perimeter(){
            return 2 * (getWidth() + getLength());
        }
        //calculates area
        public float area(){
            return getWidth() * getLength();
        }
    }


}
