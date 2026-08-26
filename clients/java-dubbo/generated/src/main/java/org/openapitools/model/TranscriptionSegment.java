package org.openapitools.model;

import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class TranscriptionSegment implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Unique identifier of the segment.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * Seek offset of the segment.
   */
  @JsonProperty("seek")
  private Integer seek;

  /**
   * Start time of the segment in seconds.
   */
  @JsonProperty("start")
  private Float start;

  /**
   * End time of the segment in seconds.
   */
  @JsonProperty("end")
  private Float end;

  /**
   * Text content of the segment.
   */
  @JsonProperty("text")
  private String text;

  /**
   * Array of token IDs for the text content.
   */
  @JsonProperty("tokens")
  private List<Integer> tokens = new ArrayList<>();

  /**
   * Temperature parameter used for generating the segment.
   */
  @JsonProperty("temperature")
  private Float temperature;

  /**
   * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
   */
  @JsonProperty("avg_logprob")
  private Float avgLogprob;

  /**
   * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
   */
  @JsonProperty("compression_ratio")
  private Float compressionRatio;

  /**
   * Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent.
   */
  @JsonProperty("no_speech_prob")
  private Float noSpeechProb;

  /**
   * Unique identifier of the segment.
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Seek offset of the segment.
   * @return seek
   */
  public Integer getSeek() {
    return seek;
  }

  public void setSeek(Integer seek) {
    this.seek = seek;
  }

  /**
   * Start time of the segment in seconds.
   * @return start
   */
  public Float getStart() {
    return start;
  }

  public void setStart(Float start) {
    this.start = start;
  }

  /**
   * End time of the segment in seconds.
   * @return end
   */
  public Float getEnd() {
    return end;
  }

  public void setEnd(Float end) {
    this.end = end;
  }

  /**
   * Text content of the segment.
   * @return text
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  /**
   * Array of token IDs for the text content.
   * @return tokens
   */
  public List<Integer> getTokens() {
    return tokens;
  }

  public void setTokens(List<Integer> tokens) {
    this.tokens = tokens;
  }

  /**
   * Temperature parameter used for generating the segment.
   * @return temperature
   */
  public Float getTemperature() {
    return temperature;
  }

  public void setTemperature(Float temperature) {
    this.temperature = temperature;
  }

  /**
   * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
   * @return avgLogprob
   */
  public Float getAvgLogprob() {
    return avgLogprob;
  }

  public void setAvgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
  }

  /**
   * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
   * @return compressionRatio
   */
  public Float getCompressionRatio() {
    return compressionRatio;
  }

  public void setCompressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
  }

  /**
   * Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent.
   * @return noSpeechProb
   */
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
    return Objects.equals(this.id, transcriptionSegment.id) &&
        Objects.equals(this.seek, transcriptionSegment.seek) &&
        Objects.equals(this.start, transcriptionSegment.start) &&
        Objects.equals(this.end, transcriptionSegment.end) &&
        Objects.equals(this.text, transcriptionSegment.text) &&
        Objects.equals(this.tokens, transcriptionSegment.tokens) &&
        Objects.equals(this.temperature, transcriptionSegment.temperature) &&
        Objects.equals(this.avgLogprob, transcriptionSegment.avgLogprob) &&
        Objects.equals(this.compressionRatio, transcriptionSegment.compressionRatio) &&
        Objects.equals(this.noSpeechProb, transcriptionSegment.noSpeechProb);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
