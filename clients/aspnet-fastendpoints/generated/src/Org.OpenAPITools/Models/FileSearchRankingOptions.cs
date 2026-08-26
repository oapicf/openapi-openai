namespace Org.OpenAPITools.Models;


/// <summary>
/// The ranking options for the file search. If not specified, the file search tool will use the &#x60;auto&#x60; ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
/// </summary>
public class FileSearchRankingOptions 
{
    
    /// <summary>
    /// The ranker to use for the file search. If not specified will use the `auto` ranker.
    /// </summary>
    /// <value>The ranker to use for the file search. If not specified will use the `auto` ranker.</value>
    public enum RankerEnum
    {
        
        /// <summary>
        /// Enum AutoEnum for auto
        /// </summary>
        AutoEnum = 1,
        
        /// <summary>
        /// Enum Default20240821Enum for default_2024_08_21
        /// </summary>
        Default20240821Enum = 2
    }

    public RankerEnum Ranker { get; set; }
    public decimal ScoreThreshold { get; set; }
}


