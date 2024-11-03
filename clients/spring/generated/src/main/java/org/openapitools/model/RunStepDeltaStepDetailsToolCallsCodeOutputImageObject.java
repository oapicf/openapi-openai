package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-03T11:16:04.738790927Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject implements RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {

  private Integer index;

  /**
   * Always `image`.
   */
  public enum TypeEnum {
    IMAGE("image");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private TypeEnum type;

  private RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image;

  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(Integer index, TypeEnum type) {
    this.index = index;
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the output in the outputs array.
   * @return index
   */
  @NotNull 
  @Schema(name = "index", description = "The index of the output in the outputs array.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `image`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "Always `image`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject image(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @Valid 
  @Schema(name = "image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
    return image;
  }

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

