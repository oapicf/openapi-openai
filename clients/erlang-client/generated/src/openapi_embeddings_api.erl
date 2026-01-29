-module(openapi_embeddings_api).

-export([create_embedding/2, create_embedding/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Creates an embedding vector representing the input text.
%% 
-spec create_embedding(ctx:ctx(), openapi_create_embedding_request:openapi_create_embedding_request()) -> {ok, openapi_create_embedding_response:openapi_create_embedding_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_embedding(Ctx, OpenapiCreateEmbeddingRequest) ->
    create_embedding(Ctx, OpenapiCreateEmbeddingRequest, #{}).

-spec create_embedding(ctx:ctx(), openapi_create_embedding_request:openapi_create_embedding_request(), maps:map()) -> {ok, openapi_create_embedding_response:openapi_create_embedding_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_embedding(Ctx, OpenapiCreateEmbeddingRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/embeddings"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateEmbeddingRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


