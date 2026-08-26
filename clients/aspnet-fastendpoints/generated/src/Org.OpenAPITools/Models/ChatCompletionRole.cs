namespace Org.OpenAPITools.Models;

    /// <summary>
    /// The role of the author of a message
    /// </summary>
    /// <value>The role of the author of a message</value>
    public enum ChatCompletionRole
    {
        
        /// <summary>
        /// Enum SystemEnum for system
        /// </summary>
        SystemEnum = 1,
        
        /// <summary>
        /// Enum UserEnum for user
        /// </summary>
        UserEnum = 2,
        
        /// <summary>
        /// Enum AssistantEnum for assistant
        /// </summary>
        AssistantEnum = 3,
        
        /// <summary>
        /// Enum ToolEnum for tool
        /// </summary>
        ToolEnum = 4,
        
        /// <summary>
        /// Enum FunctionEnum for function
        /// </summary>
        FunctionEnum = 5
    }
