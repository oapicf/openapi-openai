-module(openapi_realtime_client_event_response_create).

-export([encode/1]).

-export_type([openapi_realtime_client_event_response_create/0]).

-type openapi_realtime_client_event_response_create() ::
    #{ 'event_id' => binary(),
       'type' := binary(),
       'response' => openapi_realtime_response_create_params:openapi_realtime_response_create_params()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'response' := Response
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'response' => Response
     }.
