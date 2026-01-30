-module(openapi_vector_stores_api).

-export([cancel_vector_store_file_batch/3, cancel_vector_store_file_batch/4,
         create_vector_store/2, create_vector_store/3,
         create_vector_store_file/3, create_vector_store_file/4,
         create_vector_store_file_batch/3, create_vector_store_file_batch/4,
         delete_vector_store/2, delete_vector_store/3,
         delete_vector_store_file/3, delete_vector_store_file/4,
         get_vector_store/2, get_vector_store/3,
         get_vector_store_file/3, get_vector_store_file/4,
         get_vector_store_file_batch/3, get_vector_store_file_batch/4,
         list_files_in_vector_store_batch/3, list_files_in_vector_store_batch/4,
         list_vector_store_files/2, list_vector_store_files/3,
         list_vector_stores/1, list_vector_stores/2,
         modify_vector_store/3, modify_vector_store/4]).

-define(BASE_URL, <<"/v1">>).

%% @doc Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
%% 
-spec cancel_vector_store_file_batch(ctx:ctx(), binary(), binary()) -> {ok, openapi_vector_store_file_batch_object:openapi_vector_store_file_batch_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_vector_store_file_batch(Ctx, VectorStoreId, BatchId) ->
    cancel_vector_store_file_batch(Ctx, VectorStoreId, BatchId, #{}).

-spec cancel_vector_store_file_batch(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_vector_store_file_batch_object:openapi_vector_store_file_batch_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_vector_store_file_batch(Ctx, VectorStoreId, BatchId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vector_stores/", VectorStoreId, "/file_batches/", BatchId, "/cancel"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a vector store.
%% 
-spec create_vector_store(ctx:ctx(), openapi_create_vector_store_request:openapi_create_vector_store_request()) -> {ok, openapi_vector_store_object:openapi_vector_store_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_vector_store(Ctx, OpenapiCreateVectorStoreRequest) ->
    create_vector_store(Ctx, OpenapiCreateVectorStoreRequest, #{}).

-spec create_vector_store(ctx:ctx(), openapi_create_vector_store_request:openapi_create_vector_store_request(), maps:map()) -> {ok, openapi_vector_store_object:openapi_vector_store_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_vector_store(Ctx, OpenapiCreateVectorStoreRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vector_stores"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateVectorStoreRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
%% 
-spec create_vector_store_file(ctx:ctx(), binary(), openapi_create_vector_store_file_request:openapi_create_vector_store_file_request()) -> {ok, openapi_vector_store_file_object:openapi_vector_store_file_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_vector_store_file(Ctx, VectorStoreId, OpenapiCreateVectorStoreFileRequest) ->
    create_vector_store_file(Ctx, VectorStoreId, OpenapiCreateVectorStoreFileRequest, #{}).

-spec create_vector_store_file(ctx:ctx(), binary(), openapi_create_vector_store_file_request:openapi_create_vector_store_file_request(), maps:map()) -> {ok, openapi_vector_store_file_object:openapi_vector_store_file_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_vector_store_file(Ctx, VectorStoreId, OpenapiCreateVectorStoreFileRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vector_stores/", VectorStoreId, "/files"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateVectorStoreFileRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a vector store file batch.
%% 
-spec create_vector_store_file_batch(ctx:ctx(), binary(), openapi_create_vector_store_file_batch_request:openapi_create_vector_store_file_batch_request()) -> {ok, openapi_vector_store_file_batch_object:openapi_vector_store_file_batch_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_vector_store_file_batch(Ctx, VectorStoreId, OpenapiCreateVectorStoreFileBatchRequest) ->
    create_vector_store_file_batch(Ctx, VectorStoreId, OpenapiCreateVectorStoreFileBatchRequest, #{}).

-spec create_vector_store_file_batch(ctx:ctx(), binary(), openapi_create_vector_store_file_batch_request:openapi_create_vector_store_file_batch_request(), maps:map()) -> {ok, openapi_vector_store_file_batch_object:openapi_vector_store_file_batch_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_vector_store_file_batch(Ctx, VectorStoreId, OpenapiCreateVectorStoreFileBatchRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vector_stores/", VectorStoreId, "/file_batches"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateVectorStoreFileBatchRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete a vector store.
%% 
-spec delete_vector_store(ctx:ctx(), binary()) -> {ok, openapi_delete_vector_store_response:openapi_delete_vector_store_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_vector_store(Ctx, VectorStoreId) ->
    delete_vector_store(Ctx, VectorStoreId, #{}).

-spec delete_vector_store(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_delete_vector_store_response:openapi_delete_vector_store_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_vector_store(Ctx, VectorStoreId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/vector_stores/", VectorStoreId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
%% 
-spec delete_vector_store_file(ctx:ctx(), binary(), binary()) -> {ok, openapi_delete_vector_store_file_response:openapi_delete_vector_store_file_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_vector_store_file(Ctx, VectorStoreId, FileId) ->
    delete_vector_store_file(Ctx, VectorStoreId, FileId, #{}).

-spec delete_vector_store_file(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_delete_vector_store_file_response:openapi_delete_vector_store_file_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_vector_store_file(Ctx, VectorStoreId, FileId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/vector_stores/", VectorStoreId, "/files/", FileId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a vector store.
%% 
-spec get_vector_store(ctx:ctx(), binary()) -> {ok, openapi_vector_store_object:openapi_vector_store_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vector_store(Ctx, VectorStoreId) ->
    get_vector_store(Ctx, VectorStoreId, #{}).

-spec get_vector_store(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_vector_store_object:openapi_vector_store_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vector_store(Ctx, VectorStoreId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vector_stores/", VectorStoreId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a vector store file.
%% 
-spec get_vector_store_file(ctx:ctx(), binary(), binary()) -> {ok, openapi_vector_store_file_object:openapi_vector_store_file_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vector_store_file(Ctx, VectorStoreId, FileId) ->
    get_vector_store_file(Ctx, VectorStoreId, FileId, #{}).

-spec get_vector_store_file(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_vector_store_file_object:openapi_vector_store_file_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vector_store_file(Ctx, VectorStoreId, FileId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vector_stores/", VectorStoreId, "/files/", FileId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a vector store file batch.
%% 
-spec get_vector_store_file_batch(ctx:ctx(), binary(), binary()) -> {ok, openapi_vector_store_file_batch_object:openapi_vector_store_file_batch_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vector_store_file_batch(Ctx, VectorStoreId, BatchId) ->
    get_vector_store_file_batch(Ctx, VectorStoreId, BatchId, #{}).

-spec get_vector_store_file_batch(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_vector_store_file_batch_object:openapi_vector_store_file_batch_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vector_store_file_batch(Ctx, VectorStoreId, BatchId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vector_stores/", VectorStoreId, "/file_batches/", BatchId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of vector store files in a batch.
%% 
-spec list_files_in_vector_store_batch(ctx:ctx(), binary(), binary()) -> {ok, openapi_list_vector_store_files_response:openapi_list_vector_store_files_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_files_in_vector_store_batch(Ctx, VectorStoreId, BatchId) ->
    list_files_in_vector_store_batch(Ctx, VectorStoreId, BatchId, #{}).

-spec list_files_in_vector_store_batch(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_list_vector_store_files_response:openapi_list_vector_store_files_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_files_in_vector_store_batch(Ctx, VectorStoreId, BatchId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vector_stores/", VectorStoreId, "/file_batches/", BatchId, "/files"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'order', 'after', 'before', 'filter'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of vector store files.
%% 
-spec list_vector_store_files(ctx:ctx(), binary()) -> {ok, openapi_list_vector_store_files_response:openapi_list_vector_store_files_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_vector_store_files(Ctx, VectorStoreId) ->
    list_vector_store_files(Ctx, VectorStoreId, #{}).

-spec list_vector_store_files(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_list_vector_store_files_response:openapi_list_vector_store_files_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_vector_store_files(Ctx, VectorStoreId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vector_stores/", VectorStoreId, "/files"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'order', 'after', 'before', 'filter'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of vector stores.
%% 
-spec list_vector_stores(ctx:ctx()) -> {ok, openapi_list_vector_stores_response:openapi_list_vector_stores_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_vector_stores(Ctx) ->
    list_vector_stores(Ctx, #{}).

-spec list_vector_stores(ctx:ctx(), maps:map()) -> {ok, openapi_list_vector_stores_response:openapi_list_vector_stores_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_vector_stores(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vector_stores"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'order', 'after', 'before'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Modifies a vector store.
%% 
-spec modify_vector_store(ctx:ctx(), binary(), openapi_update_vector_store_request:openapi_update_vector_store_request()) -> {ok, openapi_vector_store_object:openapi_vector_store_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_vector_store(Ctx, VectorStoreId, OpenapiUpdateVectorStoreRequest) ->
    modify_vector_store(Ctx, VectorStoreId, OpenapiUpdateVectorStoreRequest, #{}).

-spec modify_vector_store(ctx:ctx(), binary(), openapi_update_vector_store_request:openapi_update_vector_store_request(), maps:map()) -> {ok, openapi_vector_store_object:openapi_vector_store_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_vector_store(Ctx, VectorStoreId, OpenapiUpdateVectorStoreRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vector_stores/", VectorStoreId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiUpdateVectorStoreRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


