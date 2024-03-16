package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CreateCompletionResponseUsage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateCompletionResponseUsage   {
  @JsonProperty("prompt_tokens")
  private Integer promptTokens;

  @JsonProperty("completion_tokens")
  private Integer completionTokens;

  @JsonProperty("total_tokens")
  private Integer totalTokens;

  public CreateCompletionResponseUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

   /**
   * Get promptTokens
   * @return promptTokens
  **/
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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

