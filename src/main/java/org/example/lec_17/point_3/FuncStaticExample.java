package org.example.lec_17.point_3;

import java.util.function.Predicate;

public class FuncStaticExample {
    public static void main(String[] args) {
        FilterExample filterExample = x -> x > 20;

        FilterImpl filterImpl = new FilterImpl();

        FilterExample filter = x -> filterImpl.filter(x);
        FilterExample filterMethodReference = filterImpl::filter;

        FilterExample staticFilter = x -> FilterImpl.staticFilter(x);
        FilterExample staticFilterMethodReference = FilterImpl::staticFilter;

        Predicate<Integer> predicate = filterImpl::filter;
    }
}

interface FilterExample {
    boolean filter(Integer x);
}

class FilterImpl {
    boolean filter(Integer x) {
        return staticFilter(x);
    }

    boolean filter(String string) {
        return staticFilter(string.length());
    }

    static boolean staticFilter(Integer x) {
        return x > 20;
    }
}
