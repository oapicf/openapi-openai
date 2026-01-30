package apimodels;

import apimodels.UsageTimeBucket;
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
 * UsageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UsageResponse   {
  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    PAGE("page");

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

  private List<@Valid UsageTimeBucket> data = new ArrayList<>();

  @JsonProperty("has_more")
  @NotNull

  private Boolean hasMore;

  @JsonProperty("next_page")
  @NotNull

  private String nextPage;

  public UsageResponse _object(ObjectEnum _object) {
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(_object, usageResponse._object) &&
        Objects.equals(data, usageResponse.data) &&
        Objects.equals(hasMore, usageResponse.hasMore) &&
        Objects.equals(nextPage, usageResponse.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, hasMore, nextPage);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

