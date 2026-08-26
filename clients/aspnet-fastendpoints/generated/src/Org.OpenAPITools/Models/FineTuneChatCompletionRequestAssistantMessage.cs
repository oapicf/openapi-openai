namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class FineTuneChatCompletionRequestAssistantMessage 
{
    public ChatCompletionRequestAssistantMessageContent Content { get; set; }
    public string Refusal { get; set; }
    
    /// <summary>
    /// The role of the messages author, in this case `assistant`.
    /// </summary>
    /// <value>The role of the messages author, in this case `assistant`.</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum AssistantEnum for assistant
        /// </summary>
        AssistantEnum = 1
    }

    public RoleEnum Role { get; set; }
    public string Name { get; set; }
    public ChatCompletionRequestAssistantMessageAudio Audio { get; set; }
    public List<ChatCompletionMessageToolCall> ToolCalls { get; set; }
    public ChatCompletionRequestAssistantMessageFunctionCall FunctionCall { get; set; }
    
    /// <summary>
    /// Controls whether the assistant message is trained against (0 or 1)
    /// </summary>
    /// <value>Controls whether the assistant message is trained against (0 or 1)</value>
    public enum WeightEnum
    {
        
        /// <summary>
        /// Enum _0Enum for 0
        /// </summary>
        _0Enum = 0,
        
        /// <summary>
        /// Enum _1Enum for 1
        /// </summary>
        _1Enum = 1
    }

    public WeightEnum Weight { get; set; }
}


