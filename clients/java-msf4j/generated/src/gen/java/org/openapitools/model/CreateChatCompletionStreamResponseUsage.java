package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An optional field that will only be present when you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60; in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
 */
@ApiModel(description = "An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionStreamResponseUsage   {
  @JsonProperty("completion_tokens")
  private Integer completionTokens;

  @JsonProperty("prompt_tokens")
  private Integer promptTokens;

  @JsonProperty("total_tokens")
  private Integer totalTokens;

  public CreateChatCompletionStreamResponseUsage completionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

   /**
   * Number of tokens in the generated completion.
   * @return completionTokens
  **/
  @ApiModelProperty(required = true, value = "Number of tokens in the generated completion.")
  public Integer getCompletionTokens() {
    return completionTokens;
  }

  public void setCompletionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
  }

  public CreateChatCompletionStreamResponseUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

   /**
   * Number of tokens in the prompt.
   * @return promptTokens
  **/
  @ApiModelProperty(required = true, value = "Number of tokens in the prompt.")
  public Integer getPromptTokens() {
    return promptTokens;
  }

  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  public CreateChatCompletionStreamResponseUsage totalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

   /**
   * Total number of tokens used in the request (prompt + completion).
   * @return totalTokens
  **/
  @ApiModelProperty(required = true, value = "Total number of tokens used in the request (prompt + completion).")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

