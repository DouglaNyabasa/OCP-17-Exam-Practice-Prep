
// Adding Constructors, Fields, and Methods


enum Days{
    MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5);

    // instance variable
    private final int numb;
    // constructor is implicitly private
    private Days(int numb){
        this.numb =numb;
    }

    public void print(){
        System.out.println(numb);
    }
    public static void main(String[] args) {
        Days day = Days.MONDAY;
        day.print();

    }
}
