-module(openapi_realtime_server_event_response_done).

-export([encode/1]).

-export_type([openapi_realtime_server_event_response_done/0]).

-type openapi_realtime_server_event_response_done() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'response' := openapi_realtime_response:openapi_realtime_response()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'response' := Response
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'response' => Response
     }.
