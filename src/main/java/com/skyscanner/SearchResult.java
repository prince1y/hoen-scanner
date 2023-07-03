package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SearchResult {
    @JsonProperty
    private String city;

    @JsonProperty
    private String kind;

    @JsonProperty
    private String title;
}
