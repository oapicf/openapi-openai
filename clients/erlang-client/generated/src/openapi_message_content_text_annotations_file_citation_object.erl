-module(openapi_message_content_text_annotations_file_citation_object).

-export([encode/1]).

-export_type([openapi_message_content_text_annotations_file_citation_object/0]).

-type openapi_message_content_text_annotations_file_citation_object() ::
    #{ 'type' := binary(),
       'text' := binary(),
       'file_citation' := openapi_message_content_text_annotations_file_citation_object_file_citation:openapi_message_content_text_annotations_file_citation_object_file_citation(),
       'start_index' := integer(),
       'end_index' := integer()
     }.

encode(#{ 'type' := Type,
          'text' := Text,
          'file_citation' := FileCitation,
          'start_index' := StartIndex,
          'end_index' := EndIndex
        }) ->
    #{ 'type' => Type,
       'text' => Text,
       'file_citation' => FileCitation,
       'start_index' => StartIndex,
       'end_index' => EndIndex
     }.
