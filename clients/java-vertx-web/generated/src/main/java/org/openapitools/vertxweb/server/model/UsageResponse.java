package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.UsageTimeBucket;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsageResponse   {
  


  public enum ObjectEnum {
    PAGE("page");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private List<UsageTimeBucket> data = new ArrayList<>();
  private Boolean hasMore;
  private String nextPage;

  public UsageResponse () {

  }

  public UsageResponse (ObjectEnum _object, List<UsageTimeBucket> data, Boolean hasMore, String nextPage) {
    this._object = _object;
    this.data = data;
    this.hasMore = hasMore;
    this.nextPage = nextPage;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("data")
  public List<UsageTimeBucket> getData() {
    return data;
  }
  public void setData(List<UsageTimeBucket> data) {
    this.data = data;
  }

    
  @JsonProperty("has_more")
  public Boolean getHasMore() {
    return hasMore;
  }
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

    
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
    return Objects.equals(_object, usageResponse._object) &&
        Objects.equals(data, usageResponse.data) &&
        Objects.equals(hasMore, usageResponse.hasMore) &&
        Objects.equals(nextPage, usageResponse.nextPage);
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
