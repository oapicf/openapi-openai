-module(openapi_realtime_client_event_conversation_item_delete).

-include("openapi.hrl").

-export([openapi_realtime_client_event_conversation_item_delete/0]).

-export([openapi_realtime_client_event_conversation_item_delete/1]).

-export_type([openapi_realtime_client_event_conversation_item_delete/0]).

-type openapi_realtime_client_event_conversation_item_delete() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'item_id', binary() }
  ].


openapi_realtime_client_event_conversation_item_delete() ->
    openapi_realtime_client_event_conversation_item_delete([]).

openapi_realtime_client_event_conversation_item_delete(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"conversation.item.delete">>]) }
            , {'item_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

