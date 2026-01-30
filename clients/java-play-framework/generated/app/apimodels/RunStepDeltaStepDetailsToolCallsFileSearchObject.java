package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RunStepDeltaStepDetailsToolCallsFileSearchObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepDeltaStepDetailsToolCallsFileSearchObject   {
  @JsonProperty("index")
  @NotNull

  private Integer index;

  @JsonProperty("id")
  
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

  private Object fileSearch;

  public RunStepDeltaStepDetailsToolCallsFileSearchObject index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the tool call in the tool calls array.
   * @return index
  **/
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public RunStepDeltaStepDetailsToolCallsFileSearchObject id(String id) {
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

  public RunStepDeltaStepDetailsToolCallsFileSearchObject type(TypeEnum type) {
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

  public RunStepDeltaStepDetailsToolCallsFileSearchObject fileSearch(Object fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

   /**
   * For now, this is always going to be an empty object.
   * @return fileSearch
  **/
  public Object getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(Object fileSearch) {
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
    RunStepDeltaStepDetailsToolCallsFileSearchObject runStepDeltaStepDetailsToolCallsFileSearchObject = (RunStepDeltaStepDetailsToolCallsFileSearchObject) o;
    return Objects.equals(index, runStepDeltaStepDetailsToolCallsFileSearchObject.index) &&
        Objects.equals(id, runStepDeltaStepDetailsToolCallsFileSearchObject.id) &&
        Objects.equals(type, runStepDeltaStepDetailsToolCallsFileSearchObject.type) &&
        Objects.equals(fileSearch, runStepDeltaStepDetailsToolCallsFileSearchObject.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, type, fileSearch);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsFileSearchObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

