namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ProjectUserListResponse 
{
    public string Object { get; set; }
    public List<ProjectUser> Data { get; set; }
    public string FirstId { get; set; }
    public string LastId { get; set; }
    public bool HasMore { get; set; }
}


