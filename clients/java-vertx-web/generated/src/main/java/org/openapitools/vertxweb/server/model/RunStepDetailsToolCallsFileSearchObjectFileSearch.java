package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.RunStepDetailsToolCallsFileSearchRankingOptionsObject;
import org.openapitools.vertxweb.server.model.RunStepDetailsToolCallsFileSearchResultObject;

/**
 * For now, this is always going to be an empty object.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunStepDetailsToolCallsFileSearchObjectFileSearch   {
  
  private RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions;
  private List<RunStepDetailsToolCallsFileSearchResultObject> results = new ArrayList<>();

  public RunStepDetailsToolCallsFileSearchObjectFileSearch () {

  }

  public RunStepDetailsToolCallsFileSearchObjectFileSearch (RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions, List<RunStepDetailsToolCallsFileSearchResultObject> results) {
    this.rankingOptions = rankingOptions;
    this.results = results;
  }

    
  @JsonProperty("ranking_options")
  public RunStepDetailsToolCallsFileSearchRankingOptionsObject getRankingOptions() {
    return rankingOptions;
  }
  public void setRankingOptions(RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions) {
    this.rankingOptions = rankingOptions;
  }

    
  @JsonProperty("results")
  public List<RunStepDetailsToolCallsFileSearchResultObject> getResults() {
    return results;
  }
  public void setResults(List<RunStepDetailsToolCallsFileSearchResultObject> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsFileSearchObjectFileSearch runStepDetailsToolCallsFileSearchObjectFileSearch = (RunStepDetailsToolCallsFileSearchObjectFileSearch) o;
    return Objects.equals(rankingOptions, runStepDetailsToolCallsFileSearchObjectFileSearch.rankingOptions) &&
        Objects.equals(results, runStepDetailsToolCallsFileSearchObjectFileSearch.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rankingOptions, results);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
