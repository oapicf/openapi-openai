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

import java.util.*;
import org.openapitools.client.model.CreateTranslationResponseJson;
import org.openapitools.client.model.CreateTranslationResponseVerboseJson;
import org.openapitools.client.model.TranscriptionSegment;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateTranslation200Response {
  
  @SerializedName("text")
  private String text = null;
  @SerializedName("language")
  private String language = null;
  @SerializedName("duration")
  private String duration = null;
  @SerializedName("segments")
  private List<TranscriptionSegment> segments = null;

  /**
   * The translated text.
   **/
  @ApiModelProperty(required = true, value = "The translated text.")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * The language of the output translation (always `english`).
   **/
  @ApiModelProperty(required = true, value = "The language of the output translation (always `english`).")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * The duration of the input audio.
   **/
  @ApiModelProperty(required = true, value = "The duration of the input audio.")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }

  /**
   * Segments of the translated text and their corresponding details.
   **/
  @ApiModelProperty(value = "Segments of the translated text and their corresponding details.")
  public List<TranscriptionSegment> getSegments() {
    return segments;
  }
  public void setSegments(List<TranscriptionSegment> segments) {
    this.segments = segments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTranslation200Response createTranslation200Response = (CreateTranslation200Response) o;
    return (this.text == null ? createTranslation200Response.text == null : this.text.equals(createTranslation200Response.text)) &&
        (this.language == null ? createTranslation200Response.language == null : this.language.equals(createTranslation200Response.language)) &&
        (this.duration == null ? createTranslation200Response.duration == null : this.duration.equals(createTranslation200Response.duration)) &&
        (this.segments == null ? createTranslation200Response.segments == null : this.segments.equals(createTranslation200Response.segments));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.text == null ? 0: this.text.hashCode());
    result = 31 * result + (this.language == null ? 0: this.language.hashCode());
    result = 31 * result + (this.duration == null ? 0: this.duration.hashCode());
    result = 31 * result + (this.segments == null ? 0: this.segments.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranslation200Response {\n");
    
    sb.append("  text: ").append(text).append("\n");
    sb.append("  language: ").append(language).append("\n");
    sb.append("  duration: ").append(duration).append("\n");
    sb.append("  segments: ").append(segments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
