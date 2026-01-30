package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TranscriptionWord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TranscriptionWord   {
  @JsonProperty("word")
  @NotNull

  private String word;

  @JsonProperty("start")
  @NotNull

  private Float start;

  @JsonProperty("end")
  @NotNull

  private Float end;

  public TranscriptionWord word(String word) {
    this.word = word;
    return this;
  }

   /**
   * The text content of the word.
   * @return word
  **/
  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public TranscriptionWord start(Float start) {
    this.start = start;
    return this;
  }

   /**
   * Start time of the word in seconds.
   * @return start
  **/
  public Float getStart() {
    return start;
  }

  public void setStart(Float start) {
    this.start = start;
  }

  public TranscriptionWord end(Float end) {
    this.end = end;
    return this;
  }

   /**
   * End time of the word in seconds.
   * @return end
  **/
  public Float getEnd() {
    return end;
  }

  public void setEnd(Float end) {
    this.end = end;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionWord transcriptionWord = (TranscriptionWord) o;
    return Objects.equals(word, transcriptionWord.word) &&
        Objects.equals(start, transcriptionWord.start) &&
        Objects.equals(end, transcriptionWord.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, start, end);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionWord {\n");
    
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

