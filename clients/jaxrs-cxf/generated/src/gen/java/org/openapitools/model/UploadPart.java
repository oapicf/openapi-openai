package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The upload Part represents a chunk of bytes we can add to an Upload object. 
 */
@ApiModel(description="The upload Part represents a chunk of bytes we can add to an Upload object. ")

public class UploadPart  {
  
 /**
  * The upload Part unique identifier, which can be referenced in API endpoints.
  */
  @ApiModelProperty(required = true, value = "The upload Part unique identifier, which can be referenced in API endpoints.")

  private String id;

 /**
  * The Unix timestamp (in seconds) for when the Part was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the Part was created.")

  private Integer createdAt;

 /**
  * The ID of the Upload object that this Part was added to.
  */
  @ApiModelProperty(required = true, value = "The ID of the Upload object that this Part was added to.")

  private String uploadId;

public enum ObjectEnum {

UPLOAD_PART(String.valueOf("upload.part"));


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

 /**
  * The object type, which is always `upload.part`.
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `upload.part`.")

  private ObjectEnum _object;
 /**
   * The upload Part unique identifier, which can be referenced in API endpoints.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UploadPart id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the Part was created.
   * @return createdAt
  **/
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public UploadPart createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * The ID of the Upload object that this Part was added to.
   * @return uploadId
  **/
  @JsonProperty("upload_id")
  @NotNull
  public String getUploadId() {
    return uploadId;
  }

  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }

  public UploadPart uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }

 /**
   * The object type, which is always &#x60;upload.part&#x60;.
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

  public UploadPart _object(ObjectEnum _object) {
    this._object = _object;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

