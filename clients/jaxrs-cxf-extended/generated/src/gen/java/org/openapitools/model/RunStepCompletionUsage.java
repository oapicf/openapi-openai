package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
 */
@ApiModel(description="Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.")

public class RunStepCompletionUsage  {
  
 /**
  * Number of completion tokens used over the course of the run step.
  */
  @ApiModelProperty(required = true, value = "Number of completion tokens used over the course of the run step.")
  private Integer completionTokens;

 /**
  * Number of prompt tokens used over the course of the run step.
  */
  @ApiModelProperty(required = true, value = "Number of prompt tokens used over the course of the run step.")
  private Integer promptTokens;

 /**
  * Total number of tokens used (prompt + completion).
  */
  @ApiModelProperty(required = true, value = "Total number of tokens used (prompt + completion).")
  private Integer totalTokens;
 /**
  * Number of completion tokens used over the course of the run step.
  * @return completionTokens
  */
  @JsonProperty("completion_tokens")
  @NotNull
  public Integer getCompletionTokens() {
    return completionTokens;
  }

  /**
   * Sets the <code>completionTokens</code> property.
   */
 public void setCompletionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
  }

  /**
   * Sets the <code>completionTokens</code> property.
   */
  public RunStepCompletionUsage completionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

 /**
  * Number of prompt tokens used over the course of the run step.
  * @return promptTokens
  */
  @JsonProperty("prompt_tokens")
  @NotNull
  public Integer getPromptTokens() {
    return promptTokens;
  }

  /**
   * Sets the <code>promptTokens</code> property.
   */
 public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  /**
   * Sets the <code>promptTokens</code> property.
   */
  public RunStepCompletionUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

 /**
  * Total number of tokens used (prompt + completion).
  * @return totalTokens
  */
  @JsonProperty("total_tokens")
  @NotNull
  public Integer getTotalTokens() {
    return totalTokens;
  }

  /**
   * Sets the <code>totalTokens</code> property.
   */
 public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

  /**
   * Sets the <code>totalTokens</code> property.
   */
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

