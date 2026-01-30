package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionRequestMessageContentPartAudio;
import org.openapitools.model.ChatCompletionRequestMessageContentPartAudioInputAudio;
import org.openapitools.model.ChatCompletionRequestMessageContentPartImage;
import org.openapitools.model.ChatCompletionRequestMessageContentPartImageImageUrl;
import org.openapitools.model.ChatCompletionRequestMessageContentPartText;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ChatCompletionRequestUserMessageContentPart")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionRequestUserMessageContentPart   {
  public enum TypeEnum {

    TEXT(String.valueOf("text")), IMAGE_URL(String.valueOf("image_url")), INPUT_AUDIO(String.valueOf("input_audio"));


    private String value;

    TypeEnum (String v) {
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
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private TypeEnum type;
  private String text;
  private ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;
  private ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio;

  public ChatCompletionRequestUserMessageContentPart() {
  }

  @JsonCreator
  public ChatCompletionRequestUserMessageContentPart(
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "text") String text,
    @JsonProperty(required = true, value = "image_url") ChatCompletionRequestMessageContentPartImageImageUrl imageUrl,
    @JsonProperty(required = true, value = "input_audio") ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio
  ) {
    this.type = type;
    this.text = text;
    this.imageUrl = imageUrl;
    this.inputAudio = inputAudio;
  }

  /**
   * The type of the content part.
   **/
  public ChatCompletionRequestUserMessageContentPart type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of the content part.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The text content.
   **/
  public ChatCompletionRequestUserMessageContentPart text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The text content.")
  @JsonProperty(required = true, value = "text")
  @NotNull public String getText() {
    return text;
  }

  @JsonProperty(required = true, value = "text")
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  public ChatCompletionRequestUserMessageContentPart imageUrl(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "image_url")
  @NotNull @Valid public ChatCompletionRequestMessageContentPartImageImageUrl getImageUrl() {
    return imageUrl;
  }

  @JsonProperty(required = true, value = "image_url")
  public void setImageUrl(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   **/
  public ChatCompletionRequestUserMessageContentPart inputAudio(ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
    this.inputAudio = inputAudio;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "input_audio")
  @NotNull @Valid public ChatCompletionRequestMessageContentPartAudioInputAudio getInputAudio() {
    return inputAudio;
  }

  @JsonProperty(required = true, value = "input_audio")
  public void setInputAudio(ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
    this.inputAudio = inputAudio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestUserMessageContentPart chatCompletionRequestUserMessageContentPart = (ChatCompletionRequestUserMessageContentPart) o;
    return Objects.equals(this.type, chatCompletionRequestUserMessageContentPart.type) &&
        Objects.equals(this.text, chatCompletionRequestUserMessageContentPart.text) &&
        Objects.equals(this.imageUrl, chatCompletionRequestUserMessageContentPart.imageUrl) &&
        Objects.equals(this.inputAudio, chatCompletionRequestUserMessageContentPart.inputAudio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, imageUrl, inputAudio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestUserMessageContentPart {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    inputAudio: ").append(toIndentedString(inputAudio)).append("\n");
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

