/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseCreateParamsToolsInner   {
  


  public enum TypeEnum {
    FUNCTION("function");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private String name;
  private String description;
  private Object parameters;

  /**
   * The type of the tool, i.e. `function`.
   */
  public RealtimeResponseCreateParamsToolsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "The type of the tool, i.e. `function`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The name of the function.
   */
  public RealtimeResponseCreateParamsToolsInner name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the function.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
   */
  public RealtimeResponseCreateParamsToolsInner description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). ")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Parameters of the function in JSON Schema.
   */
  public RealtimeResponseCreateParamsToolsInner parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

  
  @ApiModelProperty(value = "Parameters of the function in JSON Schema.")
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
    return Objects.equals(type, realtimeResponseCreateParamsToolsInner.type) &&
        Objects.equals(name, realtimeResponseCreateParamsToolsInner.name) &&
        Objects.equals(description, realtimeResponseCreateParamsToolsInner.description) &&
        Objects.equals(parameters, realtimeResponseCreateParamsToolsInner.parameters);
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

