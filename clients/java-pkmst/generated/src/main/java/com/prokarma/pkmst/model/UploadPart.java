package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The upload Part represents a chunk of bytes we can add to an Upload object. 
 */
@ApiModel(description = "The upload Part represents a chunk of bytes we can add to an Upload object. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UploadPart   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("upload_id")
  private String uploadId;

  /**
   * The object type, which is always `upload.part`.
   */
  public enum ObjectEnum {
    UPLOAD_PART("upload.part");

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

  public UploadPart id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The upload Part unique identifier, which can be referenced in API endpoints.
   * @return id
   */
  @ApiModelProperty(required = true, value = "The upload Part unique identifier, which can be referenced in API endpoints.")
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
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the Part was created.")
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
  @ApiModelProperty(required = true, value = "The ID of the Upload object that this Part was added to.")
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
  @ApiModelProperty(required = true, value = "The object type, which is always `upload.part`.")
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

