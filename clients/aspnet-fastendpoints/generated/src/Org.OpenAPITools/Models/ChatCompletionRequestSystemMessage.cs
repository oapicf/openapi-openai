namespace Org.OpenAPITools.Models;


/// <summary>
/// Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use &#x60;developer&#x60; messages for this purpose instead. 
/// </summary>
public class ChatCompletionRequestSystemMessage 
{
    public ChatCompletionRequestSystemMessageContent Content { get; set; }
    
    /// <summary>
    /// The role of the messages author, in this case `system`.
    /// </summary>
    /// <value>The role of the messages author, in this case `system`.</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum SystemEnum for system
        /// </summary>
        SystemEnum = 1
    }

    public RoleEnum Role { get; set; }
    public string Name { get; set; }
}


