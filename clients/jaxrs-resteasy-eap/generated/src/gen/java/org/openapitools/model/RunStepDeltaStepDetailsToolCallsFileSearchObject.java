package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDeltaStepDetailsToolCallsFileSearchObject   {
  
  private Integer index;
  private String id;

  /**
   * The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call.
   */
  public enum TypeEnum {
    FILE_SEARCH("file_search");
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
  private Object fileSearch;

  /**
   * The index of the tool call in the tool calls array.
   **/
  
  @ApiModelProperty(required = true, value = "The index of the tool call in the tool calls array.")
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * The ID of the tool call object.
   **/
  
  @ApiModelProperty(value = "The ID of the tool call object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call.
   **/
  
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `file_search` for this type of tool call.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * For now, this is always going to be an empty object.
   **/
  
  @ApiModelProperty(required = true, value = "For now, this is always going to be an empty object.")
  @JsonProperty("file_search")
  @NotNull
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

