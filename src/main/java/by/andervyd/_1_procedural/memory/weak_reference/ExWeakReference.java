package by.andervyd._1_procedural.memory.weak_reference;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class ExWeakReference {
    public static void main(String[] args) throws InterruptedException {

        List<WeakReference<byte[]>> list = new ArrayList<>();

        while (true) {
            System.out.println();

            for (WeakReference<byte[]> ref : list) {
                System.out.print(ref.get() == null ? "*" : "E");
            }
            list.add(new WeakReference<>(new byte[10_000_000]));
            Thread.sleep(100);
        }
    }
} // >> ...
  //    **********EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
  //    ***********EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
  //    ************EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
  //    ...
