package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * If the audio output modality is requested, this object contains data about the audio response from the model. [Learn more](/docs/guides/audio). 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionResponseMessageAudio   {
  
  private String id;
  private Integer expiresAt;
  private String data;
  private String transcript;

  public ChatCompletionResponseMessageAudio () {

  }

  public ChatCompletionResponseMessageAudio (String id, Integer expiresAt, String data, String transcript) {
    this.id = id;
    this.expiresAt = expiresAt;
    this.data = data;
    this.transcript = transcript;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

    
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

    
  @JsonProperty("transcript")
  public String getTranscript() {
    return transcript;
  }
  public void setTranscript(String transcript) {
    this.transcript = transcript;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionResponseMessageAudio chatCompletionResponseMessageAudio = (ChatCompletionResponseMessageAudio) o;
    return Objects.equals(id, chatCompletionResponseMessageAudio.id) &&
        Objects.equals(expiresAt, chatCompletionResponseMessageAudio.expiresAt) &&
        Objects.equals(data, chatCompletionResponseMessageAudio.data) &&
        Objects.equals(transcript, chatCompletionResponseMessageAudio.transcript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, expiresAt, data, transcript);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionResponseMessageAudio {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
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
