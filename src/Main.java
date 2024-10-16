public class Main{
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();

        Integer[] arr = {10,20,50,30,40,70,60,80};
        for (int a : arr) {
            bst.insert(a);
        }

        for (int a = 0; a < 50; a++){
            bst.insert((int) (Math.random() * 100));
        }



        System.out.print("In-order traversal: ");
        bst.inOrder();

        int key = 40;
        if (bst.search(key)) {
            System.out.println(key + " found in the tree.");
        } else {
            System.out.println(key + " not found in the tree.");
        }
    }
}