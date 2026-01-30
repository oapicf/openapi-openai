package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.FileSearchRankingOptions;

/**
 * Overrides for the file search tool.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssistantToolsFileSearchFileSearch   {
  
  private Integer maxNumResults;
  private FileSearchRankingOptions rankingOptions;

  public AssistantToolsFileSearchFileSearch () {

  }

  public AssistantToolsFileSearchFileSearch (Integer maxNumResults, FileSearchRankingOptions rankingOptions) {
    this.maxNumResults = maxNumResults;
    this.rankingOptions = rankingOptions;
  }

    
  @JsonProperty("max_num_results")
  public Integer getMaxNumResults() {
    return maxNumResults;
  }
  public void setMaxNumResults(Integer maxNumResults) {
    this.maxNumResults = maxNumResults;
  }

    
  @JsonProperty("ranking_options")
  public FileSearchRankingOptions getRankingOptions() {
    return rankingOptions;
  }
  public void setRankingOptions(FileSearchRankingOptions rankingOptions) {
    this.rankingOptions = rankingOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistantToolsFileSearchFileSearch assistantToolsFileSearchFileSearch = (AssistantToolsFileSearchFileSearch) o;
    return Objects.equals(maxNumResults, assistantToolsFileSearchFileSearch.maxNumResults) &&
        Objects.equals(rankingOptions, assistantToolsFileSearchFileSearch.rankingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxNumResults, rankingOptions);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
