package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TranscriptionSegment;
import org.openapitools.model.TranscriptionWord;



/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 **/

@ApiModel(description = "Represents a verbose json transcription response returned by model, based on the provided input.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-03T11:06:32.740431132Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateTranscriptionResponseVerboseJson   {
  @JsonProperty("language")
  private String language;

  @JsonProperty("duration")
  private String duration;

  @JsonProperty("text")
  private String text;

  @JsonProperty("words")
  private List<TranscriptionWord> words = null;

  @JsonProperty("segments")
  private List<TranscriptionSegment> segments = null;

  /**
   * The language of the input audio.
   **/
  public CreateTranscriptionResponseVerboseJson language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The language of the input audio.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * The duration of the input audio.
   **/
  public CreateTranscriptionResponseVerboseJson duration(String duration) {
    this.duration = duration;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The duration of the input audio.")
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }

  /**
   * The transcribed text.
   **/
  public CreateTranscriptionResponseVerboseJson text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The transcribed text.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Extracted words and their corresponding timestamps.
   **/
  public CreateTranscriptionResponseVerboseJson words(List<TranscriptionWord> words) {
    this.words = words;
    return this;
  }

  
  @ApiModelProperty(value = "Extracted words and their corresponding timestamps.")
  @JsonProperty("words")
  public List<TranscriptionWord> getWords() {
    return words;
  }
  public void setWords(List<TranscriptionWord> words) {
    this.words = words;
  }

  /**
   * Segments of the transcribed text and their corresponding details.
   **/
  public CreateTranscriptionResponseVerboseJson segments(List<TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  
  @ApiModelProperty(value = "Segments of the transcribed text and their corresponding details.")
  @JsonProperty("segments")
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
    CreateTranscriptionResponseVerboseJson createTranscriptionResponseVerboseJson = (CreateTranscriptionResponseVerboseJson) o;
    return Objects.equals(language, createTranscriptionResponseVerboseJson.language) &&
        Objects.equals(duration, createTranscriptionResponseVerboseJson.duration) &&
        Objects.equals(text, createTranscriptionResponseVerboseJson.text) &&
        Objects.equals(words, createTranscriptionResponseVerboseJson.words) &&
        Objects.equals(segments, createTranscriptionResponseVerboseJson.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, duration, text, words, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranscriptionResponseVerboseJson {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

