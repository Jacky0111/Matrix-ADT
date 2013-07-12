//////////////////////////////////////////////////////////////
//
//  Raj Maitra
//  Username: Rmaitra
//  Assignment: pa3
//
//////////////////////////////////////////////////////////////

class ListTest{
   public static void main(String[] args){
      List A = new List();
      List B = new List();
     
      //Test defined Lists Constructs
      System.out.println("Test predefined constructs of the List class: ");
      System.out.println("A.index = "+A.getIndex());
         //System.out.prinln(A.getCurrent()); //Undefined current... 
      System.out.println();

      //Test insert Lists, front and back
      for(int i=1; i<=10; i++){
         A.insertBack(i);
         System.out.println("Insert to Back of List A");
         System.out.println(A);
         B.insertFront(i);
         System.out.println("Insert to Front of List B");
         System.out.println(B);
      }
      System.out.println();
 
      //Test getFront, getBack
      System.out.println("Test getFront of A and B: ");
      System.out.println("A.getFront = "+A.getFront());
      System.out.println("B.getFront = "+B.getFront());
      System.out.println("Test getBack of A and B: ");
      System.out.println("A.getBack = "+A.getBack());
      System.out.println("B.getBack = "+B.getBack());
      System.out.println();
     
      //Test getCurrent, getIndex, getLength, insertAfterCurrent, insertBeforeCurrent  
      System.out.println("Test Current of A: (should be at back of list because getBack()");
      System.out.println(A);
      System.out.println("A.getCurrent = "+A.getCurrent());
      System.out.println();
      
      System.out.println("Test insertBeforeCurrent of A: ");
      System.out.println(A);
      A.insertBeforeCurrent(99);
      System.out.println(A);
      System.out.println("Test Index: ");
      System.out.println("A.getIndex = "+A.getIndex());
      System.out.println("Test Length: ");
      System.out.println("A.getLength = "+A.getLength());
      System.out.println();
      
      System.out.println("Test insertAfterCurrent of A: ");
      System.out.println(A);
      A.insertAfterCurrent(16);
      System.out.println(A);
      System.out.println("Test Index: ");
      System.out.println("A.getIndex = "+A.getIndex());
      System.out.println("Test Length: ");
      System.out.println("A.getLength = "+A.getLength());
      System.out.println();
      
      //Test moveTo, movePrev, moveNext and deleteCurrent 
      System.out.println("Test moveTo of A: ");
      System.out.println("A.getIndex = "+A.getIndex());
      System.out.println("Move to index 2... ");
      A.moveTo(2);//uses movePrev in the ADT
      System.out.println("A.Index after move = "+ A.getIndex());
      System.out.println("Move again, to index 6... ");
      A.moveTo(6);//uses moveNext in the ADT
      System.out.println("A.Index after move = "+ A.getIndex());
      System.out.println("Test deleteCurrent of A: (deleting data in index 6) ");
      System.out.println("pre: " +A);
      A.deleteCurrent();
      System.out.println("A.deleteCurrent = " +A);
      System.out.println("A.Index after delete = "+ A.getIndex());
      System.out.println();
    
      //Test deleteFront, deleteBack
      System.out.println("Test deleteFront of A and B: ");
      System.out.println("A = "+A);
      A.deleteFront();
      System.out.println("A after deleteFront = "+A);
      System.out.println("B = "+B);
      B.deleteFront();
      System.out.println("B after deleteFront = "+B);
      System.out.println();
      System.out.println("Test deleteBack of A and B: ");
      System.out.println("A = "+A);
      A.deleteBack();
      System.out.println("A after deleteBack = "+A);
      System.out.println("B = "+B);
      B.deleteBack();
      System.out.println("B after deleteBack = "+B);

   }
}


