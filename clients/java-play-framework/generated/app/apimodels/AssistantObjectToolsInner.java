package apimodels;

import apimodels.AssistantToolsCode;
import apimodels.AssistantToolsFileSearch;
import apimodels.AssistantToolsFileSearchFileSearch;
import apimodels.AssistantToolsFunction;
import apimodels.FunctionObject;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AssistantObjectToolsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssistantObjectToolsInner   {
  /**
   * The type of tool being defined: `code_interpreter`
   */
  public enum TypeEnum {
    CODE_INTERPRETER("code_interpreter"),
    
    FILE_SEARCH("file_search"),
    
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
  @NotNull

  private TypeEnum type;

  @JsonProperty("file_search")
  @Valid

  private AssistantToolsFileSearchFileSearch fileSearch;

  @JsonProperty("function")
  @NotNull
@Valid

  private FunctionObject function;

  public AssistantObjectToolsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of tool being defined: `code_interpreter`
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AssistantObjectToolsInner fileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

   /**
   * Get fileSearch
   * @return fileSearch
  **/
  public AssistantToolsFileSearchFileSearch getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  public AssistantObjectToolsInner function(FunctionObject function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

