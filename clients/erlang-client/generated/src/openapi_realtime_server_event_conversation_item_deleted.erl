-module(openapi_realtime_server_event_conversation_item_deleted).

-export([encode/1]).

-export_type([openapi_realtime_server_event_conversation_item_deleted/0]).

-type openapi_realtime_server_event_conversation_item_deleted() ::
    #{ 'event_id' := binary(),
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
