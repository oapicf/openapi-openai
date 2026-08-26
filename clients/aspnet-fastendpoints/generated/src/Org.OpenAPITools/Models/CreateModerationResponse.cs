namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents if a given text input is potentially harmful.
/// </summary>
public class CreateModerationResponse 
{
    public string Id { get; set; }
    public string Model { get; set; }
    public List<CreateModerationResponseResultsInner> Results { get; set; }
}


