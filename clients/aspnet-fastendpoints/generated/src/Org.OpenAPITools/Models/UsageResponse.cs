namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UsageResponse 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum PageEnum for page
        /// </summary>
        PageEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public List<UsageTimeBucket> Data { get; set; }
    public bool HasMore { get; set; }
    public string NextPage { get; set; }
}


