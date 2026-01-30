package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Project;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProjectListResponse  {
  
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

  @ApiModelProperty(required = true, value = "")

  private List<Project> data = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private String firstId;

  @ApiModelProperty(required = true, value = "")

  private String lastId;

  @ApiModelProperty(required = true, value = "")

  private Boolean hasMore;
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

  public ProjectListResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<Project> getData() {
    return data;
  }

  public void setData(List<Project> data) {
    this.data = data;
  }

  public ProjectListResponse data(List<Project> data) {
    this.data = data;
    return this;
  }

  public ProjectListResponse addDataItem(Project dataItem) {
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

  public ProjectListResponse firstId(String firstId) {
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

  public ProjectListResponse lastId(String lastId) {
    this.lastId = lastId;
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

  public ProjectListResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
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
    ProjectListResponse projectListResponse = (ProjectListResponse) o;
    return Objects.equals(this._object, projectListResponse._object) &&
        Objects.equals(this.data, projectListResponse.data) &&
        Objects.equals(this.firstId, projectListResponse.firstId) &&
        Objects.equals(this.lastId, projectListResponse.lastId) &&
        Objects.equals(this.hasMore, projectListResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectListResponse {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

