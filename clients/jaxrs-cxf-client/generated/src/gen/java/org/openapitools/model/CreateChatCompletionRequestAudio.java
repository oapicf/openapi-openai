package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 
 */
@ApiModel(description="Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). ")

public class CreateChatCompletionRequestAudio  {
  
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
    public String toString() {
        return String.valueOf(value);
    }

    public static VoiceEnum fromValue(String value) {
        for (VoiceEnum b : VoiceEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
  */
  @ApiModelProperty(required = true, value = "The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). ")

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
    public String toString() {
        return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
        for (FormatEnum b : FormatEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
  */
  @ApiModelProperty(required = true, value = "Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. ")

  private FormatEnum format;
 /**
   * The voice the model uses to respond. Supported voices are &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;sage&#x60;, and &#x60;verse&#x60; (also supported but not recommended are &#x60;alloy&#x60;, &#x60;echo&#x60;, and &#x60;shimmer&#x60;; these voices are less expressive). 
   * @return voice
  **/
  @JsonProperty("voice")
  public String getVoice() {
    if (voice == null) {
      return null;
    }
    return voice.value();
  }

  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }

  public CreateChatCompletionRequestAudio voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

 /**
   * Specifies the output audio format. Must be one of &#x60;wav&#x60;, &#x60;mp3&#x60;, &#x60;flac&#x60;, &#x60;opus&#x60;, or &#x60;pcm16&#x60;. 
   * @return format
  **/
  @JsonProperty("format")
  public String getFormat() {
    if (format == null) {
      return null;
    }
    return format.value();
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public CreateChatCompletionRequestAudio format(FormatEnum format) {
    this.format = format;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

