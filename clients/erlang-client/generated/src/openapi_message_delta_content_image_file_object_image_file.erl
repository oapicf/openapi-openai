-module(openapi_message_delta_content_image_file_object_image_file).

-export([encode/1]).

-export_type([openapi_message_delta_content_image_file_object_image_file/0]).

-type openapi_message_delta_content_image_file_object_image_file() ::
    #{ 'file_id' => binary()
     }.

encode(#{ 'file_id' := FileId
        }) ->
    #{ 'file_id' => FileId
     }.
