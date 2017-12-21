package com.durrutia.dnews.model;

import com.ucn.dnews.model.Article;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public final class TestArticle {

    /**
     * Simple test del constructor via patron builder.
     */
    @Test
    public void testConstructor() {

        final Article article = Article.builder()
                .author("Jose Diaz Vargas")
                .title("Example Title")
                .description("Example Description")
                .url("http://ucn.cl")
                .build();

        Assertions.assertThat(article).isNotNull();

        Assertions.assertThat(article.getAuthor()).isNotBlank();

    }

}
