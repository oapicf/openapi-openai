-module(openapi_message_content_text_annotations_file_path_object_file_path).

-export([encode/1]).

-export_type([openapi_message_content_text_annotations_file_path_object_file_path/0]).

-type openapi_message_content_text_annotations_file_path_object_file_path() ::
    #{ 'file_id' := binary()
     }.

encode(#{ 'file_id' := FileId
        }) ->
    #{ 'file_id' => FileId
     }.
