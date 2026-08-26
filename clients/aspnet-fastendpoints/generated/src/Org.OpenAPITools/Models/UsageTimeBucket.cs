namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UsageTimeBucket 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum BucketEnum for bucket
        /// </summary>
        BucketEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int StartTime { get; set; }
    public int EndTime { get; set; }
    public List<UsageTimeBucketResultInner> Result { get; set; }
}


