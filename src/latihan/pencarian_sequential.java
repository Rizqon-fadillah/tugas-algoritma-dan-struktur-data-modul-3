package latihan;
public class pencarian_sequential {
    public static void main (String[] args){
    int data [] = {12, 22, 34, 78, 98, 45};
    int key = 98;
    
    System.out.print("isi data adalah : ");
    for(int i = 0; i < data.length; i++){
        System.out.print(data[i] + " ");
    }
    System.out.println("");
    for(int i = 0; i <= data.length; i++){
        if(key == data[i]){
            System.out.print("Data " + key + " berada pada index ke - 4");
            break;
        }
    }
    System.out.println("\n");
    System.out.println();
    }
}

