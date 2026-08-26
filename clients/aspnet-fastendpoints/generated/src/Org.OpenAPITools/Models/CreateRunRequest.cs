namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateRunRequest 
{
    public string AssistantId { get; set; }
    public CreateRunRequestModel Model { get; set; }
    public string Instructions { get; set; }
    public string AdditionalInstructions { get; set; }
    public List<CreateMessageRequest> AdditionalMessages { get; set; }
    public List<AssistantObjectToolsInner> Tools { get; set; }
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


