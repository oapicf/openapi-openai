namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ChatCompletionRequestMessage 
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
    public string Refusal { get; set; }
    public ChatCompletionRequestAssistantMessageAudio Audio { get; set; }
    public List<ChatCompletionMessageToolCall> ToolCalls { get; set; }
    public ChatCompletionRequestAssistantMessageFunctionCall FunctionCall { get; set; }
    public string ToolCallId { get; set; }
}


