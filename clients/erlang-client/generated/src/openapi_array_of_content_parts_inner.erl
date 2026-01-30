-module(openapi_array_of_content_parts_inner).

-export([encode/1]).

-export_type([openapi_array_of_content_parts_inner/0]).

-type openapi_array_of_content_parts_inner() ::
    #{ 'type' := binary(),
       'image_file' := openapi_message_content_image_file_object_image_file:openapi_message_content_image_file_object_image_file(),
       'image_url' := openapi_message_content_image_url_object_image_url:openapi_message_content_image_url_object_image_url(),
       'text' := binary()
     }.

encode(#{ 'type' := Type,
          'image_file' := ImageFile,
          'image_url' := ImageUrl,
          'text' := Text
        }) ->
    #{ 'type' => Type,
       'image_file' => ImageFile,
       'image_url' => ImageUrl,
       'text' => Text
     }.
