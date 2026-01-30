package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The upload Part represents a chunk of bytes we can add to an Upload object. 
 */

@Schema(name = "UploadPart", description = "The upload Part represents a chunk of bytes we can add to an Upload object. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UploadPart {

  private String id;

  private Integer createdAt;

  private String uploadId;

  /**
   * The object type, which is always `upload.part`.
   */
  public enum ObjectEnum {
    UPLOAD_PART("upload.part");

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

  public UploadPart() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UploadPart(String id, Integer createdAt, String uploadId, ObjectEnum _object) {
    this.id = id;
    this.createdAt = createdAt;
    this.uploadId = uploadId;
    this._object = _object;
  }

  public UploadPart id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The upload Part unique identifier, which can be referenced in API endpoints.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "The upload Part unique identifier, which can be referenced in API endpoints.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UploadPart createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the Part was created.
   * @return createdAt
   */
  @NotNull 
  @Schema(name = "created_at", description = "The Unix timestamp (in seconds) for when the Part was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public UploadPart uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }

  /**
   * The ID of the Upload object that this Part was added to.
   * @return uploadId
   */
  @NotNull 
  @Schema(name = "upload_id", description = "The ID of the Upload object that this Part was added to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("upload_id")
  public String getUploadId() {
    return uploadId;
  }

  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }

  public UploadPart _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `upload.part`.
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `upload.part`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadPart uploadPart = (UploadPart) o;
    return Objects.equals(this.id, uploadPart.id) &&
        Objects.equals(this.createdAt, uploadPart.createdAt) &&
        Objects.equals(this.uploadId, uploadPart.uploadId) &&
        Objects.equals(this._object, uploadPart._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, uploadId, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadPart {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

