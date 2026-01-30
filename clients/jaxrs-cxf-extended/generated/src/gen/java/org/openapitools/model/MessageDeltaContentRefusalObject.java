package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonProperty("refusal") REFUSAL(String.valueOf("refusal"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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
  */
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  /**
   * Sets the <code>index</code> property.
   */
 public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Sets the <code>index</code> property.
   */
  public MessageDeltaContentRefusalObject index(Integer index) {
    this.index = index;
    return this;
  }

 /**
  * Always &#x60;refusal&#x60;.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public MessageDeltaContentRefusalObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get refusal
  * @return refusal
  */
  @JsonProperty("refusal")
  public String getRefusal() {
    return refusal;
  }

  /**
   * Sets the <code>refusal</code> property.
   */
 public void setRefusal(String refusal) {
    this.refusal = refusal;
  }

  /**
   * Sets the <code>refusal</code> property.
   */
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

