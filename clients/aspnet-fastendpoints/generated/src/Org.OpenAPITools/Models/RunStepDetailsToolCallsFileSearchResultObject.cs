namespace Org.OpenAPITools.Models;


/// <summary>
/// A result instance of the file search.
/// </summary>
public class RunStepDetailsToolCallsFileSearchResultObject 
{
    public string FileId { get; set; }
    public string FileName { get; set; }
    public decimal Score { get; set; }
    public List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> Content { get; set; }
}


