package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Usage statistics for the completion request.
 */
@ApiModel(description="Usage statistics for the completion request.")

public class CompletionUsage  {
  
 /**
  * Number of tokens in the generated completion.
  */
  @ApiModelProperty(required = true, value = "Number of tokens in the generated completion.")
  private Integer completionTokens;

 /**
  * Number of tokens in the prompt.
  */
  @ApiModelProperty(required = true, value = "Number of tokens in the prompt.")
  private Integer promptTokens;

 /**
  * Total number of tokens used in the request (prompt + completion).
  */
  @ApiModelProperty(required = true, value = "Total number of tokens used in the request (prompt + completion).")
  private Integer totalTokens;
 /**
  * Number of tokens in the generated completion.
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
  public CompletionUsage completionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

 /**
  * Number of tokens in the prompt.
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
  public CompletionUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

 /**
  * Total number of tokens used in the request (prompt + completion).
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
  public CompletionUsage totalTokens(Integer totalTokens) {
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
    CompletionUsage completionUsage = (CompletionUsage) o;
    return Objects.equals(this.completionTokens, completionUsage.completionTokens) &&
        Objects.equals(this.promptTokens, completionUsage.promptTokens) &&
        Objects.equals(this.totalTokens, completionUsage.totalTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTokens, promptTokens, totalTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionUsage {\n");
    
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

