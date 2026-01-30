-module(openapi_project).

-include("openapi.hrl").

-export([openapi_project/0]).

-export([openapi_project/1]).

-export_type([openapi_project/0]).

-type openapi_project() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'name', binary() }
  | {'created_at', integer() }
  | {'archived_at', integer() }
  | {'status', binary() }
  ].


openapi_project() ->
    openapi_project([]).

openapi_project(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"organization.project">>]) }
            , {'name', binary() }
            , {'created_at', integer() }
            , {'archived_at', integer() }
            , {'status', elements([<<"active">>, <<"archived">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

