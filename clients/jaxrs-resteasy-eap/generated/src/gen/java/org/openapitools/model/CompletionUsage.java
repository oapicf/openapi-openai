package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CompletionUsageCompletionTokensDetails;
import org.openapitools.model.CompletionUsagePromptTokensDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Usage statistics for the completion request.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CompletionUsage   {
  
  private Integer completionTokens;
  private Integer promptTokens;
  private Integer totalTokens;
  private CompletionUsageCompletionTokensDetails completionTokensDetails;
  private CompletionUsagePromptTokensDetails promptTokensDetails;

  /**
   * Number of tokens in the generated completion.
   **/
  
  @ApiModelProperty(required = true, value = "Number of tokens in the generated completion.")
  @JsonProperty("completion_tokens")
  @NotNull
  public Integer getCompletionTokens() {
    return completionTokens;
  }
  public void setCompletionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
  }

  /**
   * Number of tokens in the prompt.
   **/
  
  @ApiModelProperty(required = true, value = "Number of tokens in the prompt.")
  @JsonProperty("prompt_tokens")
  @NotNull
  public Integer getPromptTokens() {
    return promptTokens;
  }
  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  /**
   * Total number of tokens used in the request (prompt + completion).
   **/
  
  @ApiModelProperty(required = true, value = "Total number of tokens used in the request (prompt + completion).")
  @JsonProperty("total_tokens")
  @NotNull
  public Integer getTotalTokens() {
    return totalTokens;
  }
  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("completion_tokens_details")
  public CompletionUsageCompletionTokensDetails getCompletionTokensDetails() {
    return completionTokensDetails;
  }
  public void setCompletionTokensDetails(CompletionUsageCompletionTokensDetails completionTokensDetails) {
    this.completionTokensDetails = completionTokensDetails;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prompt_tokens_details")
  public CompletionUsagePromptTokensDetails getPromptTokensDetails() {
    return promptTokensDetails;
  }
  public void setPromptTokensDetails(CompletionUsagePromptTokensDetails promptTokensDetails) {
    this.promptTokensDetails = promptTokensDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletionUsage completionUsage = (CompletionUsage) o;
    return Objects.equals(this.completionTokens, completionUsage.completionTokens) &&
        Objects.equals(this.promptTokens, completionUsage.promptTokens) &&
        Objects.equals(this.totalTokens, completionUsage.totalTokens) &&
        Objects.equals(this.completionTokensDetails, completionUsage.completionTokensDetails) &&
        Objects.equals(this.promptTokensDetails, completionUsage.promptTokensDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTokens, promptTokens, totalTokens, completionTokensDetails, promptTokensDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionUsage {\n");
    
    sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n");
    sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
    sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
    sb.append("    completionTokensDetails: ").append(toIndentedString(completionTokensDetails)).append("\n");
    sb.append("    promptTokensDetails: ").append(toIndentedString(promptTokensDetails)).append("\n");
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

