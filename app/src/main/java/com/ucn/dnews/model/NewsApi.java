
package com.ucn.dnews.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

/**
 * Clase generada via http://www.jsonschema2pojo.org/
 */
@Builder
public final class NewsApi {

    @Getter
    private String status;

    @Getter
    private String source;

    @Getter
    private String sortBy;

    @Getter
    private List<com.ucn.dnews.model.Article> articles;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
