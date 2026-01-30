-module(openapi_realtime_server_event_response_audio_done).

-export([encode/1]).

-export_type([openapi_realtime_server_event_response_audio_done/0]).

-type openapi_realtime_server_event_response_audio_done() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'response_id' := binary(),
       'item_id' := binary(),
       'output_index' := integer(),
       'content_index' := integer()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'response_id' := ResponseId,
          'item_id' := ItemId,
          'output_index' := OutputIndex,
          'content_index' := ContentIndex
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'response_id' => ResponseId,
       'item_id' => ItemId,
       'output_index' => OutputIndex,
       'content_index' => ContentIndex
     }.
