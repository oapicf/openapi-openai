package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The `File` object represents a document that has been uploaded to OpenAI.
 */
@ApiModel(description="The `File` object represents a document that has been uploaded to OpenAI.")

public class OpenAIFile  {
  
 /**
  * The file identifier, which can be referenced in the API endpoints.
  */
  @ApiModelProperty(required = true, value = "The file identifier, which can be referenced in the API endpoints.")
  private String id;

 /**
  * The size of the file, in bytes.
  */
  @ApiModelProperty(required = true, value = "The size of the file, in bytes.")
  private Integer bytes;

 /**
  * The Unix timestamp (in seconds) for when the file was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the file was created.")
  private Integer createdAt;

 /**
  * The name of the file.
  */
  @ApiModelProperty(required = true, value = "The name of the file.")
  private String filename;

public enum ObjectEnum {

    @JsonProperty("file") FILE(String.valueOf("file"));

    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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
  * The object type, which is always `file`.
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `file`.")
  private ObjectEnum _object;

public enum PurposeEnum {

    @JsonProperty("fine-tune") FINE_TUNE(String.valueOf("fine-tune")),
    @JsonProperty("fine-tune-results") FINE_TUNE_RESULTS(String.valueOf("fine-tune-results")),
    @JsonProperty("assistants") ASSISTANTS(String.valueOf("assistants")),
    @JsonProperty("assistants_output") ASSISTANTS_OUTPUT(String.valueOf("assistants_output"));

    private String value;

    PurposeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PurposeEnum fromValue(String value) {
        for (PurposeEnum b : PurposeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
  */
  @ApiModelProperty(required = true, value = "The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.")
  private PurposeEnum purpose;

public enum StatusEnum {

    @JsonProperty("uploaded") UPLOADED(String.valueOf("uploaded")),
    @JsonProperty("processed") PROCESSED(String.valueOf("processed")),
    @JsonProperty("error") ERROR(String.valueOf("error"));

    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
  */
  @ApiModelProperty(required = true, value = "Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.")
  private StatusEnum status;

 /**
  * Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
  */
  @ApiModelProperty(value = "Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.")
  private String statusDetails;
 /**
  * The file identifier, which can be referenced in the API endpoints.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public OpenAIFile id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The size of the file, in bytes.
  * @return bytes
  */
  @JsonProperty("bytes")
  @NotNull
  public Integer getBytes() {
    return bytes;
  }

  /**
   * Sets the <code>bytes</code> property.
   */
 public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  /**
   * Sets the <code>bytes</code> property.
   */
  public OpenAIFile bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the file was created.
  * @return createdAt
  */
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public OpenAIFile createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * The name of the file.
  * @return filename
  */
  @JsonProperty("filename")
  @NotNull
  public String getFilename() {
    return filename;
  }

  /**
   * Sets the <code>filename</code> property.
   */
 public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * Sets the <code>filename</code> property.
   */
  public OpenAIFile filename(String filename) {
    this.filename = filename;
    return this;
  }

 /**
  * The object type, which is always &#x60;file&#x60;.
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public OpenAIFile _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * The intended purpose of the file. Supported values are &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60;, &#x60;assistants&#x60;, and &#x60;assistants_output&#x60;.
  * @return purpose
  */
  @JsonProperty("purpose")
  @NotNull
  public String getPurpose() {
    return purpose == null ? null : purpose.value();
  }

  /**
   * Sets the <code>purpose</code> property.
   */
 public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  /**
   * Sets the <code>purpose</code> property.
   */
  public OpenAIFile purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

 /**
  * Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status == null ? null : status.value();
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public OpenAIFile status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
  * Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;.
  * @return statusDetails
  */
  @JsonProperty("status_details")
  public String getStatusDetails() {
    return statusDetails;
  }

  /**
   * Sets the <code>statusDetails</code> property.
   */
 public void setStatusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
  }

  /**
   * Sets the <code>statusDetails</code> property.
   */
  public OpenAIFile statusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

