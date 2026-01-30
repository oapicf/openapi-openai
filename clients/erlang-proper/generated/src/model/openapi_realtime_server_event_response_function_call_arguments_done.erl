-module(openapi_realtime_server_event_response_function_call_arguments_done).

-include("openapi.hrl").

-export([openapi_realtime_server_event_response_function_call_arguments_done/0]).

-export([openapi_realtime_server_event_response_function_call_arguments_done/1]).

-export_type([openapi_realtime_server_event_response_function_call_arguments_done/0]).

-type openapi_realtime_server_event_response_function_call_arguments_done() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'response_id', binary() }
  | {'item_id', binary() }
  | {'output_index', integer() }
  | {'call_id', binary() }
  | {'arguments', binary() }
  ].


openapi_realtime_server_event_response_function_call_arguments_done() ->
    openapi_realtime_server_event_response_function_call_arguments_done([]).

openapi_realtime_server_event_response_function_call_arguments_done(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"response.function_call_arguments.done">>]) }
            , {'response_id', binary() }
            , {'item_id', binary() }
            , {'output_index', integer() }
            , {'call_id', binary() }
            , {'arguments', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

