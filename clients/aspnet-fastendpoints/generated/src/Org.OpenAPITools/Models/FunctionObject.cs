namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class FunctionObject 
{
    public string Description { get; set; }
    public string Name { get; set; }
    public Dictionary<string, Object> Parameters { get; set; }
    public bool Strict { get; set; } = false;
}


