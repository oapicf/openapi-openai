namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ChatCompletionTokenLogprobTopLogprobsInner 
{
    public string Token { get; set; }
    public decimal Logprob { get; set; }
    public List<int> Bytes { get; set; }
}


