package org.openapitools.model;

import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The index of the output in the outputs array.
   */
  @JsonProperty("index")
  private Integer index;

  /**
   * Always &#x60;image&#x60;.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("image")
  private RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image;

  /**
   * The index of the output in the outputs array.
   * @return index
   */
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Always &#x60;image&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   * @return image
   */
  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
    return image;
  }

  public void setImage(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject runStepDeltaStepDetailsToolCallsCodeOutputImageObject = (RunStepDeltaStepDetailsToolCallsCodeOutputImageObject) o;
    return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsCodeOutputImageObject.index) &&
        Objects.equals(this.type, runStepDeltaStepDetailsToolCallsCodeOutputImageObject.type) &&
        Objects.equals(this.image, runStepDeltaStepDetailsToolCallsCodeOutputImageObject.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
