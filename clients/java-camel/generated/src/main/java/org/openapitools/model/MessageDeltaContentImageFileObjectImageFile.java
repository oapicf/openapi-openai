package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MessageDeltaContentImageFileObjectImageFile
 */

@JsonTypeName("MessageDeltaContentImageFileObject_image_file")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentImageFileObjectImageFile {

  private String fileId;

  /**
   * Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
   */
  public enum DetailEnum {
    AUTO("auto"),
    
    LOW("low"),
    
    HIGH("high");

    private final String value;

    DetailEnum(String value) {
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
    public static DetailEnum fromValue(String value) {
      for (DetailEnum b : DetailEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DetailEnum detail = DetailEnum.AUTO;

  public MessageDeltaContentImageFileObjectImageFile fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
   * @return fileId
   */
  
  @Schema(name = "file_id", description = "The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_id")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public MessageDeltaContentImageFileObjectImageFile detail(DetailEnum detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
   * @return detail
   */
  
  @Schema(name = "detail", description = "Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detail")
  public DetailEnum getDetail() {
    return detail;
  }

  public void setDetail(DetailEnum detail) {
    this.detail = detail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeltaContentImageFileObjectImageFile messageDeltaContentImageFileObjectImageFile = (MessageDeltaContentImageFileObjectImageFile) o;
    return Objects.equals(this.fileId, messageDeltaContentImageFileObjectImageFile.fileId) &&
        Objects.equals(this.detail, messageDeltaContentImageFileObjectImageFile.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentImageFileObjectImageFile {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

