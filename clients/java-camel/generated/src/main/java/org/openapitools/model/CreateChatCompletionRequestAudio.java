package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Parameters for audio output. Required when audio output is requested with &#x60;modalities: [\&quot;audio\&quot;]&#x60;. [Learn more](/docs/guides/audio). 
 */

@Schema(name = "CreateChatCompletionRequest_audio", description = "Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). ")
@JsonTypeName("CreateChatCompletionRequest_audio")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionRequestAudio {

  /**
   * The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
   */
  public enum VoiceEnum {
    ALLOY("alloy"),
    
    ASH("ash"),
    
    BALLAD("ballad"),
    
    CORAL("coral"),
    
    ECHO("echo"),
    
    SAGE("sage"),
    
    SHIMMER("shimmer"),
    
    VERSE("verse");

    private final String value;

    VoiceEnum(String value) {
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
    public static VoiceEnum fromValue(String value) {
      for (VoiceEnum b : VoiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VoiceEnum voice;

  /**
   * Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
   */
  public enum FormatEnum {
    WAV("wav"),
    
    MP3("mp3"),
    
    FLAC("flac"),
    
    OPUS("opus"),
    
    PCM16("pcm16");

    private final String value;

    FormatEnum(String value) {
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
    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FormatEnum format;

  public CreateChatCompletionRequestAudio() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateChatCompletionRequestAudio(VoiceEnum voice, FormatEnum format) {
    this.voice = voice;
    this.format = format;
  }

  public CreateChatCompletionRequestAudio voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

  /**
   * The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
   * @return voice
   */
  @NotNull 
  @Schema(name = "voice", description = "The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("voice")
  public VoiceEnum getVoice() {
    return voice;
  }

  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }

  public CreateChatCompletionRequestAudio format(FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
   * @return format
   */
  @NotNull 
  @Schema(name = "format", description = "Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("format")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionRequestAudio createChatCompletionRequestAudio = (CreateChatCompletionRequestAudio) o;
    return Objects.equals(this.voice, createChatCompletionRequestAudio.voice) &&
        Objects.equals(this.format, createChatCompletionRequestAudio.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voice, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionRequestAudio {\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

