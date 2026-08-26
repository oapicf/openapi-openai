using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Delete an invite. If the invite has already been accepted, it cannot be deleted.
/// </summary>

public class DeleteInviteEndpoint : FastEndpoints.Endpoint<DeleteInviteRequest, InviteDeleteResponse>
{
    public override void Configure()
    {
        Delete("/v1/organization/invites/{invite_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invites");
        });

        Summary(s => {
            s.Summary = "Delete an invite. If the invite has already been accepted, it cannot be deleted.";
            s.RequestParam(r => r.InviteId, "The ID of the invite to delete.");
            s.Responses[200] = "Invite deleted successfully.";
        });
    }

    public override async Task HandleAsync(DeleteInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
/// </summary>

public class InviteUserEndpoint : FastEndpoints.Endpoint<InviteUserRequest, Invite>
{
    public override void Configure()
    {
        Post("/v1/organization/invites");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invites");
        });

        Summary(s => {
            s.Summary = "Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.";
            s.RequestParam(r => r.inviteRequest, "The invite request payload.");
            s.Responses[200] = "User invited successfully.";
        });
    }

    public override async Task HandleAsync(InviteUserRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns a list of invites in the organization.
/// </summary>

public class ListInvitesEndpoint : FastEndpoints.Endpoint<ListInvitesRequest, InviteListResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/invites");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invites");
        });

        Summary(s => {
            s.Summary = "Returns a list of invites in the organization.";
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.Responses[200] = "Invites listed successfully.";
        });
    }

    public override async Task HandleAsync(ListInvitesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves an invite.
/// </summary>

public class RetrieveInviteEndpoint : FastEndpoints.Endpoint<RetrieveInviteRequest, Invite>
{
    public override void Configure()
    {
        Get("/v1/organization/invites/{invite_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invites");
        });

        Summary(s => {
            s.Summary = "Retrieves an invite.";
            s.RequestParam(r => r.InviteId, "The ID of the invite to retrieve.");
            s.Responses[200] = "Invite retrieved successfully.";
        });
    }

    public override async Task HandleAsync(RetrieveInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

