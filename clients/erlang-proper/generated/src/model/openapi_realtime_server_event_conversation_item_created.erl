-module(openapi_realtime_server_event_conversation_item_created).

-include("openapi.hrl").

-export([openapi_realtime_server_event_conversation_item_created/0]).

-export([openapi_realtime_server_event_conversation_item_created/1]).

-export_type([openapi_realtime_server_event_conversation_item_created/0]).

-type openapi_realtime_server_event_conversation_item_created() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'previous_item_id', binary() }
  | {'item', openapi_realtime_conversation_item:openapi_realtime_conversation_item() }
  ].


openapi_realtime_server_event_conversation_item_created() ->
    openapi_realtime_server_event_conversation_item_created([]).

openapi_realtime_server_event_conversation_item_created(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"conversation.item.created">>]) }
            , {'previous_item_id', binary() }
            , {'item', openapi_realtime_conversation_item:openapi_realtime_conversation_item() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

