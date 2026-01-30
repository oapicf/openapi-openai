package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CompletionUsageCompletionTokensDetails;
import org.openapitools.model.CompletionUsagePromptTokensDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Usage statistics for the completion request.
 */

@Schema(name = "CompletionUsage", description = "Usage statistics for the completion request.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CompletionUsage {

  private Integer completionTokens;

  private Integer promptTokens;

  private Integer totalTokens;

  private CompletionUsageCompletionTokensDetails completionTokensDetails;

  private CompletionUsagePromptTokensDetails promptTokensDetails;

  public CompletionUsage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CompletionUsage(Integer completionTokens, Integer promptTokens, Integer totalTokens) {
    this.completionTokens = completionTokens;
    this.promptTokens = promptTokens;
    this.totalTokens = totalTokens;
  }

  public CompletionUsage completionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

  /**
   * Number of tokens in the generated completion.
   * @return completionTokens
   */
  @NotNull 
  @Schema(name = "completion_tokens", description = "Number of tokens in the generated completion.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("completion_tokens")
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
   */
  @NotNull 
  @Schema(name = "prompt_tokens", description = "Number of tokens in the prompt.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("prompt_tokens")
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
   */
  @NotNull 
  @Schema(name = "total_tokens", description = "Total number of tokens used in the request (prompt + completion).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total_tokens")
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
   */
  @Valid 
  @Schema(name = "completion_tokens_details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completion_tokens_details")
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
   */
  @Valid 
  @Schema(name = "prompt_tokens_details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

