package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CreateEmbeddingResponse_usage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-16T01:13:46.302927795Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEmbeddingResponseUsage   {
  private @Valid Integer promptTokens;
  private @Valid Integer totalTokens;

  /**
   **/
  public CreateEmbeddingResponseUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("prompt_tokens")
  @NotNull
  public Integer getPromptTokens() {
    return promptTokens;
  }

  @JsonProperty("prompt_tokens")
  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  /**
   **/
  public CreateEmbeddingResponseUsage totalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("total_tokens")
  @NotNull
  public Integer getTotalTokens() {
    return totalTokens;
  }

  @JsonProperty("total_tokens")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

