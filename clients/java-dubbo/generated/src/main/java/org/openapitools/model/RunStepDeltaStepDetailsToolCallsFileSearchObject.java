package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class RunStepDeltaStepDetailsToolCallsFileSearchObject implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The index of the tool call in the tool calls array.
   */
  @JsonProperty("index")
  private Integer index;

  /**
   * The ID of the tool call object.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call.
   */
  @JsonProperty("type")
  private String type;

  /**
   * For now, this is always going to be an empty object.
   */
  @JsonProperty("file_search")
  private Object fileSearch;

  /**
   * The index of the tool call in the tool calls array.
   * @return index
   */
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * The ID of the tool call object.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * For now, this is always going to be an empty object.
   * @return fileSearch
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
