package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CompletionUsageCompletionTokensDetails;
import org.openapitools.model.CompletionUsagePromptTokensDetails;

/**
 * Usage statistics for the completion request.
 */
@ApiModel(description = "Usage statistics for the completion request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CompletionUsage   {
  @JsonProperty("completion_tokens")
  private Integer completionTokens;

  @JsonProperty("prompt_tokens")
  private Integer promptTokens;

  @JsonProperty("total_tokens")
  private Integer totalTokens;

  @JsonProperty("completion_tokens_details")
  private CompletionUsageCompletionTokensDetails completionTokensDetails;

  @JsonProperty("prompt_tokens_details")
  private CompletionUsagePromptTokensDetails promptTokensDetails;

  public CompletionUsage completionTokens(Integer completionTokens) {
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

  public CompletionUsage promptTokens(Integer promptTokens) {
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

  public CompletionUsage totalTokens(Integer totalTokens) {
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

  public CompletionUsage completionTokensDetails(CompletionUsageCompletionTokensDetails completionTokensDetails) {
    this.completionTokensDetails = completionTokensDetails;
    return this;
  }

   /**
   * Get completionTokensDetails
   * @return completionTokensDetails
  **/
  @ApiModelProperty(value = "")
  public CompletionUsageCompletionTokensDetails getCompletionTokensDetails() {
    return completionTokensDetails;
  }

  public void setCompletionTokensDetails(CompletionUsageCompletionTokensDetails completionTokensDetails) {
    this.completionTokensDetails = completionTokensDetails;
  }

  public CompletionUsage promptTokensDetails(CompletionUsagePromptTokensDetails promptTokensDetails) {
    this.promptTokensDetails = promptTokensDetails;
    return this;
  }

   /**
   * Get promptTokensDetails
   * @return promptTokensDetails
  **/
  @ApiModelProperty(value = "")
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

