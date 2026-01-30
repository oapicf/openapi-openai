-module(openapi_realtime_client_event_conversation_item_create).

-include("openapi.hrl").

-export([openapi_realtime_client_event_conversation_item_create/0]).

-export([openapi_realtime_client_event_conversation_item_create/1]).

-export_type([openapi_realtime_client_event_conversation_item_create/0]).

-type openapi_realtime_client_event_conversation_item_create() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'previous_item_id', binary() }
  | {'item', openapi_realtime_conversation_item:openapi_realtime_conversation_item() }
  ].


openapi_realtime_client_event_conversation_item_create() ->
    openapi_realtime_client_event_conversation_item_create([]).

openapi_realtime_client_event_conversation_item_create(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"conversation.item.create">>]) }
            , {'previous_item_id', binary() }
            , {'item', openapi_realtime_conversation_item:openapi_realtime_conversation_item() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

