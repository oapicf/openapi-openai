-module(openapi_chat_completion_request_message_content_part_image_image_url).

-export([encode/1]).

-export_type([openapi_chat_completion_request_message_content_part_image_image_url/0]).

-type openapi_chat_completion_request_message_content_part_image_image_url() ::
    #{ 'url' := openapi_u_ri:openapi_u_ri(),
       'detail' => binary()
     }.

encode(#{ 'url' := Url,
          'detail' := Detail
        }) ->
    #{ 'url' => Url,
       'detail' => Detail
     }.
