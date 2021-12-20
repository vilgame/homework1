package animals;

public class Kotik extends Carnivorous implements Run, Voice {
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count;
    private static final int METHODS = 5;

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;

    }

    public Kotik() {
        count++;
    }

    @Override
    public void run() {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    private boolean play() {
        if (satiety > 0) {
            System.out.println("Играет");
            satiety--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    private boolean sleep() {
        if (satiety > 0) {
            System.out.println("Спит");
            satiety--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    private boolean wash() {
        if (satiety > 0) {
            System.out.println("Умывается");
            satiety--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    private boolean walk() {
        if (satiety > 0) {
            System.out.println("Гуляет");
            satiety--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    private boolean hunt() {
        if (satiety > 0) {
            System.out.println("Охотится");
            satiety--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    private int eat(int satiety) {
        this.satiety += satiety;
        return satiety;
    }

    private void eat(int satiety, String foodName) {
        this.satiety = eat(satiety);
        System.out.println("Ест " + foodName + " - " + getSatiety());
    }

    private void eat() {
        String[] foodName  = {"Fish", "Milk", "Chicken"};
        eat((int) (Math.random() * 3) + 3, foodName[(int) (Math.random() * 3)]);
    }

    public String[] liveAnotherDay() {
        String[] pastimeArray = new String[24];
        for (int i = 0; i<24; i++) {
            switch ((int) (Math.random() * METHODS) + 1) {
                case 1:
                    if (play()) {
                        pastimeArray[i] = i + " - играл";
                    }
                    else {
                        pastimeArray[i] = i + " - ел";
                    }
                    break;
                case 2:
                    if (sleep()) {
                        pastimeArray[i] = i + " - спал";
                    }
                    else {
                        pastimeArray[i] = i + " - ел";
                    }
                    break;
                case 3:
                    if (wash()) {
                        pastimeArray[i] = i + " - умывался";
                    }
                    else {
                        pastimeArray[i] = i + " - ел";
                    }
                    break;
                case 4:
                    if (walk()) {
                        pastimeArray[i] = i + " - гулял";
                    }
                    else {
                        pastimeArray[i] = i + " - ел";
                    }
                    break;
                case 5:
                    if (hunt()) {
                        pastimeArray[i] = i + " - охотился";
                    }
                    else {
                        pastimeArray[i] = i + " - ел";
                    }
                    break;
            }
        }
        return pastimeArray;
    }
}
