package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchRankingOptionsObject;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObject;



/**
 * For now, this is always going to be an empty object.
 **/

@ApiModel(description = "For now, this is always going to be an empty object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFileSearchObjectFileSearch   {
  @JsonProperty("ranking_options")
  private RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions;

  @JsonProperty("results")
  private List<RunStepDetailsToolCallsFileSearchResultObject> results = null;

  /**
   **/
  public RunStepDetailsToolCallsFileSearchObjectFileSearch rankingOptions(RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions) {
    this.rankingOptions = rankingOptions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ranking_options")
  public RunStepDetailsToolCallsFileSearchRankingOptionsObject getRankingOptions() {
    return rankingOptions;
  }
  public void setRankingOptions(RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions) {
    this.rankingOptions = rankingOptions;
  }

  /**
   * The results of the file search.
   **/
  public RunStepDetailsToolCallsFileSearchObjectFileSearch results(List<RunStepDetailsToolCallsFileSearchResultObject> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(value = "The results of the file search.")
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

