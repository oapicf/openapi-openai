-module(openapi_message_content_text_annotations_file_citation_object).

-include("openapi.hrl").

-export([openapi_message_content_text_annotations_file_citation_object/0]).

-export([openapi_message_content_text_annotations_file_citation_object/1]).

-export_type([openapi_message_content_text_annotations_file_citation_object/0]).

-type openapi_message_content_text_annotations_file_citation_object() ::
  [ {'type', binary() }
  | {'text', binary() }
  | {'file_citation', openapi_message_content_text_annotations_file_citation_object_file_citation:openapi_message_content_text_annotations_file_citation_object_file_citation() }
  | {'start_index', integer() }
  | {'end_index', integer() }
  ].


openapi_message_content_text_annotations_file_citation_object() ->
    openapi_message_content_text_annotations_file_citation_object([]).

openapi_message_content_text_annotations_file_citation_object(Fields) ->
  Default = [ {'type', elements([<<"file_citation">>]) }
            , {'text', binary() }
            , {'file_citation', openapi_message_content_text_annotations_file_citation_object_file_citation:openapi_message_content_text_annotations_file_citation_object_file_citation() }
            , {'start_index', integer(0) }
            , {'end_index', integer(0) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

