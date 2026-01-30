package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionRequestMessageContentPartRefusal   {
  


  public enum TypeEnum {
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
  private String refusal;

  public ChatCompletionRequestMessageContentPartRefusal () {

  }

  public ChatCompletionRequestMessageContentPartRefusal (TypeEnum type, String refusal) {
    this.type = type;
    this.refusal = refusal;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
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
    ChatCompletionRequestMessageContentPartRefusal chatCompletionRequestMessageContentPartRefusal = (ChatCompletionRequestMessageContentPartRefusal) o;
    return Objects.equals(type, chatCompletionRequestMessageContentPartRefusal.type) &&
        Objects.equals(refusal, chatCompletionRequestMessageContentPartRefusal.refusal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, refusal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessageContentPartRefusal {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
