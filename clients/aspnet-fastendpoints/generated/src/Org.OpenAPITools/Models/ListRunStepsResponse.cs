namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ListRunStepsResponse 
{
    public string Object { get; set; }
    public List<RunStepObject> Data { get; set; }
    public string FirstId { get; set; }
    public string LastId { get; set; }
    public bool HasMore { get; set; }
}


