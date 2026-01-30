package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Details about the input tokens used in the Response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealtimeResponseUsageInputTokenDetails   {
  @JsonProperty("cached_tokens")
  
  private Integer cachedTokens;

  @JsonProperty("text_tokens")
  
  private Integer textTokens;

  @JsonProperty("audio_tokens")
  
  private Integer audioTokens;

  public RealtimeResponseUsageInputTokenDetails cachedTokens(Integer cachedTokens) {
    this.cachedTokens = cachedTokens;
    return this;
  }

   /**
   * The number of cached tokens used in the Response.
   * @return cachedTokens
  **/
  public Integer getCachedTokens() {
    return cachedTokens;
  }

  public void setCachedTokens(Integer cachedTokens) {
    this.cachedTokens = cachedTokens;
  }

  public RealtimeResponseUsageInputTokenDetails textTokens(Integer textTokens) {
    this.textTokens = textTokens;
    return this;
  }

   /**
   * The number of text tokens used in the Response.
   * @return textTokens
  **/
  public Integer getTextTokens() {
    return textTokens;
  }

  public void setTextTokens(Integer textTokens) {
    this.textTokens = textTokens;
  }

  public RealtimeResponseUsageInputTokenDetails audioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
    return this;
  }

   /**
   * The number of audio tokens used in the Response.
   * @return audioTokens
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

