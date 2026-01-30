-module(openapi_realtime_server_event_conversation_item_truncated).

-include("openapi.hrl").

-export([openapi_realtime_server_event_conversation_item_truncated/0]).

-export([openapi_realtime_server_event_conversation_item_truncated/1]).

-export_type([openapi_realtime_server_event_conversation_item_truncated/0]).

-type openapi_realtime_server_event_conversation_item_truncated() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'item_id', binary() }
  | {'content_index', integer() }
  | {'audio_end_ms', integer() }
  ].


openapi_realtime_server_event_conversation_item_truncated() ->
    openapi_realtime_server_event_conversation_item_truncated([]).

openapi_realtime_server_event_conversation_item_truncated(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"conversation.item.truncated">>]) }
            , {'item_id', binary() }
            , {'content_index', integer() }
            , {'audio_end_ms', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

