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
 * The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
 */
@ApiModel(description = "The `File` object represents a document that has been uploaded to OpenAI.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class OpenAIFile   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("bytes")
  private Integer bytes;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("filename")
  private String filename;

  /**
   * The object type, which is always `file`.
   */
  public enum ObjectEnum {
    FILE("file");

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

  /**
   * The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
   */
  public enum PurposeEnum {
    ASSISTANTS("assistants"),
    
    ASSISTANTS_OUTPUT("assistants_output"),
    
    BATCH("batch"),
    
    BATCH_OUTPUT("batch_output"),
    
    FINE_TUNE("fine-tune"),
    
    FINE_TUNE_RESULTS("fine-tune-results"),
    
    VISION("vision");

    private String value;

    PurposeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PurposeEnum fromValue(String text) {
      for (PurposeEnum b : PurposeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("purpose")
  private PurposeEnum purpose;

  /**
   * Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
   */
  public enum StatusEnum {
    UPLOADED("uploaded"),
    
    PROCESSED("processed"),
    
    ERROR("error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("status_details")
  private String statusDetails;

  public OpenAIFile id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The file identifier, which can be referenced in the API endpoints.
   * @return id
   */
  @ApiModelProperty(required = true, value = "The file identifier, which can be referenced in the API endpoints.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OpenAIFile bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

  /**
   * The size of the file, in bytes.
   * @return bytes
   */
  @ApiModelProperty(required = true, value = "The size of the file, in bytes.")
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
   * The Unix timestamp (in seconds) for when the file was created.
   * @return createdAt
   */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the file was created.")
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
   * The name of the file.
   * @return filename
   */
  @ApiModelProperty(required = true, value = "The name of the file.")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public OpenAIFile _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `file`.
   * @return _object
   */
  @ApiModelProperty(required = true, value = "The object type, which is always `file`.")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public OpenAIFile purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
   * @return purpose
   */
  @ApiModelProperty(required = true, value = "The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.")
  public PurposeEnum getPurpose() {
    return purpose;
  }

  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  public OpenAIFile status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
   * @return status
   */
  @ApiModelProperty(required = true, value = "Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OpenAIFile statusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  /**
   * Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
   * @return statusDetails
   */
  @ApiModelProperty(value = "Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.")
  public String getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(String statusDetails) {
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
    return Objects.equals(this.id, openAIFile.id) &&
        Objects.equals(this.bytes, openAIFile.bytes) &&
        Objects.equals(this.createdAt, openAIFile.createdAt) &&
        Objects.equals(this.filename, openAIFile.filename) &&
        Objects.equals(this._object, openAIFile._object) &&
        Objects.equals(this.purpose, openAIFile.purpose) &&
        Objects.equals(this.status, openAIFile.status) &&
        Objects.equals(this.statusDetails, openAIFile.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bytes, createdAt, filename, _object, purpose, status, statusDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAIFile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

