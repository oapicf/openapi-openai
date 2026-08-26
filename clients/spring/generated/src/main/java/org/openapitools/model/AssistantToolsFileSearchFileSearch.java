package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.FileSearchRankingOptions;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Overrides for the file search tool.
 */

@Schema(name = "AssistantToolsFileSearch_file_search", description = "Overrides for the file search tool.")
@JsonTypeName("AssistantToolsFileSearch_file_search")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssistantToolsFileSearchFileSearch {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer maxNumResults;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FileSearchRankingOptions rankingOptions;

  public AssistantToolsFileSearchFileSearch maxNumResults(@Nullable Integer maxNumResults) {
    this.maxNumResults = maxNumResults;
    return this;
  }

  /**
   * The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
   * minimum: 1
   * maximum: 50
   * @return maxNumResults
   */
  @Min(value = 1) @Max(value = 50) 
  @Schema(name = "max_num_results", description = "The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_num_results")
  public @Nullable Integer getMaxNumResults() {
    return maxNumResults;
  }

  @JsonProperty("max_num_results")
  public void setMaxNumResults(@Nullable Integer maxNumResults) {
    this.maxNumResults = maxNumResults;
  }

  public AssistantToolsFileSearchFileSearch rankingOptions(@Nullable FileSearchRankingOptions rankingOptions) {
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
  public @Nullable FileSearchRankingOptions getRankingOptions() {
    return rankingOptions;
  }

  @JsonProperty("ranking_options")
  public void setRankingOptions(@Nullable FileSearchRankingOptions rankingOptions) {
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
    return Objects.equals(this.maxNumResults, assistantToolsFileSearchFileSearch.maxNumResults) &&
        Objects.equals(this.rankingOptions, assistantToolsFileSearchFileSearch.rankingOptions);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

