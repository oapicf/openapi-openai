-module(openapi_create_moderation_request).

-include("openapi.hrl").

-export([openapi_create_moderation_request/0]).

-export([openapi_create_moderation_request/1]).

-export_type([openapi_create_moderation_request/0]).

-type openapi_create_moderation_request() ::
  [ {'input', openapi_create_moderation_request_input:openapi_create_moderation_request_input() }
  | {'model', openapi_create_moderation_request_model:openapi_create_moderation_request_model() }
  ].


openapi_create_moderation_request() ->
    openapi_create_moderation_request([]).

openapi_create_moderation_request(Fields) ->
  Default = [ {'input', openapi_create_moderation_request_input:openapi_create_moderation_request_input() }
            , {'model', openapi_create_moderation_request_model:openapi_create_moderation_request_model() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

