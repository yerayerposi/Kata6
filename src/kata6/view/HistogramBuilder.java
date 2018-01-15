
package kata6.view;

import java.util.List;
import kata6.model.Histogram;


public class HistogramBuilder <T> {

    private final List<T> items;

    public HistogramBuilder(List<T> items) {
        this.items = items;
    }
    
    public <A>Histogram<A> build(Attribute <T,A> attribute) {
        
        Histogram<A> histo = new Histogram<>();
        for (T item : items) {
            A value = attribute.get(item);
            histo.increment(value);
        }
        return histo;
        
    }
    
}
