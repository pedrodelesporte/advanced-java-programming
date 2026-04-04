package javaclasslabs.domain.test;

import javaclasslabs.domain.PQ;
import javaclasslabs.domain.PQInterface;
import javaclasslabs.domain.Patient;

public class PQTest01 {
    public static void main(String[] args) throws Exception {

        Patient p = new Patient("Pedro", 20, 499);
        System.out.println(p); //prints fake address "hashcode"


//        PQInterface<Integer, String> pq = new PQ<>();
//
//        pq.add(10, "Pedro");
//        pq.add(15, "Gabriel");
//        pq.add(20, "Raniery");
//
//        System.out.println(pq.toString());

    }
}
