package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Invite;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InviteListResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class InviteListResponse {

  /**
   * The object type, which is always `list`
   */
  public enum ObjectEnum {
    LIST("list");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private ObjectEnum _object;

  @Valid
  private List<@Valid Invite> data = new ArrayList<>();

  private @Nullable String firstId;

  private @Nullable String lastId;

  private @Nullable Boolean hasMore;

  public InviteListResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InviteListResponse(ObjectEnum _object, List<@Valid Invite> data) {
    this._object = _object;
    this.data = data;
  }

  public InviteListResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `list`
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `list`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public InviteListResponse data(List<@Valid Invite> data) {
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
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public List<@Valid Invite> getData() {
    return data;
  }

  public void setData(List<@Valid Invite> data) {
    this.data = data;
  }

  public InviteListResponse firstId(@Nullable String firstId) {
    this.firstId = firstId;
    return this;
  }

  /**
   * The first `invite_id` in the retrieved `list`
   * @return firstId
   */
  
  @Schema(name = "first_id", description = "The first `invite_id` in the retrieved `list`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first_id")
  public @Nullable String getFirstId() {
    return firstId;
  }

  public void setFirstId(@Nullable String firstId) {
    this.firstId = firstId;
  }

  public InviteListResponse lastId(@Nullable String lastId) {
    this.lastId = lastId;
    return this;
  }

  /**
   * The last `invite_id` in the retrieved `list`
   * @return lastId
   */
  
  @Schema(name = "last_id", description = "The last `invite_id` in the retrieved `list`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_id")
  public @Nullable String getLastId() {
    return lastId;
  }

  public void setLastId(@Nullable String lastId) {
    this.lastId = lastId;
  }

  public InviteListResponse hasMore(@Nullable Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * The `has_more` property is used for pagination to indicate there are additional results.
   * @return hasMore
   */
  
  @Schema(name = "has_more", description = "The `has_more` property is used for pagination to indicate there are additional results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_more")
  public @Nullable Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(@Nullable Boolean hasMore) {
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

