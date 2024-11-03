-module(openapi_list_message_files_response).

-include("openapi.hrl").

-export([openapi_list_message_files_response/0]).

-export([openapi_list_message_files_response/1]).

-export_type([openapi_list_message_files_response/0]).

-type openapi_list_message_files_response() ::
  [ {'object', binary() }
  | {'data', list(openapi_message_file_object:openapi_message_file_object()) }
  | {'first_id', binary() }
  | {'last_id', binary() }
  | {'has_more', boolean() }
  ].


openapi_list_message_files_response() ->
    openapi_list_message_files_response([]).

openapi_list_message_files_response(Fields) ->
  Default = [ {'object', binary() }
            , {'data', list(openapi_message_file_object:openapi_message_file_object()) }
            , {'first_id', binary() }
            , {'last_id', binary() }
            , {'has_more', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

