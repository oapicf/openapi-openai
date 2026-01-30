package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeConversationItemContentInner   {
  /**
   * The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
   */
  public enum TypeEnum {
    INPUT_AUDIO("input_audio"),
    
    INPUT_TEXT("input_text"),
    
    ITEM_REFERENCE("item_reference"),
    
    TEXT("text");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("text")
  private String text;

  @JsonProperty("id")
  private String id;

  @JsonProperty("audio")
  private String audio;

  @JsonProperty("transcript")
  private String transcript;

  /**
   * The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
   **/
  public RealtimeConversationItemContentInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "The content type (`input_text`, `input_audio`, `item_reference`, `text`). ")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The text content, used for `input_text` and `text` content types. 
   **/
  public RealtimeConversationItemContentInner text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "The text content, used for `input_text` and `text` content types. ")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
   **/
  public RealtimeConversationItemContentInner id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. ")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Base64-encoded audio bytes, used for `input_audio` content type. 
   **/
  public RealtimeConversationItemContentInner audio(String audio) {
    this.audio = audio;
    return this;
  }

  
  @ApiModelProperty(value = "Base64-encoded audio bytes, used for `input_audio` content type. ")
  @JsonProperty("audio")
  public String getAudio() {
    return audio;
  }
  public void setAudio(String audio) {
    this.audio = audio;
  }

  /**
   * The transcript of the audio, used for `input_audio` content type. 
   **/
  public RealtimeConversationItemContentInner transcript(String transcript) {
    this.transcript = transcript;
    return this;
  }

  
  @ApiModelProperty(value = "The transcript of the audio, used for `input_audio` content type. ")
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
    RealtimeConversationItemContentInner realtimeConversationItemContentInner = (RealtimeConversationItemContentInner) o;
    return Objects.equals(type, realtimeConversationItemContentInner.type) &&
        Objects.equals(text, realtimeConversationItemContentInner.text) &&
        Objects.equals(id, realtimeConversationItemContentInner.id) &&
        Objects.equals(audio, realtimeConversationItemContentInner.audio) &&
        Objects.equals(transcript, realtimeConversationItemContentInner.transcript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, id, audio, transcript);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeConversationItemContentInner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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

