namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a stream ends.
/// </summary>
public class DoneEvent 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum DoneEnum for done
        /// </summary>
        DoneEnum = 1
    }

    public EventEnum Event { get; set; }
    
    /// <summary>
    /// Gets or Sets Data
    /// </summary>
    public enum DataEnum
    {
        
        /// <summary>
        /// Enum DONEEnum for [DONE]
        /// </summary>
        DONEEnum = 1
    }

    public DataEnum Data { get; set; }
}


