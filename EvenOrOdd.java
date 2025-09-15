


class EvenOrOdd {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 11, 14, 17};
	System.out.println("Checking whether the number is Even or Odd");
      	 for(int n:numbers){
            if ( n%2==0) {
                System.out.println("Yes,The number is Even :" + n);
            } else {
                System.out.println("The Number is Odd : " + n);
            }
		System.out.println("=============================");
            switch (n%2) {
                case 0:
                    System.out.println("The number is Even : " + n);
                    break;
                case 1:
                    System.out.println("The number is Odd : " + n);
                    break;
		case 2:
                    System.out.println("The number is Even : " + n);
                    break;
		case 3:
                    System.out.println("The number is Odd : " + n);
                    break;
		case 4:
                    System.out.println("The number is Even : " + n);
                    break;
		case 5:
                    System.out.println("The number is Odd : " + n);
                    break;		
            }
        }
    }
}

