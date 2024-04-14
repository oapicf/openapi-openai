-module(openapi_chat_completion_request_message_content_part_image).

-export([encode/1]).

-export_type([openapi_chat_completion_request_message_content_part_image/0]).

-type openapi_chat_completion_request_message_content_part_image() ::
    #{ 'type' := binary(),
       'image_url' := openapi_chat_completion_request_message_content_part_image_image_url:openapi_chat_completion_request_message_content_part_image_image_url()
     }.

encode(#{ 'type' := Type,
          'image_url' := ImageUrl
        }) ->
    #{ 'type' => Type,
       'image_url' => ImageUrl
     }.
