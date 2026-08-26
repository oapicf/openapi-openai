namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateModerationResponseResultsInner 
{
    public bool Flagged { get; set; }
    public CreateModerationResponseResultsInnerCategories Categories { get; set; }
    public CreateModerationResponseResultsInnerCategoryScores CategoryScores { get; set; }
    public CreateModerationResponseResultsInnerCategoryAppliedInputTypes CategoryAppliedInputTypes { get; set; }
}


