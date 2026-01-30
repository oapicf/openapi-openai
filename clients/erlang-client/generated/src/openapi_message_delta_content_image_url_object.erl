-module(openapi_message_delta_content_image_url_object).

-export([encode/1]).

-export_type([openapi_message_delta_content_image_url_object/0]).

-type openapi_message_delta_content_image_url_object() ::
    #{ 'index' := integer(),
       'type' := binary(),
       'image_url' => openapi_message_delta_content_image_url_object_image_url:openapi_message_delta_content_image_url_object_image_url()
     }.

encode(#{ 'index' := Index,
          'type' := Type,
          'image_url' := ImageUrl
        }) ->
    #{ 'index' => Index,
       'type' => Type,
       'image_url' => ImageUrl
     }.
