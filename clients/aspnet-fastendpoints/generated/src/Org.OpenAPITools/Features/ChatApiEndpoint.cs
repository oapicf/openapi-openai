using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
/// </summary>

public class CreateChatCompletionEndpoint : FastEndpoints.Endpoint<CreateChatCompletionRequest, CreateChatCompletionResponse>
{
    public override void Configure()
    {
        Post("/v1/chat/completions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Chat");
        });

        Summary(s => {
            s.Summary = "Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). ";
            s.RequestParam(r => r.createChatCompletionRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateChatCompletionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

