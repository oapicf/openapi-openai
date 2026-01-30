-module(openapi_realtime_response_create_params_max_response_output_tokens).

-include("openapi.hrl").

-export([openapi_realtime_response_create_params_max_response_output_tokens/0]).

-export([openapi_realtime_response_create_params_max_response_output_tokens/1]).

-export_type([openapi_realtime_response_create_params_max_response_output_tokens/0]).

-type openapi_realtime_response_create_params_max_response_output_tokens() ::
  [ 
  ].


openapi_realtime_response_create_params_max_response_output_tokens() ->
    openapi_realtime_response_create_params_max_response_output_tokens([]).

openapi_realtime_response_create_params_max_response_output_tokens(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

