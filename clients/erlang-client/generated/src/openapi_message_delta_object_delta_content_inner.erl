-module(openapi_message_delta_object_delta_content_inner).

-export([encode/1]).

-export_type([openapi_message_delta_object_delta_content_inner/0]).

-type openapi_message_delta_object_delta_content_inner() ::
    #{ 'index' := integer(),
       'type' := binary(),
       'image_file' => openapi_message_delta_content_image_file_object_image_file:openapi_message_delta_content_image_file_object_image_file(),
       'text' => openapi_message_delta_content_text_object_text:openapi_message_delta_content_text_object_text()
     }.

encode(#{ 'index' := Index,
          'type' := Type,
          'image_file' := ImageFile,
          'text' := Text
        }) ->
    #{ 'index' => Index,
       'type' => Type,
       'image_file' => ImageFile,
       'text' => Text
     }.
