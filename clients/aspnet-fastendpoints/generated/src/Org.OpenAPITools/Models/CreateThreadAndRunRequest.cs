namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateThreadAndRunRequest 
{
    public string AssistantId { get; set; }
    public CreateThreadRequest Thread { get; set; }
    public CreateRunRequestModel Model { get; set; }
    public string Instructions { get; set; }
    public List<CreateThreadAndRunRequestToolsInner> Tools { get; set; }
    public CreateThreadAndRunRequestToolResources ToolResources { get; set; }
    public Object Metadata { get; set; }
    public decimal Temperature { get; set; } = 1M;
    public decimal TopP { get; set; } = 1M;
    public bool Stream { get; set; }
    public int MaxPromptTokens { get; set; }
    public int MaxCompletionTokens { get; set; }
    public TruncationObject TruncationStrategy { get; set; }
    public AssistantsApiToolChoiceOption ToolChoice { get; set; }
    public bool ParallelToolCalls { get; set; } = true;
    public AssistantsApiResponseFormatOption ResponseFormat { get; set; }
}


