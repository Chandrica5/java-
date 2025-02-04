class CountInt{
    public static void main(String[] args) {
        int count = 0;
        int number = 12345;

        while(number != 0){
            number = number/10;
            ++count;
        }
        System.out.println("The integer count is: "+count);
    }
}