package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionRequestMessageContentPartAudioInputAudio  {
  
 /**
  * Base64 encoded audio data.
  */
  @ApiModelProperty(required = true, value = "Base64 encoded audio data.")

  private String data;

public enum FormatEnum {

WAV(String.valueOf("wav")), MP3(String.valueOf("mp3"));


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
  * The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
  */
  @ApiModelProperty(required = true, value = "The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". ")

  private FormatEnum format;
 /**
   * Base64 encoded audio data.
   * @return data
  **/
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ChatCompletionRequestMessageContentPartAudioInputAudio data(String data) {
    this.data = data;
    return this;
  }

 /**
   * The format of the encoded audio data. Currently supports \&quot;wav\&quot; and \&quot;mp3\&quot;. 
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

  public ChatCompletionRequestMessageContentPartAudioInputAudio format(FormatEnum format) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

