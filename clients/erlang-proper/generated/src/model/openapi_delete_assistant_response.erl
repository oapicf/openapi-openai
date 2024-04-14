-module(openapi_delete_assistant_response).

-include("openapi.hrl").

-export([openapi_delete_assistant_response/0]).

-export([openapi_delete_assistant_response/1]).

-export_type([openapi_delete_assistant_response/0]).

-type openapi_delete_assistant_response() ::
  [ {'id', binary() }
  | {'deleted', boolean() }
  | {'object', binary() }
  ].


openapi_delete_assistant_response() ->
    openapi_delete_assistant_response([]).

openapi_delete_assistant_response(Fields) ->
  Default = [ {'id', binary() }
            , {'deleted', boolean() }
            , {'object', elements([<<"assistant.deleted">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

