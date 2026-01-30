-module(openapi_message_content_image_file_object_image_file).

-export([encode/1]).

-export_type([openapi_message_content_image_file_object_image_file/0]).

-type openapi_message_content_image_file_object_image_file() ::
    #{ 'file_id' := binary(),
       'detail' => binary()
     }.

encode(#{ 'file_id' := FileId,
          'detail' := Detail
        }) ->
    #{ 'file_id' => FileId,
       'detail' => Detail
     }.
