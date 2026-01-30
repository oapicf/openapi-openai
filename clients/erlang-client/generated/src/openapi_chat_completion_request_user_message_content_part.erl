-module(openapi_chat_completion_request_user_message_content_part).

-export([encode/1]).

-export_type([openapi_chat_completion_request_user_message_content_part/0]).

-type openapi_chat_completion_request_user_message_content_part() ::
    #{ 'type' := binary(),
       'text' := binary(),
       'image_url' := openapi_chat_completion_request_message_content_part_image_image_url:openapi_chat_completion_request_message_content_part_image_image_url(),
       'input_audio' := openapi_chat_completion_request_message_content_part_audio_input_audio:openapi_chat_completion_request_message_content_part_audio_input_audio()
     }.

encode(#{ 'type' := Type,
          'text' := Text,
          'image_url' := ImageUrl,
          'input_audio' := InputAudio
        }) ->
    #{ 'type' => Type,
       'text' => Text,
       'image_url' => ImageUrl,
       'input_audio' => InputAudio
     }.
