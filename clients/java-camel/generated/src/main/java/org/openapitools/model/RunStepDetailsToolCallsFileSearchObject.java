package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchObjectFileSearch;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RunStepDetailsToolCallsFileSearchObject
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFileSearchObject implements RunStepDetailsToolCallsObjectToolCallsInner {

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private TypeEnum type;

  private RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch;

  public RunStepDetailsToolCallsFileSearchObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RunStepDetailsToolCallsFileSearchObject(String id, TypeEnum type, RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
    this.id = id;
    this.type = type;
    this.fileSearch = fileSearch;
  }

  public RunStepDetailsToolCallsFileSearchObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the tool call object.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "The ID of the tool call object.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  @NotNull 
  @Schema(name = "type", description = "The type of tool call. This is always going to be `file_search` for this type of tool call.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
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
   */
  @NotNull @Valid 
  @Schema(name = "file_search", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("file_search")
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
    return Objects.equals(this.id, runStepDetailsToolCallsFileSearchObject.id) &&
        Objects.equals(this.type, runStepDetailsToolCallsFileSearchObject.type) &&
        Objects.equals(this.fileSearch, runStepDetailsToolCallsFileSearchObject.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, fileSearch);
  }

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

