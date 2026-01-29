-module(openapi_models_api).

-export([delete_model/2, delete_model/3,
         list_models/1, list_models/2,
         retrieve_model/2, retrieve_model/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
%% 
-spec delete_model(ctx:ctx(), binary()) -> {ok, openapi_delete_model_response:openapi_delete_model_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_model(Ctx, Model) ->
    delete_model(Ctx, Model, #{}).

-spec delete_model(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_delete_model_response:openapi_delete_model_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_model(Ctx, Model, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/models/", Model, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Lists the currently available models, and provides basic information about each one such as the owner and availability.
%% 
-spec list_models(ctx:ctx()) -> {ok, openapi_list_models_response:openapi_list_models_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_models(Ctx) ->
    list_models(Ctx, #{}).

-spec list_models(ctx:ctx(), maps:map()) -> {ok, openapi_list_models_response:openapi_list_models_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_models(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/models"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
%% 
-spec retrieve_model(ctx:ctx(), binary()) -> {ok, openapi_model:openapi_model(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_model(Ctx, Model) ->
    retrieve_model(Ctx, Model, #{}).

-spec retrieve_model(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_model:openapi_model(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
retrieve_model(Ctx, Model, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/models/", Model, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


