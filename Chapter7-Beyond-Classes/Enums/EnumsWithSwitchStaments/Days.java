public enum Days{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY;

    public static void main(String[] args) {
        Days days = Days.FRIDAY;

	switch(days){
	
		case MONDAY:
			System.out.println("its a monday be bored and grampy");
			break;
		case WEDNESDAY:
			System.out.println("Okay get ready");
			break;
		case FRIDAY:
			System.out.println("ready to watch anime");
			break;
		default:
			System.out.println("watch anime till monday lol");
	}
    }
}
