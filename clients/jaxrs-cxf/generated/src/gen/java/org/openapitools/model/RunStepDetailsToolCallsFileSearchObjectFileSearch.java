package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchRankingOptionsObject;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * For now, this is always going to be an empty object.
 */
@ApiModel(description="For now, this is always going to be an empty object.")

public class RunStepDetailsToolCallsFileSearchObjectFileSearch  {
  
  @ApiModelProperty(value = "")

  @Valid

  private RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions;

 /**
  * The results of the file search.
  */
  @ApiModelProperty(value = "The results of the file search.")

  @Valid

  private List<@Valid RunStepDetailsToolCallsFileSearchResultObject> results = new ArrayList<>();
 /**
   * Get rankingOptions
   * @return rankingOptions
  **/
  @JsonProperty("ranking_options")
  public RunStepDetailsToolCallsFileSearchRankingOptionsObject getRankingOptions() {
    return rankingOptions;
  }

  public void setRankingOptions(RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions) {
    this.rankingOptions = rankingOptions;
  }

  public RunStepDetailsToolCallsFileSearchObjectFileSearch rankingOptions(RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions) {
    this.rankingOptions = rankingOptions;
    return this;
  }

 /**
   * The results of the file search.
   * @return results
  **/
  @JsonProperty("results")
  public List<@Valid RunStepDetailsToolCallsFileSearchResultObject> getResults() {
    return results;
  }

  public void setResults(List<@Valid RunStepDetailsToolCallsFileSearchResultObject> results) {
    this.results = results;
  }

  public RunStepDetailsToolCallsFileSearchObjectFileSearch results(List<@Valid RunStepDetailsToolCallsFileSearchResultObject> results) {
    this.results = results;
    return this;
  }

  public RunStepDetailsToolCallsFileSearchObjectFileSearch addResultsItem(RunStepDetailsToolCallsFileSearchResultObject resultsItem) {
    this.results.add(resultsItem);
    return this;
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
    return Objects.equals(this.rankingOptions, runStepDetailsToolCallsFileSearchObjectFileSearch.rankingOptions) &&
        Objects.equals(this.results, runStepDetailsToolCallsFileSearchObjectFileSearch.results);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

