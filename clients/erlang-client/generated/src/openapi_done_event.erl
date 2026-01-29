-module(openapi_done_event).

-export([encode/1]).

-export_type([openapi_done_event/0]).

-type openapi_done_event() ::
    #{ 'event' := binary(),
       'data' := binary()
     }.

encode(#{ 'event' := Event,
          'data' := Data
        }) ->
    #{ 'event' => Event,
       'data' => Data
     }.
