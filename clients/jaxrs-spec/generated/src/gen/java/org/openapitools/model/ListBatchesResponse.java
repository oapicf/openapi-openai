package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Batch;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ListBatchesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ListBatchesResponse   {
  private @Valid List<@Valid Batch> data = new ArrayList<>();
  private String firstId;
  private String lastId;
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ObjectEnum fromString(String s) {
        for (ObjectEnum b : ObjectEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  public ListBatchesResponse() {
  }

  @JsonCreator
  public ListBatchesResponse(
    @JsonProperty(required = true, value = "data") List<@Valid Batch> data,
    @JsonProperty(required = true, value = "has_more") Boolean hasMore,
    @JsonProperty(required = true, value = "object") ObjectEnum _object
  ) {
    this.data = data;
    this.hasMore = hasMore;
    this._object = _object;
  }

  /**
   **/
  public ListBatchesResponse data(List<@Valid Batch> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "data")
  @NotNull @Valid public List<@Valid Batch> getData() {
    return data;
  }

  @JsonProperty(required = true, value = "data")
  public void setData(List<@Valid Batch> data) {
    this.data = data;
  }

  public ListBatchesResponse addDataItem(Batch dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }

    this.data.add(dataItem);
    return this;
  }

  public ListBatchesResponse removeDataItem(Batch dataItem) {
    if (dataItem != null && this.data != null) {
      this.data.remove(dataItem);
    }

    return this;
  }
  /**
   **/
  public ListBatchesResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

  
  @ApiModelProperty(example = "batch_abc123", value = "")
  @JsonProperty("first_id")
  public String getFirstId() {
    return firstId;
  }

  @JsonProperty("first_id")
  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  /**
   **/
  public ListBatchesResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  
  @ApiModelProperty(example = "batch_abc456", value = "")
  @JsonProperty("last_id")
  public String getLastId() {
    return lastId;
  }

  @JsonProperty("last_id")
  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  /**
   **/
  public ListBatchesResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "has_more")
  @NotNull public Boolean getHasMore() {
    return hasMore;
  }

  @JsonProperty(required = true, value = "has_more")
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  /**
   **/
  public ListBatchesResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "object")
  @NotNull public ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty(required = true, value = "object")
  public void setObject(ObjectEnum _object) {
    this._object = _object;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

