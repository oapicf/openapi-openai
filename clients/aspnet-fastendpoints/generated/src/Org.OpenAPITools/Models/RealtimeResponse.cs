namespace Org.OpenAPITools.Models;


/// <summary>
/// The response resource.
/// </summary>
public class RealtimeResponse 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The object type, must be `realtime.response`.
    /// </summary>
    /// <value>The object type, must be `realtime.response`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum RealtimeResponseEnum for realtime.response
        /// </summary>
        RealtimeResponseEnum = 1
    }

    public ObjectEnum Object { get; set; }
    
    /// <summary>
    /// The final status of the response (`completed`, `cancelled`, `failed`, or  `incomplete`). 
    /// </summary>
    /// <value>The final status of the response (`completed`, `cancelled`, `failed`, or  `incomplete`). </value>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum CompletedEnum for completed
        /// </summary>
        CompletedEnum = 1,
        
        /// <summary>
        /// Enum CancelledEnum for cancelled
        /// </summary>
        CancelledEnum = 2,
        
        /// <summary>
        /// Enum FailedEnum for failed
        /// </summary>
        FailedEnum = 3,
        
        /// <summary>
        /// Enum IncompleteEnum for incomplete
        /// </summary>
        IncompleteEnum = 4
    }

    public StatusEnum Status { get; set; }
    public RealtimeResponseStatusDetails StatusDetails { get; set; }
    public List<RealtimeConversationItem> Output { get; set; }
    public Object Metadata { get; set; }
    public RealtimeResponseUsage Usage { get; set; }
}


