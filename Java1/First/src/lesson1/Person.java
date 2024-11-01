package lesson1;
class Person1 {
    public String personName; //建立屬性或是作欄位(登錄的內容子項)
    public static int personCount = 0; // 靜態變數宣告，所有人都對應到一樣的

    // 建構子，與類別名稱相同(第一字母大寫)
    public Person1(String name) {
        this.personName = name;
        personCount++;
    }

    public void showName() {
        System.out.println("person name is " + personName);
    }

    // // 封裝回傳name
    // public String getName(String car) {
    //     return this.personName + " have a " + car + " car";
    // }

    // 靜態方法印出personCount
    public static void callPersonCountWithStatic() {
        System.out.println("Total people is " + personCount);
    }

    public static String callPersonCount(){
        String result = "total is " + personCount;
        return result;
    }
}
