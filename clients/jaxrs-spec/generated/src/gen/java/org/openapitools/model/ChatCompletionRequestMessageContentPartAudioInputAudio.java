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



@JsonTypeName("ChatCompletionRequestMessageContentPartAudio_input_audio")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionRequestMessageContentPartAudioInputAudio   {
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

  public ChatCompletionRequestMessageContentPartAudioInputAudio() {
  }

  @JsonCreator
  public ChatCompletionRequestMessageContentPartAudioInputAudio(
    @JsonProperty(required = true, value = "data") String data,
    @JsonProperty(required = true, value = "format") FormatEnum format
  ) {
    this.data = data;
    this.format = format;
  }

  /**
   * Base64 encoded audio data.
   **/
  public ChatCompletionRequestMessageContentPartAudioInputAudio data(String data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Base64 encoded audio data.")
  @JsonProperty(required = true, value = "data")
  @NotNull public String getData() {
    return data;
  }

  @JsonProperty(required = true, value = "data")
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

