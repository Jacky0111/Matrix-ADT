///////////////////////////////////
// 
//   Raj Maitra
//   Rmaitra
//   pa3
//
/////////////////////////////////// 

class MatrixTest{
   public static void main(String[] args){
      Matrix A = new Matrix(4);
      Matrix B, C;
      Matrix Q = new Matrix(10);
      Matrix Q_add = new Matrix(10);
      Matrix D;
      Matrix M1 = new Matrix(2);
      Matrix M2 = new Matrix(2);
      
      //-----changeEntry Test-----------
      System.out.println("-------changeEntry()--------");
      A.changeEntry(1,1,6.0);
      A.changeEntry(1,3,5.0);
      A.changeEntry(1,1,0.0);
      A.changeEntry(2,4,45.0);
      A.changeEntry(4,4,3.0);
      A.changeEntry(4,3,99.0);
      A.changeEntry(4,3,33.0);
      A.changeEntry(4,3,0.0);
      System.out.println(A);
      System.out.println("nnz = "+ A.getNNZ());
     
      //-----scalarMult Test-----------
      System.out.println("-------scalarMult()--------");
      System.out.println("A*2.0");
      B = A.scalarMult(2.0);
      System.out.println(B);
 
      //-----copy Test-----------
      System.out.println("-------copy()--------");
      System.out.println("A.copy");
      C = A.copy();
      System.out.println(C);

      //-----add Matrix Test-----------
      System.out.println("-------add()--------");
      Q.changeEntry(1,3,25.0);
      Q.changeEntry(1,8,33.0);
      Q.changeEntry(2,1,8.0);
      Q.changeEntry(3,3,8.0);
      Q.changeEntry(3,6,8.0);
      Q_add.changeEntry(1,3,75.0);
      Q_add.changeEntry(1,8,22.0);
      Q_add.changeEntry(2,5,9.0);
      Q_add.changeEntry(3,5,9.0);
      Q_add.changeEntry(3,6,9.0);
      
      System.out.println("Q = ");
      System.out.println(Q);
      System.out.println("Q1 = ");
      System.out.println(Q_add);
      D = Q.add(Q_add);
      System.out.println("Q+Q1 = ");
      System.out.println(D);

      //-----sub Matrix Test-----------
      System.out.println("-------sub()--------");
      D = Q.sub(Q_add);
      System.out.println(D);

      //-----Transpose Matrix Test-----------
      System.out.println("-------transpose()--------");
      A = D.transpose();
      System.out.println(D);
      System.out.println("Transpose of D");
      System.out.println(A);


      //-----Multiply Matrix Test-----------
      System.out.println("-------mult()--------");
      A = Q.mult(Q_add);
      System.out.println("multiply");
      System.out.println(A);
  
      M1.changeEntry(1,1,1.0);
      M1.changeEntry(1,2,0);
      M1.changeEntry(2,1,0);
      M1.changeEntry(2,2,2.0);
      M2.changeEntry(1,1,1.0);
      M2.changeEntry(1,2,2.0);
      M2.changeEntry(2,1,3.0);
      M2.changeEntry(2,2,4.0);
      
      System.out.println("M1 = ");
      System.out.println(M1);
      System.out.println("M2 = ");
      System.out.println(M2);
      A = M1.mult(M2);
      System.out.println("M1*M2 = ");
      System.out.println(A);
    
      System.out.println("\n");
      System.out.println("---------Test Done---------");
   }
} 
