-module(openapi_chat_completion_request_message_content_part_audio).

-export([encode/1]).

-export_type([openapi_chat_completion_request_message_content_part_audio/0]).

-type openapi_chat_completion_request_message_content_part_audio() ::
    #{ 'type' := binary(),
       'input_audio' := openapi_chat_completion_request_message_content_part_audio_input_audio:openapi_chat_completion_request_message_content_part_audio_input_audio()
     }.

encode(#{ 'type' := Type,
          'input_audio' := InputAudio
        }) ->
    #{ 'type' => Type,
       'input_audio' => InputAudio
     }.
