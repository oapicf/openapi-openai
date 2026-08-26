using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
/// </summary>

public class CancelVectorStoreFileBatchEndpoint : FastEndpoints.Endpoint<CancelVectorStoreFileBatchRequest, VectorStoreFileBatchObject>
{
    public override void Configure()
    {
        Post("/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vector stores");
        });

        Summary(s => {
            s.Summary = "Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.";
            s.RequestParam(r => r.VectorStoreId, "The ID of the vector store that the file batch belongs to.");
            s.RequestParam(r => r.BatchId, "The ID of the file batch to cancel.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CancelVectorStoreFileBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create a vector store.
/// </summary>

public class CreateVectorStoreEndpoint : FastEndpoints.Endpoint<CreateVectorStoreRequest, VectorStoreObject>
{
    public override void Configure()
    {
        Post("/v1/vector_stores");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vector stores");
        });

        Summary(s => {
            s.Summary = "Create a vector store.";
            s.RequestParam(r => r.createVectorStoreRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateVectorStoreRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
/// </summary>

public class CreateVectorStoreFileEndpoint : FastEndpoints.Endpoint<CreateVectorStoreFileRequest, VectorStoreFileObject>
{
    public override void Configure()
    {
        Post("/v1/vector_stores/{vector_store_id}/files");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vector stores");
        });

        Summary(s => {
            s.Summary = "Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).";
            s.RequestParam(r => r.VectorStoreId, "The ID of the vector store for which to create a File. ");
            s.RequestParam(r => r.createVectorStoreFileRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateVectorStoreFileRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create a vector store file batch.
/// </summary>

public class CreateVectorStoreFileBatchEndpoint : FastEndpoints.Endpoint<CreateVectorStoreFileBatchRequest, VectorStoreFileBatchObject>
{
    public override void Configure()
    {
        Post("/v1/vector_stores/{vector_store_id}/file_batches");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vector stores");
        });

        Summary(s => {
            s.Summary = "Create a vector store file batch.";
            s.RequestParam(r => r.VectorStoreId, "The ID of the vector store for which to create a File Batch. ");
            s.RequestParam(r => r.createVectorStoreFileBatchRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateVectorStoreFileBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete a vector store.
/// </summary>

public class DeleteVectorStoreEndpoint : FastEndpoints.Endpoint<DeleteVectorStoreRequest, DeleteVectorStoreResponse>
{
    public override void Configure()
    {
        Delete("/v1/vector_stores/{vector_store_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vector stores");
        });

        Summary(s => {
            s.Summary = "Delete a vector store.";
            s.RequestParam(r => r.VectorStoreId, "The ID of the vector store to delete.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(DeleteVectorStoreRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
/// </summary>

public class DeleteVectorStoreFileEndpoint : FastEndpoints.Endpoint<DeleteVectorStoreFileRequest, DeleteVectorStoreFileResponse>
{
    public override void Configure()
    {
        Delete("/v1/vector_stores/{vector_store_id}/files/{file_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vector stores");
        });

        Summary(s => {
            s.Summary = "Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.";
            s.RequestParam(r => r.VectorStoreId, "The ID of the vector store that the file belongs to.");
            s.RequestParam(r => r.FileId, "The ID of the file to delete.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(DeleteVectorStoreFileRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves a vector store.
/// </summary>

public class GetVectorStoreEndpoint : FastEndpoints.Endpoint<GetVectorStoreRequest, VectorStoreObject>
{
    public override void Configure()
    {
        Get("/v1/vector_stores/{vector_store_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vector stores");
        });

        Summary(s => {
            s.Summary = "Retrieves a vector store.";
            s.RequestParam(r => r.VectorStoreId, "The ID of the vector store to retrieve.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(GetVectorStoreRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves a vector store file.
/// </summary>

public class GetVectorStoreFileEndpoint : FastEndpoints.Endpoint<GetVectorStoreFileRequest, VectorStoreFileObject>
{
    public override void Configure()
    {
        Get("/v1/vector_stores/{vector_store_id}/files/{file_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vector stores");
        });

        Summary(s => {
            s.Summary = "Retrieves a vector store file.";
            s.RequestParam(r => r.VectorStoreId, "The ID of the vector store that the file belongs to.");
            s.RequestParam(r => r.FileId, "The ID of the file being retrieved.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(GetVectorStoreFileRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves a vector store file batch.
/// </summary>

public class GetVectorStoreFileBatchEndpoint : FastEndpoints.Endpoint<GetVectorStoreFileBatchRequest, VectorStoreFileBatchObject>
{
    public override void Configure()
    {
        Get("/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vector stores");
        });

        Summary(s => {
            s.Summary = "Retrieves a vector store file batch.";
            s.RequestParam(r => r.VectorStoreId, "The ID of the vector store that the file batch belongs to.");
            s.RequestParam(r => r.BatchId, "The ID of the file batch being retrieved.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(GetVectorStoreFileBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns a list of vector store files in a batch.
/// </summary>

public class ListFilesInVectorStoreBatchEndpoint : FastEndpoints.Endpoint<ListFilesInVectorStoreBatchRequest, ListVectorStoreFilesResponse>
{
    public override void Configure()
    {
        Get("/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/files");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vector stores");
        });

        Summary(s => {
            s.Summary = "Returns a list of vector store files in a batch.";
            s.RequestParam(r => r.VectorStoreId, "The ID of the vector store that the files belong to.");
            s.RequestParam(r => r.BatchId, "The ID of the file batch that the files belong to.");
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.Order, "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.RequestParam(r => r.Before, "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ");
            s.RequestParam(r => r.Filter, "Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ListFilesInVectorStoreBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns a list of vector store files.
/// </summary>

public class ListVectorStoreFilesEndpoint : FastEndpoints.Endpoint<ListVectorStoreFilesRequest, ListVectorStoreFilesResponse>
{
    public override void Configure()
    {
        Get("/v1/vector_stores/{vector_store_id}/files");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vector stores");
        });

        Summary(s => {
            s.Summary = "Returns a list of vector store files.";
            s.RequestParam(r => r.VectorStoreId, "The ID of the vector store that the files belong to.");
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.Order, "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.RequestParam(r => r.Before, "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ");
            s.RequestParam(r => r.Filter, "Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ListVectorStoreFilesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns a list of vector stores.
/// </summary>

public class ListVectorStoresEndpoint : FastEndpoints.Endpoint<ListVectorStoresRequest, ListVectorStoresResponse>
{
    public override void Configure()
    {
        Get("/v1/vector_stores");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vector stores");
        });

        Summary(s => {
            s.Summary = "Returns a list of vector stores.";
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.Order, "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.RequestParam(r => r.Before, "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ListVectorStoresRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Modifies a vector store.
/// </summary>

public class ModifyVectorStoreEndpoint : FastEndpoints.Endpoint<ModifyVectorStoreRequest, VectorStoreObject>
{
    public override void Configure()
    {
        Post("/v1/vector_stores/{vector_store_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vector stores");
        });

        Summary(s => {
            s.Summary = "Modifies a vector store.";
            s.RequestParam(r => r.VectorStoreId, "The ID of the vector store to modify.");
            s.RequestParam(r => r.updateVectorStoreRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ModifyVectorStoreRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

