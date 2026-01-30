-module(openapi_prediction_content).

-include("openapi.hrl").

-export([openapi_prediction_content/0]).

-export([openapi_prediction_content/1]).

-export_type([openapi_prediction_content/0]).

-type openapi_prediction_content() ::
  [ {'type', binary() }
  | {'content', openapi_prediction_content_content:openapi_prediction_content_content() }
  ].


openapi_prediction_content() ->
    openapi_prediction_content([]).

openapi_prediction_content(Fields) ->
  Default = [ {'type', elements([<<"content">>]) }
            , {'content', openapi_prediction_content_content:openapi_prediction_content_content() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

