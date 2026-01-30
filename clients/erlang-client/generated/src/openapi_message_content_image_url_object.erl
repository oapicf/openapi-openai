-module(openapi_message_content_image_url_object).

-export([encode/1]).

-export_type([openapi_message_content_image_url_object/0]).

-type openapi_message_content_image_url_object() ::
    #{ 'type' := binary(),
       'image_url' := openapi_message_content_image_url_object_image_url:openapi_message_content_image_url_object_image_url()
     }.

encode(#{ 'type' := Type,
          'image_url' := ImageUrl
        }) ->
    #{ 'type' => Type,
       'image_url' => ImageUrl
     }.
