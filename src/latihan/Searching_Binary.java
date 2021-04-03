package latihan;
public class Searching_Binary {
    public static void main(String[] args){
    int A[] = {12, 22, 24, 34, 54};
    int cari = 24;
    int N = 5;
    int batas_bawah = N - 1;
    int batas_atas = 0;
    boolean ketemu = false;
    int tengah = 0;
    
    System.out.print("isi data adalah : ");
    for(int i = 0; i < A.length; i++){
    System.out.print(A[i] + " ");
    System.out.println("");
    
    while ((batas_atas < batas_bawah) && (!ketemu)){
    tengah = (batas_atas + batas_bawah) /2;
    if (A[tengah] == cari){
        ketemu = true;
    } else{
        if (A[tengah] < cari){
            batas_atas = tengah ++;
        }else{
            batas_atas = tengah--;
    if (ketemu){
    System.out.println("Data " + cari + " telah ditemukan pada index ke + " + (tengah + " baris ke" +(tengah + 1)));
    } else{
        System.out.println("\n");
        System.out.println();
    }
        }
    }
    }
    
    }
    }
}