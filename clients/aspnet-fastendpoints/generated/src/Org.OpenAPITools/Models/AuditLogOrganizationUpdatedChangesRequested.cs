namespace Org.OpenAPITools.Models;


/// <summary>
/// The payload used to update the organization settings.
/// </summary>
public class AuditLogOrganizationUpdatedChangesRequested 
{
    public string Title { get; set; }
    public string Description { get; set; }
    public string Name { get; set; }
    public AuditLogOrganizationUpdatedChangesRequestedSettings Settings { get; set; }
}


