-module(openapi_fine_tuning_api).

-export([cancel_fine_tuning_job/2, cancel_fine_tuning_job/3,
         create_fine_tuning_job/2, create_fine_tuning_job/3,
         list_fine_tuning_events/2, list_fine_tuning_events/3,
         list_fine_tuning_job_checkpoints/2, list_fine_tuning_job_checkpoints/3,
         list_paginated_fine_tuning_jobs/1, list_paginated_fine_tuning_jobs/2,
         retrieve_fine_tuning_job/2, retrieve_fine_tuning_job/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Immediately cancel a fine-tune job. 
%% 
-spec cancel_fine_tuning_job(ctx:ctx(), binary()) -> {ok, openapi_fine_tuning_job:openapi_fine_tuning_job(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_fine_tuning_job(Ctx, FineTuningJobId) ->
    cancel_fine_tuning_job(Ctx, FineTuningJobId, #{}).

-spec cancel_fine_tuning_job(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_fine_tuning_job:openapi_fine_tuning_job(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_fine_tuning_job(Ctx, FineTuningJobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/fine_tuning/jobs/", FineTuningJobId, "/cancel"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
%% 
-spec create_fine_tuning_job(ctx:ctx(), openapi_create_fine_tuning_job_request:openapi_create_fine_tuning_job_request()) -> {ok, openapi_fine_tuning_job:openapi_fine_tuning_job(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_fine_tuning_job(Ctx, OpenapiCreateFineTuningJobRequest) ->
    create_fine_tuning_job(Ctx, OpenapiCreateFineTuningJobRequest, #{}).

-spec create_fine_tuning_job(ctx:ctx(), openapi_create_fine_tuning_job_request:openapi_create_fine_tuning_job_request(), maps:map()) -> {ok, openapi_fine_tuning_job:openapi_fine_tuning_job(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_fine_tuning_job(Ctx, OpenapiCreateFineTuningJobRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/fine_tuning/jobs"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateFineTuningJobRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get status updates for a fine-tuning job. 
%% 
-spec list_fine_tuning_events(ctx:ctx(), binary()) -> {ok, openapi_list_fine_tuning_job_events_response:openapi_list_fine_tuning_job_events_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_fine_tuning_events(Ctx, FineTuningJobId) ->
    list_fine_tuning_events(Ctx, FineTuningJobId, #{}).

-spec list_fine_tuning_events(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_list_fine_tuning_job_events_response:openapi_list_fine_tuning_job_events_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_fine_tuning_events(Ctx, FineTuningJobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/fine_tuning/jobs/", FineTuningJobId, "/events"],
    QS = lists:flatten([])++openapi_utils:optional_params(['after', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List checkpoints for a fine-tuning job. 
%% 
-spec list_fine_tuning_job_checkpoints(ctx:ctx(), binary()) -> {ok, openapi_list_fine_tuning_job_checkpoints_response:openapi_list_fine_tuning_job_checkpoints_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_fine_tuning_job_checkpoints(Ctx, FineTuningJobId) ->
    list_fine_tuning_job_checkpoints(Ctx, FineTuningJobId, #{}).

-spec list_fine_tuning_job_checkpoints(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_list_fine_tuning_job_checkpoints_response:openapi_list_fine_tuning_job_checkpoints_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_fine_tuning_job_checkpoints(Ctx, FineTuningJobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/fine_tuning/jobs/", FineTuningJobId, "/checkpoints"],
    QS = lists:flatten([])++openapi_utils:optional_params(['after', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List your organization's fine-tuning jobs 
%% 
-spec list_paginated_fine_tuning_jobs(ctx:ctx()) -> {ok, openapi_list_paginated_fine_tuning_jobs_response:openapi_list_paginated_fine_tuning_jobs_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_paginated_fine_tuning_jobs(Ctx) ->
    list_paginated_fine_tuning_jobs(Ctx, #{}).

-spec list_paginated_fine_tuning_jobs(ctx:ctx(), maps:map()) -> {ok, openapi_list_paginated_fine_tuning_jobs_response:openapi_list_paginated_fine_tuning_jobs_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_paginated_fine_tuning_jobs(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/fine_tuning/jobs"],
    QS = lists:flatten([])++openapi_utils:optional_params(['after', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
%% 
-spec retrieve_fine_tuning_job(ctx:ctx(), binary()) -> {ok, openapi_fine_tuning_job:openapi_fine_tuning_job(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_fine_tuning_job(Ctx, FineTuningJobId) ->
    retrieve_fine_tuning_job(Ctx, FineTuningJobId, #{}).

-spec retrieve_fine_tuning_job(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_fine_tuning_job:openapi_fine_tuning_job(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_fine_tuning_job(Ctx, FineTuningJobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/fine_tuning/jobs/", FineTuningJobId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


