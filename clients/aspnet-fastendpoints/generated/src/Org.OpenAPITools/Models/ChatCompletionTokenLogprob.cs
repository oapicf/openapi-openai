namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ChatCompletionTokenLogprob 
{
    public string Token { get; set; }
    public decimal Logprob { get; set; }
    public List<int> Bytes { get; set; }
    public List<ChatCompletionTokenLogprobTopLogprobsInner> TopLogprobs { get; set; }
}


