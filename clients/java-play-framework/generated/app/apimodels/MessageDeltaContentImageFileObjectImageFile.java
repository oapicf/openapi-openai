package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MessageDeltaContentImageFileObjectImageFile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MessageDeltaContentImageFileObjectImageFile   {
  @JsonProperty("file_id")
  
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

    @Override
    @JsonValue
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

  @JsonProperty("detail")
  
  private DetailEnum detail = DetailEnum.AUTO;

  public MessageDeltaContentImageFileObjectImageFile fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
   * @return fileId
  **/
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
  **/
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
    return Objects.equals(fileId, messageDeltaContentImageFileObjectImageFile.fileId) &&
        Objects.equals(detail, messageDeltaContentImageFileObjectImageFile.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, detail);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

