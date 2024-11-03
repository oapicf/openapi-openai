package apimodels;

import apimodels.FineTuningJobCheckpoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListFineTuningJobCheckpointsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T11:07:27.411323426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ListFineTuningJobCheckpointsResponse   {
  @JsonProperty("data")
  @NotNull
@Valid

  private List<@Valid FineTuningJobCheckpoint> data = new ArrayList<>();

  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    LIST("list");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("object")
  @NotNull

  private ObjectEnum _object;

  @JsonProperty("first_id")
  
  private String firstId;

  @JsonProperty("last_id")
  
  private String lastId;

  @JsonProperty("has_more")
  @NotNull

  private Boolean hasMore;

  public ListFineTuningJobCheckpointsResponse data(List<@Valid FineTuningJobCheckpoint> data) {
    this.data = data;
    return this;
  }

  public ListFineTuningJobCheckpointsResponse addDataItem(FineTuningJobCheckpoint dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<@Valid FineTuningJobCheckpoint> getData() {
    return data;
  }

  public void setData(List<@Valid FineTuningJobCheckpoint> data) {
    this.data = data;
  }

  public ListFineTuningJobCheckpointsResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public ListFineTuningJobCheckpointsResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

   /**
   * Get firstId
   * @return firstId
  **/
  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  public ListFineTuningJobCheckpointsResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

   /**
   * Get lastId
   * @return lastId
  **/
  public String getLastId() {
    return lastId;
  }

  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  public ListFineTuningJobCheckpointsResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

