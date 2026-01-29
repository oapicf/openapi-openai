-module(openapi_assistant_object).

-include("openapi.hrl").

-export([openapi_assistant_object/0]).

-export([openapi_assistant_object/1]).

-export_type([openapi_assistant_object/0]).

-type openapi_assistant_object() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'created_at', integer() }
  | {'name', binary() }
  | {'description', binary() }
  | {'model', binary() }
  | {'instructions', binary() }
  | {'tools', list(openapi_assistant_object_tools_inner:openapi_assistant_object_tools_inner()) }
  | {'file_ids', list(binary()) }
  | {'metadata', map() }
  ].


openapi_assistant_object() ->
    openapi_assistant_object([]).

openapi_assistant_object(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"assistant">>]) }
            , {'created_at', integer() }
            , {'name', binary() }
            , {'description', binary() }
            , {'model', binary() }
            , {'instructions', binary() }
            , {'tools', list(openapi_assistant_object_tools_inner:openapi_assistant_object_tools_inner()) }
            , {'file_ids', list(binary()) }
            , {'metadata', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

