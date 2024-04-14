-module(openapi_message_content_text_object_text).

-include("openapi.hrl").

-export([openapi_message_content_text_object_text/0]).

-export([openapi_message_content_text_object_text/1]).

-export_type([openapi_message_content_text_object_text/0]).

-type openapi_message_content_text_object_text() ::
  [ {'value', binary() }
  | {'annotations', list(openapi_message_content_text_object_text_annotations_inner:openapi_message_content_text_object_text_annotations_inner()) }
  ].


openapi_message_content_text_object_text() ->
    openapi_message_content_text_object_text([]).

openapi_message_content_text_object_text(Fields) ->
  Default = [ {'value', binary() }
            , {'annotations', list(openapi_message_content_text_object_text_annotations_inner:openapi_message_content_text_object_text_annotations_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

