using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Creates an embedding vector representing the input text.
/// </summary>

public class CreateEmbeddingEndpoint : FastEndpoints.Endpoint<CreateEmbeddingRequest, CreateEmbeddingResponse>
{
    public override void Configure()
    {
        Post("/v1/embeddings");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Embeddings");
        });

        Summary(s => {
            s.Summary = "Creates an embedding vector representing the input text.";
            s.RequestParam(r => r.createEmbeddingRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateEmbeddingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

