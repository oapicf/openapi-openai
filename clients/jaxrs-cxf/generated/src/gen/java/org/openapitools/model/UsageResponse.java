package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UsageTimeBucket;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UsageResponse  {
  
public enum ObjectEnum {

PAGE(String.valueOf("page"));


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

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid UsageTimeBucket> data = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private Boolean hasMore;

  @ApiModelProperty(required = true, value = "")

  private String nextPage;
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

  public UsageResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  @NotNull
  public List<@Valid UsageTimeBucket> getData() {
    return data;
  }

  public void setData(List<@Valid UsageTimeBucket> data) {
    this.data = data;
  }

  public UsageResponse data(List<@Valid UsageTimeBucket> data) {
    this.data = data;
    return this;
  }

  public UsageResponse addDataItem(UsageTimeBucket dataItem) {
    this.data.add(dataItem);
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

  public UsageResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

 /**
   * Get nextPage
   * @return nextPage
  **/
  @JsonProperty("next_page")
  @NotNull
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }

  public UsageResponse nextPage(String nextPage) {
    this.nextPage = nextPage;
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
    UsageResponse usageResponse = (UsageResponse) o;
    return Objects.equals(this._object, usageResponse._object) &&
        Objects.equals(this.data, usageResponse.data) &&
        Objects.equals(this.hasMore, usageResponse.hasMore) &&
        Objects.equals(this.nextPage, usageResponse.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, hasMore, nextPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageResponse {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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

