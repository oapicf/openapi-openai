package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.FileSearchRankingOptions;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Overrides for the file search tool.
 */
public class AssistantToolsFileSearchFileSearch   {

    private Integer maxNumResults;
    private FileSearchRankingOptions rankingOptions;

    /**
     * Default constructor.
     */
    public AssistantToolsFileSearchFileSearch() {
    // JSON-B / Jackson
    }

    /**
     * Create AssistantToolsFileSearchFileSearch.
     *
     * @param maxNumResults The maximum number of results the file search tool should output. The default is 20 for &#x60;gpt-4*&#x60; models and 5 for &#x60;gpt-3.5-turbo&#x60;. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than &#x60;max_num_results&#x60; results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
     * @param rankingOptions rankingOptions
     */
    public AssistantToolsFileSearchFileSearch(
        Integer maxNumResults, 
        FileSearchRankingOptions rankingOptions
    ) {
        this.maxNumResults = maxNumResults;
        this.rankingOptions = rankingOptions;
    }



    /**
     * The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
     * minimum: 1
     * maximum: 50
     * @return maxNumResults
     */
    public Integer getMaxNumResults() {
        return maxNumResults;
    }

    public void setMaxNumResults(Integer maxNumResults) {
        this.maxNumResults = maxNumResults;
    }

    /**
     * Get rankingOptions
     * @return rankingOptions
     */
    public FileSearchRankingOptions getRankingOptions() {
        return rankingOptions;
    }

    public void setRankingOptions(FileSearchRankingOptions rankingOptions) {
        this.rankingOptions = rankingOptions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistantToolsFileSearchFileSearch {\n");
        
        sb.append("    maxNumResults: ").append(toIndentedString(maxNumResults)).append("\n");
        sb.append("    rankingOptions: ").append(toIndentedString(rankingOptions)).append("\n");
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

