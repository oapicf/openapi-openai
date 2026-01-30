-module(openapi_response_format_text).

-include("openapi.hrl").

-export([openapi_response_format_text/0]).

-export([openapi_response_format_text/1]).

-export_type([openapi_response_format_text/0]).

-type openapi_response_format_text() ::
  [ {'type', binary() }
  ].


openapi_response_format_text() ->
    openapi_response_format_text([]).

openapi_response_format_text(Fields) ->
  Default = [ {'type', elements([<<"text">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

