-module(openapi_thread_stream_event_one_of).

-export([encode/1]).

-export_type([openapi_thread_stream_event_one_of/0]).

-type openapi_thread_stream_event_one_of() ::
    #{ 'event' := binary(),
       'data' := openapi_thread_object:openapi_thread_object()
     }.

encode(#{ 'event' := Event,
          'data' := Data
        }) ->
    #{ 'event' => Event,
       'data' => Data
     }.
