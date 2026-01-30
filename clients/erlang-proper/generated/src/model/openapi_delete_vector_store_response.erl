-module(openapi_delete_vector_store_response).

-include("openapi.hrl").

-export([openapi_delete_vector_store_response/0]).

-export([openapi_delete_vector_store_response/1]).

-export_type([openapi_delete_vector_store_response/0]).

-type openapi_delete_vector_store_response() ::
  [ {'id', binary() }
  | {'deleted', boolean() }
  | {'object', binary() }
  ].


openapi_delete_vector_store_response() ->
    openapi_delete_vector_store_response([]).

openapi_delete_vector_store_response(Fields) ->
  Default = [ {'id', binary() }
            , {'deleted', boolean() }
            , {'object', elements([<<"vector_store.deleted">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

