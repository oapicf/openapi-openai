namespace Org.OpenAPITools.Models;


/// <summary>
/// The ranking options for the file search.
/// </summary>
public class RunStepDetailsToolCallsFileSearchRankingOptionsObject 
{
    
    /// <summary>
    /// The ranker used for the file search.
    /// </summary>
    /// <value>The ranker used for the file search.</value>
    public enum RankerEnum
    {
        
        /// <summary>
        /// Enum Default20240821Enum for default_2024_08_21
        /// </summary>
        Default20240821Enum = 1
    }

    public RankerEnum Ranker { get; set; }
    public decimal ScoreThreshold { get; set; }
}


