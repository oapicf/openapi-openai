/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CreateCompletionResponseUsage
 */
@JsonPropertyOrder({
  CreateCompletionResponseUsage.JSON_PROPERTY_PROMPT_TOKENS,
  CreateCompletionResponseUsage.JSON_PROPERTY_COMPLETION_TOKENS,
  CreateCompletionResponseUsage.JSON_PROPERTY_TOTAL_TOKENS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateCompletionResponseUsage   {
  public static final String JSON_PROPERTY_PROMPT_TOKENS = "prompt_tokens";
  @JsonProperty(JSON_PROPERTY_PROMPT_TOKENS)
  private Integer promptTokens;

  public static final String JSON_PROPERTY_COMPLETION_TOKENS = "completion_tokens";
  @JsonProperty(JSON_PROPERTY_COMPLETION_TOKENS)
  private Integer completionTokens;

  public static final String JSON_PROPERTY_TOTAL_TOKENS = "total_tokens";
  @JsonProperty(JSON_PROPERTY_TOTAL_TOKENS)
  private Integer totalTokens;

  public CreateCompletionResponseUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

  /**
   * Get promptTokens
   * @return promptTokens
   **/
  @JsonProperty(value = "prompt_tokens")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
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
   **/
  @JsonProperty(value = "completion_tokens")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
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
   **/
  @JsonProperty(value = "total_tokens")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
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

