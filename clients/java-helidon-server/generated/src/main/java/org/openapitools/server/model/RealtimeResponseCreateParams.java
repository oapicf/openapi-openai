package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.RealtimeConversationItem;
import org.openapitools.server.model.RealtimeResponseCreateParamsConversation;
import org.openapitools.server.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.server.model.RealtimeResponseCreateParamsToolsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Create a new Realtime response with these parameters
 */
public class RealtimeResponseCreateParams   {


    /**
    * Gets or Sets modalities
    */
    public enum ModalitiesEnum {
        TEXT("text"),
        AUDIO("audio");

        private String value;

        ModalitiesEnum(String value) {
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
        public static ModalitiesEnum fromValue(String text) {
            for (ModalitiesEnum b : ModalitiesEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private List<ModalitiesEnum> modalities = new ArrayList<>();
    private String instructions;

    /**
    * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
    */
    public enum VoiceEnum {
        ALLOY("alloy"),
        ASH("ash"),
        BALLAD("ballad"),
        CORAL("coral"),
        ECHO("echo"),
        SAGE("sage"),
        SHIMMER("shimmer"),
        VERSE("verse");

        private String value;

        VoiceEnum(String value) {
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
        public static VoiceEnum fromValue(String text) {
            for (VoiceEnum b : VoiceEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private VoiceEnum voice;

    /**
    * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
    */
    public enum OutputAudioFormatEnum {
        PCM16("pcm16"),
        G711_ULAW("g711_ulaw"),
        G711_ALAW("g711_alaw");

        private String value;

        OutputAudioFormatEnum(String value) {
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
        public static OutputAudioFormatEnum fromValue(String text) {
            for (OutputAudioFormatEnum b : OutputAudioFormatEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private OutputAudioFormatEnum outputAudioFormat;
    private List<@Valid RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();
    private String toolChoice;
    private BigDecimal temperature;
    private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;
    private RealtimeResponseCreateParamsConversation conversation;
    private Object metadata;
    private List<@Valid RealtimeConversationItem> input = new ArrayList<>();

    /**
     * Default constructor.
     */
    public RealtimeResponseCreateParams() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeResponseCreateParams.
     *
     * @param modalities The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;]. 
     * @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session. 
     * @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;. 
     * @param outputAudioFormat The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
     * @param tools Tools (functions) available to the model.
     * @param toolChoice How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function, like &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60;. 
     * @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
     * @param maxResponseOutputTokens maxResponseOutputTokens
     * @param conversation conversation
     * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @param input Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
     */
    public RealtimeResponseCreateParams(
        List<ModalitiesEnum> modalities, 
        String instructions, 
        VoiceEnum voice, 
        OutputAudioFormatEnum outputAudioFormat, 
        List<@Valid RealtimeResponseCreateParamsToolsInner> tools, 
        String toolChoice, 
        BigDecimal temperature, 
        RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens, 
        RealtimeResponseCreateParamsConversation conversation, 
        Object metadata, 
        List<@Valid RealtimeConversationItem> input
    ) {
        this.modalities = modalities;
        this.instructions = instructions;
        this.voice = voice;
        this.outputAudioFormat = outputAudioFormat;
        this.tools = tools;
        this.toolChoice = toolChoice;
        this.temperature = temperature;
        this.maxResponseOutputTokens = maxResponseOutputTokens;
        this.conversation = conversation;
        this.metadata = metadata;
        this.input = input;
    }



    /**
     * The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
     * @return modalities
     */
    public List<ModalitiesEnum> getModalities() {
        return modalities;
    }

    public void setModalities(List<ModalitiesEnum> modalities) {
        this.modalities = modalities;
    }

    /**
     * The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
     * @return instructions
     */
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
     * @return voice
     */
    public VoiceEnum getVoice() {
        return voice;
    }

    public void setVoice(VoiceEnum voice) {
        this.voice = voice;
    }

    /**
     * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
     * @return outputAudioFormat
     */
    public OutputAudioFormatEnum getOutputAudioFormat() {
        return outputAudioFormat;
    }

    public void setOutputAudioFormat(OutputAudioFormatEnum outputAudioFormat) {
        this.outputAudioFormat = outputAudioFormat;
    }

    /**
     * Tools (functions) available to the model.
     * @return tools
     */
    public List<@Valid RealtimeResponseCreateParamsToolsInner> getTools() {
        return tools;
    }

    public void setTools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
        this.tools = tools;
    }

    /**
     * How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
     * @return toolChoice
     */
    public String getToolChoice() {
        return toolChoice;
    }

    public void setToolChoice(String toolChoice) {
        this.toolChoice = toolChoice;
    }

    /**
     * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
     * @return temperature
     */
    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    /**
     * Get maxResponseOutputTokens
     * @return maxResponseOutputTokens
     */
    public RealtimeResponseCreateParamsMaxResponseOutputTokens getMaxResponseOutputTokens() {
        return maxResponseOutputTokens;
    }

    public void setMaxResponseOutputTokens(RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
        this.maxResponseOutputTokens = maxResponseOutputTokens;
    }

    /**
     * Get conversation
     * @return conversation
     */
    public RealtimeResponseCreateParamsConversation getConversation() {
        return conversation;
    }

    public void setConversation(RealtimeResponseCreateParamsConversation conversation) {
        this.conversation = conversation;
    }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
     * Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
     * @return input
     */
    public List<@Valid RealtimeConversationItem> getInput() {
        return input;
    }

    public void setInput(List<@Valid RealtimeConversationItem> input) {
        this.input = input;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeResponseCreateParams {\n");
        
        sb.append("    modalities: ").append(toIndentedString(modalities)).append("\n");
        sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
        sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
        sb.append("    outputAudioFormat: ").append(toIndentedString(outputAudioFormat)).append("\n");
        sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
        sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
        sb.append("    maxResponseOutputTokens: ").append(toIndentedString(maxResponseOutputTokens)).append("\n");
        sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
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

