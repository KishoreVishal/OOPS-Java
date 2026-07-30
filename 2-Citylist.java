import java.util.*;

class City {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> city = new ArrayList<>();

        String newcity, search;
        int index;

        city.add("Madurai");
        city.add("Chennai");
        city.add("Trichy");

        System.out.println("Initial List: " + city);

        System.out.print("City to Add: ");
        newcity = in.next();      // next() instead of nextInt()
        city.add(newcity);

        System.out.println("Updated List: " + city);

        System.out.print("Index: ");
        index = in.nextInt();

        System.out.print("City to Add: ");
        newcity = in.next();
        city.add(index, newcity);

        System.out.println("Updated List: " + city);

        System.out.print("City to Search: ");
        search = in.next();

        for (int i = 0; i < city.size(); i++) {
            if (search.equals(city.get(i))) {
                System.out.println("City found at index " + i);
            }
        }

        System.out.print("Starting Letter: ");
        char c = in.next().charAt(0);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < city.size(); i++) {
            String str = city.get(i);
            if (str.charAt(0) == c) {
                list.add(str);
            }
        }

        System.out.println("Cities starting with '" + c + "': " + list);

        
    }
}
