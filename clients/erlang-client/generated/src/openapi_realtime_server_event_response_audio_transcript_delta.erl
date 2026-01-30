-module(openapi_realtime_server_event_response_audio_transcript_delta).

-export([encode/1]).

-export_type([openapi_realtime_server_event_response_audio_transcript_delta/0]).

-type openapi_realtime_server_event_response_audio_transcript_delta() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'response_id' := binary(),
       'item_id' := binary(),
       'output_index' := integer(),
       'content_index' := integer(),
       'delta' := binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'response_id' := ResponseId,
          'item_id' := ItemId,
          'output_index' := OutputIndex,
          'content_index' := ContentIndex,
          'delta' := Delta
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'response_id' => ResponseId,
       'item_id' => ItemId,
       'output_index' => OutputIndex,
       'content_index' => ContentIndex,
       'delta' => Delta
     }.
