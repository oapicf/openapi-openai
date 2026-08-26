
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateFileRequest
{
    /// <summary>
    /// The File object (not file name) to be uploaded. 
    /// </summary>
    [FastEndpoints.BindFrom("file")]
    public System.IO.Stream File { get; set; }
    /// <summary>
    /// The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning). 
    /// </summary>
    [FastEndpoints.BindFrom("purpose")]
    public string Purpose { get; set; }
}
public class DeleteFileRequest
{
    /// <summary>
    /// The ID of the file to use for this request.
    /// </summary>
    [FastEndpoints.BindFrom("file_id")]
    public string FileId { get; set; }
}
public class DownloadFileRequest
{
    /// <summary>
    /// The ID of the file to use for this request.
    /// </summary>
    [FastEndpoints.BindFrom("file_id")]
    public string FileId { get; set; }
}
public class ListFilesRequest
{
    /// <summary>
    /// Only return files with the given purpose.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purpose")]
    public string? Purpose { get; set; }
    /// <summary>
    /// A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("order")]
    public string? Order { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("after")]
    public string? After { get; set; }
}
public class RetrieveFileRequest
{
    /// <summary>
    /// The ID of the file to use for this request.
    /// </summary>
    [FastEndpoints.BindFrom("file_id")]
    public string FileId { get; set; }
}


