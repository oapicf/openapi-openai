-module(openapi_assistants_api).

-export([cancel_run/3, cancel_run/4,
         create_assistant/2, create_assistant/3,
         create_assistant_file/3, create_assistant_file/4,
         create_message/3, create_message/4,
         create_run/3, create_run/4,
         create_thread/2, create_thread/3,
         create_thread_and_run/2, create_thread_and_run/3,
         delete_assistant/2, delete_assistant/3,
         delete_assistant_file/3, delete_assistant_file/4,
         delete_thread/2, delete_thread/3,
         get_assistant/2, get_assistant/3,
         get_assistant_file/3, get_assistant_file/4,
         get_message/3, get_message/4,
         get_message_file/4, get_message_file/5,
         get_run/3, get_run/4,
         get_run_step/4, get_run_step/5,
         get_thread/2, get_thread/3,
         list_assistant_files/2, list_assistant_files/3,
         list_assistants/1, list_assistants/2,
         list_message_files/3, list_message_files/4,
         list_messages/2, list_messages/3,
         list_run_steps/3, list_run_steps/4,
         list_runs/2, list_runs/3,
         modify_assistant/3, modify_assistant/4,
         modify_message/4, modify_message/5,
         modify_run/4, modify_run/5,
         modify_thread/3, modify_thread/4,
         submit_tool_ouputs_to_run/4, submit_tool_ouputs_to_run/5]).

-define(BASE_URL, <<"/v1">>).

%% @doc Cancels a run that is `in_progress`.
%% 
-spec cancel_run(ctx:ctx(), binary(), binary()) -> {ok, openapi_run_object:openapi_run_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_run(Ctx, ThreadId, RunId) ->
    cancel_run(Ctx, ThreadId, RunId, #{}).

-spec cancel_run(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_run_object:openapi_run_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_run(Ctx, ThreadId, RunId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/threads/", ThreadId, "/runs/", RunId, "/cancel"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create an assistant with a model and instructions.
%% 
-spec create_assistant(ctx:ctx(), openapi_create_assistant_request:openapi_create_assistant_request()) -> {ok, openapi_assistant_object:openapi_assistant_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_assistant(Ctx, OpenapiCreateAssistantRequest) ->
    create_assistant(Ctx, OpenapiCreateAssistantRequest, #{}).

-spec create_assistant(ctx:ctx(), openapi_create_assistant_request:openapi_create_assistant_request(), maps:map()) -> {ok, openapi_assistant_object:openapi_assistant_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_assistant(Ctx, OpenapiCreateAssistantRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/assistants"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateAssistantRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
%% 
-spec create_assistant_file(ctx:ctx(), binary(), openapi_create_assistant_file_request:openapi_create_assistant_file_request()) -> {ok, openapi_assistant_file_object:openapi_assistant_file_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_assistant_file(Ctx, AssistantId, OpenapiCreateAssistantFileRequest) ->
    create_assistant_file(Ctx, AssistantId, OpenapiCreateAssistantFileRequest, #{}).

-spec create_assistant_file(ctx:ctx(), binary(), openapi_create_assistant_file_request:openapi_create_assistant_file_request(), maps:map()) -> {ok, openapi_assistant_file_object:openapi_assistant_file_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_assistant_file(Ctx, AssistantId, OpenapiCreateAssistantFileRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/assistants/", AssistantId, "/files"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateAssistantFileRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a message.
%% 
-spec create_message(ctx:ctx(), binary(), openapi_create_message_request:openapi_create_message_request()) -> {ok, openapi_message_object:openapi_message_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_message(Ctx, ThreadId, OpenapiCreateMessageRequest) ->
    create_message(Ctx, ThreadId, OpenapiCreateMessageRequest, #{}).

-spec create_message(ctx:ctx(), binary(), openapi_create_message_request:openapi_create_message_request(), maps:map()) -> {ok, openapi_message_object:openapi_message_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_message(Ctx, ThreadId, OpenapiCreateMessageRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/threads/", ThreadId, "/messages"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateMessageRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a run.
%% 
-spec create_run(ctx:ctx(), binary(), openapi_create_run_request:openapi_create_run_request()) -> {ok, openapi_run_object:openapi_run_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_run(Ctx, ThreadId, OpenapiCreateRunRequest) ->
    create_run(Ctx, ThreadId, OpenapiCreateRunRequest, #{}).

-spec create_run(ctx:ctx(), binary(), openapi_create_run_request:openapi_create_run_request(), maps:map()) -> {ok, openapi_run_object:openapi_run_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_run(Ctx, ThreadId, OpenapiCreateRunRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/threads/", ThreadId, "/runs"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateRunRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a thread.
%% 
-spec create_thread(ctx:ctx()) -> {ok, openapi_thread_object:openapi_thread_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_thread(Ctx) ->
    create_thread(Ctx, #{}).

-spec create_thread(ctx:ctx(), maps:map()) -> {ok, openapi_thread_object:openapi_thread_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_thread(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/threads"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateThreadRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a thread and run it in one request.
%% 
-spec create_thread_and_run(ctx:ctx(), openapi_create_thread_and_run_request:openapi_create_thread_and_run_request()) -> {ok, openapi_run_object:openapi_run_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_thread_and_run(Ctx, OpenapiCreateThreadAndRunRequest) ->
    create_thread_and_run(Ctx, OpenapiCreateThreadAndRunRequest, #{}).

-spec create_thread_and_run(ctx:ctx(), openapi_create_thread_and_run_request:openapi_create_thread_and_run_request(), maps:map()) -> {ok, openapi_run_object:openapi_run_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_thread_and_run(Ctx, OpenapiCreateThreadAndRunRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/threads/runs"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateThreadAndRunRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete an assistant.
%% 
-spec delete_assistant(ctx:ctx(), binary()) -> {ok, openapi_delete_assistant_response:openapi_delete_assistant_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_assistant(Ctx, AssistantId) ->
    delete_assistant(Ctx, AssistantId, #{}).

-spec delete_assistant(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_delete_assistant_response:openapi_delete_assistant_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_assistant(Ctx, AssistantId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/assistants/", AssistantId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete an assistant file.
%% 
-spec delete_assistant_file(ctx:ctx(), binary(), binary()) -> {ok, openapi_delete_assistant_file_response:openapi_delete_assistant_file_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_assistant_file(Ctx, AssistantId, FileId) ->
    delete_assistant_file(Ctx, AssistantId, FileId, #{}).

-spec delete_assistant_file(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_delete_assistant_file_response:openapi_delete_assistant_file_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_assistant_file(Ctx, AssistantId, FileId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/assistants/", AssistantId, "/files/", FileId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete a thread.
%% 
-spec delete_thread(ctx:ctx(), binary()) -> {ok, openapi_delete_thread_response:openapi_delete_thread_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_thread(Ctx, ThreadId) ->
    delete_thread(Ctx, ThreadId, #{}).

-spec delete_thread(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_delete_thread_response:openapi_delete_thread_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_thread(Ctx, ThreadId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/threads/", ThreadId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves an assistant.
%% 
-spec get_assistant(ctx:ctx(), binary()) -> {ok, openapi_assistant_object:openapi_assistant_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_assistant(Ctx, AssistantId) ->
    get_assistant(Ctx, AssistantId, #{}).

-spec get_assistant(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_assistant_object:openapi_assistant_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_assistant(Ctx, AssistantId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/assistants/", AssistantId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves an AssistantFile.
%% 
-spec get_assistant_file(ctx:ctx(), binary(), binary()) -> {ok, openapi_assistant_file_object:openapi_assistant_file_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_assistant_file(Ctx, AssistantId, FileId) ->
    get_assistant_file(Ctx, AssistantId, FileId, #{}).

-spec get_assistant_file(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_assistant_file_object:openapi_assistant_file_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_assistant_file(Ctx, AssistantId, FileId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/assistants/", AssistantId, "/files/", FileId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve a message.
%% 
-spec get_message(ctx:ctx(), binary(), binary()) -> {ok, openapi_message_object:openapi_message_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_message(Ctx, ThreadId, MessageId) ->
    get_message(Ctx, ThreadId, MessageId, #{}).

-spec get_message(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_message_object:openapi_message_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_message(Ctx, ThreadId, MessageId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/threads/", ThreadId, "/messages/", MessageId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a message file.
%% 
-spec get_message_file(ctx:ctx(), binary(), binary(), binary()) -> {ok, openapi_message_file_object:openapi_message_file_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_message_file(Ctx, ThreadId, MessageId, FileId) ->
    get_message_file(Ctx, ThreadId, MessageId, FileId, #{}).

-spec get_message_file(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_message_file_object:openapi_message_file_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_message_file(Ctx, ThreadId, MessageId, FileId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/threads/", ThreadId, "/messages/", MessageId, "/files/", FileId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a run.
%% 
-spec get_run(ctx:ctx(), binary(), binary()) -> {ok, openapi_run_object:openapi_run_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_run(Ctx, ThreadId, RunId) ->
    get_run(Ctx, ThreadId, RunId, #{}).

-spec get_run(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_run_object:openapi_run_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_run(Ctx, ThreadId, RunId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/threads/", ThreadId, "/runs/", RunId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a run step.
%% 
-spec get_run_step(ctx:ctx(), binary(), binary(), binary()) -> {ok, openapi_run_step_object:openapi_run_step_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_run_step(Ctx, ThreadId, RunId, StepId) ->
    get_run_step(Ctx, ThreadId, RunId, StepId, #{}).

-spec get_run_step(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_run_step_object:openapi_run_step_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_run_step(Ctx, ThreadId, RunId, StepId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/threads/", ThreadId, "/runs/", RunId, "/steps/", StepId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a thread.
%% 
-spec get_thread(ctx:ctx(), binary()) -> {ok, openapi_thread_object:openapi_thread_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_thread(Ctx, ThreadId) ->
    get_thread(Ctx, ThreadId, #{}).

-spec get_thread(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_thread_object:openapi_thread_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_thread(Ctx, ThreadId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/threads/", ThreadId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of assistant files.
%% 
-spec list_assistant_files(ctx:ctx(), binary()) -> {ok, openapi_list_assistant_files_response:openapi_list_assistant_files_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_assistant_files(Ctx, AssistantId) ->
    list_assistant_files(Ctx, AssistantId, #{}).

-spec list_assistant_files(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_list_assistant_files_response:openapi_list_assistant_files_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_assistant_files(Ctx, AssistantId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/assistants/", AssistantId, "/files"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'order', 'after', 'before'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of assistants.
%% 
-spec list_assistants(ctx:ctx()) -> {ok, openapi_list_assistants_response:openapi_list_assistants_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_assistants(Ctx) ->
    list_assistants(Ctx, #{}).

-spec list_assistants(ctx:ctx(), maps:map()) -> {ok, openapi_list_assistants_response:openapi_list_assistants_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_assistants(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/assistants"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'order', 'after', 'before'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of message files.
%% 
-spec list_message_files(ctx:ctx(), binary(), binary()) -> {ok, openapi_list_message_files_response:openapi_list_message_files_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_message_files(Ctx, ThreadId, MessageId) ->
    list_message_files(Ctx, ThreadId, MessageId, #{}).

-spec list_message_files(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_list_message_files_response:openapi_list_message_files_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_message_files(Ctx, ThreadId, MessageId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/threads/", ThreadId, "/messages/", MessageId, "/files"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'order', 'after', 'before'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of messages for a given thread.
%% 
-spec list_messages(ctx:ctx(), binary()) -> {ok, openapi_list_messages_response:openapi_list_messages_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_messages(Ctx, ThreadId) ->
    list_messages(Ctx, ThreadId, #{}).

-spec list_messages(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_list_messages_response:openapi_list_messages_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_messages(Ctx, ThreadId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/threads/", ThreadId, "/messages"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'order', 'after', 'before', 'run_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of run steps belonging to a run.
%% 
-spec list_run_steps(ctx:ctx(), binary(), binary()) -> {ok, openapi_list_run_steps_response:openapi_list_run_steps_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_run_steps(Ctx, ThreadId, RunId) ->
    list_run_steps(Ctx, ThreadId, RunId, #{}).

-spec list_run_steps(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_list_run_steps_response:openapi_list_run_steps_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_run_steps(Ctx, ThreadId, RunId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/threads/", ThreadId, "/runs/", RunId, "/steps"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'order', 'after', 'before'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Returns a list of runs belonging to a thread.
%% 
-spec list_runs(ctx:ctx(), binary()) -> {ok, openapi_list_runs_response:openapi_list_runs_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_runs(Ctx, ThreadId) ->
    list_runs(Ctx, ThreadId, #{}).

-spec list_runs(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_list_runs_response:openapi_list_runs_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_runs(Ctx, ThreadId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/threads/", ThreadId, "/runs"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'order', 'after', 'before'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Modifies an assistant.
%% 
-spec modify_assistant(ctx:ctx(), binary(), openapi_modify_assistant_request:openapi_modify_assistant_request()) -> {ok, openapi_assistant_object:openapi_assistant_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_assistant(Ctx, AssistantId, OpenapiModifyAssistantRequest) ->
    modify_assistant(Ctx, AssistantId, OpenapiModifyAssistantRequest, #{}).

-spec modify_assistant(ctx:ctx(), binary(), openapi_modify_assistant_request:openapi_modify_assistant_request(), maps:map()) -> {ok, openapi_assistant_object:openapi_assistant_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_assistant(Ctx, AssistantId, OpenapiModifyAssistantRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/assistants/", AssistantId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiModifyAssistantRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Modifies a message.
%% 
-spec modify_message(ctx:ctx(), binary(), binary(), openapi_modify_message_request:openapi_modify_message_request()) -> {ok, openapi_message_object:openapi_message_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_message(Ctx, ThreadId, MessageId, OpenapiModifyMessageRequest) ->
    modify_message(Ctx, ThreadId, MessageId, OpenapiModifyMessageRequest, #{}).

-spec modify_message(ctx:ctx(), binary(), binary(), openapi_modify_message_request:openapi_modify_message_request(), maps:map()) -> {ok, openapi_message_object:openapi_message_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_message(Ctx, ThreadId, MessageId, OpenapiModifyMessageRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/threads/", ThreadId, "/messages/", MessageId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiModifyMessageRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Modifies a run.
%% 
-spec modify_run(ctx:ctx(), binary(), binary(), openapi_modify_run_request:openapi_modify_run_request()) -> {ok, openapi_run_object:openapi_run_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_run(Ctx, ThreadId, RunId, OpenapiModifyRunRequest) ->
    modify_run(Ctx, ThreadId, RunId, OpenapiModifyRunRequest, #{}).

-spec modify_run(ctx:ctx(), binary(), binary(), openapi_modify_run_request:openapi_modify_run_request(), maps:map()) -> {ok, openapi_run_object:openapi_run_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_run(Ctx, ThreadId, RunId, OpenapiModifyRunRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/threads/", ThreadId, "/runs/", RunId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiModifyRunRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Modifies a thread.
%% 
-spec modify_thread(ctx:ctx(), binary(), openapi_modify_thread_request:openapi_modify_thread_request()) -> {ok, openapi_thread_object:openapi_thread_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_thread(Ctx, ThreadId, OpenapiModifyThreadRequest) ->
    modify_thread(Ctx, ThreadId, OpenapiModifyThreadRequest, #{}).

-spec modify_thread(ctx:ctx(), binary(), openapi_modify_thread_request:openapi_modify_thread_request(), maps:map()) -> {ok, openapi_thread_object:openapi_thread_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_thread(Ctx, ThreadId, OpenapiModifyThreadRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/threads/", ThreadId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiModifyThreadRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
%% 
-spec submit_tool_ouputs_to_run(ctx:ctx(), binary(), binary(), openapi_submit_tool_outputs_run_request:openapi_submit_tool_outputs_run_request()) -> {ok, openapi_run_object:openapi_run_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
submit_tool_ouputs_to_run(Ctx, ThreadId, RunId, OpenapiSubmitToolOutputsRunRequest) ->
    submit_tool_ouputs_to_run(Ctx, ThreadId, RunId, OpenapiSubmitToolOutputsRunRequest, #{}).

-spec submit_tool_ouputs_to_run(ctx:ctx(), binary(), binary(), openapi_submit_tool_outputs_run_request:openapi_submit_tool_outputs_run_request(), maps:map()) -> {ok, openapi_run_object:openapi_run_object(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
submit_tool_ouputs_to_run(Ctx, ThreadId, RunId, OpenapiSubmitToolOutputsRunRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/threads/", ThreadId, "/runs/", RunId, "/submit_tool_outputs"],
    QS = [],
    Headers = [],
    Body1 = OpenapiSubmitToolOutputsRunRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


