-module(openapi_uploads_api).

-export([add_upload_part/3, add_upload_part/4,
         cancel_upload/2, cancel_upload/3,
         complete_upload/3, complete_upload/4,
         create_upload/2, create_upload/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
%% 
-spec add_upload_part(ctx:ctx(), binary(), binary()) -> {ok, openapi_upload_part:openapi_upload_part(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
add_upload_part(Ctx, UploadId, Data) ->
    add_upload_part(Ctx, UploadId, Data, #{}).

-spec add_upload_part(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_upload_part:openapi_upload_part(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
add_upload_part(Ctx, UploadId, Data, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/uploads/", UploadId, "/parts"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"data">>, Data}]++openapi_utils:optional_params([], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Cancels the Upload. No Parts may be added after an Upload is cancelled. 
%% 
-spec cancel_upload(ctx:ctx(), binary()) -> {ok, openapi_upload:openapi_upload(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_upload(Ctx, UploadId) ->
    cancel_upload(Ctx, UploadId, #{}).

-spec cancel_upload(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_upload:openapi_upload(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_upload(Ctx, UploadId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/uploads/", UploadId, "/cancel"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
%% 
-spec complete_upload(ctx:ctx(), binary(), openapi_complete_upload_request:openapi_complete_upload_request()) -> {ok, openapi_upload:openapi_upload(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
complete_upload(Ctx, UploadId, OpenapiCompleteUploadRequest) ->
    complete_upload(Ctx, UploadId, OpenapiCompleteUploadRequest, #{}).

-spec complete_upload(ctx:ctx(), binary(), openapi_complete_upload_request:openapi_complete_upload_request(), maps:map()) -> {ok, openapi_upload:openapi_upload(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
complete_upload(Ctx, UploadId, OpenapiCompleteUploadRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/uploads/", UploadId, "/complete"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCompleteUploadRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
%% 
-spec create_upload(ctx:ctx(), openapi_create_upload_request:openapi_create_upload_request()) -> {ok, openapi_upload:openapi_upload(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_upload(Ctx, OpenapiCreateUploadRequest) ->
    create_upload(Ctx, OpenapiCreateUploadRequest, #{}).

-spec create_upload(ctx:ctx(), openapi_create_upload_request:openapi_create_upload_request(), maps:map()) -> {ok, openapi_upload:openapi_upload(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_upload(Ctx, OpenapiCreateUploadRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/uploads"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateUploadRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


