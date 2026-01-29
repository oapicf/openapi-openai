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
 * An object describing the expected output of the model. If &#x60;json_object&#x60; only &#x60;function&#x60; type &#x60;tools&#x60; are allowed to be passed to the Run. If &#x60;text&#x60; the model can return text or any value needed. 
 */
@ApiModel(description = "An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T10:45:02.588292416Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantsApiResponseFormat   {
  /**
   * Must be one of `text` or `json_object`.
   */
  public enum TypeEnum {
    TEXT("text"),
    
    JSON_OBJECT("json_object");

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
  private TypeEnum type = TypeEnum.TEXT;

  public AssistantsApiResponseFormat type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Must be one of `text` or `json_object`.
   * @return type
   */
  @ApiModelProperty(example = "json_object", value = "Must be one of `text` or `json_object`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistantsApiResponseFormat assistantsApiResponseFormat = (AssistantsApiResponseFormat) o;
    return Objects.equals(this.type, assistantsApiResponseFormat.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantsApiResponseFormat {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

