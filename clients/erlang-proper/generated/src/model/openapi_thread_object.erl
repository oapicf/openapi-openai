-module(openapi_thread_object).

-include("openapi.hrl").

-export([openapi_thread_object/0]).

-export([openapi_thread_object/1]).

-export_type([openapi_thread_object/0]).

-type openapi_thread_object() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'created_at', integer() }
  | {'metadata', map() }
  ].


openapi_thread_object() ->
    openapi_thread_object([]).

openapi_thread_object(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"thread">>]) }
            , {'created_at', integer() }
            , {'metadata', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

