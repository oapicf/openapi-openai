package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchRankingOptionsObject;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * For now, this is always going to be an empty object.
 **/
@ApiModel(description = "For now, this is always going to be an empty object.")
@JsonTypeName("RunStepDetailsToolCallsFileSearchObject_file_search")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFileSearchObjectFileSearch   {
  private RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions;
  private @Valid List<@Valid RunStepDetailsToolCallsFileSearchResultObject> results = new ArrayList<>();

  public RunStepDetailsToolCallsFileSearchObjectFileSearch() {
  }

  /**
   **/
  public RunStepDetailsToolCallsFileSearchObjectFileSearch rankingOptions(RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions) {
    this.rankingOptions = rankingOptions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ranking_options")
  @Valid public RunStepDetailsToolCallsFileSearchRankingOptionsObject getRankingOptions() {
    return rankingOptions;
  }

  @JsonProperty("ranking_options")
  public void setRankingOptions(RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions) {
    this.rankingOptions = rankingOptions;
  }

  /**
   * The results of the file search.
   **/
  public RunStepDetailsToolCallsFileSearchObjectFileSearch results(List<@Valid RunStepDetailsToolCallsFileSearchResultObject> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(value = "The results of the file search.")
  @JsonProperty("results")
  @Valid public List<@Valid RunStepDetailsToolCallsFileSearchResultObject> getResults() {
    return results;
  }

  @JsonProperty("results")
  public void setResults(List<@Valid RunStepDetailsToolCallsFileSearchResultObject> results) {
    this.results = results;
  }

  public RunStepDetailsToolCallsFileSearchObjectFileSearch addResultsItem(RunStepDetailsToolCallsFileSearchResultObject resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }

    this.results.add(resultsItem);
    return this;
  }

  public RunStepDetailsToolCallsFileSearchObjectFileSearch removeResultsItem(RunStepDetailsToolCallsFileSearchResultObject resultsItem) {
    if (resultsItem != null && this.results != null) {
      this.results.remove(resultsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

