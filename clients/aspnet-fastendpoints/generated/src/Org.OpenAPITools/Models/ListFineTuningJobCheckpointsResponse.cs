namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ListFineTuningJobCheckpointsResponse 
{
    public List<FineTuningJobCheckpoint> Data { get; set; }
    
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
    public string FirstId { get; set; }
    public string LastId { get; set; }
    public bool HasMore { get; set; }
}


