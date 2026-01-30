package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RealtimeConversationItemContentInner
 */

@JsonTypeName("RealtimeConversationItem_content_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeConversationItemContentInner {

  /**
   * The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
   */
  public enum TypeEnum {
    INPUT_AUDIO("input_audio"),
    
    INPUT_TEXT("input_text"),
    
    ITEM_REFERENCE("item_reference"),
    
    TEXT("text");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TypeEnum type;

  private @Nullable String text;

  private @Nullable String id;

  private @Nullable String audio;

  private @Nullable String transcript;

  public RealtimeConversationItemContentInner type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
   * @return type
   */
  
  @Schema(name = "type", description = "The content type (`input_text`, `input_audio`, `item_reference`, `text`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public RealtimeConversationItemContentInner text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * The text content, used for `input_text` and `text` content types. 
   * @return text
   */
  
  @Schema(name = "text", description = "The text content, used for `input_text` and `text` content types. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  public RealtimeConversationItemContentInner id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
   * @return id
   */
  
  @Schema(name = "id", description = "ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public RealtimeConversationItemContentInner audio(@Nullable String audio) {
    this.audio = audio;
    return this;
  }

  /**
   * Base64-encoded audio bytes, used for `input_audio` content type. 
   * @return audio
   */
  
  @Schema(name = "audio", description = "Base64-encoded audio bytes, used for `input_audio` content type. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audio")
  public @Nullable String getAudio() {
    return audio;
  }

  public void setAudio(@Nullable String audio) {
    this.audio = audio;
  }

  public RealtimeConversationItemContentInner transcript(@Nullable String transcript) {
    this.transcript = transcript;
    return this;
  }

  /**
   * The transcript of the audio, used for `input_audio` content type. 
   * @return transcript
   */
  
  @Schema(name = "transcript", description = "The transcript of the audio, used for `input_audio` content type. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transcript")
  public @Nullable String getTranscript() {
    return transcript;
  }

  public void setTranscript(@Nullable String transcript) {
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

