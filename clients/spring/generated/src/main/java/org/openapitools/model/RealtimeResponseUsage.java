package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.RealtimeResponseUsageInputTokenDetails;
import org.openapitools.model.RealtimeResponseUsageOutputTokenDetails;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
 */

@Schema(name = "RealtimeResponse_usage", description = "Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. ")
@JsonTypeName("RealtimeResponse_usage")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseUsage {

  private @Nullable Integer totalTokens;

  private @Nullable Integer inputTokens;

  private @Nullable Integer outputTokens;

  private @Nullable RealtimeResponseUsageInputTokenDetails inputTokenDetails;

  private @Nullable RealtimeResponseUsageOutputTokenDetails outputTokenDetails;

  public RealtimeResponseUsage totalTokens(@Nullable Integer totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

  /**
   * The total number of tokens in the Response including input and output  text and audio tokens. 
   * @return totalTokens
   */
  
  @Schema(name = "total_tokens", description = "The total number of tokens in the Response including input and output  text and audio tokens. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_tokens")
  public @Nullable Integer getTotalTokens() {
    return totalTokens;
  }

  public void setTotalTokens(@Nullable Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

  public RealtimeResponseUsage inputTokens(@Nullable Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

  /**
   * The number of input tokens used in the Response, including text and  audio tokens. 
   * @return inputTokens
   */
  
  @Schema(name = "input_tokens", description = "The number of input tokens used in the Response, including text and  audio tokens. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("input_tokens")
  public @Nullable Integer getInputTokens() {
    return inputTokens;
  }

  public void setInputTokens(@Nullable Integer inputTokens) {
    this.inputTokens = inputTokens;
  }

  public RealtimeResponseUsage outputTokens(@Nullable Integer outputTokens) {
    this.outputTokens = outputTokens;
    return this;
  }

  /**
   * The number of output tokens sent in the Response, including text and  audio tokens. 
   * @return outputTokens
   */
  
  @Schema(name = "output_tokens", description = "The number of output tokens sent in the Response, including text and  audio tokens. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("output_tokens")
  public @Nullable Integer getOutputTokens() {
    return outputTokens;
  }

  public void setOutputTokens(@Nullable Integer outputTokens) {
    this.outputTokens = outputTokens;
  }

  public RealtimeResponseUsage inputTokenDetails(@Nullable RealtimeResponseUsageInputTokenDetails inputTokenDetails) {
    this.inputTokenDetails = inputTokenDetails;
    return this;
  }

  /**
   * Get inputTokenDetails
   * @return inputTokenDetails
   */
  @Valid 
  @Schema(name = "input_token_details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("input_token_details")
  public @Nullable RealtimeResponseUsageInputTokenDetails getInputTokenDetails() {
    return inputTokenDetails;
  }

  public void setInputTokenDetails(@Nullable RealtimeResponseUsageInputTokenDetails inputTokenDetails) {
    this.inputTokenDetails = inputTokenDetails;
  }

  public RealtimeResponseUsage outputTokenDetails(@Nullable RealtimeResponseUsageOutputTokenDetails outputTokenDetails) {
    this.outputTokenDetails = outputTokenDetails;
    return this;
  }

  /**
   * Get outputTokenDetails
   * @return outputTokenDetails
   */
  @Valid 
  @Schema(name = "output_token_details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("output_token_details")
  public @Nullable RealtimeResponseUsageOutputTokenDetails getOutputTokenDetails() {
    return outputTokenDetails;
  }

  public void setOutputTokenDetails(@Nullable RealtimeResponseUsageOutputTokenDetails outputTokenDetails) {
    this.outputTokenDetails = outputTokenDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseUsage realtimeResponseUsage = (RealtimeResponseUsage) o;
    return Objects.equals(this.totalTokens, realtimeResponseUsage.totalTokens) &&
        Objects.equals(this.inputTokens, realtimeResponseUsage.inputTokens) &&
        Objects.equals(this.outputTokens, realtimeResponseUsage.outputTokens) &&
        Objects.equals(this.inputTokenDetails, realtimeResponseUsage.inputTokenDetails) &&
        Objects.equals(this.outputTokenDetails, realtimeResponseUsage.outputTokenDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalTokens, inputTokens, outputTokens, inputTokenDetails, outputTokenDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseUsage {\n");
    sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
    sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
    sb.append("    inputTokenDetails: ").append(toIndentedString(inputTokenDetails)).append("\n");
    sb.append("    outputTokenDetails: ").append(toIndentedString(outputTokenDetails)).append("\n");
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

