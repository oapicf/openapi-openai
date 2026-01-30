-module(openapi_realtime_conversation_item_content_inner).

-export([encode/1]).

-export_type([openapi_realtime_conversation_item_content_inner/0]).

-type openapi_realtime_conversation_item_content_inner() ::
    #{ 'type' => binary(),
       'text' => binary(),
       'id' => binary(),
       'audio' => binary(),
       'transcript' => binary()
     }.

encode(#{ 'type' := Type,
          'text' := Text,
          'id' := Id,
          'audio' := Audio,
          'transcript' := Transcript
        }) ->
    #{ 'type' => Type,
       'text' => Text,
       'id' => Id,
       'audio' => Audio,
       'transcript' => Transcript
     }.
