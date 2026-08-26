namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ListPaginatedFineTuningJobsResponse 
{
    public List<FineTuningJob> Data { get; set; }
    public bool HasMore { get; set; }
    
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


