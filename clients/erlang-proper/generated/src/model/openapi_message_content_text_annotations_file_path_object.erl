-module(openapi_message_content_text_annotations_file_path_object).

-include("openapi.hrl").

-export([openapi_message_content_text_annotations_file_path_object/0]).

-export([openapi_message_content_text_annotations_file_path_object/1]).

-export_type([openapi_message_content_text_annotations_file_path_object/0]).

-type openapi_message_content_text_annotations_file_path_object() ::
  [ {'type', binary() }
  | {'text', binary() }
  | {'file_path', openapi_message_content_text_annotations_file_path_object_file_path:openapi_message_content_text_annotations_file_path_object_file_path() }
  | {'start_index', integer() }
  | {'end_index', integer() }
  ].


openapi_message_content_text_annotations_file_path_object() ->
    openapi_message_content_text_annotations_file_path_object([]).

openapi_message_content_text_annotations_file_path_object(Fields) ->
  Default = [ {'type', elements([<<"file_path">>]) }
            , {'text', binary() }
            , {'file_path', openapi_message_content_text_annotations_file_path_object_file_path:openapi_message_content_text_annotations_file_path_object_file_path() }
            , {'start_index', integer(0) }
            , {'end_index', integer(0) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

