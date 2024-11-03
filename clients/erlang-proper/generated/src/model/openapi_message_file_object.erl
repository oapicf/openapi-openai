-module(openapi_message_file_object).

-include("openapi.hrl").

-export([openapi_message_file_object/0]).

-export([openapi_message_file_object/1]).

-export_type([openapi_message_file_object/0]).

-type openapi_message_file_object() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'created_at', integer() }
  | {'message_id', binary() }
  ].


openapi_message_file_object() ->
    openapi_message_file_object([]).

openapi_message_file_object(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"thread.message.file">>]) }
            , {'created_at', integer() }
            , {'message_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

