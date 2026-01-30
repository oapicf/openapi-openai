package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The refusal content that is part of a message.
 */
@ApiModel(description = "The refusal content that is part of a message.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentRefusalObject   {
  @JsonProperty("index")
  private Integer index;

  /**
   * Always `refusal`.
   */
  public enum TypeEnum {
    REFUSAL("refusal");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("refusal")
  private String refusal;

  public MessageDeltaContentRefusalObject index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the refusal part in the message.
   * @return index
   */
  @ApiModelProperty(required = true, value = "The index of the refusal part in the message.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MessageDeltaContentRefusalObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `refusal`.
   * @return type
   */
  @ApiModelProperty(required = true, value = "Always `refusal`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaContentRefusalObject refusal(String refusal) {
    this.refusal = refusal;
    return this;
  }

  /**
   * Get refusal
   * @return refusal
   */
  @ApiModelProperty(value = "")
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
    MessageDeltaContentRefusalObject messageDeltaContentRefusalObject = (MessageDeltaContentRefusalObject) o;
    return Objects.equals(this.index, messageDeltaContentRefusalObject.index) &&
        Objects.equals(this.type, messageDeltaContentRefusalObject.type) &&
        Objects.equals(this.refusal, messageDeltaContentRefusalObject.refusal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, refusal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentRefusalObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

