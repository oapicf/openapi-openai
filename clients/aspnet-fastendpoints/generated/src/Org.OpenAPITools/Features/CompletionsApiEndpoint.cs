using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Creates a completion for the provided prompt and parameters.
/// </summary>

public class CreateCompletionEndpoint : FastEndpoints.Endpoint<CreateCompletionRequest, CreateCompletionResponse>
{
    public override void Configure()
    {
        Post("/v1/completions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Completions");
        });

        Summary(s => {
            s.Summary = "Creates a completion for the provided prompt and parameters.";
            s.RequestParam(r => r.createCompletionRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateCompletionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

