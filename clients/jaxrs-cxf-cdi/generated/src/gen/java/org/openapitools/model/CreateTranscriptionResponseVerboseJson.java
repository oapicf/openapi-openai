package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TranscriptionSegment;
import org.openapitools.model.TranscriptionWord;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Represents a verbose json transcription response returned by model, based on the provided input.")
public class CreateTranscriptionResponseVerboseJson   {
  
  private String language;

  private String duration;

  private String text;

  private List<@Valid TranscriptionWord> words = new ArrayList<>();

  private List<@Valid TranscriptionSegment> segments = new ArrayList<>();

  /**
   * The language of the input audio.
   **/
  public CreateTranscriptionResponseVerboseJson language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The language of the input audio.")
  @JsonProperty("language")
  @NotNull
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
  @NotNull
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
  @NotNull
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Extracted words and their corresponding timestamps.
   **/
  public CreateTranscriptionResponseVerboseJson words(List<@Valid TranscriptionWord> words) {
    this.words = words;
    return this;
  }

  
  @ApiModelProperty(value = "Extracted words and their corresponding timestamps.")
  @JsonProperty("words")
  public List<@Valid TranscriptionWord> getWords() {
    return words;
  }
  public void setWords(List<@Valid TranscriptionWord> words) {
    this.words = words;
  }

  public CreateTranscriptionResponseVerboseJson addWordsItem(TranscriptionWord wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<>();
    }
    this.words.add(wordsItem);
    return this;
  }


  /**
   * Segments of the transcribed text and their corresponding details.
   **/
  public CreateTranscriptionResponseVerboseJson segments(List<@Valid TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  
  @ApiModelProperty(value = "Segments of the transcribed text and their corresponding details.")
  @JsonProperty("segments")
  public List<@Valid TranscriptionSegment> getSegments() {
    return segments;
  }
  public void setSegments(List<@Valid TranscriptionSegment> segments) {
    this.segments = segments;
  }

  public CreateTranscriptionResponseVerboseJson addSegmentsItem(TranscriptionSegment segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

