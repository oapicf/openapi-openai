-module(openapi_assistant_file_object).

-include("openapi.hrl").

-export([openapi_assistant_file_object/0]).

-export([openapi_assistant_file_object/1]).

-export_type([openapi_assistant_file_object/0]).

-type openapi_assistant_file_object() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'created_at', integer() }
  | {'assistant_id', binary() }
  ].


openapi_assistant_file_object() ->
    openapi_assistant_file_object([]).

openapi_assistant_file_object(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"assistant.file">>]) }
            , {'created_at', integer() }
            , {'assistant_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

