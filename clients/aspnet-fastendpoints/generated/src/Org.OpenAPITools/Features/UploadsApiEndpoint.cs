using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
/// </summary>

public class AddUploadPartEndpoint : FastEndpoints.Endpoint<AddUploadPartRequest, UploadPart>
{
    public override void Configure()
    {
        Post("/v1/uploads/{upload_id}/parts");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Uploads");
        });

        Summary(s => {
            s.Summary = "Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). ";
            s.RequestParam(r => r.UploadId, "The ID of the Upload. ");
            s.RequestParam(r => r.Data, "The chunk of bytes for this Part. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(AddUploadPartRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Cancels the Upload. No Parts may be added after an Upload is cancelled. 
/// </summary>

public class CancelUploadEndpoint : FastEndpoints.Endpoint<CancelUploadRequest, Upload>
{
    public override void Configure()
    {
        Post("/v1/uploads/{upload_id}/cancel");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Uploads");
        });

        Summary(s => {
            s.Summary = "Cancels the Upload. No Parts may be added after an Upload is cancelled. ";
            s.RequestParam(r => r.UploadId, "The ID of the Upload. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CancelUploadRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
/// </summary>

public class CompleteUploadEndpoint : FastEndpoints.Endpoint<CompleteUploadRequest, Upload>
{
    public override void Configure()
    {
        Post("/v1/uploads/{upload_id}/complete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Uploads");
        });

        Summary(s => {
            s.Summary = "Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. ";
            s.RequestParam(r => r.UploadId, "The ID of the Upload. ");
            s.RequestParam(r => r.completeUploadRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CompleteUploadRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
/// </summary>

public class CreateUploadEndpoint : FastEndpoints.Endpoint<CreateUploadRequest, Upload>
{
    public override void Configure()
    {
        Post("/v1/uploads");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Uploads");
        });

        Summary(s => {
            s.Summary = "Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). ";
            s.RequestParam(r => r.createUploadRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateUploadRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

