package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Parameters for audio output. Required when audio output is requested with &#x60;modalities: [\&quot;audio\&quot;]&#x60;. [Learn more](/docs/guides/audio). 
 **/
@ApiModel(description = "Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). ")
@JsonTypeName("CreateChatCompletionRequest_audio")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionRequestAudio   {
  public enum VoiceEnum {

    ALLOY(String.valueOf("alloy")), ASH(String.valueOf("ash")), BALLAD(String.valueOf("ballad")), CORAL(String.valueOf("coral")), ECHO(String.valueOf("echo")), SAGE(String.valueOf("sage")), SHIMMER(String.valueOf("shimmer")), VERSE(String.valueOf("verse"));


    private String value;

    VoiceEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static VoiceEnum fromString(String s) {
        for (VoiceEnum b : VoiceEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  public enum FormatEnum {

    WAV(String.valueOf("wav")), MP3(String.valueOf("mp3")), FLAC(String.valueOf("flac")), OPUS(String.valueOf("opus")), PCM16(String.valueOf("pcm16"));


    private String value;

    FormatEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static FormatEnum fromString(String s) {
        for (FormatEnum b : FormatEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  }

  @JsonCreator
  public CreateChatCompletionRequestAudio(
    @JsonProperty(required = true, value = "voice") VoiceEnum voice,
    @JsonProperty(required = true, value = "format") FormatEnum format
  ) {
    this.voice = voice;
    this.format = format;
  }

  /**
   * The voice the model uses to respond. Supported voices are &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;sage&#x60;, and &#x60;verse&#x60; (also supported but not recommended are &#x60;alloy&#x60;, &#x60;echo&#x60;, and &#x60;shimmer&#x60;; these voices are less expressive). 
   **/
  public CreateChatCompletionRequestAudio voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). ")
  @JsonProperty(required = true, value = "voice")
  @NotNull public VoiceEnum getVoice() {
    return voice;
  }

  @JsonProperty(required = true, value = "voice")
  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }

  /**
   * Specifies the output audio format. Must be one of &#x60;wav&#x60;, &#x60;mp3&#x60;, &#x60;flac&#x60;, &#x60;opus&#x60;, or &#x60;pcm16&#x60;. 
   **/
  public CreateChatCompletionRequestAudio format(FormatEnum format) {
    this.format = format;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. ")
  @JsonProperty(required = true, value = "format")
  @NotNull public FormatEnum getFormat() {
    return format;
  }

  @JsonProperty(required = true, value = "format")
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

