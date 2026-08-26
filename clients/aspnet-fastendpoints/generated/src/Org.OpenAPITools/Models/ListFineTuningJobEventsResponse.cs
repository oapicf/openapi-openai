namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ListFineTuningJobEventsResponse 
{
    public List<FineTuningJobEvent> Data { get; set; }
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ListEnum for list
        /// </summary>
        ListEnum = 1
    }

    public ObjectEnum Object { get; set; }
}


