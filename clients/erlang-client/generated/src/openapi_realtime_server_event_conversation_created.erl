-module(openapi_realtime_server_event_conversation_created).

-export([encode/1]).

-export_type([openapi_realtime_server_event_conversation_created/0]).

-type openapi_realtime_server_event_conversation_created() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'conversation' := openapi_realtime_server_event_conversation_created_conversation:openapi_realtime_server_event_conversation_created_conversation()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'conversation' := Conversation
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'conversation' => Conversation
     }.
