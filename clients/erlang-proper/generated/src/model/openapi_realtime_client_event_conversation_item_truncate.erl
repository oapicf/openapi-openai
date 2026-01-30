-module(openapi_realtime_client_event_conversation_item_truncate).

-include("openapi.hrl").

-export([openapi_realtime_client_event_conversation_item_truncate/0]).

-export([openapi_realtime_client_event_conversation_item_truncate/1]).

-export_type([openapi_realtime_client_event_conversation_item_truncate/0]).

-type openapi_realtime_client_event_conversation_item_truncate() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'item_id', binary() }
  | {'content_index', integer() }
  | {'audio_end_ms', integer() }
  ].


openapi_realtime_client_event_conversation_item_truncate() ->
    openapi_realtime_client_event_conversation_item_truncate([]).

openapi_realtime_client_event_conversation_item_truncate(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"conversation.item.truncate">>]) }
            , {'item_id', binary() }
            , {'content_index', integer() }
            , {'audio_end_ms', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

