package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class RealtimeConversationItemContentInner   {
  

public enum TypeEnum {

    @JsonProperty("input_audio") INPUT_AUDIO(String.valueOf("input_audio")), @JsonProperty("input_text") INPUT_TEXT(String.valueOf("input_text")), @JsonProperty("item_reference") ITEM_REFERENCE(String.valueOf("item_reference")), @JsonProperty("text") TEXT(String.valueOf("text"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private String text;

  private String id;

  private String audio;

  private String transcript;

  /**
   * The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;). 
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
   * The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types. 
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
   * ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items. 
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
   * Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type. 
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
   * The transcript of the audio, used for &#x60;input_audio&#x60; content type. 
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

