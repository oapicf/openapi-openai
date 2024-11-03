package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
 **/
@ApiModel(description="Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.")

public class RunStepCompletionUsage  {
  
  @ApiModelProperty(required = true, value = "Number of completion tokens used over the course of the run step.")
 /**
   * Number of completion tokens used over the course of the run step.
  **/
  private Integer completionTokens;

  @ApiModelProperty(required = true, value = "Number of prompt tokens used over the course of the run step.")
 /**
   * Number of prompt tokens used over the course of the run step.
  **/
  private Integer promptTokens;

  @ApiModelProperty(required = true, value = "Total number of tokens used (prompt + completion).")
 /**
   * Total number of tokens used (prompt + completion).
  **/
  private Integer totalTokens;
 /**
   * Number of completion tokens used over the course of the run step.
   * @return completionTokens
  **/
  @JsonProperty("completion_tokens")
  public Integer getCompletionTokens() {
    return completionTokens;
  }

  public void setCompletionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
  }

  public RunStepCompletionUsage completionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

 /**
   * Number of prompt tokens used over the course of the run step.
   * @return promptTokens
  **/
  @JsonProperty("prompt_tokens")
  public Integer getPromptTokens() {
    return promptTokens;
  }

  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  public RunStepCompletionUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

 /**
   * Total number of tokens used (prompt + completion).
   * @return totalTokens
  **/
  @JsonProperty("total_tokens")
  public Integer getTotalTokens() {
    return totalTokens;
  }

  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

  public RunStepCompletionUsage totalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
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
    RunStepCompletionUsage runStepCompletionUsage = (RunStepCompletionUsage) o;
    return Objects.equals(this.completionTokens, runStepCompletionUsage.completionTokens) &&
        Objects.equals(this.promptTokens, runStepCompletionUsage.promptTokens) &&
        Objects.equals(this.totalTokens, runStepCompletionUsage.totalTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTokens, promptTokens, totalTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepCompletionUsage {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

