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
import org.openapitools.model.Invite;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class InviteListResponse   {
  

  /**
   * The object type, which is always &#x60;list&#x60;
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
  private List<@Valid Invite> data = new ArrayList<>();
  private String firstId;
  private String lastId;
  private Boolean hasMore;

  /**
   * The object type, which is always &#x60;list&#x60;
   **/
  
  @ApiModelProperty(required = true, value = "The object type, which is always `list`")
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
  public List<@Valid Invite> getData() {
    return data;
  }
  public void setData(List<@Valid Invite> data) {
    this.data = data;
  }

  /**
   * The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60;
   **/
  
  @ApiModelProperty(value = "The first `invite_id` in the retrieved `list`")
  @JsonProperty("first_id")
  public String getFirstId() {
    return firstId;
  }
  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  /**
   * The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60;
   **/
  
  @ApiModelProperty(value = "The last `invite_id` in the retrieved `list`")
  @JsonProperty("last_id")
  public String getLastId() {
    return lastId;
  }
  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  /**
   * The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results.
   **/
  
  @ApiModelProperty(value = "The `has_more` property is used for pagination to indicate there are additional results.")
  @JsonProperty("has_more")
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

