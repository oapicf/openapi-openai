package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateTranscriptionResponseJson;
import org.openapitools.model.CreateTranscriptionResponseVerboseJson;
import org.openapitools.model.TranscriptionSegment;
import org.openapitools.model.TranscriptionWord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("createTranscription_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T10:45:34.459631427Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateTranscription200Response   {
  private String text;
  private String language;
  private String duration;
  private @Valid List<@Valid TranscriptionWord> words = new ArrayList<>();
  private @Valid List<@Valid TranscriptionSegment> segments = new ArrayList<>();

  public CreateTranscription200Response() {
  }

  @JsonCreator
  public CreateTranscription200Response(
    @JsonProperty(required = true, value = "text") String text,
    @JsonProperty(required = true, value = "language") String language,
    @JsonProperty(required = true, value = "duration") String duration
  ) {
    this.text = text;
    this.language = language;
    this.duration = duration;
  }

  /**
   * The transcribed text.
   **/
  public CreateTranscription200Response text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The transcribed text.")
  @JsonProperty(required = true, value = "text")
  @NotNull public String getText() {
    return text;
  }

  @JsonProperty(required = true, value = "text")
  public void setText(String text) {
    this.text = text;
  }

  /**
   * The language of the input audio.
   **/
  public CreateTranscription200Response language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The language of the input audio.")
  @JsonProperty(required = true, value = "language")
  @NotNull public String getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * The duration of the input audio.
   **/
  public CreateTranscription200Response duration(String duration) {
    this.duration = duration;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The duration of the input audio.")
  @JsonProperty(required = true, value = "duration")
  @NotNull public String getDuration() {
    return duration;
  }

  @JsonProperty(required = true, value = "duration")
  public void setDuration(String duration) {
    this.duration = duration;
  }

  /**
   * Extracted words and their corresponding timestamps.
   **/
  public CreateTranscription200Response words(List<@Valid TranscriptionWord> words) {
    this.words = words;
    return this;
  }

  
  @ApiModelProperty(value = "Extracted words and their corresponding timestamps.")
  @JsonProperty("words")
  @Valid public List<@Valid TranscriptionWord> getWords() {
    return words;
  }

  @JsonProperty("words")
  public void setWords(List<@Valid TranscriptionWord> words) {
    this.words = words;
  }

  public CreateTranscription200Response addWordsItem(TranscriptionWord wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<>();
    }

    this.words.add(wordsItem);
    return this;
  }

  public CreateTranscription200Response removeWordsItem(TranscriptionWord wordsItem) {
    if (wordsItem != null && this.words != null) {
      this.words.remove(wordsItem);
    }

    return this;
  }
  /**
   * Segments of the transcribed text and their corresponding details.
   **/
  public CreateTranscription200Response segments(List<@Valid TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  
  @ApiModelProperty(value = "Segments of the transcribed text and their corresponding details.")
  @JsonProperty("segments")
  @Valid public List<@Valid TranscriptionSegment> getSegments() {
    return segments;
  }

  @JsonProperty("segments")
  public void setSegments(List<@Valid TranscriptionSegment> segments) {
    this.segments = segments;
  }

  public CreateTranscription200Response addSegmentsItem(TranscriptionSegment segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }

    this.segments.add(segmentsItem);
    return this;
  }

  public CreateTranscription200Response removeSegmentsItem(TranscriptionSegment segmentsItem) {
    if (segmentsItem != null && this.segments != null) {
      this.segments.remove(segmentsItem);
    }

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
    CreateTranscription200Response createTranscription200Response = (CreateTranscription200Response) o;
    return Objects.equals(this.text, createTranscription200Response.text) &&
        Objects.equals(this.language, createTranscription200Response.language) &&
        Objects.equals(this.duration, createTranscription200Response.duration) &&
        Objects.equals(this.words, createTranscription200Response.words) &&
        Objects.equals(this.segments, createTranscription200Response.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, language, duration, words, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranscription200Response {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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

