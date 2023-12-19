package project_pdpl;

public class OperationFactory {

    public Operation createOperation(int pilihan) {
        switch (pilihan) {
            case 1:
                return new Penjumlahan();
            case 2:
                return new Pengurangan();
            case 3:
                return new Perkalian();
            case 4:
                return new Pembagian();
            case 5:
                return new Akar();
            case 6:
                return new Kuadrat();
            default:
                System.out.println("Opsi operasi tidak valid");
                return null;
        }
    }
}
