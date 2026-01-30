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



public class ChatCompletionRequestMessageContentPartAudioInputAudio   {
  
  private String data;


public enum FormatEnum {

    @JsonProperty("wav") WAV(String.valueOf("wav")), @JsonProperty("mp3") MP3(String.valueOf("mp3"));


    private String value;

    FormatEnum(String v) {
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

  private FormatEnum format;

  /**
   * Base64 encoded audio data.
   **/
  public ChatCompletionRequestMessageContentPartAudioInputAudio data(String data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Base64 encoded audio data.")
  @JsonProperty("data")
  @NotNull
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }


  /**
   * The format of the encoded audio data. Currently supports \&quot;wav\&quot; and \&quot;mp3\&quot;. 
   **/
  public ChatCompletionRequestMessageContentPartAudioInputAudio format(FormatEnum format) {
    this.format = format;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". ")
  @JsonProperty("format")
  @NotNull
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
    ChatCompletionRequestMessageContentPartAudioInputAudio chatCompletionRequestMessageContentPartAudioInputAudio = (ChatCompletionRequestMessageContentPartAudioInputAudio) o;
    return Objects.equals(this.data, chatCompletionRequestMessageContentPartAudioInputAudio.data) &&
        Objects.equals(this.format, chatCompletionRequestMessageContentPartAudioInputAudio.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessageContentPartAudioInputAudio {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

