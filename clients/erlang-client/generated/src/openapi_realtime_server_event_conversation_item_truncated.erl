-module(openapi_realtime_server_event_conversation_item_truncated).

-export([encode/1]).

-export_type([openapi_realtime_server_event_conversation_item_truncated/0]).

-type openapi_realtime_server_event_conversation_item_truncated() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'item_id' := binary(),
       'content_index' := integer(),
       'audio_end_ms' := integer()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'item_id' := ItemId,
          'content_index' := ContentIndex,
          'audio_end_ms' := AudioEndMs
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'item_id' => ItemId,
       'content_index' => ContentIndex,
       'audio_end_ms' => AudioEndMs
     }.
