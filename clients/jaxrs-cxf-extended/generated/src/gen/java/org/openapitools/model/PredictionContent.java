package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.PredictionContentContent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 */
@ApiModel(description="Static predicted output content, such as the content of a text file that is being regenerated. ")

public class PredictionContent  {
  
public enum TypeEnum {

    @JsonProperty("content") CONTENT(String.valueOf("content"));

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
  * The type of the predicted content you want to provide. This type is currently always `content`. 
  */
  @ApiModelProperty(required = true, value = "The type of the predicted content you want to provide. This type is currently always `content`. ")
  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PredictionContentContent content;
 /**
  * The type of the predicted content you want to provide. This type is currently always &#x60;content&#x60;. 
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
  public PredictionContent type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get content
  * @return content
  */
  @JsonProperty("content")
  @NotNull
  public PredictionContentContent getContent() {
    return content;
  }

  /**
   * Sets the <code>content</code> property.
   */
 public void setContent(PredictionContentContent content) {
    this.content = content;
  }

  /**
   * Sets the <code>content</code> property.
   */
  public PredictionContent content(PredictionContentContent content) {
    this.content = content;
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
    PredictionContent predictionContent = (PredictionContent) o;
    return Objects.equals(this.type, predictionContent.type) &&
        Objects.equals(this.content, predictionContent.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictionContent {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

