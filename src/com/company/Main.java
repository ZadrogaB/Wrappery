import java.util.Random;

class RandomMajorNumbers{
    private Random random = new Random();
    private int arrayInt[] = new int[3];
    private double arrayDouble[] = new double[3];
    private float arrayFloat[] = new float[3];
    private int arrayInt2[] = new int[3];
    private double arrayDouble2[] = new double[3];
    private float arrayFloat2[] = new float[3];
    //                                                                              <---losowanie i zwracanie liczb
    public int[] getRandomMajorNumbersInt(){
        for (int i=0; i<3; i++){
            int randomInt = random.nextInt(100);
            arrayInt[i]  = randomInt;
            arrayInt2[i] = randomInt;
        }
        return this.arrayInt;
    }

    public double[] getRandomMajorNumbersDouble(){
        for (int i=0; i<3; i++){
            arrayDouble[i] = random.nextDouble() ;
            arrayDouble2[i] = random.nextDouble() ;
        }
        return this.arrayDouble;
    }

    public float[] getRandomMajorNumbersFloat(){
        for (int i=0; i<3; i++){
            arrayFloat[i] = random.nextFloat() ;
            arrayFloat2[i] = random.nextFloat() ;
        }
        return this.arrayFloat;
    }
    //                                                                               <---Wypisywanie wylosowanych liczb (do testów)
    public void writeRandomMajorNumbersInt(){
        System.out.println("Losowe liczby podstawowe Integer to: ");
        for (int i=0; i<3; i++){
            System.out.print(arrayInt[i] + ", ");
        }
    }

    public void writeRandomMajorNumbersDouble(){
        System.out.println();
        System.out.println("Losowe liczby podstawowe Double to: ");
        for (int i=0; i<3; i++){
            System.out.print(arrayDouble[i]+ ", ");
        }
    }

    public void writeRandomMajorNumbersFloat(){
        System.out.println();
        System.out.println("Losowe liczby podstawowe Float to: ");
        for (int i=0; i<3; i++){
            System.out.print(arrayFloat[i]+ ", ");
        }
    }
}


class MajorEqualsWrappers{
    private Integer arrayInt[] = new Integer[3];
    private Double arrayDouble[] = new Double[3];
    private Float arrayFloat[] = new Float[3];
    //                                                                               <---Wrappowanie
    public void majorEqualsWrappersInt(int[] array){
        for (int i=0; i<3; i++){
            this.arrayInt[i] = array[i];
        }
    }

    public void majorEqualsWrappersDouble(double[] array){
        for (int i=0; i<3; i++){
            this.arrayDouble[i] = array[i];
        }
    }

    public void majorEqualsWrappersFloat(float[] array){
        for (int i=0; i<3; i++){
            this.arrayFloat[i] = array[i];
        }
    }
    //                                                                               <---Zwracanie liczb po wrappowaniu
    public Double[] getMajorEqualsWrappersDouble(){
        return this.arrayDouble;
    }
    public Integer[] getMajorEqualsWrappersInt(){
        return this.arrayInt;
    }

    public Float[] getMajorEqualsWrappersFloat(){
        return this.arrayFloat;
    }
    //                                                                               <---Wypisywanie wylosowanych liczb (do testów)
    public void writeWrappedInt(){
        System.out.println();
        System.out.println("Int po wrappowaniu to: ");
        for (int i=0; i<3; i++){
            System.out.print(arrayInt[i]+ ", ");
        }
    }

    public void writeWrappedDouble(){
        System.out.println();
        System.out.println("Double po wrappowaniu to: ");
        for (int i=0; i<3; i++){
            System.out.print(arrayDouble[i]+ ", ");
        }
    }

    public void writeWrappedFloat(){
        System.out.println();
        System.out.println("Float po wrappowaniu to: ");
        for (int i=0; i<3; i++){
            System.out.print(arrayFloat[i]+ ", ");
        }
    }
}


class Compare{
    public void isMajorEqualWrappedInt(int[] arrayIntMajor, Integer[] arrayIntWrapped){
        boolean isEqual;
        isEqual = true;
        for (int i=0; i<3; i++){
            if (arrayIntMajor[i] != arrayIntWrapped[i].){
                isEqual = false;
                break;
            }
        }
        if( isEqual == true){
            System.out.println();
            System.out.println("Integery jako typ podstawowy i jako typ obiektowy są sobie równe");
        } else {
            System.out.println();
            System.out.println("Integery jako typ podstawowy i jako typ obiektowy NIE są sobie równe");
        }
    }

    public void isMajorEqualWrappedDouble(double[] arrayDoubleMajor, Double[] arrayDoubleWrapped){
        boolean isEqual;
        isEqual = true;
        for (int i=0; i<3; i++){
            if (arrayDoubleMajor[i] != arrayDoubleWrapped[i]){
                isEqual = false;
                break;
            }
        }
        if( isEqual == true){
            System.out.println();
            System.out.println("Double jako typ podstawowy i jako typ obiektowy są sobie równe");
        } else {
            System.out.println();
            System.out.println("Double jako typ podstawowy i jako typ obiektowy NIE są sobie równe");
        }
    }

    public void isMajorEqualWrappedFloat(float[] arrayFloatMajor, Float[] arrayFloatWrapped){
        boolean isEqual;
        isEqual = false;
        for (int i=0; i<3; i++){
            if (arrayFloatMajor[i] == arrayFloatWrapped[i]){
                isEqual = true;
                break;
            }
        }
        if( isEqual == true){
            System.out.println();
            System.out.println("Float jako typ podstawowy i jako typ obiektowy są sobie równe");
        } else {
            System.out.println();
            System.out.println("Float jako typ podstawowy i jako typ obiektowy NIE są sobie równe");
        }
    }
}


class Kodilla {
    public static void main (String[] args) {
        // your code goes here
        int arrayIntMajor[] = new int[3];
        double arrayDoubleMajor[] = new double[3];
        float arrayFloatMajor[] = new float[3];
        Integer arrayIntWrapped[] = new Integer[3];
        Double arrayDoubleWrapped[] = new Double[3];
        Float arrayFloatWrapped[] = new Float[3];
        Integer arrayIntWrapped2[] = new Integer[3];
        Double arrayDoubleWrapped2[] = new Double[3];
        Float arrayFloatWrapped2[] = new Float[3];

        RandomMajorNumbers randomMajorNumbers = new RandomMajorNumbers();
        MajorEqualsWrappers majorEqualsWrappers = new MajorEqualsWrappers();
        Compare compare = new Compare();

        arrayIntMajor = randomMajorNumbers.getRandomMajorNumbersInt(); // losowanie liczb typu podstawowego
        arrayDoubleMajor = randomMajorNumbers.getRandomMajorNumbersDouble();
        arrayFloatMajor = randomMajorNumbers.getRandomMajorNumbersFloat();
       /*randomMajorNumbers.writeRandomMajorNumbersInt(); // wypisywanie liczb typu podstawowego w konsoli
       randomMajorNumbers.writeRandomMajorNumbersDouble();
       randomMajorNumbers.writeRandomMajorNumbersFloat();*/

        majorEqualsWrappers.majorEqualsWrappersInt(arrayIntMajor); //przypisywanie wylosowanych liczb typu podstawowego do typów obiektowych i zwracanie ich
        majorEqualsWrappers.majorEqualsWrappersDouble(arrayDoubleMajor);
        majorEqualsWrappers.majorEqualsWrappersFloat(arrayFloatMajor);
        arrayIntWrapped = majorEqualsWrappers.getMajorEqualsWrappersInt();
        arrayDoubleWrapped = majorEqualsWrappers.getMajorEqualsWrappersDouble();
        arrayFloatWrapped = majorEqualsWrappers.getMajorEqualsWrappersFloat();
        arrayIntWrapped2 = arrayIntWrapped;
        arrayDoubleWrapped2 = arrayDoubleWrapped;
        arrayFloatWrapped2 = arrayFloatWrapped;
       /*majorEqualsWrappers.writeWrappedInt(); // wypisywanie liczb po wrappowaniu w konsoli
       majorEqualsWrappers.writeWrappedDouble();
       majorEqualsWrappers.writeWrappedFloat();*/

        System.out.println("Porównanie nr 1");
        compare.isMajorEqualWrappedInt(arrayIntMajor,arrayIntWrapped); //porównanie obu typów i wyświetlenie czy są sobie równe
        compare.isMajorEqualWrappedDouble(arrayDoubleMajor,arrayDoubleWrapped);
        compare.isMajorEqualWrappedFloat(arrayFloatMajor,arrayFloatWrapped);
        System.out.println("Porównanie nr 2");
        compare.isMajorEqualWrappedInt(arrayIntMajor,arrayIntWrapped2);
        compare.isMajorEqualWrappedDouble(arrayDoubleMajor,arrayDoubleWrapped2);
        compare.isMajorEqualWrappedFloat(arrayFloatMajor,arrayFloatWrapped2);

       /*przyrównałem wartość podstawową int do obiektowej Integer i są sobie równe. Teraz przypisze do kolejnej tablicy Integer wartości
       z pierwszego Integer i porównam z typem podstawowym*/
    }
}