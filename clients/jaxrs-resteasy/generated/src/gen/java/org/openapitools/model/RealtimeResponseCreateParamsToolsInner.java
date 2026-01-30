package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseCreateParamsToolsInner   {
  

  /**
   * The type of the tool, i.e. &#x60;function&#x60;.
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
  }

  private TypeEnum type;
  private String name;
  private String description;
  private Object parameters;

  /**
   * The type of the tool, i.e. &#x60;function&#x60;.
   **/
  
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
   **/
  
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
   **/
  
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
   **/
  
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

