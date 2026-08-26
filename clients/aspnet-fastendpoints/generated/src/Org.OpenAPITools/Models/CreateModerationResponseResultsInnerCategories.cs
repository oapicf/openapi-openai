namespace Org.OpenAPITools.Models;


/// <summary>
/// A list of the categories, and whether they are flagged or not.
/// </summary>
public class CreateModerationResponseResultsInnerCategories 
{
    public bool Hate { get; set; }
    public bool HateThreatening { get; set; }
    public bool Harassment { get; set; }
    public bool HarassmentThreatening { get; set; }
    public bool Illicit { get; set; }
    public bool IllicitViolent { get; set; }
    public bool SelfHarm { get; set; }
    public bool SelfHarmIntent { get; set; }
    public bool SelfHarmInstructions { get; set; }
    public bool Sexual { get; set; }
    public bool SexualMinors { get; set; }
    public bool Violence { get; set; }
    public bool ViolenceGraphic { get; set; }
}


