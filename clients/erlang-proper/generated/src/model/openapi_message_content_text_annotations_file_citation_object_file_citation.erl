-module(openapi_message_content_text_annotations_file_citation_object_file_citation).

-include("openapi.hrl").

-export([openapi_message_content_text_annotations_file_citation_object_file_citation/0]).

-export([openapi_message_content_text_annotations_file_citation_object_file_citation/1]).

-export_type([openapi_message_content_text_annotations_file_citation_object_file_citation/0]).

-type openapi_message_content_text_annotations_file_citation_object_file_citation() ::
  [ {'file_id', binary() }
  | {'quote', binary() }
  ].


openapi_message_content_text_annotations_file_citation_object_file_citation() ->
    openapi_message_content_text_annotations_file_citation_object_file_citation([]).

openapi_message_content_text_annotations_file_citation_object_file_citation(Fields) ->
  Default = [ {'file_id', binary() }
            , {'quote', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

