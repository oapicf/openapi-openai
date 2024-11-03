-module(openapi_message_delta_content_text_annotations_file_path_object).

-export([encode/1]).

-export_type([openapi_message_delta_content_text_annotations_file_path_object/0]).

-type openapi_message_delta_content_text_annotations_file_path_object() ::
    #{ 'index' := integer(),
       'type' := binary(),
       'text' => binary(),
       'file_path' => openapi_message_delta_content_text_annotations_file_path_object_file_path:openapi_message_delta_content_text_annotations_file_path_object_file_path(),
       'start_index' => integer(),
       'end_index' => integer()
     }.

encode(#{ 'index' := Index,
          'type' := Type,
          'text' := Text,
          'file_path' := FilePath,
          'start_index' := StartIndex,
          'end_index' := EndIndex
        }) ->
    #{ 'index' => Index,
       'type' => Type,
       'text' => Text,
       'file_path' => FilePath,
       'start_index' => StartIndex,
       'end_index' => EndIndex
     }.
