package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssistantToolsCode;
import org.openapitools.model.AssistantToolsFileSearch;
import org.openapitools.model.AssistantToolsFileSearchFileSearch;
import org.openapitools.model.AssistantToolsFunction;
import org.openapitools.model.FunctionObject;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class AssistantObjectToolsInner   {
  

public enum TypeEnum {

    @JsonProperty("code_interpreter") CODE_INTERPRETER(String.valueOf("code_interpreter")), @JsonProperty("file_search") FILE_SEARCH(String.valueOf("file_search")), @JsonProperty("function") FUNCTION(String.valueOf("function"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private AssistantToolsFileSearchFileSearch fileSearch;

  private FunctionObject function;

  /**
   * The type of tool being defined: &#x60;code_interpreter&#x60;
   **/
  public AssistantObjectToolsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of tool being defined: `code_interpreter`")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public AssistantObjectToolsInner fileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
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
  public AssistantObjectToolsInner function(FunctionObject function) {
    this.function = function;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("function")
  @NotNull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

