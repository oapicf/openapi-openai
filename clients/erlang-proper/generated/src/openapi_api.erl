-module(openapi_api).

-export([ create_moderation/1
        ]).

-define(BASE_URL, "/v1").

%% @doc Classifies if text is potentially harmful.
%% 
-spec create_moderation(openapi_create_moderation_request:openapi_create_moderation_request()) ->
  openapi_utils:response().
create_moderation(OpenapiCreateModerationRequest) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/moderations"],
  Body        = OpenapiCreateModerationRequest,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

