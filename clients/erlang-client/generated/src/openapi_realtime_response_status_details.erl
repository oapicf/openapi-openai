-module(openapi_realtime_response_status_details).

-export([encode/1]).

-export_type([openapi_realtime_response_status_details/0]).

-type openapi_realtime_response_status_details() ::
    #{ 'type' => binary(),
       'reason' => binary(),
       'error' => openapi_realtime_response_status_details_error:openapi_realtime_response_status_details_error()
     }.

encode(#{ 'type' := Type,
          'reason' := Reason,
          'error' := Error
        }) ->
    #{ 'type' => Type,
       'reason' => Reason,
       'error' => Error
     }.
