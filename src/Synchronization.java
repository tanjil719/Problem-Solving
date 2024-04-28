//public class Synchronization {
//    public static void main(String args[]) {
//        Power obj = new Power();//only one object
//        Thread1 p1 = new Thread1(obj);
//        Thread2 p2 = new Thread2(obj);
//        Thread2 p3 = new Thread2(obj);
//        Thread3 p4 = new Thread3(obj);
//
//        p1.start();
//        p2.start();
//        p3.start();
//        p4.start();
//    }
//}
//
//class Thread1 extends Thread {
//    Power p;
//
//    Thread1(Power p) {
//        this.p = p;
//    }
//
//    public void run() {
//        p.printPower(5);
//    }
//}
//
//class Thread3 extends Thread {
//    Power p;
//
//    Thread3(Power p) {
//        this.p = p;
//    }
//
//    public void run() {
//        p.printPower(4);
//    }
//}
//
//
//class Thread2 extends Thread {
//    Power p;
//
//    Thread2(Power p) {
//        this.p = p;
//    }
//
//    public void run() {
//        p.printPower(8);
//    }
//}
//
////synchronized (object){
//////code of the block.
////        }
//
//class Power {
////    void printPower(int n) {
////        int temp = 1;
////        for (int i = 1; i <= 5; i++) {
////            System.out.println(Thread.currentThread().getName() + ":- " + n + "^" + i + " value: " + n * temp);
////            temp = n * temp;
////            try {
////                Thread.sleep(500);
////            } catch (Exception e) {
////                System.out.println(e);
////            }
////        }
//
//
//    void printPower(int n) {//method synchronized
////        int temp = 1;
////        for (int i = 1; i <= 5; i++) {
////            System.out.println(Thread.currentThread().getName() + ":- " + n + "^" + i + " value: " + n * temp);
////            temp = n * temp;
////            try {
////                Thread.sleep(500);
////            } catch (Exception e) {
////                System.out.println(e);
////            }
////        }
//        synchronized (object) { //synchronized block
//            int temp = 1;
//            for (int i = 1; i <= 5; i++) {
//                System.out.println(Thread.currentThread().getName() + ":- " + n + "^" + i + " value: " + n * temp);
//                temp = n * temp;
//                try {
//                    Thread.sleep(500);
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//            }
//        }
//
//    }
//
//}
//
