/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateTranslationResponseJson {
  
  @SerializedName("text")
  private String text = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTranslationResponseJson createTranslationResponseJson = (CreateTranslationResponseJson) o;
    return (this.text == null ? createTranslationResponseJson.text == null : this.text.equals(createTranslationResponseJson.text));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.text == null ? 0: this.text.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranslationResponseJson {\n");
    
    sb.append("  text: ").append(text).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
