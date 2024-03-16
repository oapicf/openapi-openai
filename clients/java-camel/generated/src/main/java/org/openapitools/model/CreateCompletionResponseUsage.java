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
 * CreateCompletionResponseUsage
 */

@JsonTypeName("CreateCompletionResponse_usage")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-16T01:13:12.257183065Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateCompletionResponseUsage {

  private Integer promptTokens;

  private Integer completionTokens;

  private Integer totalTokens;

  public CreateCompletionResponseUsage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateCompletionResponseUsage(Integer promptTokens, Integer completionTokens, Integer totalTokens) {
    this.promptTokens = promptTokens;
    this.completionTokens = completionTokens;
    this.totalTokens = totalTokens;
  }

  public CreateCompletionResponseUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

  /**
   * Get promptTokens
   * @return promptTokens
  */
  @NotNull 
  @Schema(name = "prompt_tokens", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("prompt_tokens")
  public Integer getPromptTokens() {
    return promptTokens;
  }

  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  public CreateCompletionResponseUsage completionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

  /**
   * Get completionTokens
   * @return completionTokens
  */
  @NotNull 
  @Schema(name = "completion_tokens", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("completion_tokens")
  public Integer getCompletionTokens() {
    return completionTokens;
  }

  public void setCompletionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
  }

  public CreateCompletionResponseUsage totalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

  /**
   * Get totalTokens
   * @return totalTokens
  */
  @NotNull 
  @Schema(name = "total_tokens", requiredMode = Schema.RequiredMode.REQUIRED)
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
    CreateCompletionResponseUsage createCompletionResponseUsage = (CreateCompletionResponseUsage) o;
    return Objects.equals(this.promptTokens, createCompletionResponseUsage.promptTokens) &&
        Objects.equals(this.completionTokens, createCompletionResponseUsage.completionTokens) &&
        Objects.equals(this.totalTokens, createCompletionResponseUsage.totalTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promptTokens, completionTokens, totalTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponseUsage {\n");
    sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
    sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n");
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

