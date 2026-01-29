package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FineTuningJobCheckpoint;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListFineTuningJobCheckpointsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T10:48:36.973220935Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ListFineTuningJobCheckpointsResponse {

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private ObjectEnum _object;

  private JsonNullable<String> firstId = JsonNullable.<String>undefined();

  private JsonNullable<String> lastId = JsonNullable.<String>undefined();

  private Boolean hasMore;

  public ListFineTuningJobCheckpointsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListFineTuningJobCheckpointsResponse(List<@Valid FineTuningJobCheckpoint> data, ObjectEnum _object, Boolean hasMore) {
    this.data = data;
    this._object = _object;
    this.hasMore = hasMore;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
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
   */
  @NotNull 
  @Schema(name = "object", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public ListFineTuningJobCheckpointsResponse firstId(String firstId) {
    this.firstId = JsonNullable.of(firstId);
    return this;
  }

  /**
   * Get firstId
   * @return firstId
   */
  
  @Schema(name = "first_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first_id")
  public JsonNullable<String> getFirstId() {
    return firstId;
  }

  public void setFirstId(JsonNullable<String> firstId) {
    this.firstId = firstId;
  }

  public ListFineTuningJobCheckpointsResponse lastId(String lastId) {
    this.lastId = JsonNullable.of(lastId);
    return this;
  }

  /**
   * Get lastId
   * @return lastId
   */
  
  @Schema(name = "last_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_id")
  public JsonNullable<String> getLastId() {
    return lastId;
  }

  public void setLastId(JsonNullable<String> lastId) {
    this.lastId = lastId;
  }

  public ListFineTuningJobCheckpointsResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Get hasMore
   * @return hasMore
   */
  @NotNull 
  @Schema(name = "has_more", requiredMode = Schema.RequiredMode.REQUIRED)
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
    return Objects.equals(this.data, listFineTuningJobCheckpointsResponse.data) &&
        Objects.equals(this._object, listFineTuningJobCheckpointsResponse._object) &&
        equalsNullable(this.firstId, listFineTuningJobCheckpointsResponse.firstId) &&
        equalsNullable(this.lastId, listFineTuningJobCheckpointsResponse.lastId) &&
        Objects.equals(this.hasMore, listFineTuningJobCheckpointsResponse.hasMore);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, _object, hashCodeNullable(firstId), hashCodeNullable(lastId), hasMore);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

