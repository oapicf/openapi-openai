using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
/// </summary>

public class CreateRealtimeSessionEndpoint : FastEndpoints.Endpoint<CreateRealtimeSessionRequest, RealtimeSessionCreateResponse>
{
    public override void Configure()
    {
        Post("/v1/realtime/sessions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Realtime");
        });

        Summary(s => {
            s.Summary = "Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. ";
            s.RequestParam(r => r.realtimeSessionCreateRequest, "Create an ephemeral API key with the given session configuration.");
            s.Responses[200] = "Session created successfully.";
        });
    }

    public override async Task HandleAsync(CreateRealtimeSessionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

