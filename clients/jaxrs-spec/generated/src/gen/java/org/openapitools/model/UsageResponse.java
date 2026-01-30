package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UsageTimeBucket;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("UsageResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageResponse   {
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
  private @Valid List<@Valid UsageTimeBucket> data = new ArrayList<>();
  private Boolean hasMore;
  private String nextPage;

  public UsageResponse() {
  }

  @JsonCreator
  public UsageResponse(
    @JsonProperty(required = true, value = "object") ObjectEnum _object,
    @JsonProperty(required = true, value = "data") List<@Valid UsageTimeBucket> data,
    @JsonProperty(required = true, value = "has_more") Boolean hasMore,
    @JsonProperty(required = true, value = "next_page") String nextPage
  ) {
    this._object = _object;
    this.data = data;
    this.hasMore = hasMore;
    this.nextPage = nextPage;
  }

  /**
   **/
  public UsageResponse _object(ObjectEnum _object) {
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

  /**
   **/
  public UsageResponse data(List<@Valid UsageTimeBucket> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "data")
  @NotNull @Valid public List<@Valid UsageTimeBucket> getData() {
    return data;
  }

  @JsonProperty(required = true, value = "data")
  public void setData(List<@Valid UsageTimeBucket> data) {
    this.data = data;
  }

  public UsageResponse addDataItem(UsageTimeBucket dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }

    this.data.add(dataItem);
    return this;
  }

  public UsageResponse removeDataItem(UsageTimeBucket dataItem) {
    if (dataItem != null && this.data != null) {
      this.data.remove(dataItem);
    }

    return this;
  }
  /**
   **/
  public UsageResponse hasMore(Boolean hasMore) {
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
  public UsageResponse nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "next_page")
  @NotNull public String getNextPage() {
    return nextPage;
  }

  @JsonProperty(required = true, value = "next_page")
  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

