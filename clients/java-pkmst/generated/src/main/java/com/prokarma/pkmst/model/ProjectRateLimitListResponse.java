package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ProjectRateLimit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ProjectRateLimitListResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectRateLimitListResponse   {
  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    LIST("list");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("data")
  
  private List<ProjectRateLimit> data = new ArrayList<>();

  @JsonProperty("first_id")
  private String firstId;

  @JsonProperty("last_id")
  private String lastId;

  @JsonProperty("has_more")
  private Boolean hasMore;

  public ProjectRateLimitListResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @ApiModelProperty(required = true, value = "")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public ProjectRateLimitListResponse data(List<ProjectRateLimit> data) {
    this.data = data;
    return this;
  }

  public ProjectRateLimitListResponse addDataItem(ProjectRateLimit dataItem) {
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
  @ApiModelProperty(required = true, value = "")
  public List<ProjectRateLimit> getData() {
    return data;
  }

  public void setData(List<ProjectRateLimit> data) {
    this.data = data;
  }

  public ProjectRateLimitListResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

  /**
   * Get firstId
   * @return firstId
   */
  @ApiModelProperty(required = true, value = "")
  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  public ProjectRateLimitListResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  /**
   * Get lastId
   * @return lastId
   */
  @ApiModelProperty(required = true, value = "")
  public String getLastId() {
    return lastId;
  }

  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  public ProjectRateLimitListResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Get hasMore
   * @return hasMore
   */
  @ApiModelProperty(required = true, value = "")
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
    ProjectRateLimitListResponse projectRateLimitListResponse = (ProjectRateLimitListResponse) o;
    return Objects.equals(this._object, projectRateLimitListResponse._object) &&
        Objects.equals(this.data, projectRateLimitListResponse.data) &&
        Objects.equals(this.firstId, projectRateLimitListResponse.firstId) &&
        Objects.equals(this.lastId, projectRateLimitListResponse.lastId) &&
        Objects.equals(this.hasMore, projectRateLimitListResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRateLimitListResponse {\n");
    
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

