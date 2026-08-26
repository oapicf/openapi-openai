using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// List user actions and configuration changes within this organization.
/// </summary>

public class ListAuditLogsEndpoint : FastEndpoints.Endpoint<ListAuditLogsRequest, ListAuditLogsResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/audit_logs");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audit Logs");
        });

        Summary(s => {
            s.Summary = "List user actions and configuration changes within this organization.";
            s.RequestParam(r => r.EffectiveAt, "Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range.");
            s.RequestParam(r => r.ProjectIds, "Return only events for these projects.");
            s.RequestParam(r => r.EventTypes, "Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).");
            s.RequestParam(r => r.ActorIds, "Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.");
            s.RequestParam(r => r.ActorEmails, "Return only events performed by users with these emails.");
            s.RequestParam(r => r.ResourceIds, "Return only events performed on these targets. For example, a project ID updated.");
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.RequestParam(r => r.Before, "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ");
            s.Responses[200] = "Audit logs listed successfully.";
        });
    }

    public override async Task HandleAsync(ListAuditLogsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

