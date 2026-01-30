-module(openapi_message_object_content_inner).

-export([encode/1]).

-export_type([openapi_message_object_content_inner/0]).

-type openapi_message_object_content_inner() ::
    #{ 'type' := binary(),
       'image_file' := openapi_message_content_image_file_object_image_file:openapi_message_content_image_file_object_image_file(),
       'image_url' := openapi_message_content_image_url_object_image_url:openapi_message_content_image_url_object_image_url(),
       'text' := openapi_message_content_text_object_text:openapi_message_content_text_object_text(),
       'refusal' := binary()
     }.

encode(#{ 'type' := Type,
          'image_file' := ImageFile,
          'image_url' := ImageUrl,
          'text' := Text,
          'refusal' := Refusal
        }) ->
    #{ 'type' => Type,
       'image_file' => ImageFile,
       'image_url' => ImageUrl,
       'text' => Text,
       'refusal' => Refusal
     }.
