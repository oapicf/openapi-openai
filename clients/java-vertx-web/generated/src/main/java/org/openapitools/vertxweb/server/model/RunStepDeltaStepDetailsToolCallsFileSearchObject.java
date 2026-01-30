package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunStepDeltaStepDetailsToolCallsFileSearchObject   {
  
  private Integer index;
  private String id;


  public enum TypeEnum {
    FILE_SEARCH("file_search");

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
  private Object fileSearch;

  public RunStepDeltaStepDetailsToolCallsFileSearchObject () {

  }

  public RunStepDeltaStepDetailsToolCallsFileSearchObject (Integer index, String id, TypeEnum type, Object fileSearch) {
    this.index = index;
    this.id = id;
    this.type = type;
    this.fileSearch = fileSearch;
  }

    
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("file_search")
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
