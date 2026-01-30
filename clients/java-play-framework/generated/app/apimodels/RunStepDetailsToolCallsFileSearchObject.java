package apimodels;

import apimodels.RunStepDetailsToolCallsFileSearchObjectFileSearch;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RunStepDetailsToolCallsFileSearchObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepDetailsToolCallsFileSearchObject   {
  @JsonProperty("id")
  @NotNull

  private String id;

  /**
   * The type of tool call. This is always going to be `file_search` for this type of tool call.
   */
  public enum TypeEnum {
    FILE_SEARCH("file_search");

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
  @NotNull
@Valid

  private RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch;

  public RunStepDetailsToolCallsFileSearchObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the tool call object.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunStepDetailsToolCallsFileSearchObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of tool call. This is always going to be `file_search` for this type of tool call.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDetailsToolCallsFileSearchObject fileSearch(RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

   /**
   * Get fileSearch
   * @return fileSearch
  **/
  public RunStepDetailsToolCallsFileSearchObjectFileSearch getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsFileSearchObject runStepDetailsToolCallsFileSearchObject = (RunStepDetailsToolCallsFileSearchObject) o;
    return Objects.equals(id, runStepDetailsToolCallsFileSearchObject.id) &&
        Objects.equals(type, runStepDetailsToolCallsFileSearchObject.type) &&
        Objects.equals(fileSearch, runStepDetailsToolCallsFileSearchObject.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, fileSearch);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFileSearchObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fileSearch: ").append(toIndentedString(fileSearch)).append("\n");
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

