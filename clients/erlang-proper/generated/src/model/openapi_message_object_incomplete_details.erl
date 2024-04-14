-module(openapi_message_object_incomplete_details).

-include("openapi.hrl").

-export([openapi_message_object_incomplete_details/0]).

-export([openapi_message_object_incomplete_details/1]).

-export_type([openapi_message_object_incomplete_details/0]).

-type openapi_message_object_incomplete_details() ::
  [ {'reason', binary() }
  ].


openapi_message_object_incomplete_details() ->
    openapi_message_object_incomplete_details([]).

openapi_message_object_incomplete_details(Fields) ->
  Default = [ {'reason', elements([<<"content_filter">>, <<"max_tokens">>, <<"run_cancelled">>, <<"run_expired">>, <<"run_failed">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

