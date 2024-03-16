package apimodels;

import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OpenAIFile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OpenAIFile   {
  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("object")
  @NotNull

  private String _object;

  @JsonProperty("bytes")
  @NotNull

  private Integer bytes;

  @JsonProperty("created_at")
  @NotNull

  private Integer createdAt;

  @JsonProperty("filename")
  @NotNull

  private String filename;

  @JsonProperty("purpose")
  @NotNull

  private String purpose;

  @JsonProperty("status")
  
  private String status;

  @JsonProperty("status_details")
  
  private Object statusDetails;

  public OpenAIFile id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OpenAIFile _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public OpenAIFile bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

   /**
   * Get bytes
   * @return bytes
  **/
  public Integer getBytes() {
    return bytes;
  }

  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  public OpenAIFile createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public OpenAIFile filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public OpenAIFile purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public OpenAIFile status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OpenAIFile statusDetails(Object statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

   /**
   * Get statusDetails
   * @return statusDetails
  **/
  public Object getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(Object statusDetails) {
    this.statusDetails = statusDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAIFile openAIFile = (OpenAIFile) o;
    return Objects.equals(id, openAIFile.id) &&
        Objects.equals(_object, openAIFile._object) &&
        Objects.equals(bytes, openAIFile.bytes) &&
        Objects.equals(createdAt, openAIFile.createdAt) &&
        Objects.equals(filename, openAIFile.filename) &&
        Objects.equals(purpose, openAIFile.purpose) &&
        Objects.equals(status, openAIFile.status) &&
        Objects.equals(statusDetails, openAIFile.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, bytes, createdAt, filename, purpose, status, statusDetails);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAIFile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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

