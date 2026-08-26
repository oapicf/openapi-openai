using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
/// </summary>

public class CreateFileEndpoint : FastEndpoints.Endpoint<CreateFileRequest, OpenAIFile>
{
    public override void Configure()
    {
        Post("/v1/files");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Files");
        });

        Summary(s => {
            s.Summary = "Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ";
            s.RequestParam(r => r.File, "The File object (not file name) to be uploaded. ");
            s.RequestParam(r => r.Purpose, "The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning). ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateFileRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete a file.
/// </summary>

public class DeleteFileEndpoint : FastEndpoints.Endpoint<DeleteFileRequest, DeleteFileResponse>
{
    public override void Configure()
    {
        Delete("/v1/files/{file_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Files");
        });

        Summary(s => {
            s.Summary = "Delete a file.";
            s.RequestParam(r => r.FileId, "The ID of the file to use for this request.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(DeleteFileRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns the contents of the specified file.
/// </summary>

public class DownloadFileEndpoint : FastEndpoints.Endpoint<DownloadFileRequest, string>
{
    public override void Configure()
    {
        Get("/v1/files/{file_id}/content");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Files");
        });

        Summary(s => {
            s.Summary = "Returns the contents of the specified file.";
            s.RequestParam(r => r.FileId, "The ID of the file to use for this request.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(DownloadFileRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns a list of files.
/// </summary>

public class ListFilesEndpoint : FastEndpoints.Endpoint<ListFilesRequest, ListFilesResponse>
{
    public override void Configure()
    {
        Get("/v1/files");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Files");
        });

        Summary(s => {
            s.Summary = "Returns a list of files.";
            s.RequestParam(r => r.Purpose, "Only return files with the given purpose.");
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. ");
            s.RequestParam(r => r.Order, "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ListFilesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns information about a specific file.
/// </summary>

public class RetrieveFileEndpoint : FastEndpoints.Endpoint<RetrieveFileRequest, OpenAIFile>
{
    public override void Configure()
    {
        Get("/v1/files/{file_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Files");
        });

        Summary(s => {
            s.Summary = "Returns information about a specific file.";
            s.RequestParam(r => r.FileId, "The ID of the file to use for this request.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(RetrieveFileRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

