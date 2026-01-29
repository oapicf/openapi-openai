-module(openapi_message_stream_event_one_of_2).

-export([encode/1]).

-export_type([openapi_message_stream_event_one_of_2/0]).

-type openapi_message_stream_event_one_of_2() ::
    #{ 'event' := binary(),
       'data' := openapi_message_delta_object:openapi_message_delta_object()
     }.

encode(#{ 'event' := Event,
          'data' := Data
        }) ->
    #{ 'event' => Event,
       'data' => Data
     }.
