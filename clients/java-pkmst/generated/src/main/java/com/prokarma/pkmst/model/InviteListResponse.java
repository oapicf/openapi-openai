package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.Invite;
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
 * InviteListResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class InviteListResponse   {
  /**
   * The object type, which is always `list`
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
  
  private List<Invite> data = new ArrayList<>();

  @JsonProperty("first_id")
  private String firstId;

  @JsonProperty("last_id")
  private String lastId;

  @JsonProperty("has_more")
  private Boolean hasMore;

  public InviteListResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `list`
   * @return _object
   */
  @ApiModelProperty(required = true, value = "The object type, which is always `list`")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public InviteListResponse data(List<Invite> data) {
    this.data = data;
    return this;
  }

  public InviteListResponse addDataItem(Invite dataItem) {
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
  public List<Invite> getData() {
    return data;
  }

  public void setData(List<Invite> data) {
    this.data = data;
  }

  public InviteListResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

  /**
   * The first `invite_id` in the retrieved `list`
   * @return firstId
   */
  @ApiModelProperty(value = "The first `invite_id` in the retrieved `list`")
  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  public InviteListResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  /**
   * The last `invite_id` in the retrieved `list`
   * @return lastId
   */
  @ApiModelProperty(value = "The last `invite_id` in the retrieved `list`")
  public String getLastId() {
    return lastId;
  }

  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  public InviteListResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * The `has_more` property is used for pagination to indicate there are additional results.
   * @return hasMore
   */
  @ApiModelProperty(value = "The `has_more` property is used for pagination to indicate there are additional results.")
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
    InviteListResponse inviteListResponse = (InviteListResponse) o;
    return Objects.equals(this._object, inviteListResponse._object) &&
        Objects.equals(this.data, inviteListResponse.data) &&
        Objects.equals(this.firstId, inviteListResponse.firstId) &&
        Objects.equals(this.lastId, inviteListResponse.lastId) &&
        Objects.equals(this.hasMore, inviteListResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteListResponse {\n");
    
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

