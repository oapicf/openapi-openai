-module(openapi_realtime_server_event_response_function_call_arguments_delta).

-include("openapi.hrl").

-export([openapi_realtime_server_event_response_function_call_arguments_delta/0]).

-export([openapi_realtime_server_event_response_function_call_arguments_delta/1]).

-export_type([openapi_realtime_server_event_response_function_call_arguments_delta/0]).

-type openapi_realtime_server_event_response_function_call_arguments_delta() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'response_id', binary() }
  | {'item_id', binary() }
  | {'output_index', integer() }
  | {'call_id', binary() }
  | {'delta', binary() }
  ].


openapi_realtime_server_event_response_function_call_arguments_delta() ->
    openapi_realtime_server_event_response_function_call_arguments_delta([]).

openapi_realtime_server_event_response_function_call_arguments_delta(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"response.function_call_arguments.delta">>]) }
            , {'response_id', binary() }
            , {'item_id', binary() }
            , {'output_index', integer() }
            , {'call_id', binary() }
            , {'delta', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

