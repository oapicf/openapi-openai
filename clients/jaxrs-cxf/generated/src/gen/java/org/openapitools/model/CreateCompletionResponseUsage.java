package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateCompletionResponseUsage  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer promptTokens;

  @ApiModelProperty(required = true, value = "")
  private Integer completionTokens;

  @ApiModelProperty(required = true, value = "")
  private Integer totalTokens;
 /**
   * Get promptTokens
   * @return promptTokens
  **/
  @JsonProperty("prompt_tokens")
  @NotNull
  public Integer getPromptTokens() {
    return promptTokens;
  }

  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  public CreateCompletionResponseUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

 /**
   * Get completionTokens
   * @return completionTokens
  **/
  @JsonProperty("completion_tokens")
  @NotNull
  public Integer getCompletionTokens() {
    return completionTokens;
  }

  public void setCompletionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
  }

  public CreateCompletionResponseUsage completionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

 /**
   * Get totalTokens
   * @return totalTokens
  **/
  @JsonProperty("total_tokens")
  @NotNull
  public Integer getTotalTokens() {
    return totalTokens;
  }

  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

  public CreateCompletionResponseUsage totalTokens(Integer totalTokens) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

