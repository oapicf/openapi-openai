package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestMessageContentPartRefusal;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestMessageContentPartText;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionRequestAssistantMessageContentPart   {
  


  public enum TypeEnum {
    TEXT("text"),
    REFUSAL("refusal");

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
  private String text;
  private String refusal;

  public ChatCompletionRequestAssistantMessageContentPart () {

  }

  public ChatCompletionRequestAssistantMessageContentPart (TypeEnum type, String text, String refusal) {
    this.type = type;
    this.text = text;
    this.refusal = refusal;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

    
  @JsonProperty("refusal")
  public String getRefusal() {
    return refusal;
  }
  public void setRefusal(String refusal) {
    this.refusal = refusal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestAssistantMessageContentPart chatCompletionRequestAssistantMessageContentPart = (ChatCompletionRequestAssistantMessageContentPart) o;
    return Objects.equals(type, chatCompletionRequestAssistantMessageContentPart.type) &&
        Objects.equals(text, chatCompletionRequestAssistantMessageContentPart.text) &&
        Objects.equals(refusal, chatCompletionRequestAssistantMessageContentPart.refusal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, refusal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestAssistantMessageContentPart {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
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
