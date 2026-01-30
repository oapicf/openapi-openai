package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProjectUser;

/**
 * ProjectUserListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectUserListResponse   {
  @JsonProperty("object")
  private String _object;

  @JsonProperty("data")
  private List<@Valid ProjectUser> data = new ArrayList<>();

  @JsonProperty("first_id")
  private String firstId;

  @JsonProperty("last_id")
  private String lastId;

  @JsonProperty("has_more")
  private Boolean hasMore;

  public ProjectUserListResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public ProjectUserListResponse data(List<@Valid ProjectUser> data) {
    this.data = data;
    return this;
  }

  public ProjectUserListResponse addDataItem(ProjectUser dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid ProjectUser> getData() {
    return data;
  }

  public void setData(List<@Valid ProjectUser> data) {
    this.data = data;
  }

  public ProjectUserListResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

   /**
   * Get firstId
   * @return firstId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  public ProjectUserListResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

   /**
   * Get lastId
   * @return lastId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLastId() {
    return lastId;
  }

  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  public ProjectUserListResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
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
    ProjectUserListResponse projectUserListResponse = (ProjectUserListResponse) o;
    return Objects.equals(this._object, projectUserListResponse._object) &&
        Objects.equals(this.data, projectUserListResponse.data) &&
        Objects.equals(this.firstId, projectUserListResponse.firstId) &&
        Objects.equals(this.lastId, projectUserListResponse.lastId) &&
        Objects.equals(this.hasMore, projectUserListResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUserListResponse {\n");
    
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

