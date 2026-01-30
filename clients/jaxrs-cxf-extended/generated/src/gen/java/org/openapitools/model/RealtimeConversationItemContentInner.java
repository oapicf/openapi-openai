package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RealtimeConversationItemContentInner  {
  
public enum TypeEnum {

    @JsonProperty("input_audio") INPUT_AUDIO(String.valueOf("input_audio")),
    @JsonProperty("input_text") INPUT_TEXT(String.valueOf("input_text")),
    @JsonProperty("item_reference") ITEM_REFERENCE(String.valueOf("item_reference")),
    @JsonProperty("text") TEXT(String.valueOf("text"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
  */
  @ApiModelProperty(value = "The content type (`input_text`, `input_audio`, `item_reference`, `text`). ")
  private TypeEnum type;

 /**
  * The text content, used for `input_text` and `text` content types. 
  */
  @ApiModelProperty(value = "The text content, used for `input_text` and `text` content types. ")
  private String text;

 /**
  * ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
  */
  @ApiModelProperty(value = "ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. ")
  private String id;

 /**
  * Base64-encoded audio bytes, used for `input_audio` content type. 
  */
  @ApiModelProperty(value = "Base64-encoded audio bytes, used for `input_audio` content type. ")
  private String audio;

 /**
  * The transcript of the audio, used for `input_audio` content type. 
  */
  @ApiModelProperty(value = "The transcript of the audio, used for `input_audio` content type. ")
  private String transcript;
 /**
  * The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;). 
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RealtimeConversationItemContentInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types. 
  * @return text
  */
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  /**
   * Sets the <code>text</code> property.
   */
 public void setText(String text) {
    this.text = text;
  }

  /**
   * Sets the <code>text</code> property.
   */
  public RealtimeConversationItemContentInner text(String text) {
    this.text = text;
    return this;
  }

 /**
  * ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items. 
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public RealtimeConversationItemContentInner id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type. 
  * @return audio
  */
  @JsonProperty("audio")
  public String getAudio() {
    return audio;
  }

  /**
   * Sets the <code>audio</code> property.
   */
 public void setAudio(String audio) {
    this.audio = audio;
  }

  /**
   * Sets the <code>audio</code> property.
   */
  public RealtimeConversationItemContentInner audio(String audio) {
    this.audio = audio;
    return this;
  }

 /**
  * The transcript of the audio, used for &#x60;input_audio&#x60; content type. 
  * @return transcript
  */
  @JsonProperty("transcript")
  public String getTranscript() {
    return transcript;
  }

  /**
   * Sets the <code>transcript</code> property.
   */
 public void setTranscript(String transcript) {
    this.transcript = transcript;
  }

  /**
   * Sets the <code>transcript</code> property.
   */
  public RealtimeConversationItemContentInner transcript(String transcript) {
    this.transcript = transcript;
    return this;
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
    return Objects.equals(this.type, realtimeConversationItemContentInner.type) &&
        Objects.equals(this.text, realtimeConversationItemContentInner.text) &&
        Objects.equals(this.id, realtimeConversationItemContentInner.id) &&
        Objects.equals(this.audio, realtimeConversationItemContentInner.audio) &&
        Objects.equals(this.transcript, realtimeConversationItemContentInner.transcript);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

