package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 */
public class FileSearchRankingOptions   {


    /**
    * The ranker to use for the file search. If not specified will use the `auto` ranker.
    */
    public enum RankerEnum {
        AUTO("auto"),
        DEFAULT_2024_08_21("default_2024_08_21");

        private String value;

        RankerEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static RankerEnum fromValue(String text) {
            for (RankerEnum b : RankerEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private RankerEnum ranker;
    private BigDecimal scoreThreshold;

    /**
     * Default constructor.
     */
    public FileSearchRankingOptions() {
    // JSON-B / Jackson
    }

    /**
     * Create FileSearchRankingOptions.
     *
     * @param ranker The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker.
     * @param scoreThreshold The score threshold for the file search. All values must be a floating point number between 0 and 1.
     */
    public FileSearchRankingOptions(
        RankerEnum ranker, 
        BigDecimal scoreThreshold
    ) {
        this.ranker = ranker;
        this.scoreThreshold = scoreThreshold;
    }



    /**
     * The ranker to use for the file search. If not specified will use the `auto` ranker.
     * @return ranker
     */
    public RankerEnum getRanker() {
        return ranker;
    }

    public void setRanker(RankerEnum ranker) {
        this.ranker = ranker;
    }

    /**
     * The score threshold for the file search. All values must be a floating point number between 0 and 1.
     * minimum: 0
     * maximum: 1
     * @return scoreThreshold
     */
    public BigDecimal getScoreThreshold() {
        return scoreThreshold;
    }

    public void setScoreThreshold(BigDecimal scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileSearchRankingOptions {\n");
        
        sb.append("    ranker: ").append(toIndentedString(ranker)).append("\n");
        sb.append("    scoreThreshold: ").append(toIndentedString(scoreThreshold)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

