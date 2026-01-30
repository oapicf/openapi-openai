package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.FileSearchRankingOptions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Overrides for the file search tool.
 */

@Schema(name = "AssistantToolsFileSearch_file_search", description = "Overrides for the file search tool.")
@JsonTypeName("AssistantToolsFileSearch_file_search")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantToolsFileSearchFileSearch {

  private Integer maxNumResults;

  private FileSearchRankingOptions rankingOptions;

  public AssistantToolsFileSearchFileSearch maxNumResults(Integer maxNumResults) {
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
  public Integer getMaxNumResults() {
    return maxNumResults;
  }

  public void setMaxNumResults(Integer maxNumResults) {
    this.maxNumResults = maxNumResults;
  }

  public AssistantToolsFileSearchFileSearch rankingOptions(FileSearchRankingOptions rankingOptions) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

