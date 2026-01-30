package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details about the output tokens used in the Response.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeResponseUsageOutputTokenDetails   {
  
  private Integer textTokens;
  private Integer audioTokens;

  public RealtimeResponseUsageOutputTokenDetails () {

  }

  public RealtimeResponseUsageOutputTokenDetails (Integer textTokens, Integer audioTokens) {
    this.textTokens = textTokens;
    this.audioTokens = audioTokens;
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
    RealtimeResponseUsageOutputTokenDetails realtimeResponseUsageOutputTokenDetails = (RealtimeResponseUsageOutputTokenDetails) o;
    return Objects.equals(textTokens, realtimeResponseUsageOutputTokenDetails.textTokens) &&
        Objects.equals(audioTokens, realtimeResponseUsageOutputTokenDetails.audioTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textTokens, audioTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseUsageOutputTokenDetails {\n");
    
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
