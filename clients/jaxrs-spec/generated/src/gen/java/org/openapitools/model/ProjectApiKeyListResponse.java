package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProjectApiKey;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ProjectApiKeyListResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectApiKeyListResponse   {
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
  private @Valid List<@Valid ProjectApiKey> data = new ArrayList<>();
  private String firstId;
  private String lastId;
  private Boolean hasMore;

  public ProjectApiKeyListResponse() {
  }

  @JsonCreator
  public ProjectApiKeyListResponse(
    @JsonProperty(required = true, value = "object") ObjectEnum _object,
    @JsonProperty(required = true, value = "data") List<@Valid ProjectApiKey> data,
    @JsonProperty(required = true, value = "first_id") String firstId,
    @JsonProperty(required = true, value = "last_id") String lastId,
    @JsonProperty(required = true, value = "has_more") Boolean hasMore
  ) {
    this._object = _object;
    this.data = data;
    this.firstId = firstId;
    this.lastId = lastId;
    this.hasMore = hasMore;
  }

  /**
   **/
  public ProjectApiKeyListResponse _object(ObjectEnum _object) {
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
  public ProjectApiKeyListResponse data(List<@Valid ProjectApiKey> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "data")
  @NotNull @Valid public List<@Valid ProjectApiKey> getData() {
    return data;
  }

  @JsonProperty(required = true, value = "data")
  public void setData(List<@Valid ProjectApiKey> data) {
    this.data = data;
  }

  public ProjectApiKeyListResponse addDataItem(ProjectApiKey dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }

    this.data.add(dataItem);
    return this;
  }

  public ProjectApiKeyListResponse removeDataItem(ProjectApiKey dataItem) {
    if (dataItem != null && this.data != null) {
      this.data.remove(dataItem);
    }

    return this;
  }
  /**
   **/
  public ProjectApiKeyListResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "first_id")
  @NotNull public String getFirstId() {
    return firstId;
  }

  @JsonProperty(required = true, value = "first_id")
  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  /**
   **/
  public ProjectApiKeyListResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "last_id")
  @NotNull public String getLastId() {
    return lastId;
  }

  @JsonProperty(required = true, value = "last_id")
  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  /**
   **/
  public ProjectApiKeyListResponse hasMore(Boolean hasMore) {
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

