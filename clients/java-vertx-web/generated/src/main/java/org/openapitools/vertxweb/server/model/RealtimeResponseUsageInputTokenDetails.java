package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details about the input tokens used in the Response.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeResponseUsageInputTokenDetails   {
  
  private Integer cachedTokens;
  private Integer textTokens;
  private Integer audioTokens;

  public RealtimeResponseUsageInputTokenDetails () {

  }

  public RealtimeResponseUsageInputTokenDetails (Integer cachedTokens, Integer textTokens, Integer audioTokens) {
    this.cachedTokens = cachedTokens;
    this.textTokens = textTokens;
    this.audioTokens = audioTokens;
  }

    
  @JsonProperty("cached_tokens")
  public Integer getCachedTokens() {
    return cachedTokens;
  }
  public void setCachedTokens(Integer cachedTokens) {
    this.cachedTokens = cachedTokens;
  }

    
  @JsonProperty("text_tokens")
  public Integer getTextTokens() {
    return textTokens;
  }
  public void setTextTokens(Integer textTokens) {
    this.textTokens = textTokens;
  }

    
  @JsonProperty("audio_tokens")
  public Integer getAudioTokens() {
    return audioTokens;
  }
  public void setAudioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseUsageInputTokenDetails realtimeResponseUsageInputTokenDetails = (RealtimeResponseUsageInputTokenDetails) o;
    return Objects.equals(cachedTokens, realtimeResponseUsageInputTokenDetails.cachedTokens) &&
        Objects.equals(textTokens, realtimeResponseUsageInputTokenDetails.textTokens) &&
        Objects.equals(audioTokens, realtimeResponseUsageInputTokenDetails.audioTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachedTokens, textTokens, audioTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseUsageInputTokenDetails {\n");
    
    sb.append("    cachedTokens: ").append(toIndentedString(cachedTokens)).append("\n");
    sb.append("    textTokens: ").append(toIndentedString(textTokens)).append("\n");
    sb.append("    audioTokens: ").append(toIndentedString(audioTokens)).append("\n");
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
