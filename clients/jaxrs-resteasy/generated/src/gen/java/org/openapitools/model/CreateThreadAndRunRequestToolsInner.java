package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateThreadAndRunRequestToolsInner   {
  

  /**
   * The type of tool being defined: &#x60;code_interpreter&#x60;
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
  }

  private TypeEnum type;
  private AssistantToolsFileSearchFileSearch fileSearch;
  private FunctionObject function;

  /**
   * The type of tool being defined: &#x60;code_interpreter&#x60;
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("file_search")
  @Valid
  public AssistantToolsFileSearchFileSearch getFileSearch() {
    return fileSearch;
  }
  public void setFileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("function")
  @NotNull
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

