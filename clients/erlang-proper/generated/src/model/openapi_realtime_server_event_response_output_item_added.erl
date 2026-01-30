-module(openapi_realtime_server_event_response_output_item_added).

-include("openapi.hrl").

-export([openapi_realtime_server_event_response_output_item_added/0]).

-export([openapi_realtime_server_event_response_output_item_added/1]).

-export_type([openapi_realtime_server_event_response_output_item_added/0]).

-type openapi_realtime_server_event_response_output_item_added() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'response_id', binary() }
  | {'output_index', integer() }
  | {'item', openapi_realtime_conversation_item:openapi_realtime_conversation_item() }
  ].


openapi_realtime_server_event_response_output_item_added() ->
    openapi_realtime_server_event_response_output_item_added([]).

openapi_realtime_server_event_response_output_item_added(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"response.output_item.added">>]) }
            , {'response_id', binary() }
            , {'output_index', integer() }
            , {'item', openapi_realtime_conversation_item:openapi_realtime_conversation_item() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

