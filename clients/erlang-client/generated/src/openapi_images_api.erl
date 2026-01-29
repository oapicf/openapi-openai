-module(openapi_images_api).

-export([create_image/2, create_image/3,
         create_image_edit/3, create_image_edit/4,
         create_image_variation/2, create_image_variation/3]).

-define(BASE_URL, <<"/v1">>).

%% @doc Creates an image given a prompt.
%% 
-spec create_image(ctx:ctx(), openapi_create_image_request:openapi_create_image_request()) -> {ok, openapi_images_response:openapi_images_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_image(Ctx, OpenapiCreateImageRequest) ->
    create_image(Ctx, OpenapiCreateImageRequest, #{}).

-spec create_image(ctx:ctx(), openapi_create_image_request:openapi_create_image_request(), maps:map()) -> {ok, openapi_images_response:openapi_images_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_image(Ctx, OpenapiCreateImageRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/images/generations"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateImageRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates an edited or extended image given an original image and a prompt.
%% 
-spec create_image_edit(ctx:ctx(), binary(), binary()) -> {ok, openapi_images_response:openapi_images_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_image_edit(Ctx, Image, Prompt) ->
    create_image_edit(Ctx, Image, Prompt, #{}).

-spec create_image_edit(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_images_response:openapi_images_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_image_edit(Ctx, Image, Prompt, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/images/edits"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"image">>, Image}, {<<"prompt">>, Prompt}]++openapi_utils:optional_params(['mask', 'model', 'n', 'size', 'response_format', 'user'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Creates a variation of a given image.
%% 
-spec create_image_variation(ctx:ctx(), binary()) -> {ok, openapi_images_response:openapi_images_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_image_variation(Ctx, Image) ->
    create_image_variation(Ctx, Image, #{}).

-spec create_image_variation(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_images_response:openapi_images_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_image_variation(Ctx, Image, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/images/variations"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"image">>, Image}]++openapi_utils:optional_params(['model', 'n', 'response_format', 'size', 'user'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


