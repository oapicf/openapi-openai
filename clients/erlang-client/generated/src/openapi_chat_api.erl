-module(openapi_chat_api).

-export([create_chat_completion/2, create_chat_completion/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
%% 
-spec create_chat_completion(ctx:ctx(), openapi_create_chat_completion_request:openapi_create_chat_completion_request()) -> {ok, openapi_create_chat_completion_response:openapi_create_chat_completion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_chat_completion(Ctx, OpenapiCreateChatCompletionRequest) ->
    create_chat_completion(Ctx, OpenapiCreateChatCompletionRequest, #{}).

-spec create_chat_completion(ctx:ctx(), openapi_create_chat_completion_request:openapi_create_chat_completion_request(), maps:map()) -> {ok, openapi_create_chat_completion_response:openapi_create_chat_completion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_chat_completion(Ctx, OpenapiCreateChatCompletionRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/chat/completions"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateChatCompletionRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


