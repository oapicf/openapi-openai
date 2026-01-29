-module(openapi_error_event).

-include("openapi.hrl").

-export([openapi_error_event/0]).

-export([openapi_error_event/1]).

-export_type([openapi_error_event/0]).

-type openapi_error_event() ::
  [ {'event', binary() }
  | {'data', openapi_error:openapi_error() }
  ].


openapi_error_event() ->
    openapi_error_event([]).

openapi_error_event(Fields) ->
  Default = [ {'event', elements([<<"error">>]) }
            , {'data', openapi_error:openapi_error() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

