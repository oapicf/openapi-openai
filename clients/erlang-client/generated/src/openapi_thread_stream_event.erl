-module(openapi_thread_stream_event).

-export([encode/1]).

-export_type([openapi_thread_stream_event/0]).

-type openapi_thread_stream_event() ::
    #{ 'event' := binary(),
       'data' := openapi_thread_object:openapi_thread_object()
     }.

encode(#{ 'event' := Event,
          'data' := Data
        }) ->
    #{ 'event' => Event,
       'data' => Data
     }.
