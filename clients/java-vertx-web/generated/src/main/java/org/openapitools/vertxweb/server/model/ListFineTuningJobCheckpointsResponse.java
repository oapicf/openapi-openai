package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.FineTuningJobCheckpoint;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListFineTuningJobCheckpointsResponse   {
  
  private List<FineTuningJobCheckpoint> data = new ArrayList<>();


  public enum ObjectEnum {
    LIST("list");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private String firstId;
  private String lastId;
  private Boolean hasMore;

  public ListFineTuningJobCheckpointsResponse () {

  }

  public ListFineTuningJobCheckpointsResponse (List<FineTuningJobCheckpoint> data, ObjectEnum _object, String firstId, String lastId, Boolean hasMore) {
    this.data = data;
    this._object = _object;
    this.firstId = firstId;
    this.lastId = lastId;
    this.hasMore = hasMore;
  }

    
  @JsonProperty("data")
  public List<FineTuningJobCheckpoint> getData() {
    return data;
  }
  public void setData(List<FineTuningJobCheckpoint> data) {
    this.data = data;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
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
    ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpointsResponse = (ListFineTuningJobCheckpointsResponse) o;
    return Objects.equals(data, listFineTuningJobCheckpointsResponse.data) &&
        Objects.equals(_object, listFineTuningJobCheckpointsResponse._object) &&
        Objects.equals(firstId, listFineTuningJobCheckpointsResponse.firstId) &&
        Objects.equals(lastId, listFineTuningJobCheckpointsResponse.lastId) &&
        Objects.equals(hasMore, listFineTuningJobCheckpointsResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, _object, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFineTuningJobCheckpointsResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
