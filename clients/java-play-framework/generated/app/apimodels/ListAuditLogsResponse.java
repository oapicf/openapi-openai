package apimodels;

import apimodels.AuditLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListAuditLogsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ListAuditLogsResponse   {
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

  @JsonProperty("data")
  @NotNull
@Valid

  private List<@Valid AuditLog> data = new ArrayList<>();

  @JsonProperty("first_id")
  @NotNull

  private String firstId;

  @JsonProperty("last_id")
  @NotNull

  private String lastId;

  @JsonProperty("has_more")
  @NotNull

  private Boolean hasMore;

  public ListAuditLogsResponse _object(ObjectEnum _object) {
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

  public ListAuditLogsResponse data(List<@Valid AuditLog> data) {
    this.data = data;
    return this;
  }

  public ListAuditLogsResponse addDataItem(AuditLog dataItem) {
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
  public List<@Valid AuditLog> getData() {
    return data;
  }

  public void setData(List<@Valid AuditLog> data) {
    this.data = data;
  }

  public ListAuditLogsResponse firstId(String firstId) {
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

  public ListAuditLogsResponse lastId(String lastId) {
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

  public ListAuditLogsResponse hasMore(Boolean hasMore) {
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
    ListAuditLogsResponse listAuditLogsResponse = (ListAuditLogsResponse) o;
    return Objects.equals(_object, listAuditLogsResponse._object) &&
        Objects.equals(data, listAuditLogsResponse.data) &&
        Objects.equals(firstId, listAuditLogsResponse.firstId) &&
        Objects.equals(lastId, listAuditLogsResponse.lastId) &&
        Objects.equals(hasMore, listAuditLogsResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAuditLogsResponse {\n");
    
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

