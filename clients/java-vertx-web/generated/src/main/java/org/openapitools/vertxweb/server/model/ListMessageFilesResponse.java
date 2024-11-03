package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MessageFileObject;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListMessageFilesResponse   {
  
  private String _object;
  private List<MessageFileObject> data = new ArrayList<>();
  private String firstId;
  private String lastId;
  private Boolean hasMore;

  public ListMessageFilesResponse () {

  }

  public ListMessageFilesResponse (String _object, List<MessageFileObject> data, String firstId, String lastId, Boolean hasMore) {
    this._object = _object;
    this.data = data;
    this.firstId = firstId;
    this.lastId = lastId;
    this.hasMore = hasMore;
  }

    
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

    
  @JsonProperty("data")
  public List<MessageFileObject> getData() {
    return data;
  }
  public void setData(List<MessageFileObject> data) {
    this.data = data;
  }

    
  @JsonProperty("first_id")
  public String getFirstId() {
    return firstId;
  }
  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

    
  @JsonProperty("last_id")
  public String getLastId() {
    return lastId;
  }
  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

    
  @JsonProperty("has_more")
  public Boolean getHasMore() {
    return hasMore;
  }
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMessageFilesResponse listMessageFilesResponse = (ListMessageFilesResponse) o;
    return Objects.equals(_object, listMessageFilesResponse._object) &&
        Objects.equals(data, listMessageFilesResponse.data) &&
        Objects.equals(firstId, listMessageFilesResponse.firstId) &&
        Objects.equals(lastId, listMessageFilesResponse.lastId) &&
        Objects.equals(hasMore, listMessageFilesResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMessageFilesResponse {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    firstId: ").append(toIndentedString(firstId)).append("\n");
    sb.append("    lastId: ").append(toIndentedString(lastId)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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
