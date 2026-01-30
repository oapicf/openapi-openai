package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.FileSearchRankingOptions;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Overrides for the file search tool.
 */
@ApiModel(description="Overrides for the file search tool.")

public class AssistantToolsFileSearchFileSearch  {
  
 /**
  * The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
  */
  @ApiModelProperty(value = "The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ")

  private Integer maxNumResults;

  @ApiModelProperty(value = "")

  @Valid

  private FileSearchRankingOptions rankingOptions;
 /**
   * The maximum number of results the file search tool should output. The default is 20 for &#x60;gpt-4*&#x60; models and 5 for &#x60;gpt-3.5-turbo&#x60;. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than &#x60;max_num_results&#x60; results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
   * minimum: 1
   * maximum: 50
   * @return maxNumResults
  **/
  @JsonProperty("max_num_results")
 @Min(1) @Max(50)  public Integer getMaxNumResults() {
    return maxNumResults;
  }

  public void setMaxNumResults(Integer maxNumResults) {
    this.maxNumResults = maxNumResults;
  }

  public AssistantToolsFileSearchFileSearch maxNumResults(Integer maxNumResults) {
    this.maxNumResults = maxNumResults;
    return this;
  }

 /**
   * Get rankingOptions
   * @return rankingOptions
  **/
  @JsonProperty("ranking_options")
  public FileSearchRankingOptions getRankingOptions() {
    return rankingOptions;
  }

  public void setRankingOptions(FileSearchRankingOptions rankingOptions) {
    this.rankingOptions = rankingOptions;
  }

  public AssistantToolsFileSearchFileSearch rankingOptions(FileSearchRankingOptions rankingOptions) {
    this.rankingOptions = rankingOptions;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

