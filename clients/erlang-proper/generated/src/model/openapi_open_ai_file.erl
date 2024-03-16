-module(openapi_open_ai_file).

-include("openapi.hrl").

-export([openapi_open_ai_file/0]).

-export([openapi_open_ai_file/1]).

-export_type([openapi_open_ai_file/0]).

-type openapi_open_ai_file() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'bytes', integer() }
  | {'created_at', integer() }
  | {'filename', binary() }
  | {'purpose', binary() }
  | {'status', binary() }
  | {'status_details', map() }
  ].


openapi_open_ai_file() ->
    openapi_open_ai_file([]).

openapi_open_ai_file(Fields) ->
  Default = [ {'id', binary() }
            , {'object', binary() }
            , {'bytes', integer() }
            , {'created_at', integer() }
            , {'filename', binary() }
            , {'purpose', binary() }
            , {'status', binary() }
            , {'status_details', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

