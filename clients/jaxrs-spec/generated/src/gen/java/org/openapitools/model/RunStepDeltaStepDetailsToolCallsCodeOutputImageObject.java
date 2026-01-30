package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("RunStepDeltaStepDetailsToolCallsCodeOutputImageObject")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject   {
  private Integer index;
  public enum TypeEnum {

    IMAGE(String.valueOf("image"));


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
  private RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image;

  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject() {
  }

  @JsonCreator
  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(
    @JsonProperty(required = true, value = "index") Integer index,
    @JsonProperty(required = true, value = "type") TypeEnum type
  ) {
    this.index = index;
    this.type = type;
  }

  /**
   * The index of the output in the outputs array.
   **/
  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the output in the outputs array.")
  @JsonProperty(required = true, value = "index")
  @NotNull public Integer getIndex() {
    return index;
  }

  @JsonProperty(required = true, value = "index")
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Always &#x60;image&#x60;.
   **/
  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `image`.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject image(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image) {
    this.image = image;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("image")
  @Valid public RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
    return image;
  }

  @JsonProperty("image")
  public void setImage(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject runStepDeltaStepDetailsToolCallsCodeOutputImageObject = (RunStepDeltaStepDetailsToolCallsCodeOutputImageObject) o;
    return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsCodeOutputImageObject.index) &&
        Objects.equals(this.type, runStepDeltaStepDetailsToolCallsCodeOutputImageObject.type) &&
        Objects.equals(this.image, runStepDeltaStepDetailsToolCallsCodeOutputImageObject.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

