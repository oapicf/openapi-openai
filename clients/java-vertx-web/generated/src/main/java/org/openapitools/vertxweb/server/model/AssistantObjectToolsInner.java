package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AssistantToolsCode;
import org.openapitools.vertxweb.server.model.AssistantToolsFileSearch;
import org.openapitools.vertxweb.server.model.AssistantToolsFileSearchFileSearch;
import org.openapitools.vertxweb.server.model.AssistantToolsFunction;
import org.openapitools.vertxweb.server.model.FunctionObject;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssistantObjectToolsInner   {
  


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
      return value;
    }
  }

  private TypeEnum type;
  private AssistantToolsFileSearchFileSearch fileSearch;
  private FunctionObject function;

  public AssistantObjectToolsInner () {

  }

  public AssistantObjectToolsInner (TypeEnum type, AssistantToolsFileSearchFileSearch fileSearch, FunctionObject function) {
    this.type = type;
    this.fileSearch = fileSearch;
    this.function = function;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("file_search")
  public AssistantToolsFileSearchFileSearch getFileSearch() {
    return fileSearch;
  }
  public void setFileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

    
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
    AssistantObjectToolsInner assistantObjectToolsInner = (AssistantObjectToolsInner) o;
    return Objects.equals(type, assistantObjectToolsInner.type) &&
        Objects.equals(fileSearch, assistantObjectToolsInner.fileSearch) &&
        Objects.equals(function, assistantObjectToolsInner.function);
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
