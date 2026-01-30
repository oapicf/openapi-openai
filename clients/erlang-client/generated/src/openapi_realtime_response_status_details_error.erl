-module(openapi_realtime_response_status_details_error).

-export([encode/1]).

-export_type([openapi_realtime_response_status_details_error/0]).

-type openapi_realtime_response_status_details_error() ::
    #{ 'type' => binary(),
       'code' => binary()
     }.

encode(#{ 'type' := Type,
          'code' := Code
        }) ->
    #{ 'type' => Type,
       'code' => Code
     }.
