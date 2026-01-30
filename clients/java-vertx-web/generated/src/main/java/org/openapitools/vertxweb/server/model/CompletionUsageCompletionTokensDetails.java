package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Breakdown of tokens used in a completion.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompletionUsageCompletionTokensDetails   {
  
  private Integer acceptedPredictionTokens;
  private Integer audioTokens;
  private Integer reasoningTokens;
  private Integer rejectedPredictionTokens;

  public CompletionUsageCompletionTokensDetails () {

  }

  public CompletionUsageCompletionTokensDetails (Integer acceptedPredictionTokens, Integer audioTokens, Integer reasoningTokens, Integer rejectedPredictionTokens) {
    this.acceptedPredictionTokens = acceptedPredictionTokens;
    this.audioTokens = audioTokens;
    this.reasoningTokens = reasoningTokens;
    this.rejectedPredictionTokens = rejectedPredictionTokens;
  }

    
  @JsonProperty("accepted_prediction_tokens")
  public Integer getAcceptedPredictionTokens() {
    return acceptedPredictionTokens;
  }
  public void setAcceptedPredictionTokens(Integer acceptedPredictionTokens) {
    this.acceptedPredictionTokens = acceptedPredictionTokens;
  }

    
  @JsonProperty("audio_tokens")
  public Integer getAudioTokens() {
    return audioTokens;
  }
  public void setAudioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
  }

    
  @JsonProperty("reasoning_tokens")
  public Integer getReasoningTokens() {
    return reasoningTokens;
  }
  public void setReasoningTokens(Integer reasoningTokens) {
    this.reasoningTokens = reasoningTokens;
  }

    
  @JsonProperty("rejected_prediction_tokens")
  public Integer getRejectedPredictionTokens() {
    return rejectedPredictionTokens;
  }
  public void setRejectedPredictionTokens(Integer rejectedPredictionTokens) {
    this.rejectedPredictionTokens = rejectedPredictionTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletionUsageCompletionTokensDetails completionUsageCompletionTokensDetails = (CompletionUsageCompletionTokensDetails) o;
    return Objects.equals(acceptedPredictionTokens, completionUsageCompletionTokensDetails.acceptedPredictionTokens) &&
        Objects.equals(audioTokens, completionUsageCompletionTokensDetails.audioTokens) &&
        Objects.equals(reasoningTokens, completionUsageCompletionTokensDetails.reasoningTokens) &&
        Objects.equals(rejectedPredictionTokens, completionUsageCompletionTokensDetails.rejectedPredictionTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedPredictionTokens, audioTokens, reasoningTokens, rejectedPredictionTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionUsageCompletionTokensDetails {\n");
    
    sb.append("    acceptedPredictionTokens: ").append(toIndentedString(acceptedPredictionTokens)).append("\n");
    sb.append("    audioTokens: ").append(toIndentedString(audioTokens)).append("\n");
    sb.append("    reasoningTokens: ").append(toIndentedString(reasoningTokens)).append("\n");
    sb.append("    rejectedPredictionTokens: ").append(toIndentedString(rejectedPredictionTokens)).append("\n");
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
