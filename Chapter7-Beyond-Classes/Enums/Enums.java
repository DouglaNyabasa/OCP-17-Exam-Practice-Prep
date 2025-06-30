
//Calling the values(), name(), and ordinal() Methods

 enum Days{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY;

    public static void main(String[] args) {
        Days day = Days.valueOf("MONDAY"); // PRINTS MONDAY IF IT EXISTS AND AN IllegalArgumentException IF ID DOES NOT EXIST
        System.out.println(day);

        for(var days: Days.values()){
            System.out.println(days.name() + " " + days.ordinal());
        }
    }
}
