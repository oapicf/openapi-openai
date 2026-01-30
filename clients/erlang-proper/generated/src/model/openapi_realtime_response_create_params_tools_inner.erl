-module(openapi_realtime_response_create_params_tools_inner).

-include("openapi.hrl").

-export([openapi_realtime_response_create_params_tools_inner/0]).

-export([openapi_realtime_response_create_params_tools_inner/1]).

-export_type([openapi_realtime_response_create_params_tools_inner/0]).

-type openapi_realtime_response_create_params_tools_inner() ::
  [ {'type', binary() }
  | {'name', binary() }
  | {'description', binary() }
  | {'parameters', map() }
  ].


openapi_realtime_response_create_params_tools_inner() ->
    openapi_realtime_response_create_params_tools_inner([]).

openapi_realtime_response_create_params_tools_inner(Fields) ->
  Default = [ {'type', elements([<<"function">>]) }
            , {'name', binary() }
            , {'description', binary() }
            , {'parameters', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

