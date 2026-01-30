package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ChatCompletionRequestMessageContentPartAudioInputAudio
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionRequestMessageContentPartAudioInputAudio   {
  @JsonProperty("data")
  private String data;

  /**
   * The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
   */
  public enum FormatEnum {
    WAV("wav"),
    
    MP3("mp3");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FormatEnum fromValue(String text) {
      for (FormatEnum b : FormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("format")
  private FormatEnum format;

  public ChatCompletionRequestMessageContentPartAudioInputAudio data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Base64 encoded audio data.
   * @return data
  **/
  @ApiModelProperty(required = true, value = "Base64 encoded audio data.")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ChatCompletionRequestMessageContentPartAudioInputAudio format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
   * @return format
  **/
  @ApiModelProperty(required = true, value = "The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". ")
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

