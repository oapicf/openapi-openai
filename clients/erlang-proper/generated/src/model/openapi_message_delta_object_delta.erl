-module(openapi_message_delta_object_delta).

-include("openapi.hrl").

-export([openapi_message_delta_object_delta/0]).

-export([openapi_message_delta_object_delta/1]).

-export_type([openapi_message_delta_object_delta/0]).

-type openapi_message_delta_object_delta() ::
  [ {'role', binary() }
  | {'content', list(openapi_message_delta_object_delta_content_inner:openapi_message_delta_object_delta_content_inner()) }
  ].


openapi_message_delta_object_delta() ->
    openapi_message_delta_object_delta([]).

openapi_message_delta_object_delta(Fields) ->
  Default = [ {'role', elements([<<"user">>, <<"assistant">>]) }
            , {'content', list(openapi_message_delta_object_delta_content_inner:openapi_message_delta_object_delta_content_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

