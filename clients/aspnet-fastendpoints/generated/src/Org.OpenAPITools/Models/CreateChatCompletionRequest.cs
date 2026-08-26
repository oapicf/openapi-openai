namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateChatCompletionRequest 
{
    public List<ChatCompletionRequestMessage> Messages { get; set; }
    public CreateChatCompletionRequestModel Model { get; set; }
    public bool Store { get; set; } = false;
    
    /// <summary>
    /// **o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are `low`, `medium`, and `high`. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. 
    /// </summary>
    /// <value>**o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are `low`, `medium`, and `high`. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. </value>
    public enum ReasoningEffortEnum
    {
        
        /// <summary>
        /// Enum LowEnum for low
        /// </summary>
        LowEnum = 1,
        
        /// <summary>
        /// Enum MediumEnum for medium
        /// </summary>
        MediumEnum = 2,
        
        /// <summary>
        /// Enum HighEnum for high
        /// </summary>
        HighEnum = 3
    }

    public ReasoningEffortEnum ReasoningEffort { get; set; } = ReasoningEffortEnum.MediumEnum;
    public Dictionary<string, string> Metadata { get; set; }
    public decimal FrequencyPenalty { get; set; } = 0M;
    public Dictionary<string, int> LogitBias { get; set; }
    public bool Logprobs { get; set; } = false;
    public int TopLogprobs { get; set; }
    public int MaxTokens { get; set; }
    public int MaxCompletionTokens { get; set; }
    public int N { get; set; } = 1;
    public List<CreateChatCompletionRequest.ModalitiesEnum> Modalities { get; set; }
    public PredictionContent Prediction { get; set; }
    public CreateChatCompletionRequestAudio Audio { get; set; }
    public decimal PresencePenalty { get; set; } = 0M;
    public CreateChatCompletionRequestResponseFormat ResponseFormat { get; set; }
    public long Seed { get; set; }
    
    /// <summary>
    /// Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is 'auto'.    When this parameter is set, the response body will include the `service_tier` utilized. 
    /// </summary>
    /// <value>Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is 'auto'.    When this parameter is set, the response body will include the `service_tier` utilized. </value>
    public enum ServiceTierEnum
    {
        
        /// <summary>
        /// Enum AutoEnum for auto
        /// </summary>
        AutoEnum = 1,
        
        /// <summary>
        /// Enum DefaultEnum for default
        /// </summary>
        DefaultEnum = 2
    }

    public ServiceTierEnum? ServiceTier { get; set; } = ServiceTierEnum.AutoEnum;
    public CreateChatCompletionRequestStop Stop { get; set; }
    public bool Stream { get; set; } = false;
    public ChatCompletionStreamOptions StreamOptions { get; set; }
    public decimal Temperature { get; set; } = 1M;
    public decimal TopP { get; set; } = 1M;
    public List<ChatCompletionTool> Tools { get; set; }
    public ChatCompletionToolChoiceOption ToolChoice { get; set; }
    public bool ParallelToolCalls { get; set; } = true;
    public string User { get; set; }
    public CreateChatCompletionRequestFunctionCall FunctionCall { get; set; }
    public List<ChatCompletionFunctions> Functions { get; set; }
}


