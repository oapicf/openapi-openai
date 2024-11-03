package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-03T11:06:32.740431132Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TranscriptionSegment   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("seek")
  private Integer seek;

  @JsonProperty("start")
  private Float start;

  @JsonProperty("end")
  private Float end;

  @JsonProperty("text")
  private String text;

  @JsonProperty("tokens")
  private List<Integer> tokens = new ArrayList<>();

  @JsonProperty("temperature")
  private Float temperature;

  @JsonProperty("avg_logprob")
  private Float avgLogprob;

  @JsonProperty("compression_ratio")
  private Float compressionRatio;

  @JsonProperty("no_speech_prob")
  private Float noSpeechProb;

  /**
   * Unique identifier of the segment.
   **/
  public TranscriptionSegment id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of the segment.")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Seek offset of the segment.
   **/
  public TranscriptionSegment seek(Integer seek) {
    this.seek = seek;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Seek offset of the segment.")
  @JsonProperty("seek")
  public Integer getSeek() {
    return seek;
  }
  public void setSeek(Integer seek) {
    this.seek = seek;
  }

  /**
   * Start time of the segment in seconds.
   **/
  public TranscriptionSegment start(Float start) {
    this.start = start;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Start time of the segment in seconds.")
  @JsonProperty("start")
  public Float getStart() {
    return start;
  }
  public void setStart(Float start) {
    this.start = start;
  }

  /**
   * End time of the segment in seconds.
   **/
  public TranscriptionSegment end(Float end) {
    this.end = end;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "End time of the segment in seconds.")
  @JsonProperty("end")
  public Float getEnd() {
    return end;
  }
  public void setEnd(Float end) {
    this.end = end;
  }

  /**
   * Text content of the segment.
   **/
  public TranscriptionSegment text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Text content of the segment.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Array of token IDs for the text content.
   **/
  public TranscriptionSegment tokens(List<Integer> tokens) {
    this.tokens = tokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of token IDs for the text content.")
  @JsonProperty("tokens")
  public List<Integer> getTokens() {
    return tokens;
  }
  public void setTokens(List<Integer> tokens) {
    this.tokens = tokens;
  }

  /**
   * Temperature parameter used for generating the segment.
   **/
  public TranscriptionSegment temperature(Float temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Temperature parameter used for generating the segment.")
  @JsonProperty("temperature")
  public Float getTemperature() {
    return temperature;
  }
  public void setTemperature(Float temperature) {
    this.temperature = temperature;
  }

  /**
   * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
   **/
  public TranscriptionSegment avgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.")
  @JsonProperty("avg_logprob")
  public Float getAvgLogprob() {
    return avgLogprob;
  }
  public void setAvgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
  }

  /**
   * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
   **/
  public TranscriptionSegment compressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.")
  @JsonProperty("compression_ratio")
  public Float getCompressionRatio() {
    return compressionRatio;
  }
  public void setCompressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
  }

  /**
   * Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
   **/
  public TranscriptionSegment noSpeechProb(Float noSpeechProb) {
    this.noSpeechProb = noSpeechProb;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.")
  @JsonProperty("no_speech_prob")
  public Float getNoSpeechProb() {
    return noSpeechProb;
  }
  public void setNoSpeechProb(Float noSpeechProb) {
    this.noSpeechProb = noSpeechProb;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionSegment transcriptionSegment = (TranscriptionSegment) o;
    return Objects.equals(id, transcriptionSegment.id) &&
        Objects.equals(seek, transcriptionSegment.seek) &&
        Objects.equals(start, transcriptionSegment.start) &&
        Objects.equals(end, transcriptionSegment.end) &&
        Objects.equals(text, transcriptionSegment.text) &&
        Objects.equals(tokens, transcriptionSegment.tokens) &&
        Objects.equals(temperature, transcriptionSegment.temperature) &&
        Objects.equals(avgLogprob, transcriptionSegment.avgLogprob) &&
        Objects.equals(compressionRatio, transcriptionSegment.compressionRatio) &&
        Objects.equals(noSpeechProb, transcriptionSegment.noSpeechProb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, seek, start, end, text, tokens, temperature, avgLogprob, compressionRatio, noSpeechProb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionSegment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    seek: ").append(toIndentedString(seek)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    avgLogprob: ").append(toIndentedString(avgLogprob)).append("\n");
    sb.append("    compressionRatio: ").append(toIndentedString(compressionRatio)).append("\n");
    sb.append("    noSpeechProb: ").append(toIndentedString(noSpeechProb)).append("\n");
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

