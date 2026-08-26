
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ListAuditLogsRequest
{
    /// <summary>
    /// Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("effective_at")]
    public ListAuditLogsEffectiveAtParameter? EffectiveAt { get; set; }
    /// <summary>
    /// Return only events for these projects.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("project_ids[]")]
    public List<string>? ProjectIds { get; set; }
    /// <summary>
    /// Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("event_types[]")]
    public List<AuditLogEventType>? EventTypes { get; set; }
    /// <summary>
    /// Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("actor_ids[]")]
    public List<string>? ActorIds { get; set; }
    /// <summary>
    /// Return only events performed by users with these emails.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("actor_emails[]")]
    public List<string>? ActorEmails { get; set; }
    /// <summary>
    /// Return only events performed on these targets. For example, a project ID updated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("resource_ids[]")]
    public List<string>? ResourceIds { get; set; }
    /// <summary>
    /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("after")]
    public string? After { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("before")]
    public string? Before { get; set; }
}


