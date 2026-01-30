-module(openapi_api).

-export([ cancel_vector_store_file_batch/2
        , create_vector_store/1
        , create_vector_store_file/2
        , create_vector_store_file_batch/2
        , delete_vector_store/1
        , delete_vector_store_file/2
        , get_vector_store/1
        , get_vector_store_file/2
        , get_vector_store_file_batch/2
        , list_files_in_vector_store_batch/2
        , list_vector_store_files/1
        , list_vector_stores/0
        , modify_vector_store/2
        ]).

-define(BASE_URL, "/v1").

%% @doc Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
%% 
-spec cancel_vector_store_file_batch(binary(), binary()) ->
  openapi_utils:response().
cancel_vector_store_file_batch(VectorStoreId, BatchId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vector_stores/", VectorStoreId, "/file_batches/", BatchId, "/cancel"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Create a vector store.
%% 
-spec create_vector_store(openapi_create_vector_store_request:openapi_create_vector_store_request()) ->
  openapi_utils:response().
create_vector_store(OpenapiCreateVectorStoreRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vector_stores"],
  Body        = OpenapiCreateVectorStoreRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
%% 
-spec create_vector_store_file(binary(), openapi_create_vector_store_file_request:openapi_create_vector_store_file_request()) ->
  openapi_utils:response().
create_vector_store_file(VectorStoreId, OpenapiCreateVectorStoreFileRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vector_stores/", VectorStoreId, "/files"],
  Body        = OpenapiCreateVectorStoreFileRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Create a vector store file batch.
%% 
-spec create_vector_store_file_batch(binary(), openapi_create_vector_store_file_batch_request:openapi_create_vector_store_file_batch_request()) ->
  openapi_utils:response().
create_vector_store_file_batch(VectorStoreId, OpenapiCreateVectorStoreFileBatchRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vector_stores/", VectorStoreId, "/file_batches"],
  Body        = OpenapiCreateVectorStoreFileBatchRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete a vector store.
%% 
-spec delete_vector_store(binary()) ->
  openapi_utils:response().
delete_vector_store(VectorStoreId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vector_stores/", VectorStoreId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
%% 
-spec delete_vector_store_file(binary(), binary()) ->
  openapi_utils:response().
delete_vector_store_file(VectorStoreId, FileId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vector_stores/", VectorStoreId, "/files/", FileId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieves a vector store.
%% 
-spec get_vector_store(binary()) ->
  openapi_utils:response().
get_vector_store(VectorStoreId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vector_stores/", VectorStoreId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieves a vector store file.
%% 
-spec get_vector_store_file(binary(), binary()) ->
  openapi_utils:response().
get_vector_store_file(VectorStoreId, FileId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vector_stores/", VectorStoreId, "/files/", FileId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieves a vector store file batch.
%% 
-spec get_vector_store_file_batch(binary(), binary()) ->
  openapi_utils:response().
get_vector_store_file_batch(VectorStoreId, BatchId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vector_stores/", VectorStoreId, "/file_batches/", BatchId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Returns a list of vector store files in a batch.
%% 
-spec list_files_in_vector_store_batch(binary(), binary()) ->
  openapi_utils:response().
list_files_in_vector_store_batch(VectorStoreId, BatchId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vector_stores/", VectorStoreId, "/file_batches/", BatchId, "/files"],
  QueryString = [<<"limit=">>, Limit, <<"&">>, <<"order=">>, Order, <<"&">>, <<"after=">>, After, <<"&">>, <<"before=">>, Before, <<"&">>, <<"filter=">>, Filter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Returns a list of vector store files.
%% 
-spec list_vector_store_files(binary()) ->
  openapi_utils:response().
list_vector_store_files(VectorStoreId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vector_stores/", VectorStoreId, "/files"],
  QueryString = [<<"limit=">>, Limit, <<"&">>, <<"order=">>, Order, <<"&">>, <<"after=">>, After, <<"&">>, <<"before=">>, Before, <<"&">>, <<"filter=">>, Filter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Returns a list of vector stores.
%% 
-spec list_vector_stores() ->
  openapi_utils:response().
list_vector_stores() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vector_stores"],
  QueryString = [<<"limit=">>, Limit, <<"&">>, <<"order=">>, Order, <<"&">>, <<"after=">>, After, <<"&">>, <<"before=">>, Before, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Modifies a vector store.
%% 
-spec modify_vector_store(binary(), openapi_update_vector_store_request:openapi_update_vector_store_request()) ->
  openapi_utils:response().
modify_vector_store(VectorStoreId, OpenapiUpdateVectorStoreRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vector_stores/", VectorStoreId, ""],
  Body        = OpenapiUpdateVectorStoreRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

