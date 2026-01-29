-module(openapi_message_content_text_object_text_annotations_inner).

-export([encode/1]).

-export_type([openapi_message_content_text_object_text_annotations_inner/0]).

-type openapi_message_content_text_object_text_annotations_inner() ::
    #{ 'type' := binary(),
       'text' := binary(),
       'file_citation' := openapi_message_content_text_annotations_file_citation_object_file_citation:openapi_message_content_text_annotations_file_citation_object_file_citation(),
       'start_index' := integer(),
       'end_index' := integer(),
       'file_path' := openapi_message_content_text_annotations_file_path_object_file_path:openapi_message_content_text_annotations_file_path_object_file_path()
     }.

encode(#{ 'type' := Type,
          'text' := Text,
          'file_citation' := FileCitation,
          'start_index' := StartIndex,
          'end_index' := EndIndex,
          'file_path' := FilePath
        }) ->
    #{ 'type' => Type,
       'text' => Text,
       'file_citation' => FileCitation,
       'start_index' => StartIndex,
       'end_index' => EndIndex,
       'file_path' => FilePath
     }.
