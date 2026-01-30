package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TranscriptionSegment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TranscriptionSegment {

  private Integer id;

  private Integer seek;

  private Float start;

  private Float end;

  private String text;

  @Valid
  private List<Integer> tokens = new ArrayList<>();

  private Float temperature;

  private Float avgLogprob;

  private Float compressionRatio;

  private Float noSpeechProb;

  public TranscriptionSegment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TranscriptionSegment(Integer id, Integer seek, Float start, Float end, String text, List<Integer> tokens, Float temperature, Float avgLogprob, Float compressionRatio, Float noSpeechProb) {
    this.id = id;
    this.seek = seek;
    this.start = start;
    this.end = end;
    this.text = text;
    this.tokens = tokens;
    this.temperature = temperature;
    this.avgLogprob = avgLogprob;
    this.compressionRatio = compressionRatio;
    this.noSpeechProb = noSpeechProb;
  }

  public TranscriptionSegment id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the segment.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Unique identifier of the segment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TranscriptionSegment seek(Integer seek) {
    this.seek = seek;
    return this;
  }

  /**
   * Seek offset of the segment.
   * @return seek
   */
  @NotNull 
  @Schema(name = "seek", description = "Seek offset of the segment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("seek")
  public Integer getSeek() {
    return seek;
  }

  public void setSeek(Integer seek) {
    this.seek = seek;
  }

  public TranscriptionSegment start(Float start) {
    this.start = start;
    return this;
  }

  /**
   * Start time of the segment in seconds.
   * @return start
   */
  @NotNull 
  @Schema(name = "start", description = "Start time of the segment in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start")
  public Float getStart() {
    return start;
  }

  public void setStart(Float start) {
    this.start = start;
  }

  public TranscriptionSegment end(Float end) {
    this.end = end;
    return this;
  }

  /**
   * End time of the segment in seconds.
   * @return end
   */
  @NotNull 
  @Schema(name = "end", description = "End time of the segment in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end")
  public Float getEnd() {
    return end;
  }

  public void setEnd(Float end) {
    this.end = end;
  }

  public TranscriptionSegment text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Text content of the segment.
   * @return text
   */
  @NotNull 
  @Schema(name = "text", description = "Text content of the segment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public TranscriptionSegment tokens(List<Integer> tokens) {
    this.tokens = tokens;
    return this;
  }

  public TranscriptionSegment addTokensItem(Integer tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

  /**
   * Array of token IDs for the text content.
   * @return tokens
   */
  @NotNull 
  @Schema(name = "tokens", description = "Array of token IDs for the text content.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tokens")
  public List<Integer> getTokens() {
    return tokens;
  }

  public void setTokens(List<Integer> tokens) {
    this.tokens = tokens;
  }

  public TranscriptionSegment temperature(Float temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Temperature parameter used for generating the segment.
   * @return temperature
   */
  @NotNull 
  @Schema(name = "temperature", description = "Temperature parameter used for generating the segment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("temperature")
  public Float getTemperature() {
    return temperature;
  }

  public void setTemperature(Float temperature) {
    this.temperature = temperature;
  }

  public TranscriptionSegment avgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
    return this;
  }

  /**
   * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
   * @return avgLogprob
   */
  @NotNull 
  @Schema(name = "avg_logprob", description = "Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("avg_logprob")
  public Float getAvgLogprob() {
    return avgLogprob;
  }

  public void setAvgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
  }

  public TranscriptionSegment compressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
    return this;
  }

  /**
   * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
   * @return compressionRatio
   */
  @NotNull 
  @Schema(name = "compression_ratio", description = "Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("compression_ratio")
  public Float getCompressionRatio() {
    return compressionRatio;
  }

  public void setCompressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
  }

  public TranscriptionSegment noSpeechProb(Float noSpeechProb) {
    this.noSpeechProb = noSpeechProb;
    return this;
  }

  /**
   * Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
   * @return noSpeechProb
   */
  @NotNull 
  @Schema(name = "no_speech_prob", description = "Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

