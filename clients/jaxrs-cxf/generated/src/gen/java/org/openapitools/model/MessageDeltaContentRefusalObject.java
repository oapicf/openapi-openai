package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The refusal content that is part of a message.
 */
@ApiModel(description="The refusal content that is part of a message.")

public class MessageDeltaContentRefusalObject  {
  
 /**
  * The index of the refusal part in the message.
  */
  @ApiModelProperty(required = true, value = "The index of the refusal part in the message.")

  private Integer index;

public enum TypeEnum {

REFUSAL(String.valueOf("refusal"));


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

 /**
  * Always `refusal`.
  */
  @ApiModelProperty(required = true, value = "Always `refusal`.")

  private TypeEnum type;

  @ApiModelProperty(value = "")

  private String refusal;
 /**
   * The index of the refusal part in the message.
   * @return index
  **/
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MessageDeltaContentRefusalObject index(Integer index) {
    this.index = index;
    return this;
  }

 /**
   * Always &#x60;refusal&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaContentRefusalObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get refusal
   * @return refusal
  **/
  @JsonProperty("refusal")
  public String getRefusal() {
    return refusal;
  }

  public void setRefusal(String refusal) {
    this.refusal = refusal;
  }

  public MessageDeltaContentRefusalObject refusal(String refusal) {
    this.refusal = refusal;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

