-module(openapi_list_files_response).

-include("openapi.hrl").

-export([openapi_list_files_response/0]).

-export([openapi_list_files_response/1]).

-export_type([openapi_list_files_response/0]).

-type openapi_list_files_response() ::
  [ {'object', binary() }
  | {'data', list(openapi_open_ai_file:openapi_open_ai_file()) }
  ].


openapi_list_files_response() ->
    openapi_list_files_response([]).

openapi_list_files_response(Fields) ->
  Default = [ {'object', binary() }
            , {'data', list(openapi_open_ai_file:openapi_open_ai_file()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

