namespace Org.OpenAPITools.Models;


/// <summary>
/// The per-line training example of a fine-tuning input file for chat models using the supervised method.
/// </summary>
public class FineTuneChatRequestInput 
{
    public List<FineTuneChatRequestInputMessagesInner> Messages { get; set; }
    public List<ChatCompletionTool> Tools { get; set; }
    public bool ParallelToolCalls { get; set; } = true;
    public List<ChatCompletionFunctions> Functions { get; set; }
}


