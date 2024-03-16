package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateEmbeddingResponseUsage  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer promptTokens;

  @ApiModelProperty(required = true, value = "")
  private Integer totalTokens;
 /**
   * Get promptTokens
   * @return promptTokens
  **/
  @JsonProperty("prompt_tokens")
  public Integer getPromptTokens() {
    return promptTokens;
  }

  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  public CreateEmbeddingResponseUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

 /**
   * Get totalTokens
   * @return totalTokens
  **/
  @JsonProperty("total_tokens")
  public Integer getTotalTokens() {
    return totalTokens;
  }

  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

  public CreateEmbeddingResponseUsage totalTokens(Integer totalTokens) {
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
    CreateEmbeddingResponseUsage createEmbeddingResponseUsage = (CreateEmbeddingResponseUsage) o;
    return Objects.equals(this.promptTokens, createEmbeddingResponseUsage.promptTokens) &&
        Objects.equals(this.totalTokens, createEmbeddingResponseUsage.totalTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promptTokens, totalTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingResponseUsage {\n");
    
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

