-module(openapi_realtime_server_event_response_output_item_done).

-include("openapi.hrl").

-export([openapi_realtime_server_event_response_output_item_done/0]).

-export([openapi_realtime_server_event_response_output_item_done/1]).

-export_type([openapi_realtime_server_event_response_output_item_done/0]).

-type openapi_realtime_server_event_response_output_item_done() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'response_id', binary() }
  | {'output_index', integer() }
  | {'item', openapi_realtime_conversation_item:openapi_realtime_conversation_item() }
  ].


openapi_realtime_server_event_response_output_item_done() ->
    openapi_realtime_server_event_response_output_item_done([]).

openapi_realtime_server_event_response_output_item_done(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"response.output_item.done">>]) }
            , {'response_id', binary() }
            , {'output_index', integer() }
            , {'item', openapi_realtime_conversation_item:openapi_realtime_conversation_item() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

