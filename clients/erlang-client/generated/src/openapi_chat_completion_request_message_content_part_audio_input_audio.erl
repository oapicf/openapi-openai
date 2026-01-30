-module(openapi_chat_completion_request_message_content_part_audio_input_audio).

-export([encode/1]).

-export_type([openapi_chat_completion_request_message_content_part_audio_input_audio/0]).

-type openapi_chat_completion_request_message_content_part_audio_input_audio() ::
    #{ 'data' := binary(),
       'format' := binary()
     }.

encode(#{ 'data' := Data,
          'format' := Format
        }) ->
    #{ 'data' => Data,
       'format' => Format
     }.
