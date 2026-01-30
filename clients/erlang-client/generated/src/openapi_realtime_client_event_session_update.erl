-module(openapi_realtime_client_event_session_update).

-export([encode/1]).

-export_type([openapi_realtime_client_event_session_update/0]).

-type openapi_realtime_client_event_session_update() ::
    #{ 'event_id' => binary(),
       'type' := binary(),
       'session' := openapi_realtime_session_create_request:openapi_realtime_session_create_request()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'session' := Session
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'session' => Session
     }.
