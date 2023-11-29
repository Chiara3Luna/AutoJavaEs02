public class Main {
    public static void main(String[] args) {
        // dichiaro oggetto tipo Auto
        Auto auto1 = new Auto(2000, "AB123CD", "Fiat", "Panda");

        // imposto valori proprietà con setter
        auto1.setCilindrata(2000);
        auto1.setTarga("AB123CD");
        auto1.setMarca("Fiat");
        auto1.setModello("Panda");

        // stampa valori proprietà
        System.out.println(auto1);
    }
}