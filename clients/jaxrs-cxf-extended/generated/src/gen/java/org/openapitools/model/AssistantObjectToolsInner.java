package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AssistantToolsCode;
import org.openapitools.model.AssistantToolsFileSearch;
import org.openapitools.model.AssistantToolsFileSearchFileSearch;
import org.openapitools.model.AssistantToolsFunction;
import org.openapitools.model.FunctionObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssistantObjectToolsInner  {
  
public enum TypeEnum {

    @JsonProperty("code_interpreter") CODE_INTERPRETER(String.valueOf("code_interpreter")),
    @JsonProperty("file_search") FILE_SEARCH(String.valueOf("file_search")),
    @JsonProperty("function") FUNCTION(String.valueOf("function"));

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
  * The type of tool being defined: `code_interpreter`
  */
  @ApiModelProperty(required = true, value = "The type of tool being defined: `code_interpreter`")
  private TypeEnum type;

  @ApiModelProperty(value = "")
  @Valid
  private AssistantToolsFileSearchFileSearch fileSearch;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private FunctionObject function;
 /**
  * The type of tool being defined: &#x60;code_interpreter&#x60;
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public AssistantObjectToolsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get fileSearch
  * @return fileSearch
  */
  @JsonProperty("file_search")
  public AssistantToolsFileSearchFileSearch getFileSearch() {
    return fileSearch;
  }

  /**
   * Sets the <code>fileSearch</code> property.
   */
 public void setFileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  /**
   * Sets the <code>fileSearch</code> property.
   */
  public AssistantObjectToolsInner fileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

 /**
  * Get function
  * @return function
  */
  @JsonProperty("function")
  @NotNull
  public FunctionObject getFunction() {
    return function;
  }

  /**
   * Sets the <code>function</code> property.
   */
 public void setFunction(FunctionObject function) {
    this.function = function;
  }

  /**
   * Sets the <code>function</code> property.
   */
  public AssistantObjectToolsInner function(FunctionObject function) {
    this.function = function;
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
    AssistantObjectToolsInner assistantObjectToolsInner = (AssistantObjectToolsInner) o;
    return Objects.equals(this.type, assistantObjectToolsInner.type) &&
        Objects.equals(this.fileSearch, assistantObjectToolsInner.fileSearch) &&
        Objects.equals(this.function, assistantObjectToolsInner.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, fileSearch, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantObjectToolsInner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fileSearch: ").append(toIndentedString(fileSearch)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

