import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//Напишите код, с помощью которого можно разделить строку на части.
//Код должен работать для строк любого размера и любого содержания.
// Размер частей вы устанавливаете самостоятельно.

        String s = "123456789123456sfsrdg yut78878789";
        int size = 4;

        String[] parts = s.split("(?<=\\G.{"+size+"})");
        System.out.println(Arrays.toString(parts));
    }
}