package org.openapitools.model;

import org.openapitools.model.AssistantToolsCode;
import org.openapitools.model.AssistantToolsFileSearch;
import org.openapitools.model.AssistantToolsFileSearchFileSearch;
import org.openapitools.model.AssistantToolsFunction;
import org.openapitools.model.FunctionObject;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateThreadAndRunRequestToolsInner  {
  
public enum TypeEnum {

CODE_INTERPRETER(String.valueOf("code_interpreter")), FILE_SEARCH(String.valueOf("file_search")), FUNCTION(String.valueOf("function"));


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

  private AssistantToolsFileSearchFileSearch fileSearch;

  @ApiModelProperty(required = true, value = "")

  private FunctionObject function;
 /**
   * The type of tool being defined: &#x60;code_interpreter&#x60;
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

  public CreateThreadAndRunRequestToolsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get fileSearch
   * @return fileSearch
  **/
  @JsonProperty("file_search")
  public AssistantToolsFileSearchFileSearch getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  public CreateThreadAndRunRequestToolsInner fileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

 /**
   * Get function
   * @return function
  **/
  @JsonProperty("function")
  public FunctionObject getFunction() {
    return function;
  }

  public void setFunction(FunctionObject function) {
    this.function = function;
  }

  public CreateThreadAndRunRequestToolsInner function(FunctionObject function) {
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
    CreateThreadAndRunRequestToolsInner createThreadAndRunRequestToolsInner = (CreateThreadAndRunRequestToolsInner) o;
    return Objects.equals(this.type, createThreadAndRunRequestToolsInner.type) &&
        Objects.equals(this.fileSearch, createThreadAndRunRequestToolsInner.fileSearch) &&
        Objects.equals(this.function, createThreadAndRunRequestToolsInner.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, fileSearch, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreadAndRunRequestToolsInner {\n");
    
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

