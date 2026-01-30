-module(openapi_realtime_server_event_response_output_item_done).

-export([encode/1]).

-export_type([openapi_realtime_server_event_response_output_item_done/0]).

-type openapi_realtime_server_event_response_output_item_done() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'response_id' := binary(),
       'output_index' := integer(),
       'item' := openapi_realtime_conversation_item:openapi_realtime_conversation_item()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'response_id' := ResponseId,
          'output_index' := OutputIndex,
          'item' := Item
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'response_id' => ResponseId,
       'output_index' => OutputIndex,
       'item' => Item
     }.
