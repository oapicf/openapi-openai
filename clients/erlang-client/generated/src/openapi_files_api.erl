-module(openapi_files_api).

-export([create_file/3, create_file/4,
         delete_file/2, delete_file/3,
         download_file/2, download_file/3,
         list_files/1, list_files/2,
         retrieve_file/2, retrieve_file/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
%% 
-spec create_file(ctx:ctx(), binary(), binary()) -> {ok, openapi_open_ai_file:openapi_open_ai_file(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_file(Ctx, File, Purpose) ->
    create_file(Ctx, File, Purpose, #{}).

-spec create_file(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_open_ai_file:openapi_open_ai_file(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_file(Ctx, File, Purpose, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/files"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"file">>, File}, {<<"purpose">>, Purpose}]++openapi_utils:optional_params([], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete a file.
%% 
-spec delete_file(ctx:ctx(), binary()) -> {ok, openapi_delete_file_response:openapi_delete_file_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_file(Ctx, FileId) ->
    delete_file(Ctx, FileId, #{}).

-spec delete_file(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_delete_file_response:openapi_delete_file_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_file(Ctx, FileId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/files/", FileId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns the contents of the specified file.
%% 
-spec download_file(ctx:ctx(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
download_file(Ctx, FileId) ->
    download_file(Ctx, FileId, #{}).

-spec download_file(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
download_file(Ctx, FileId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/files/", FileId, "/content"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of files that belong to the user's organization.
%% 
-spec list_files(ctx:ctx()) -> {ok, openapi_list_files_response:openapi_list_files_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_files(Ctx) ->
    list_files(Ctx, #{}).

-spec list_files(ctx:ctx(), maps:map()) -> {ok, openapi_list_files_response:openapi_list_files_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_files(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/files"],
    QS = lists:flatten([])++openapi_utils:optional_params(['purpose'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns information about a specific file.
%% 
-spec retrieve_file(ctx:ctx(), binary()) -> {ok, openapi_open_ai_file:openapi_open_ai_file(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_file(Ctx, FileId) ->
    retrieve_file(Ctx, FileId, #{}).

-spec retrieve_file(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_open_ai_file:openapi_open_ai_file(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_file(Ctx, FileId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/files/", FileId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


