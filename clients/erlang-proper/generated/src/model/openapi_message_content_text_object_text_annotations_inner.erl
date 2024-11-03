-module(openapi_message_content_text_object_text_annotations_inner).

-include("openapi.hrl").

-export([openapi_message_content_text_object_text_annotations_inner/0]).

-export([openapi_message_content_text_object_text_annotations_inner/1]).

-export_type([openapi_message_content_text_object_text_annotations_inner/0]).

-type openapi_message_content_text_object_text_annotations_inner() ::
  [ {'type', binary() }
  | {'text', binary() }
  | {'file_citation', openapi_message_content_text_annotations_file_citation_object_file_citation:openapi_message_content_text_annotations_file_citation_object_file_citation() }
  | {'start_index', integer() }
  | {'end_index', integer() }
  | {'file_path', openapi_message_content_text_annotations_file_path_object_file_path:openapi_message_content_text_annotations_file_path_object_file_path() }
  ].


openapi_message_content_text_object_text_annotations_inner() ->
    openapi_message_content_text_object_text_annotations_inner([]).

openapi_message_content_text_object_text_annotations_inner(Fields) ->
  Default = [ {'type', elements([<<"file_citation">>, <<"file_path">>]) }
            , {'text', binary() }
            , {'file_citation', openapi_message_content_text_annotations_file_citation_object_file_citation:openapi_message_content_text_annotations_file_citation_object_file_citation() }
            , {'start_index', integer(0) }
            , {'end_index', integer(0) }
            , {'file_path', openapi_message_content_text_annotations_file_path_object_file_path:openapi_message_content_text_annotations_file_path_object_file_path() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

