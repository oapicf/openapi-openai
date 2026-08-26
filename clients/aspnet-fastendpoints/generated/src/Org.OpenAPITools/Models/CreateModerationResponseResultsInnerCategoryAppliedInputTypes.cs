namespace Org.OpenAPITools.Models;


/// <summary>
/// A list of the categories along with the input type(s) that the score applies to.
/// </summary>
public class CreateModerationResponseResultsInnerCategoryAppliedInputTypes 
{
    public List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HateEnum> Hate { get; set; }
    public List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HateThreateningEnum> HateThreatening { get; set; }
    public List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HarassmentEnum> Harassment { get; set; }
    public List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HarassmentThreateningEnum> HarassmentThreatening { get; set; }
    public List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.IllicitEnum> Illicit { get; set; }
    public List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.IllicitViolentEnum> IllicitViolent { get; set; }
    public List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmEnum> SelfHarm { get; set; }
    public List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmIntentEnum> SelfHarmIntent { get; set; }
    public List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmInstructionsEnum> SelfHarmInstructions { get; set; }
    public List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SexualEnum> Sexual { get; set; }
    public List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SexualMinorsEnum> SexualMinors { get; set; }
    public List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.ViolenceEnum> Violence { get; set; }
    public List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes.ViolenceGraphicEnum> ViolenceGraphic { get; set; }
}


