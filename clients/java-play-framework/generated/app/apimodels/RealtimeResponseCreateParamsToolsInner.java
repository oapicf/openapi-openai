package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RealtimeResponseCreateParamsToolsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealtimeResponseCreateParamsToolsInner   {
  /**
   * The type of the tool, i.e. `function`.
   */
  public enum TypeEnum {
    FUNCTION("function");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

