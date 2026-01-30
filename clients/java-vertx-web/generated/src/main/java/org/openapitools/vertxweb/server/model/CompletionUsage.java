package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CompletionUsageCompletionTokensDetails;
import org.openapitools.vertxweb.server.model.CompletionUsagePromptTokensDetails;

/**
 * Usage statistics for the completion request.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompletionUsage   {
  
  private Integer completionTokens;
  private Integer promptTokens;
  private Integer totalTokens;
  private CompletionUsageCompletionTokensDetails completionTokensDetails;
  private CompletionUsagePromptTokensDetails promptTokensDetails;

  public CompletionUsage () {

  }

  public CompletionUsage (Integer completionTokens, Integer promptTokens, Integer totalTokens, CompletionUsageCompletionTokensDetails completionTokensDetails, CompletionUsagePromptTokensDetails promptTokensDetails) {
    this.completionTokens = completionTokens;
    this.promptTokens = promptTokens;
    this.totalTokens = totalTokens;
    this.completionTokensDetails = completionTokensDetails;
    this.promptTokensDetails = promptTokensDetails;
  }

    
  @JsonProperty("completion_tokens")
  public Integer getCompletionTokens() {
    return completionTokens;
  }
  public void setCompletionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
  }

    
  @JsonProperty("prompt_tokens")
  public Integer getPromptTokens() {
    return promptTokens;
  }
  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

    
  @JsonProperty("total_tokens")
  public Integer getTotalTokens() {
    return totalTokens;
  }
  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

    
  @JsonProperty("completion_tokens_details")
  public CompletionUsageCompletionTokensDetails getCompletionTokensDetails() {
    return completionTokensDetails;
  }
  public void setCompletionTokensDetails(CompletionUsageCompletionTokensDetails completionTokensDetails) {
    this.completionTokensDetails = completionTokensDetails;
  }

    
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
    return Objects.equals(completionTokens, completionUsage.completionTokens) &&
        Objects.equals(promptTokens, completionUsage.promptTokens) &&
        Objects.equals(totalTokens, completionUsage.totalTokens) &&
        Objects.equals(completionTokensDetails, completionUsage.completionTokensDetails) &&
        Objects.equals(promptTokensDetails, completionUsage.promptTokensDetails);
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
