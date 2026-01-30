package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssistantToolsCode;
import org.openapitools.model.AssistantToolsFileSearch;
import org.openapitools.model.AssistantToolsFileSearchFileSearch;
import org.openapitools.model.AssistantToolsFunction;
import org.openapitools.model.FunctionObject;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateThreadAndRunRequestToolsInner   {
  /**
   * The type of tool being defined: `code_interpreter`
   */
  public enum TypeEnum {
    CODE_INTERPRETER("code_interpreter"),
    
    FILE_SEARCH("file_search"),
    
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

  @JsonProperty("file_search")
  private AssistantToolsFileSearchFileSearch fileSearch;

  @JsonProperty("function")
  private FunctionObject function;

  /**
   * The type of tool being defined: `code_interpreter`
   **/
  public CreateThreadAndRunRequestToolsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of tool being defined: `code_interpreter`")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public CreateThreadAndRunRequestToolsInner fileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("file_search")
  public AssistantToolsFileSearchFileSearch getFileSearch() {
    return fileSearch;
  }
  public void setFileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  /**
   **/
  public CreateThreadAndRunRequestToolsInner function(FunctionObject function) {
    this.function = function;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("function")
  public FunctionObject getFunction() {
    return function;
  }
  public void setFunction(FunctionObject function) {
    this.function = function;
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
    return Objects.equals(type, createThreadAndRunRequestToolsInner.type) &&
        Objects.equals(fileSearch, createThreadAndRunRequestToolsInner.fileSearch) &&
        Objects.equals(function, createThreadAndRunRequestToolsInner.function);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

