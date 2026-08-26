namespace Org.OpenAPITools.Models;


/// <summary>
/// The expiration policy for a vector store.
/// </summary>
public class VectorStoreExpirationAfter 
{
    
    /// <summary>
    /// Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
    /// </summary>
    /// <value>Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.</value>
    public enum AnchorEnum
    {
        
        /// <summary>
        /// Enum LastActiveAtEnum for last_active_at
        /// </summary>
        LastActiveAtEnum = 1
    }

    public AnchorEnum Anchor { get; set; }
    public int Days { get; set; }
}


