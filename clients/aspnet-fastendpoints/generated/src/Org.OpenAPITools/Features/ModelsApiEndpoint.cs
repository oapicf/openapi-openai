using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
/// </summary>

public class DeleteModelEndpoint : FastEndpoints.Endpoint<DeleteModelRequest, DeleteModelResponse>
{
    public override void Configure()
    {
        Delete("/v1/models/{model}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Models");
        });

        Summary(s => {
            s.Summary = "Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.";
            s.RequestParam(r => r.Model, "The model to delete");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(DeleteModelRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Lists the currently available models, and provides basic information about each one such as the owner and availability.
/// </summary>

public class ListModelsEndpoint : FastEndpoints.EndpointWithoutRequest<ListModelsResponse>
{
    public override void Configure()
    {
        Get("/v1/models");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Models");
        });

        Summary(s => {
            s.Summary = "Lists the currently available models, and provides basic information about each one such as the owner and availability.";
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
/// </summary>

public class RetrieveModelEndpoint : FastEndpoints.Endpoint<RetrieveModelRequest, Model>
{
    public override void Configure()
    {
        Get("/v1/models/{model}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Models");
        });

        Summary(s => {
            s.Summary = "Retrieves a model instance, providing basic information about the model such as the owner and permissioning.";
            s.RequestParam(r => r.Model, "The ID of the model to use for this request");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(RetrieveModelRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

