package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CreateCompletionResponseChoicesInnerLogprobs;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateCompletionResponseChoicesInner   {


    /**
    * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
    */
    public enum FinishReasonEnum {
        STOP("stop"),
        LENGTH("length"),
        CONTENT_FILTER("content_filter");

        private String value;

        FinishReasonEnum(String value) {
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
        public static FinishReasonEnum fromValue(String text) {
            for (FinishReasonEnum b : FinishReasonEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private FinishReasonEnum finishReason;
    private Integer index;
    private CreateCompletionResponseChoicesInnerLogprobs logprobs;
    private String text;

    /**
     * Default constructor.
     */
    public CreateCompletionResponseChoicesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateCompletionResponseChoicesInner.
     *
     * @param finishReason The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters. 
     * @param index index
     * @param logprobs logprobs
     * @param text text
     */
    public CreateCompletionResponseChoicesInner(
        FinishReasonEnum finishReason, 
        Integer index, 
        CreateCompletionResponseChoicesInnerLogprobs logprobs, 
        String text
    ) {
        this.finishReason = finishReason;
        this.index = index;
        this.logprobs = logprobs;
        this.text = text;
    }



    /**
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
     * @return finishReason
     */
    public FinishReasonEnum getFinishReason() {
        return finishReason;
    }

    public void setFinishReason(FinishReasonEnum finishReason) {
        this.finishReason = finishReason;
    }

    /**
     * Get index
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * Get logprobs
     * @return logprobs
     */
    public CreateCompletionResponseChoicesInnerLogprobs getLogprobs() {
        return logprobs;
    }

    public void setLogprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
        this.logprobs = logprobs;
    }

    /**
     * Get text
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCompletionResponseChoicesInner {\n");
        
        sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

