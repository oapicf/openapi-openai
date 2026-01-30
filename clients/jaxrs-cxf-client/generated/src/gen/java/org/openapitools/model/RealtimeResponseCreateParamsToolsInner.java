package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RealtimeResponseCreateParamsToolsInner  {
  
public enum TypeEnum {

FUNCTION(String.valueOf("function"));


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
  * The type of the tool, i.e. `function`.
  */
  @ApiModelProperty(value = "The type of the tool, i.e. `function`.")

  private TypeEnum type;

 /**
  * The name of the function.
  */
  @ApiModelProperty(value = "The name of the function.")

  private String name;

 /**
  * The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
  */
  @ApiModelProperty(value = "The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). ")

  private String description;

 /**
  * Parameters of the function in JSON Schema.
  */
  @ApiModelProperty(value = "Parameters of the function in JSON Schema.")

  private Object parameters;
 /**
   * The type of the tool, i.e. &#x60;function&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeResponseCreateParamsToolsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The name of the function.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RealtimeResponseCreateParamsToolsInner name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RealtimeResponseCreateParamsToolsInner description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Parameters of the function in JSON Schema.
   * @return parameters
  **/
  @JsonProperty("parameters")
  public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

  public RealtimeResponseCreateParamsToolsInner parameters(Object parameters) {
    this.parameters = parameters;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

