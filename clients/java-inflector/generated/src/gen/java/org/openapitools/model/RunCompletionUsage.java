package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Usage statistics related to the run. This value will be &#x60;null&#x60; if the run is not in a terminal state (i.e. &#x60;in_progress&#x60;, &#x60;queued&#x60;, etc.).
 **/

@ApiModel(description = "Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T10:44:48.545388249Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunCompletionUsage   {
  @JsonProperty("completion_tokens")
  private Integer completionTokens;

  @JsonProperty("prompt_tokens")
  private Integer promptTokens;

  @JsonProperty("total_tokens")
  private Integer totalTokens;

  /**
   * Number of completion tokens used over the course of the run.
   **/
  public RunCompletionUsage completionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number of completion tokens used over the course of the run.")
  @JsonProperty("completion_tokens")
  public Integer getCompletionTokens() {
    return completionTokens;
  }
  public void setCompletionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
  }

  /**
   * Number of prompt tokens used over the course of the run.
   **/
  public RunCompletionUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number of prompt tokens used over the course of the run.")
  @JsonProperty("prompt_tokens")
  public Integer getPromptTokens() {
    return promptTokens;
  }
  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  /**
   * Total number of tokens used (prompt + completion).
   **/
  public RunCompletionUsage totalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Total number of tokens used (prompt + completion).")
  @JsonProperty("total_tokens")
  public Integer getTotalTokens() {
    return totalTokens;
  }
  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunCompletionUsage runCompletionUsage = (RunCompletionUsage) o;
    return Objects.equals(completionTokens, runCompletionUsage.completionTokens) &&
        Objects.equals(promptTokens, runCompletionUsage.promptTokens) &&
        Objects.equals(totalTokens, runCompletionUsage.totalTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTokens, promptTokens, totalTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunCompletionUsage {\n");
    
    sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n");
    sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
    sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
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

