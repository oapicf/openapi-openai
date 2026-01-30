package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UsageTimeBucket;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UsageResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageResponse {

  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    PAGE("page");

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

  @Valid
  private List<@Valid UsageTimeBucket> data = new ArrayList<>();

  private Boolean hasMore;

  private String nextPage;

  public UsageResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UsageResponse(ObjectEnum _object, List<@Valid UsageTimeBucket> data, Boolean hasMore, String nextPage) {
    this._object = _object;
    this.data = data;
    this.hasMore = hasMore;
    this.nextPage = nextPage;
  }

  public UsageResponse _object(ObjectEnum _object) {
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

  public UsageResponse data(List<@Valid UsageTimeBucket> data) {
    this.data = data;
    return this;
  }

  public UsageResponse addDataItem(UsageTimeBucket dataItem) {
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
  public List<@Valid UsageTimeBucket> getData() {
    return data;
  }

  public void setData(List<@Valid UsageTimeBucket> data) {
    this.data = data;
  }

  public UsageResponse hasMore(Boolean hasMore) {
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

  public UsageResponse nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  /**
   * Get nextPage
   * @return nextPage
   */
  @NotNull 
  @Schema(name = "next_page", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("next_page")
  public String getNextPage() {
    return nextPage;
  }

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

