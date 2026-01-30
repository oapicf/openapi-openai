package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProjectApiKey;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProjectApiKeyListResponse  {
  
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

  private List<@Valid ProjectApiKey> data = new ArrayList<>();

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

  public ProjectApiKeyListResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  @NotNull
  public List<@Valid ProjectApiKey> getData() {
    return data;
  }

  public void setData(List<@Valid ProjectApiKey> data) {
    this.data = data;
  }

  public ProjectApiKeyListResponse data(List<@Valid ProjectApiKey> data) {
    this.data = data;
    return this;
  }

  public ProjectApiKeyListResponse addDataItem(ProjectApiKey dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * Get firstId
   * @return firstId
  **/
  @JsonProperty("first_id")
  @NotNull
  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  public ProjectApiKeyListResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

 /**
   * Get lastId
   * @return lastId
  **/
  @JsonProperty("last_id")
  @NotNull
  public String getLastId() {
    return lastId;
  }

  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  public ProjectApiKeyListResponse lastId(String lastId) {
    this.lastId = lastId;
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

  public ProjectApiKeyListResponse hasMore(Boolean hasMore) {
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
    ProjectApiKeyListResponse projectApiKeyListResponse = (ProjectApiKeyListResponse) o;
    return Objects.equals(this._object, projectApiKeyListResponse._object) &&
        Objects.equals(this.data, projectApiKeyListResponse.data) &&
        Objects.equals(this.firstId, projectApiKeyListResponse.firstId) &&
        Objects.equals(this.lastId, projectApiKeyListResponse.lastId) &&
        Objects.equals(this.hasMore, projectApiKeyListResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectApiKeyListResponse {\n");
    
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

