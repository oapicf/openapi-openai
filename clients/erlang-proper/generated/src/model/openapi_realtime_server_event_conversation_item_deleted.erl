-module(openapi_realtime_server_event_conversation_item_deleted).

-include("openapi.hrl").

-export([openapi_realtime_server_event_conversation_item_deleted/0]).

-export([openapi_realtime_server_event_conversation_item_deleted/1]).

-export_type([openapi_realtime_server_event_conversation_item_deleted/0]).

-type openapi_realtime_server_event_conversation_item_deleted() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'item_id', binary() }
  ].


openapi_realtime_server_event_conversation_item_deleted() ->
    openapi_realtime_server_event_conversation_item_deleted([]).

openapi_realtime_server_event_conversation_item_deleted(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"conversation.item.deleted">>]) }
            , {'item_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

