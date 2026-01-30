-module(openapi_realtime_server_event_session_updated).

-export([encode/1]).

-export_type([openapi_realtime_server_event_session_updated/0]).

-type openapi_realtime_server_event_session_updated() ::
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
