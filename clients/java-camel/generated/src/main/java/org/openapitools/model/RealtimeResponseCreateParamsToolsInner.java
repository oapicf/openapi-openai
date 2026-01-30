package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RealtimeResponseCreateParamsToolsInner
 */

@JsonTypeName("RealtimeResponseCreateParams_tools_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseCreateParamsToolsInner {

  /**
   * The type of the tool, i.e. `function`.
   */
  public enum TypeEnum {
    FUNCTION("function");

    private final String value;

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

  private String name;

  private String description;

  private Object parameters;

  public RealtimeResponseCreateParamsToolsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the tool, i.e. `function`.
   * @return type
   */
  
  @Schema(name = "type", description = "The type of the tool, i.e. `function`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeResponseCreateParamsToolsInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the function.
   * @return name
   */
  
  @Schema(name = "name", description = "The name of the function.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RealtimeResponseCreateParamsToolsInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
   * @return description
   */
  
  @Schema(name = "description", description = "The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RealtimeResponseCreateParamsToolsInner parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Parameters of the function in JSON Schema.
   * @return parameters
   */
  
  @Schema(name = "parameters", description = "Parameters of the function in JSON Schema.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameters")
  public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseCreateParamsToolsInner realtimeResponseCreateParamsToolsInner = (RealtimeResponseCreateParamsToolsInner) o;
    return Objects.equals(this.type, realtimeResponseCreateParamsToolsInner.type) &&
        Objects.equals(this.name, realtimeResponseCreateParamsToolsInner.name) &&
        Objects.equals(this.description, realtimeResponseCreateParamsToolsInner.description) &&
        Objects.equals(this.parameters, realtimeResponseCreateParamsToolsInner.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, description, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseCreateParamsToolsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

