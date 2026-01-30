package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PredictionContentContent;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Static predicted output content, such as the content of a text file that is being regenerated. ")
public class PredictionContent   {
  

public enum TypeEnum {

    @JsonProperty("content") CONTENT(String.valueOf("content"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private PredictionContentContent content;

  /**
   * The type of the predicted content you want to provide. This type is currently always &#x60;content&#x60;. 
   **/
  public PredictionContent type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of the predicted content you want to provide. This type is currently always `content`. ")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public PredictionContent content(PredictionContentContent content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("content")
  @NotNull
  public PredictionContentContent getContent() {
    return content;
  }
  public void setContent(PredictionContentContent content) {
    this.content = content;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

