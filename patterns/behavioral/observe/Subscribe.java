package patterns.behavioral.observe;

import java.util.ArrayList;
import java.util.List;

public class Subscribe implements  Candidate{

    private List<Candidate> candidateList;

    public Subscribe() {
        candidateList= new ArrayList<>();
    }

    public  void subscribe(Candidate candidate){
        candidateList.add(candidate);
    }
    public  void unsubscribe(Candidate candidate){
        candidateList.remove(candidate);
    }

    @Override
    public void call(Event event) {
        candidateList.forEach(candidate -> candidate.call(event));
    }
}
