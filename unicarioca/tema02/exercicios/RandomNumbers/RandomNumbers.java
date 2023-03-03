class RandomNumbers {

    public static void main(String[] args) {
        for (int counter = 1; counter <= 20; counter++) {
            int face = 1 + (int) (Math.random() * 6);

            System.out.printf("%d ", face);

            if (counter % 5 == 0)
                System.out.println();
        }
    }

}