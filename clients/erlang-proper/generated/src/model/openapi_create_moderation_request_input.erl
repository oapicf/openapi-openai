-module(openapi_create_moderation_request_input).

-include("openapi.hrl").

-export([openapi_create_moderation_request_input/0]).

-export([openapi_create_moderation_request_input/1]).

-export_type([openapi_create_moderation_request_input/0]).

-type openapi_create_moderation_request_input() ::
  [ 
  ].


openapi_create_moderation_request_input() ->
    openapi_create_moderation_request_input([]).

openapi_create_moderation_request_input(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

