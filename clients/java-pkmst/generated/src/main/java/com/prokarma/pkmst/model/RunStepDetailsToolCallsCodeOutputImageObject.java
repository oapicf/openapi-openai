package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.RunStepDetailsToolCallsCodeOutputImageObjectImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * RunStepDetailsToolCallsCodeOutputImageObject
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsCodeOutputImageObject   {
  /**
   * Always `image`.
   */
  public enum TypeEnum {
    IMAGE("image");

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

  @JsonProperty("image")
  private RunStepDetailsToolCallsCodeOutputImageObjectImage image;

  public RunStepDetailsToolCallsCodeOutputImageObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `image`.
   * @return type
   */
  @ApiModelProperty(required = true, value = "Always `image`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDetailsToolCallsCodeOutputImageObject image(RunStepDetailsToolCallsCodeOutputImageObjectImage image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @ApiModelProperty(required = true, value = "")
  public RunStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
    return image;
  }

  public void setImage(RunStepDetailsToolCallsCodeOutputImageObjectImage image) {
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
    RunStepDetailsToolCallsCodeOutputImageObject runStepDetailsToolCallsCodeOutputImageObject = (RunStepDetailsToolCallsCodeOutputImageObject) o;
    return Objects.equals(this.type, runStepDetailsToolCallsCodeOutputImageObject.type) &&
        Objects.equals(this.image, runStepDetailsToolCallsCodeOutputImageObject.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsCodeOutputImageObject {\n");
    
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

