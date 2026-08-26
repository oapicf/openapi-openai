namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class FineTunePreferenceRequestInputPreferredCompletionInner 
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
}


