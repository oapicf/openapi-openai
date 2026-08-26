namespace Org.OpenAPITools.Models;


/// <summary>
/// The item to add to the conversation.
/// </summary>
public class RealtimeConversationItem 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The type of the item (`message`, `function_call`, `function_call_output`). 
    /// </summary>
    /// <value>The type of the item (`message`, `function_call`, `function_call_output`). </value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum MessageEnum for message
        /// </summary>
        MessageEnum = 1,
        
        /// <summary>
        /// Enum FunctionCallEnum for function_call
        /// </summary>
        FunctionCallEnum = 2,
        
        /// <summary>
        /// Enum FunctionCallOutputEnum for function_call_output
        /// </summary>
        FunctionCallOutputEnum = 3
    }

    public TypeEnum Type { get; set; }
    
    /// <summary>
    /// Identifier for the API object being returned - always `realtime.item`. 
    /// </summary>
    /// <value>Identifier for the API object being returned - always `realtime.item`. </value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum RealtimeItemEnum for realtime.item
        /// </summary>
        RealtimeItemEnum = 1
    }

    public ObjectEnum Object { get; set; }
    
    /// <summary>
    /// The status of the item (`completed`, `incomplete`). These have no effect  on the conversation, but are accepted for consistency with the  `conversation.item.created` event. 
    /// </summary>
    /// <value>The status of the item (`completed`, `incomplete`). These have no effect  on the conversation, but are accepted for consistency with the  `conversation.item.created` event. </value>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum CompletedEnum for completed
        /// </summary>
        CompletedEnum = 1,
        
        /// <summary>
        /// Enum IncompleteEnum for incomplete
        /// </summary>
        IncompleteEnum = 2
    }

    public StatusEnum Status { get; set; }
    
    /// <summary>
    /// The role of the message sender (`user`, `assistant`, `system`), only  applicable for `message` items. 
    /// </summary>
    /// <value>The role of the message sender (`user`, `assistant`, `system`), only  applicable for `message` items. </value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum UserEnum for user
        /// </summary>
        UserEnum = 1,
        
        /// <summary>
        /// Enum AssistantEnum for assistant
        /// </summary>
        AssistantEnum = 2,
        
        /// <summary>
        /// Enum SystemEnum for system
        /// </summary>
        SystemEnum = 3
    }

    public RoleEnum Role { get; set; }
    public List<RealtimeConversationItemContentInner> Content { get; set; }
    public string CallId { get; set; }
    public string Name { get; set; }
    public string Arguments { get; set; }
    public string Output { get; set; }
}


