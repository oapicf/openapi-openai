-module(openapi_realtime_server_event_input_audio_buffer_committed).

-export([encode/1]).

-export_type([openapi_realtime_server_event_input_audio_buffer_committed/0]).

-type openapi_realtime_server_event_input_audio_buffer_committed() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'previous_item_id' := binary(),
       'item_id' := binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'previous_item_id' := PreviousItemId,
          'item_id' := ItemId
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'previous_item_id' => PreviousItemId,
       'item_id' => ItemId
     }.
