-module(openapi_open_ai_file).

-include("openapi.hrl").

-export([openapi_open_ai_file/0]).

-export([openapi_open_ai_file/1]).

-export_type([openapi_open_ai_file/0]).

-type openapi_open_ai_file() ::
  [ {'id', binary() }
  | {'bytes', integer() }
  | {'created_at', integer() }
  | {'filename', binary() }
  | {'object', binary() }
  | {'purpose', binary() }
  | {'status', binary() }
  | {'status_details', binary() }
  ].


openapi_open_ai_file() ->
    openapi_open_ai_file([]).

openapi_open_ai_file(Fields) ->
  Default = [ {'id', binary() }
            , {'bytes', integer() }
            , {'created_at', integer() }
            , {'filename', binary() }
            , {'object', elements([<<"file">>]) }
            , {'purpose', elements([<<"fine-tune">>, <<"fine-tune-results">>, <<"assistants">>, <<"assistants_output">>]) }
            , {'status', elements([<<"uploaded">>, <<"processed">>, <<"error">>]) }
            , {'status_details', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

