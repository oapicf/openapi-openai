namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ChatCompletionRequestToolMessage 
{
    
    /// <summary>
    /// The role of the messages author, in this case `tool`.
    /// </summary>
    /// <value>The role of the messages author, in this case `tool`.</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum ToolEnum for tool
        /// </summary>
        ToolEnum = 1
    }

    public RoleEnum Role { get; set; }
    public ChatCompletionRequestToolMessageContent Content { get; set; }
    public string ToolCallId { get; set; }
}


