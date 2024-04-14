-module(openapi_message_delta_content_text_annotations_file_citation_object_file_citation).

-export([encode/1]).

-export_type([openapi_message_delta_content_text_annotations_file_citation_object_file_citation/0]).

-type openapi_message_delta_content_text_annotations_file_citation_object_file_citation() ::
    #{ 'file_id' => binary(),
       'quote' => binary()
     }.

encode(#{ 'file_id' := FileId,
          'quote' := Quote
        }) ->
    #{ 'file_id' => FileId,
       'quote' => Quote
     }.
