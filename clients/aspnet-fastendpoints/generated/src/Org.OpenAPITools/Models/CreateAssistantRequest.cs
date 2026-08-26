namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateAssistantRequest 
{
    public CreateAssistantRequestModel Model { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public string Instructions { get; set; }
    public List<AssistantObjectToolsInner> Tools { get; set; }
    public CreateAssistantRequestToolResources ToolResources { get; set; }
    public Object Metadata { get; set; }
    public decimal Temperature { get; set; } = 1M;
    public decimal TopP { get; set; } = 1M;
    public AssistantsApiResponseFormatOption ResponseFormat { get; set; }
}


