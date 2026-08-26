package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.RunStepDetailsToolCallsFileSearchRankingOptionsObject;
import org.openapitools.server.model.RunStepDetailsToolCallsFileSearchResultObject;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * For now, this is always going to be an empty object.
 */
public class RunStepDetailsToolCallsFileSearchObjectFileSearch   {

    private RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions;
    private List<@Valid RunStepDetailsToolCallsFileSearchResultObject> results = new ArrayList<>();

    /**
     * Default constructor.
     */
    public RunStepDetailsToolCallsFileSearchObjectFileSearch() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDetailsToolCallsFileSearchObjectFileSearch.
     *
     * @param rankingOptions rankingOptions
     * @param results The results of the file search.
     */
    public RunStepDetailsToolCallsFileSearchObjectFileSearch(
        RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions, 
        List<@Valid RunStepDetailsToolCallsFileSearchResultObject> results
    ) {
        this.rankingOptions = rankingOptions;
        this.results = results;
    }



    /**
     * Get rankingOptions
     * @return rankingOptions
     */
    public RunStepDetailsToolCallsFileSearchRankingOptionsObject getRankingOptions() {
        return rankingOptions;
    }

    public void setRankingOptions(RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions) {
        this.rankingOptions = rankingOptions;
    }

    /**
     * The results of the file search.
     * @return results
     */
    public List<@Valid RunStepDetailsToolCallsFileSearchResultObject> getResults() {
        return results;
    }

    public void setResults(List<@Valid RunStepDetailsToolCallsFileSearchResultObject> results) {
        this.results = results;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDetailsToolCallsFileSearchObjectFileSearch {\n");
        
        sb.append("    rankingOptions: ").append(toIndentedString(rankingOptions)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

