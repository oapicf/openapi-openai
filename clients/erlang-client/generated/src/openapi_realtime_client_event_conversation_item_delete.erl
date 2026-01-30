-module(openapi_realtime_client_event_conversation_item_delete).

-export([encode/1]).

-export_type([openapi_realtime_client_event_conversation_item_delete/0]).

-type openapi_realtime_client_event_conversation_item_delete() ::
    #{ 'event_id' => binary(),
       'type' := binary(),
       'item_id' := binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'item_id' := ItemId
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'item_id' => ItemId
     }.
