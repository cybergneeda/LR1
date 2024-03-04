public class Part_2 {
public static void main(String[] args)
{
    System.out.print("\033[H\033[2J");
    String str1= new String(" Если волк молчит, то лучше его не перебивать ");
    System.out.println("Исходная строка: "+str1);
    str1 = str1.trim();
    System.out.println("Исходная строка без пробелов в начале и в конце: "+str1);
    System.out.println("Исходная строка в верхнем регистре: "+str1.toUpperCase());
    str1=str1.toLowerCase();
    System.out.println("Исходная строка в нижнем регистре: "+str1);
    System.out.println("Строка начинается со слова \"если\": "+str1.startsWith("если"));
    System.out.println("Строка начинается со слова \"волк\": "+str1.startsWith("волк"));
    System.out.println("Длина строки: "+str1.length()+" символа"); 
    System.out.println("Строка содержит слово \"волк\": "+str1.contains("волк"));
    System.out.println("Строка содержит слово \"лев\": "+str1.contains("лев"));
    System.out.println("Строка пуста: "+str1.isEmpty());
    String str2=str1.substring(0,17);
    System.out.println("Первая часть строки: "+str2);
    String str3=str1.substring(17);
    System.out.println("Вторая часть строки: "+str3);
    System.out.println("9 символ строки: "+str1.charAt(8));
    str2=str2.concat(str3);
    System.out.println("Объединенные фрагменты строки: "+str2);
    System.out.println("Последовательность символов \"ол\" впервые встречается в строке под "+(str1.indexOf("ол")+1)+" индексом");
    System.out.println("Последовательность символов \"ол\" в последний раз встречается в строке под "+(str1.lastIndexOf("ол")+1)+" индексом");
    System.out.println("Исходная и объединенная строки равны: "+str1.equals(str2));
    System.out.println("Сравнение без учета регистра работает: "+str1.equalsIgnoreCase(str1.toUpperCase()));
    System.out.println("Замена слова \"волк\" на слово \"лев\": "+str1.replace("волк", "лев"));
    String[] words= str1.replace(",","").split(" ");
    System.out.println("Разбиение строки на слова: ");
    for (String word : words) {
        System.out.println(word);
    }
}
}
