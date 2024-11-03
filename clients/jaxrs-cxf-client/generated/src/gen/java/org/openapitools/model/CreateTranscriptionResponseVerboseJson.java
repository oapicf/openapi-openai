package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TranscriptionSegment;
import org.openapitools.model.TranscriptionWord;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Represents a verbose json transcription response returned by model, based on the provided input.
 **/
@ApiModel(description="Represents a verbose json transcription response returned by model, based on the provided input.")

public class CreateTranscriptionResponseVerboseJson  {
  
  @ApiModelProperty(required = true, value = "The language of the input audio.")
 /**
   * The language of the input audio.
  **/
  private String language;

  @ApiModelProperty(required = true, value = "The duration of the input audio.")
 /**
   * The duration of the input audio.
  **/
  private String duration;

  @ApiModelProperty(required = true, value = "The transcribed text.")
 /**
   * The transcribed text.
  **/
  private String text;

  @ApiModelProperty(value = "Extracted words and their corresponding timestamps.")
 /**
   * Extracted words and their corresponding timestamps.
  **/
  private List<TranscriptionWord> words = new ArrayList<>();

  @ApiModelProperty(value = "Segments of the transcribed text and their corresponding details.")
 /**
   * Segments of the transcribed text and their corresponding details.
  **/
  private List<TranscriptionSegment> segments = new ArrayList<>();
 /**
   * The language of the input audio.
   * @return language
  **/
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CreateTranscriptionResponseVerboseJson language(String language) {
    this.language = language;
    return this;
  }

 /**
   * The duration of the input audio.
   * @return duration
  **/
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public CreateTranscriptionResponseVerboseJson duration(String duration) {
    this.duration = duration;
    return this;
  }

 /**
   * The transcribed text.
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateTranscriptionResponseVerboseJson text(String text) {
    this.text = text;
    return this;
  }

 /**
   * Extracted words and their corresponding timestamps.
   * @return words
  **/
  @JsonProperty("words")
  public List<TranscriptionWord> getWords() {
    return words;
  }

  public void setWords(List<TranscriptionWord> words) {
    this.words = words;
  }

  public CreateTranscriptionResponseVerboseJson words(List<TranscriptionWord> words) {
    this.words = words;
    return this;
  }

  public CreateTranscriptionResponseVerboseJson addWordsItem(TranscriptionWord wordsItem) {
    this.words.add(wordsItem);
    return this;
  }

 /**
   * Segments of the transcribed text and their corresponding details.
   * @return segments
  **/
  @JsonProperty("segments")
  public List<TranscriptionSegment> getSegments() {
    return segments;
  }

  public void setSegments(List<TranscriptionSegment> segments) {
    this.segments = segments;
  }

  public CreateTranscriptionResponseVerboseJson segments(List<TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  public CreateTranscriptionResponseVerboseJson addSegmentsItem(TranscriptionSegment segmentsItem) {
    this.segments.add(segmentsItem);
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
    CreateTranscriptionResponseVerboseJson createTranscriptionResponseVerboseJson = (CreateTranscriptionResponseVerboseJson) o;
    return Objects.equals(this.language, createTranscriptionResponseVerboseJson.language) &&
        Objects.equals(this.duration, createTranscriptionResponseVerboseJson.duration) &&
        Objects.equals(this.text, createTranscriptionResponseVerboseJson.text) &&
        Objects.equals(this.words, createTranscriptionResponseVerboseJson.words) &&
        Objects.equals(this.segments, createTranscriptionResponseVerboseJson.segments);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

