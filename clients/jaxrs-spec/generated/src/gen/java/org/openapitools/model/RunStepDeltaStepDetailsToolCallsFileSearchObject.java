package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("RunStepDeltaStepDetailsToolCallsFileSearchObject")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDeltaStepDetailsToolCallsFileSearchObject   {
  private Integer index;
  private String id;
  public enum TypeEnum {

    FILE_SEARCH(String.valueOf("file_search"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  private Object fileSearch;

  public RunStepDeltaStepDetailsToolCallsFileSearchObject() {
  }

  @JsonCreator
  public RunStepDeltaStepDetailsToolCallsFileSearchObject(
    @JsonProperty(required = true, value = "index") Integer index,
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "file_search") Object fileSearch
  ) {
    this.index = index;
    this.type = type;
    this.fileSearch = fileSearch;
  }

  /**
   * The index of the tool call in the tool calls array.
   **/
  public RunStepDeltaStepDetailsToolCallsFileSearchObject index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the tool call in the tool calls array.")
  @JsonProperty(required = true, value = "index")
  @NotNull public Integer getIndex() {
    return index;
  }

  @JsonProperty(required = true, value = "index")
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * The ID of the tool call object.
   **/
  public RunStepDeltaStepDetailsToolCallsFileSearchObject id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the tool call object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call.
   **/
  public RunStepDeltaStepDetailsToolCallsFileSearchObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `file_search` for this type of tool call.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * For now, this is always going to be an empty object.
   **/
  public RunStepDeltaStepDetailsToolCallsFileSearchObject fileSearch(Object fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "For now, this is always going to be an empty object.")
  @JsonProperty(required = true, value = "file_search")
  @NotNull public Object getFileSearch() {
    return fileSearch;
  }

  @JsonProperty(required = true, value = "file_search")
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
    return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsFileSearchObject.index) &&
        Objects.equals(this.id, runStepDeltaStepDetailsToolCallsFileSearchObject.id) &&
        Objects.equals(this.type, runStepDeltaStepDetailsToolCallsFileSearchObject.type) &&
        Objects.equals(this.fileSearch, runStepDeltaStepDetailsToolCallsFileSearchObject.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, type, fileSearch);
  }

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

