package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProjectApiKey;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectApiKeyListResponse   {
  

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
  }

  private ObjectEnum _object;
  private List<@Valid ProjectApiKey> data = new ArrayList<>();
  private String firstId;
  private String lastId;
  private Boolean hasMore;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
  @Valid
  public List<@Valid ProjectApiKey> getData() {
    return data;
  }
  public void setData(List<@Valid ProjectApiKey> data) {
    this.data = data;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("first_id")
  @NotNull
  public String getFirstId() {
    return firstId;
  }
  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("last_id")
  @NotNull
  public String getLastId() {
    return lastId;
  }
  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("has_more")
  @NotNull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

