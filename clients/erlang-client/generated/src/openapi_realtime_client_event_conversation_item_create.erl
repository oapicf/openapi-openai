-module(openapi_realtime_client_event_conversation_item_create).

-export([encode/1]).

-export_type([openapi_realtime_client_event_conversation_item_create/0]).

-type openapi_realtime_client_event_conversation_item_create() ::
    #{ 'event_id' => binary(),
       'type' := binary(),
       'previous_item_id' => binary(),
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
