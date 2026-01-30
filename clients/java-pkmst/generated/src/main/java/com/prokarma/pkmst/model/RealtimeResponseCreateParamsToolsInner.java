package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * RealtimeResponseCreateParamsToolsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseCreateParamsToolsInner   {
  /**
   * The type of the tool, i.e. `function`.
   */
  public enum TypeEnum {
    FUNCTION("function");

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

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("parameters")
  private Object parameters;

  public RealtimeResponseCreateParamsToolsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the tool, i.e. `function`.
   * @return type
   */
  @ApiModelProperty(value = "The type of the tool, i.e. `function`.")
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
  @ApiModelProperty(value = "The name of the function.")
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
  @ApiModelProperty(value = "The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). ")
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
  @ApiModelProperty(value = "Parameters of the function in JSON Schema.")
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

