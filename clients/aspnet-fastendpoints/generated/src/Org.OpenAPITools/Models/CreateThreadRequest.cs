namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateThreadRequest 
{
    public List<CreateMessageRequest> Messages { get; set; }
    public CreateThreadRequestToolResources ToolResources { get; set; }
    public Object Metadata { get; set; }
}


