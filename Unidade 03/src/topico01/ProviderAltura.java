package topico01;

import java.util.Comparator;

public class ProviderAltura implements Comparator<PessoaComparator> {

    @Override
    public int compare(PessoaComparator p1, PessoaComparator p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
