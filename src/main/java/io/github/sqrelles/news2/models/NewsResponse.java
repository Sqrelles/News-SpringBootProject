package io.github.sqrelles.news2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class NewsResponse {

    private long totalCount;
    private List<News> news;


}
