-module(openapi_realtime_client_event_conversation_item_truncate).

-export([encode/1]).

-export_type([openapi_realtime_client_event_conversation_item_truncate/0]).

-type openapi_realtime_client_event_conversation_item_truncate() ::
    #{ 'event_id' => binary(),
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
