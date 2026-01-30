-module(openapi_realtime_server_event_conversation_item_created).

-export([encode/1]).

-export_type([openapi_realtime_server_event_conversation_item_created/0]).

-type openapi_realtime_server_event_conversation_item_created() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'previous_item_id' := binary(),
       'item' := openapi_realtime_conversation_item:openapi_realtime_conversation_item()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'previous_item_id' := PreviousItemId,
          'item' := Item
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'previous_item_id' => PreviousItemId,
       'item' => Item
     }.
