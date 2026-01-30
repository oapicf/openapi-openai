package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An optional field that will only be present when you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60; in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
 */

@Schema(name = "CreateChatCompletionStreamResponse_usage", description = "An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. ")
@JsonTypeName("CreateChatCompletionStreamResponse_usage")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionStreamResponseUsage {

  private Integer completionTokens;

  private Integer promptTokens;

  private Integer totalTokens;

  public CreateChatCompletionStreamResponseUsage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateChatCompletionStreamResponseUsage(Integer completionTokens, Integer promptTokens, Integer totalTokens) {
    this.completionTokens = completionTokens;
    this.promptTokens = promptTokens;
    this.totalTokens = totalTokens;
  }

  public CreateChatCompletionStreamResponseUsage completionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

  /**
   * Number of tokens in the generated completion.
   * @return completionTokens
   */
  @NotNull 
  @Schema(name = "completion_tokens", description = "Number of tokens in the generated completion.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("completion_tokens")
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
   */
  @NotNull 
  @Schema(name = "prompt_tokens", description = "Number of tokens in the prompt.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("prompt_tokens")
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
   */
  @NotNull 
  @Schema(name = "total_tokens", description = "Total number of tokens used in the request (prompt + completion).", requiredMode = Schema.RequiredMode.REQUIRED)
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

