package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchRankingOptionsObject;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObject;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * For now, this is always going to be an empty object.
 */

@Schema(name = "RunStepDetailsToolCallsFileSearchObject_file_search", description = "For now, this is always going to be an empty object.")
@JsonTypeName("RunStepDetailsToolCallsFileSearchObject_file_search")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFileSearchObjectFileSearch {

  private @Nullable RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions;

  @Valid
  private List<@Valid RunStepDetailsToolCallsFileSearchResultObject> results = new ArrayList<>();

  public RunStepDetailsToolCallsFileSearchObjectFileSearch rankingOptions(@Nullable RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions) {
    this.rankingOptions = rankingOptions;
    return this;
  }

  /**
   * Get rankingOptions
   * @return rankingOptions
   */
  @Valid 
  @Schema(name = "ranking_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ranking_options")
  public @Nullable RunStepDetailsToolCallsFileSearchRankingOptionsObject getRankingOptions() {
    return rankingOptions;
  }

  public void setRankingOptions(@Nullable RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions) {
    this.rankingOptions = rankingOptions;
  }

  public RunStepDetailsToolCallsFileSearchObjectFileSearch results(List<@Valid RunStepDetailsToolCallsFileSearchResultObject> results) {
    this.results = results;
    return this;
  }

  public RunStepDetailsToolCallsFileSearchObjectFileSearch addResultsItem(RunStepDetailsToolCallsFileSearchResultObject resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * The results of the file search.
   * @return results
   */
  @Valid 
  @Schema(name = "results", description = "The results of the file search.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("results")
  public List<@Valid RunStepDetailsToolCallsFileSearchResultObject> getResults() {
    return results;
  }

  public void setResults(List<@Valid RunStepDetailsToolCallsFileSearchResultObject> results) {
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

