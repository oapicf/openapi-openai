
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CancelVectorStoreFileBatchRequest
{
    /// <summary>
    /// The ID of the vector store that the file batch belongs to.
    /// </summary>
    [FastEndpoints.BindFrom("vector_store_id")]
    public string VectorStoreId { get; set; }
    /// <summary>
    /// The ID of the file batch to cancel.
    /// </summary>
    [FastEndpoints.BindFrom("batch_id")]
    public string BatchId { get; set; }
}
public class CreateVectorStoreRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CreateVectorStoreRequest createVectorStoreRequest { get; set; }
}
public class CreateVectorStoreFileRequest
{
    /// <summary>
    /// The ID of the vector store for which to create a File. 
    /// </summary>
    [FastEndpoints.BindFrom("vector_store_id")]
    public string VectorStoreId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CreateVectorStoreFileRequest createVectorStoreFileRequest { get; set; }
}
public class CreateVectorStoreFileBatchRequest
{
    /// <summary>
    /// The ID of the vector store for which to create a File Batch. 
    /// </summary>
    [FastEndpoints.BindFrom("vector_store_id")]
    public string VectorStoreId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest { get; set; }
}
public class DeleteVectorStoreRequest
{
    /// <summary>
    /// The ID of the vector store to delete.
    /// </summary>
    [FastEndpoints.BindFrom("vector_store_id")]
    public string VectorStoreId { get; set; }
}
public class DeleteVectorStoreFileRequest
{
    /// <summary>
    /// The ID of the vector store that the file belongs to.
    /// </summary>
    [FastEndpoints.BindFrom("vector_store_id")]
    public string VectorStoreId { get; set; }
    /// <summary>
    /// The ID of the file to delete.
    /// </summary>
    [FastEndpoints.BindFrom("file_id")]
    public string FileId { get; set; }
}
public class GetVectorStoreRequest
{
    /// <summary>
    /// The ID of the vector store to retrieve.
    /// </summary>
    [FastEndpoints.BindFrom("vector_store_id")]
    public string VectorStoreId { get; set; }
}
public class GetVectorStoreFileRequest
{
    /// <summary>
    /// The ID of the vector store that the file belongs to.
    /// </summary>
    [FastEndpoints.BindFrom("vector_store_id")]
    public string VectorStoreId { get; set; }
    /// <summary>
    /// The ID of the file being retrieved.
    /// </summary>
    [FastEndpoints.BindFrom("file_id")]
    public string FileId { get; set; }
}
public class GetVectorStoreFileBatchRequest
{
    /// <summary>
    /// The ID of the vector store that the file batch belongs to.
    /// </summary>
    [FastEndpoints.BindFrom("vector_store_id")]
    public string VectorStoreId { get; set; }
    /// <summary>
    /// The ID of the file batch being retrieved.
    /// </summary>
    [FastEndpoints.BindFrom("batch_id")]
    public string BatchId { get; set; }
}
public class ListFilesInVectorStoreBatchRequest
{
    /// <summary>
    /// The ID of the vector store that the files belong to.
    /// </summary>
    [FastEndpoints.BindFrom("vector_store_id")]
    public string VectorStoreId { get; set; }
    /// <summary>
    /// The ID of the file batch that the files belong to.
    /// </summary>
    [FastEndpoints.BindFrom("batch_id")]
    public string BatchId { get; set; }
    /// <summary>
    /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
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
    /// <summary>
    /// A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("before")]
    public string? Before { get; set; }
    /// <summary>
    /// Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter")]
    public string? Filter { get; set; }
}
public class ListVectorStoreFilesRequest
{
    /// <summary>
    /// The ID of the vector store that the files belong to.
    /// </summary>
    [FastEndpoints.BindFrom("vector_store_id")]
    public string VectorStoreId { get; set; }
    /// <summary>
    /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
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
    /// <summary>
    /// A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("before")]
    public string? Before { get; set; }
    /// <summary>
    /// Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter")]
    public string? Filter { get; set; }
}
public class ListVectorStoresRequest
{
    /// <summary>
    /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
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
    /// <summary>
    /// A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("before")]
    public string? Before { get; set; }
}
public class ModifyVectorStoreRequest
{
    /// <summary>
    /// The ID of the vector store to modify.
    /// </summary>
    [FastEndpoints.BindFrom("vector_store_id")]
    public string VectorStoreId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public UpdateVectorStoreRequest updateVectorStoreRequest { get; set; }
}


