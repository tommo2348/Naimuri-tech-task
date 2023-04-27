package com.example.model;

import java.util.Objects;
import java.util.Set;

public record Dictionary(Set<String> words) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dictionary that = (Dictionary) o;
        return Objects.equals(words, that.words);
    }

}
