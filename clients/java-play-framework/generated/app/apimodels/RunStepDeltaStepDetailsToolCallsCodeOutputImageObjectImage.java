package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-04-14T13:39:27.767845477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage   {
  @JsonProperty("file_id")
  
  private String fileId;

  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * The [file](/docs/api-reference/files) ID of the image.
   * @return fileId
  **/
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage = (RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage) o;
    return Objects.equals(fileId, runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.fileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
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

