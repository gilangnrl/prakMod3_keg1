class Company {
    public void criteria(String companyName) {
        System.out.println("Nama Perusahaannya adalah: " + companyName);
    }

    public void criteria(String founder, String coFounder) {
        System.out.println("Pendiri perusahaannya adalah: " + founder + (coFounder == null ? "" : " dan " + coFounder));

    }

    public void criteria(double revenue, int date) {
        System.out.println("Pendapatan tahun " + date + " adalah: " + "$" + revenue);
    }

    public void criteria(String[] product) {
        System.out.println("Produk yang disediakan perusahaan ini adalah: ");
        int arrayLenght = product.length;
        for(int i = 0; i < arrayLenght; i++) {
            System.out.println(i+1 + ". " + product[i]);
        }
    }

    
}

public class FoodComp extends Company{
    public static void main(String[] args) throws Exception {
        FoodComp kfc = new FoodComp();

        kfc.criteria("KFC");
        kfc.criteria("Gilang", "Adit");
        kfc.criteria(27.9, 2020);
        String[] product = {"Burger", "Ayang Goreng", "MilkShakes", "Soup", "Minuman Soda"};
        kfc.criteria(product);
    }
}
