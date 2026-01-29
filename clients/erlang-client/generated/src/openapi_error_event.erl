-module(openapi_error_event).

-export([encode/1]).

-export_type([openapi_error_event/0]).

-type openapi_error_event() ::
    #{ 'event' := binary(),
       'data' := openapi_error:openapi_error()
     }.

encode(#{ 'event' := Event,
          'data' := Data
        }) ->
    #{ 'event' => Event,
       'data' => Data
     }.
