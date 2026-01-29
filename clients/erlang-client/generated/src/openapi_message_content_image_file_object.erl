-module(openapi_message_content_image_file_object).

-export([encode/1]).

-export_type([openapi_message_content_image_file_object/0]).

-type openapi_message_content_image_file_object() ::
    #{ 'type' := binary(),
       'image_file' := openapi_message_content_image_file_object_image_file:openapi_message_content_image_file_object_image_file()
     }.

encode(#{ 'type' := Type,
          'image_file' := ImageFile
        }) ->
    #{ 'type' => Type,
       'image_file' => ImageFile
     }.
