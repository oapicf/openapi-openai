-module(openapi_realtime_server_event_session_created).

-export([encode/1]).

-export_type([openapi_realtime_server_event_session_created/0]).

-type openapi_realtime_server_event_session_created() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'session' := openapi_realtime_session:openapi_realtime_session()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'session' := Session
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'session' => Session
     }.
