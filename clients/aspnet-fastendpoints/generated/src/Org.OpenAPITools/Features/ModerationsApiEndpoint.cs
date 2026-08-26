using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
/// </summary>

public class CreateModerationEndpoint : FastEndpoints.Endpoint<CreateModerationRequest, CreateModerationResponse>
{
    public override void Configure()
    {
        Post("/v1/moderations");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Moderations");
        });

        Summary(s => {
            s.Summary = "Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). ";
            s.RequestParam(r => r.createModerationRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateModerationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

