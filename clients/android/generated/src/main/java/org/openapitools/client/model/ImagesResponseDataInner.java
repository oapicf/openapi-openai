/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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
public class ImagesResponseDataInner {
  
  @SerializedName("url")
  private String url = null;
  @SerializedName("b64_json")
  private String b64Json = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getB64Json() {
    return b64Json;
  }
  public void setB64Json(String b64Json) {
    this.b64Json = b64Json;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImagesResponseDataInner imagesResponseDataInner = (ImagesResponseDataInner) o;
    return (this.url == null ? imagesResponseDataInner.url == null : this.url.equals(imagesResponseDataInner.url)) &&
        (this.b64Json == null ? imagesResponseDataInner.b64Json == null : this.b64Json.equals(imagesResponseDataInner.b64Json));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.b64Json == null ? 0: this.b64Json.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagesResponseDataInner {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  b64Json: ").append(b64Json).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
