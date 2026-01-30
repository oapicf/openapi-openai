/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionRequestMessageContentPartAudioInputAudio;



/**
 * Learn about [audio inputs](/docs/guides/audio). 
 */

@ApiModel(description = "Learn about [audio inputs](/docs/guides/audio). ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionRequestMessageContentPartAudio   {
  


  public enum TypeEnum {
    INPUT_AUDIO("input_audio");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio;

  /**
   * The type of the content part. Always `input_audio`.
   */
  public ChatCompletionRequestMessageContentPartAudio type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of the content part. Always `input_audio`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   */
  public ChatCompletionRequestMessageContentPartAudio inputAudio(ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
    this.inputAudio = inputAudio;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("input_audio")
  public ChatCompletionRequestMessageContentPartAudioInputAudio getInputAudio() {
    return inputAudio;
  }
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
    ChatCompletionRequestMessageContentPartAudio chatCompletionRequestMessageContentPartAudio = (ChatCompletionRequestMessageContentPartAudio) o;
    return Objects.equals(type, chatCompletionRequestMessageContentPartAudio.type) &&
        Objects.equals(inputAudio, chatCompletionRequestMessageContentPartAudio.inputAudio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, inputAudio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessageContentPartAudio {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

