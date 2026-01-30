package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.CreateTranscriptionResponseJson;
import com.prokarma.pkmst.model.CreateTranscriptionResponseVerboseJson;
import com.prokarma.pkmst.model.TranscriptionSegment;
import com.prokarma.pkmst.model.TranscriptionWord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CreateTranscription200Response
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateTranscription200Response   {
  @JsonProperty("text")
  private String text;

  @JsonProperty("language")
  private String language;

  @JsonProperty("duration")
  private String duration;

  @JsonProperty("words")
  
  private List<TranscriptionWord> words = null;

  @JsonProperty("segments")
  
  private List<TranscriptionSegment> segments = null;

  public CreateTranscription200Response text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The transcribed text.
   * @return text
   */
  @ApiModelProperty(required = true, value = "The transcribed text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateTranscription200Response language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The language of the input audio.
   * @return language
   */
  @ApiModelProperty(required = true, value = "The language of the input audio.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CreateTranscription200Response duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The duration of the input audio.
   * @return duration
   */
  @ApiModelProperty(required = true, value = "The duration of the input audio.")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public CreateTranscription200Response words(List<TranscriptionWord> words) {
    this.words = words;
    return this;
  }

  public CreateTranscription200Response addWordsItem(TranscriptionWord wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<>();
    }
    this.words.add(wordsItem);
    return this;
  }

  /**
   * Extracted words and their corresponding timestamps.
   * @return words
   */
  @ApiModelProperty(value = "Extracted words and their corresponding timestamps.")
  public List<TranscriptionWord> getWords() {
    return words;
  }

  public void setWords(List<TranscriptionWord> words) {
    this.words = words;
  }

  public CreateTranscription200Response segments(List<TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  public CreateTranscription200Response addSegmentsItem(TranscriptionSegment segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

  /**
   * Segments of the transcribed text and their corresponding details.
   * @return segments
   */
  @ApiModelProperty(value = "Segments of the transcribed text and their corresponding details.")
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

