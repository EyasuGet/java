package TruthTable;

import java.util.ArrayList;



import java.util.*;

public class Truth {
    void generateTable3(){
        ArrayList<Integer> Minterm = new ArrayList<>();
        ArrayList<Integer> Maxterm = new ArrayList<>();
        StringBuilder t = new StringBuilder();
        StringBuilder p = new StringBuilder();
        System.out.println("  A\t" + "\t" + " B\t" + "\tC" + "\t" + "\tResult");
        for (int i = 0; i < 8; i++) {
            boolean A = ((i >> 2) & 1) == 1;
            boolean B = ((i >> 1) & 1) == 1;
            boolean C = (i & 1) == 1;
            boolean Result = ((A));

            System.out.println(A + "\t" + B + "\t" + C + "\t" + Result);
            if (Result) {
                Minterm.add(i+1);
                t.append(SOP3(A,B,C));
            }else{
                Maxterm.add(i+1);
                p.append(POS3(A,B,C));
            }
        }
        System.out.println("Min-term rows " + Minterm);
        System.out.println("Max-term rows " + Maxterm);
        System.out.println("The SSOP Of the Expression "+"F(A, B, C)= " + t.substring(0, t.length()-1));
        System.out.println("The SPOS Of the Expression "+"F(A, B, C)= " + p);
    }
    void generateTable2() {
        ArrayList<Integer> Minterm = new ArrayList<>();
        ArrayList<Integer> Maxterm = new ArrayList<>();
        StringBuilder t = new StringBuilder();
        StringBuilder p = new StringBuilder();
        System.out.println("  A" + "\t" + "\tB" + "\t" + "  Result");
        for (int i = 0; i < 4; i++) {
            boolean A = ((i>>1) & 1) == 1;
            boolean B = ((i)&1) == 1;
            boolean Result = (A | B);
            System.out.println(A + "\t" + B + "\t" + Result );
            if (Result) {
                Minterm.add(i+1);
                t.append(SOP2(A,B));
            }else{
                Maxterm.add(i+1);
                p.append(POS2(A,B));
            }
        }
        System.out.println("Min-term rows " + Minterm);
        System.out.println("Max-term rows " + Maxterm);
        System.out.println("The SSOP Of the Expression "+"F(A, B)= " + t.substring(0, t.length()-1));
        System.out.println("The SPOS Of the Expression "+"F(A, B)= " + p);
    }

    void generateTable1() {
        StringBuilder t = new StringBuilder();
        StringBuilder p = new StringBuilder();
        ArrayList<Integer> Minterm = new ArrayList<>();
        ArrayList<Integer> Maxterm = new ArrayList<>();
        System.out.println("A\t" + "\t" + " Result");
        for (int i = 0; i < 2; i++) {
            boolean A = ((i) & 1) == 1;
            boolean Result = !(A);
            System.out.println(A + "\t" + Result);
            if (Result) {
                Minterm.add(i+1);
                t.append(SOP1(A));
            }else{
                Maxterm.add(i+1);
                p.append(POS1(A));
            }
        }
        System.out.println("Min-term rows " + Minterm);
        System.out.println("Max-term rows " + Maxterm);
        System.out.println("The SSOP Of the Expression "+"F(A)= " + t);
        System.out.println("The SPOS Of the Expression "+"F(A)= " + p);
    }
    public String POS3(boolean A, boolean B, boolean C){
        StringBuilder sb = new StringBuilder();
        if(!A){
            sb.append("(A + ");
        }else {
            sb.append("('A + ");
        } if(!B){
            sb.append("B + ");
        }else {
            sb.append("'B + ");
        }if(!C){
            sb.append("C)");
        }else {
            sb.append("'C)");
        } return sb.toString();
    }public String SOP3(boolean A, boolean B, boolean C){
        StringBuilder sb = new StringBuilder();
        if(A){
            sb.append("(A.");
        }else {
            sb.append("('A.");
        } if(B){
            sb.append("B.");
        }else {
            sb.append("'B.");
        }if(C){
            sb.append("C)+");
        }else {
            sb.append("'C)+");
        }
        return sb.toString();
    }
    public String SOP2(boolean A, boolean B){
        StringBuilder sb = new StringBuilder();
        if(A){
            sb.append("(A.");
        }else {
            sb.append("('A.");
        } if(B){
            sb.append("B)+");
        }else {
            sb.append("'B)+");
        }
        return sb.toString();
    }

    public String POS2(boolean A, boolean B){
        StringBuilder sb = new StringBuilder();
        if(!A){
            sb.append("(A + ");
        }else {
            sb.append("('A + ");
        } if(!B){
            sb.append("B)");
        }else {
            sb.append("'B)");
        } return sb.toString();
    }public String SOP1(boolean A) {
        StringBuilder sb = new StringBuilder();
        if(A) {
            sb.append("A");
        }else {
            sb.append("'A");
        }
        return sb.toString();
    }
    public String POS1(boolean A)
    {
        StringBuilder sb = new StringBuilder();
        if(!A){
            sb.append("A");
        }else {
            sb.append("'A");
        } return sb.toString();
    }
    public static void main(String[] args) {
        Truth p = new Truth();
//        p.generateTable1();
        p.generateTable2();
        p.generateTable3();
    }
}