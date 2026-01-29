package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FineTuningJob;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListPaginatedFineTuningJobsResponse  {
  
  @ApiModelProperty(required = true, value = "")

  private List<FineTuningJob> data = new ArrayList<>();

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
    public String toString() {
        return String.valueOf(value);
    }

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
  public List<FineTuningJob> getData() {
    return data;
  }

  public void setData(List<FineTuningJob> data) {
    this.data = data;
  }

  public ListPaginatedFineTuningJobsResponse data(List<FineTuningJob> data) {
    this.data = data;
    return this;
  }

  public ListPaginatedFineTuningJobsResponse addDataItem(FineTuningJob dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * Get hasMore
   * @return hasMore
  **/
  @JsonProperty("has_more")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ListPaginatedFineTuningJobsResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public ListPaginatedFineTuningJobsResponse _object(ObjectEnum _object) {
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
    ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobsResponse = (ListPaginatedFineTuningJobsResponse) o;
    return Objects.equals(this.data, listPaginatedFineTuningJobsResponse.data) &&
        Objects.equals(this.hasMore, listPaginatedFineTuningJobsResponse.hasMore) &&
        Objects.equals(this._object, listPaginatedFineTuningJobsResponse._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, hasMore, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPaginatedFineTuningJobsResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

