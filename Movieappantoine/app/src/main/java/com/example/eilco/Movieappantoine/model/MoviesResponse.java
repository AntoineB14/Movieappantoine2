package com.example.eilco.movieappsaid.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Result;

/**
 * Created by saide on 25/11/2017.
 */

public class MoviesResponse {
        @SerializedName("page")
        private long page;
        @SerializedName("total_results")
        private long totalResults;
        @SerializedName("total_pages")
        private long totalPages;
        @SerializedName("results")
        private List<Movie> results;

        public long getPage() {
            return page;
        }

        public void setPage(long page) {
            this.page = page;
        }

        public long getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(long totalResults) {
            this.totalResults = totalResults;
        }

        public long getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(long totalPages) {
            this.totalPages = totalPages;
        }

        public List<Movie> getResults() {
            return results;
        }

        public void setResults(List<Movie> results) {
            this.results = results;
        }


    }

