-module(openapi_message_content_text_annotations_file_path_object_file_path).

-include("openapi.hrl").

-export([openapi_message_content_text_annotations_file_path_object_file_path/0]).

-export([openapi_message_content_text_annotations_file_path_object_file_path/1]).

-export_type([openapi_message_content_text_annotations_file_path_object_file_path/0]).

-type openapi_message_content_text_annotations_file_path_object_file_path() ::
  [ {'file_id', binary() }
  ].


openapi_message_content_text_annotations_file_path_object_file_path() ->
    openapi_message_content_text_annotations_file_path_object_file_path([]).

openapi_message_content_text_annotations_file_path_object_file_path(Fields) ->
  Default = [ {'file_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

