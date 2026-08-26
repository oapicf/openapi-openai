namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents an &#x60;assistant&#x60; that can call the model and use tools.
/// </summary>
public class AssistantObject 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The object type, which is always `assistant`.
    /// </summary>
    /// <value>The object type, which is always `assistant`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum AssistantEnum for assistant
        /// </summary>
        AssistantEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int CreatedAt { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public string Model { get; set; }
    public string Instructions { get; set; }
    public List<AssistantObjectToolsInner> Tools { get; set; }
    public AssistantObjectToolResources ToolResources { get; set; }
    public Object Metadata { get; set; }
    public decimal Temperature { get; set; } = 1M;
    public decimal TopP { get; set; } = 1M;
    public AssistantsApiResponseFormatOption ResponseFormat { get; set; }
}


