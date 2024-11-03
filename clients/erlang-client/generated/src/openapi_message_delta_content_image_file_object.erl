-module(openapi_message_delta_content_image_file_object).

-export([encode/1]).

-export_type([openapi_message_delta_content_image_file_object/0]).

-type openapi_message_delta_content_image_file_object() ::
    #{ 'index' := integer(),
       'type' := binary(),
       'image_file' => openapi_message_delta_content_image_file_object_image_file:openapi_message_delta_content_image_file_object_image_file()
     }.

encode(#{ 'index' := Index,
          'type' := Type,
          'image_file' := ImageFile
        }) ->
    #{ 'index' => Index,
       'type' => Type,
       'image_file' => ImageFile
     }.
