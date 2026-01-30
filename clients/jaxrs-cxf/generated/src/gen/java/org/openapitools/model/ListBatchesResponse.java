package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Batch;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListBatchesResponse  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid Batch> data = new ArrayList<>();

  @ApiModelProperty(example = "batch_abc123", value = "")

  private String firstId;

  @ApiModelProperty(example = "batch_abc456", value = "")

  private String lastId;

  @ApiModelProperty(required = true, value = "")

  private Boolean hasMore;

public enum ObjectEnum {

LIST(String.valueOf("list"));


    private String value;

    ObjectEnum (String v) {
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

  @ApiModelProperty(required = true, value = "")

  private ObjectEnum _object;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  @NotNull
  public List<@Valid Batch> getData() {
    return data;
  }

  public void setData(List<@Valid Batch> data) {
    this.data = data;
  }

  public ListBatchesResponse data(List<@Valid Batch> data) {
    this.data = data;
    return this;
  }

  public ListBatchesResponse addDataItem(Batch dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * Get firstId
   * @return firstId
  **/
  @JsonProperty("first_id")
  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  public ListBatchesResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

 /**
   * Get lastId
   * @return lastId
  **/
  @JsonProperty("last_id")
  public String getLastId() {
    return lastId;
  }

  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  public ListBatchesResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

 /**
   * Get hasMore
   * @return hasMore
  **/
  @JsonProperty("has_more")
  @NotNull
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ListBatchesResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public ListBatchesResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBatchesResponse listBatchesResponse = (ListBatchesResponse) o;
    return Objects.equals(this.data, listBatchesResponse.data) &&
        Objects.equals(this.firstId, listBatchesResponse.firstId) &&
        Objects.equals(this.lastId, listBatchesResponse.lastId) &&
        Objects.equals(this.hasMore, listBatchesResponse.hasMore) &&
        Objects.equals(this._object, listBatchesResponse._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, firstId, lastId, hasMore, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBatchesResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    firstId: ").append(toIndentedString(firstId)).append("\n");
    sb.append("    lastId: ").append(toIndentedString(lastId)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

