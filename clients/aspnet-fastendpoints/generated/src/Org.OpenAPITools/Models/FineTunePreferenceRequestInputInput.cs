namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class FineTunePreferenceRequestInputInput 
{
    public List<FineTuneChatRequestInputMessagesInner> Messages { get; set; }
    public List<ChatCompletionTool> Tools { get; set; }
    public bool ParallelToolCalls { get; set; } = true;
}


