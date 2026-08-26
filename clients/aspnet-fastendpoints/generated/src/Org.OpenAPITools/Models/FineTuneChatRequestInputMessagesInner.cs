namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class FineTuneChatRequestInputMessagesInner 
{
    public string Content { get; set; }
    
    /// <summary>
    /// The role of the messages author, in this case `function`.
    /// </summary>
    /// <value>The role of the messages author, in this case `function`.</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum FunctionEnum for function
        /// </summary>
        FunctionEnum = 1
    }

    public RoleEnum Role { get; set; }
    public string Name { get; set; }
    
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
    public string Refusal { get; set; }
    public ChatCompletionRequestAssistantMessageAudio Audio { get; set; }
    public List<ChatCompletionMessageToolCall> ToolCalls { get; set; }
    public ChatCompletionRequestAssistantMessageFunctionCall FunctionCall { get; set; }
    public string ToolCallId { get; set; }
}


