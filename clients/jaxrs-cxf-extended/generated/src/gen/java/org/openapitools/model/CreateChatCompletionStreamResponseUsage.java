package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
 */
@ApiModel(description="An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. ")

public class CreateChatCompletionStreamResponseUsage  {
  
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
  public CreateChatCompletionStreamResponseUsage completionTokens(Integer completionTokens) {
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
  public CreateChatCompletionStreamResponseUsage promptTokens(Integer promptTokens) {
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
  public CreateChatCompletionStreamResponseUsage totalTokens(Integer totalTokens) {
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
    CreateChatCompletionStreamResponseUsage createChatCompletionStreamResponseUsage = (CreateChatCompletionStreamResponseUsage) o;
    return Objects.equals(this.completionTokens, createChatCompletionStreamResponseUsage.completionTokens) &&
        Objects.equals(this.promptTokens, createChatCompletionStreamResponseUsage.promptTokens) &&
        Objects.equals(this.totalTokens, createChatCompletionStreamResponseUsage.totalTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTokens, promptTokens, totalTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionStreamResponseUsage {\n");
    
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

