namespace Org.OpenAPITools.Models;


/// <summary>
/// Describes an OpenAI model offering that can be used with the API.
/// </summary>
public class Model 
{
    public string Id { get; set; }
    public int Created { get; set; }
    
    /// <summary>
    /// The object type, which is always \"model\".
    /// </summary>
    /// <value>The object type, which is always \"model\".</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ModelEnum for model
        /// </summary>
        ModelEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string OwnedBy { get; set; }
}


