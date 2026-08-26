package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ChatCompletionStreamResponseDelta;
import org.openapitools.server.model.CreateChatCompletionResponseChoicesInnerLogprobs;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateChatCompletionStreamResponseChoicesInner   {

    private ChatCompletionStreamResponseDelta delta;
    private CreateChatCompletionResponseChoicesInnerLogprobs logprobs;

    /**
    * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
    */
    public enum FinishReasonEnum {
        STOP("stop"),
        LENGTH("length"),
        TOOL_CALLS("tool_calls"),
        CONTENT_FILTER("content_filter"),
        FUNCTION_CALL("function_call");

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

    /**
     * Default constructor.
     */
    public CreateChatCompletionStreamResponseChoicesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateChatCompletionStreamResponseChoicesInner.
     *
     * @param delta delta
     * @param logprobs logprobs
     * @param finishReason The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. 
     * @param index The index of the choice in the list of choices.
     */
    public CreateChatCompletionStreamResponseChoicesInner(
        ChatCompletionStreamResponseDelta delta, 
        CreateChatCompletionResponseChoicesInnerLogprobs logprobs, 
        FinishReasonEnum finishReason, 
        Integer index
    ) {
        this.delta = delta;
        this.logprobs = logprobs;
        this.finishReason = finishReason;
        this.index = index;
    }



    /**
     * Get delta
     * @return delta
     */
    public ChatCompletionStreamResponseDelta getDelta() {
        return delta;
    }

    public void setDelta(ChatCompletionStreamResponseDelta delta) {
        this.delta = delta;
    }

    /**
     * Get logprobs
     * @return logprobs
     */
    public CreateChatCompletionResponseChoicesInnerLogprobs getLogprobs() {
        return logprobs;
    }

    public void setLogprobs(CreateChatCompletionResponseChoicesInnerLogprobs logprobs) {
        this.logprobs = logprobs;
    }

    /**
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
     * @return finishReason
     */
    public FinishReasonEnum getFinishReason() {
        return finishReason;
    }

    public void setFinishReason(FinishReasonEnum finishReason) {
        this.finishReason = finishReason;
    }

    /**
     * The index of the choice in the list of choices.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChatCompletionStreamResponseChoicesInner {\n");
        
        sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
        sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
        sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

