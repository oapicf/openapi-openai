namespace Org.OpenAPITools.Models;


/// <summary>
/// A list of the categories along with their scores as predicted by model.
/// </summary>
public class CreateModerationResponseResultsInnerCategoryScores 
{
    public decimal Hate { get; set; }
    public decimal HateThreatening { get; set; }
    public decimal Harassment { get; set; }
    public decimal HarassmentThreatening { get; set; }
    public decimal Illicit { get; set; }
    public decimal IllicitViolent { get; set; }
    public decimal SelfHarm { get; set; }
    public decimal SelfHarmIntent { get; set; }
    public decimal SelfHarmInstructions { get; set; }
    public decimal Sexual { get; set; }
    public decimal SexualMinors { get; set; }
    public decimal Violence { get; set; }
    public decimal ViolenceGraphic { get; set; }
}


