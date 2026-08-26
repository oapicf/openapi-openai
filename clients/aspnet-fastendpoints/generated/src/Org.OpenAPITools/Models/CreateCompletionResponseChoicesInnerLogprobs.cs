namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateCompletionResponseChoicesInnerLogprobs 
{
    public List<int> TextOffset { get; set; }
    public List<decimal> TokenLogprobs { get; set; }
    public List<string> Tokens { get; set; }
    public List<Dictionary<string, decimal>> TopLogprobs { get; set; }
}


