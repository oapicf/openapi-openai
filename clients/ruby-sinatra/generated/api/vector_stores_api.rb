require 'json'


MyApp.add_route('POST', '/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel', {
  "resourcePath" => "/VectorStores",
  "summary" => "Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.",
  "nickname" => "cancel_vector_store_file_batch",
  "responseClass" => "VectorStoreFileBatchObject",
  "endpoint" => "/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel",
  "notes" => "",
  "parameters" => [
    {
      "name" => "vector_store_id",
      "description" => "The ID of the vector store that the file batch belongs to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "batch_id",
      "description" => "The ID of the file batch to cancel.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/vector_stores', {
  "resourcePath" => "/VectorStores",
  "summary" => "Create a vector store.",
  "nickname" => "create_vector_store",
  "responseClass" => "VectorStoreObject",
  "endpoint" => "/vector_stores",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateVectorStoreRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/vector_stores/{vector_store_id}/files', {
  "resourcePath" => "/VectorStores",
  "summary" => "Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).",
  "nickname" => "create_vector_store_file",
  "responseClass" => "VectorStoreFileObject",
  "endpoint" => "/vector_stores/{vector_store_id}/files",
  "notes" => "",
  "parameters" => [
    {
      "name" => "vector_store_id",
      "description" => "The ID of the vector store for which to create a File. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateVectorStoreFileRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/vector_stores/{vector_store_id}/file_batches', {
  "resourcePath" => "/VectorStores",
  "summary" => "Create a vector store file batch.",
  "nickname" => "create_vector_store_file_batch",
  "responseClass" => "VectorStoreFileBatchObject",
  "endpoint" => "/vector_stores/{vector_store_id}/file_batches",
  "notes" => "",
  "parameters" => [
    {
      "name" => "vector_store_id",
      "description" => "The ID of the vector store for which to create a File Batch. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateVectorStoreFileBatchRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/vector_stores/{vector_store_id}', {
  "resourcePath" => "/VectorStores",
  "summary" => "Delete a vector store.",
  "nickname" => "delete_vector_store",
  "responseClass" => "DeleteVectorStoreResponse",
  "endpoint" => "/vector_stores/{vector_store_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "vector_store_id",
      "description" => "The ID of the vector store to delete.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/vector_stores/{vector_store_id}/files/{file_id}', {
  "resourcePath" => "/VectorStores",
  "summary" => "Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.",
  "nickname" => "delete_vector_store_file",
  "responseClass" => "DeleteVectorStoreFileResponse",
  "endpoint" => "/vector_stores/{vector_store_id}/files/{file_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "vector_store_id",
      "description" => "The ID of the vector store that the file belongs to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "file_id",
      "description" => "The ID of the file to delete.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/vector_stores/{vector_store_id}', {
  "resourcePath" => "/VectorStores",
  "summary" => "Retrieves a vector store.",
  "nickname" => "get_vector_store",
  "responseClass" => "VectorStoreObject",
  "endpoint" => "/vector_stores/{vector_store_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "vector_store_id",
      "description" => "The ID of the vector store to retrieve.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/vector_stores/{vector_store_id}/files/{file_id}', {
  "resourcePath" => "/VectorStores",
  "summary" => "Retrieves a vector store file.",
  "nickname" => "get_vector_store_file",
  "responseClass" => "VectorStoreFileObject",
  "endpoint" => "/vector_stores/{vector_store_id}/files/{file_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "vector_store_id",
      "description" => "The ID of the vector store that the file belongs to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "file_id",
      "description" => "The ID of the file being retrieved.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}', {
  "resourcePath" => "/VectorStores",
  "summary" => "Retrieves a vector store file batch.",
  "nickname" => "get_vector_store_file_batch",
  "responseClass" => "VectorStoreFileBatchObject",
  "endpoint" => "/vector_stores/{vector_store_id}/file_batches/{batch_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "vector_store_id",
      "description" => "The ID of the vector store that the file batch belongs to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "batch_id",
      "description" => "The ID of the file batch being retrieved.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/files', {
  "resourcePath" => "/VectorStores",
  "summary" => "Returns a list of vector store files in a batch.",
  "nickname" => "list_files_in_vector_store_batch",
  "responseClass" => "ListVectorStoreFilesResponse",
  "endpoint" => "/vector_stores/{vector_store_id}/file_batches/{batch_id}/files",
  "notes" => "",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ",
      "dataType" => "String",
      "allowableValues" => "[asc, desc]",
      "defaultValue" => "'desc'",
      "paramType" => "query",
    },
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "before",
      "description" => "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter",
      "description" => "Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.",
      "dataType" => "String",
      "allowableValues" => "[in_progress, completed, failed, cancelled]",
      "paramType" => "query",
    },
    {
      "name" => "vector_store_id",
      "description" => "The ID of the vector store that the files belong to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "batch_id",
      "description" => "The ID of the file batch that the files belong to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/vector_stores/{vector_store_id}/files', {
  "resourcePath" => "/VectorStores",
  "summary" => "Returns a list of vector store files.",
  "nickname" => "list_vector_store_files",
  "responseClass" => "ListVectorStoreFilesResponse",
  "endpoint" => "/vector_stores/{vector_store_id}/files",
  "notes" => "",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ",
      "dataType" => "String",
      "allowableValues" => "[asc, desc]",
      "defaultValue" => "'desc'",
      "paramType" => "query",
    },
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "before",
      "description" => "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter",
      "description" => "Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.",
      "dataType" => "String",
      "allowableValues" => "[in_progress, completed, failed, cancelled]",
      "paramType" => "query",
    },
    {
      "name" => "vector_store_id",
      "description" => "The ID of the vector store that the files belong to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/vector_stores', {
  "resourcePath" => "/VectorStores",
  "summary" => "Returns a list of vector stores.",
  "nickname" => "list_vector_stores",
  "responseClass" => "ListVectorStoresResponse",
  "endpoint" => "/vector_stores",
  "notes" => "",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ",
      "dataType" => "String",
      "allowableValues" => "[asc, desc]",
      "defaultValue" => "'desc'",
      "paramType" => "query",
    },
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "before",
      "description" => "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/vector_stores/{vector_store_id}', {
  "resourcePath" => "/VectorStores",
  "summary" => "Modifies a vector store.",
  "nickname" => "modify_vector_store",
  "responseClass" => "VectorStoreObject",
  "endpoint" => "/vector_stores/{vector_store_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "vector_store_id",
      "description" => "The ID of the vector store to modify.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "UpdateVectorStoreRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

