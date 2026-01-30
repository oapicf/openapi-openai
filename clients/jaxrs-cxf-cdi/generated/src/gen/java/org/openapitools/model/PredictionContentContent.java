package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import java.util.List;
import org.openapitools.model.ChatCompletionRequestMessageContentPartText;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. ")
public class PredictionContentContent   {
  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictionContentContent predictionContentContent = (PredictionContentContent) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictionContentContent {\n");
    
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

