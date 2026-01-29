-module(openapi_delete_thread_response).

-include("openapi.hrl").

-export([openapi_delete_thread_response/0]).

-export([openapi_delete_thread_response/1]).

-export_type([openapi_delete_thread_response/0]).

-type openapi_delete_thread_response() ::
  [ {'id', binary() }
  | {'deleted', boolean() }
  | {'object', binary() }
  ].


openapi_delete_thread_response() ->
    openapi_delete_thread_response([]).

openapi_delete_thread_response(Fields) ->
  Default = [ {'id', binary() }
            , {'deleted', boolean() }
            , {'object', elements([<<"thread.deleted">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

