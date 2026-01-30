-module(openapi_realtime_response_create_params_conversation).

-include("openapi.hrl").

-export([openapi_realtime_response_create_params_conversation/0]).

-export([openapi_realtime_response_create_params_conversation/1]).

-export_type([openapi_realtime_response_create_params_conversation/0]).

-type openapi_realtime_response_create_params_conversation() ::
  [ 
  ].


openapi_realtime_response_create_params_conversation() ->
    openapi_realtime_response_create_params_conversation([]).

openapi_realtime_response_create_params_conversation(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

