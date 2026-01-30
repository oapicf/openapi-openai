package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The upload Part represents a chunk of bytes we can add to an Upload object. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UploadPart   {
  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("created_at")
  @NotNull

  private Integer createdAt;

  @JsonProperty("upload_id")
  @NotNull

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

  @JsonProperty("object")
  @NotNull

  private ObjectEnum _object;

  public UploadPart id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The upload Part unique identifier, which can be referenced in API endpoints.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

