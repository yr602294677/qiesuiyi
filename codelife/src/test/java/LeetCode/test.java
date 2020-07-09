package LeetCode;

import java.util.ArrayList;
import java.util.List;
import reactor.core.publisher.FluxProcessor;
import reactor.core.publisher.UnicastProcessor;

public class test {
    private static List<String> wjljList=new ArrayList<String>();


    public static void main(String[] args) {
        FluxProcessor<Integer, Integer> publisher = UnicastProcessor.create();
        publisher.doOnNext(event -> System.out.println("receive event: " + event)).subscribe();

        publisher.onNext(1); // print 'receive event: 1'
        publisher.onNext(2); // print 'receive event: 2'
    }
}
