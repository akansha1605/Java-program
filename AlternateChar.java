class AlternateChar {
    public static void main(String[] args) {
        String str = "HELLOJAVA";
        System.out.println("Alternate characters:");
        for(int i=0; i<str.length(); i+=2) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}

