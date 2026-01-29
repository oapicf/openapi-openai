package org.openapitools.model;

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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Usage statistics related to the run. This value will be &#x60;null&#x60; if the run is not in a terminal state (i.e. &#x60;in_progress&#x60;, &#x60;queued&#x60;, etc.).
 **/
@ApiModel(description = "Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).")
@JsonTypeName("RunCompletionUsage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T10:45:34.459631427Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunCompletionUsage   {
  private Integer completionTokens;
  private Integer promptTokens;
  private Integer totalTokens;

  public RunCompletionUsage() {
  }

  @JsonCreator
  public RunCompletionUsage(
    @JsonProperty(required = true, value = "completion_tokens") Integer completionTokens,
    @JsonProperty(required = true, value = "prompt_tokens") Integer promptTokens,
    @JsonProperty(required = true, value = "total_tokens") Integer totalTokens
  ) {
    this.completionTokens = completionTokens;
    this.promptTokens = promptTokens;
    this.totalTokens = totalTokens;
  }

  /**
   * Number of completion tokens used over the course of the run.
   **/
  public RunCompletionUsage completionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number of completion tokens used over the course of the run.")
  @JsonProperty(required = true, value = "completion_tokens")
  @NotNull public Integer getCompletionTokens() {
    return completionTokens;
  }

  @JsonProperty(required = true, value = "completion_tokens")
  public void setCompletionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
  }

  /**
   * Number of prompt tokens used over the course of the run.
   **/
  public RunCompletionUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number of prompt tokens used over the course of the run.")
  @JsonProperty(required = true, value = "prompt_tokens")
  @NotNull public Integer getPromptTokens() {
    return promptTokens;
  }

  @JsonProperty(required = true, value = "prompt_tokens")
  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  /**
   * Total number of tokens used (prompt + completion).
   **/
  public RunCompletionUsage totalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Total number of tokens used (prompt + completion).")
  @JsonProperty(required = true, value = "total_tokens")
  @NotNull public Integer getTotalTokens() {
    return totalTokens;
  }

  @JsonProperty(required = true, value = "total_tokens")
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
    RunCompletionUsage runCompletionUsage = (RunCompletionUsage) o;
    return Objects.equals(this.completionTokens, runCompletionUsage.completionTokens) &&
        Objects.equals(this.promptTokens, runCompletionUsage.promptTokens) &&
        Objects.equals(this.totalTokens, runCompletionUsage.totalTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTokens, promptTokens, totalTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunCompletionUsage {\n");
    
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

