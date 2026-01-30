/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * The upload Part represents a chunk of bytes we can add to an Upload object. 
 */

@ApiModel(description = "The upload Part represents a chunk of bytes we can add to an Upload object. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UploadPart   {
  
  private String id;
  private Integer createdAt;
  private String uploadId;


  public enum ObjectEnum {
    UPLOAD_PART("upload.part");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;

  /**
   * The upload Part unique identifier, which can be referenced in API endpoints.
   */
  public UploadPart id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The upload Part unique identifier, which can be referenced in API endpoints.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The Unix timestamp (in seconds) for when the Part was created.
   */
  public UploadPart createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the Part was created.")
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The ID of the Upload object that this Part was added to.
   */
  public UploadPart uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the Upload object that this Part was added to.")
  @JsonProperty("upload_id")
  public String getUploadId() {
    return uploadId;
  }
  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }

  /**
   * The object type, which is always `upload.part`.
   */
  public UploadPart _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `upload.part`.")
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
    return Objects.equals(id, uploadPart.id) &&
        Objects.equals(createdAt, uploadPart.createdAt) &&
        Objects.equals(uploadId, uploadPart.uploadId) &&
        Objects.equals(_object, uploadPart._object);
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

