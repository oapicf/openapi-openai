namespace Org.OpenAPITools.Models;


/// <summary>
/// The session in which the audit logged action was performed.
/// </summary>
public class AuditLogActorSession 
{
    public AuditLogActorUser User { get; set; }
    public string IpAddress { get; set; }
}


