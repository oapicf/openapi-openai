-module(openapi_prediction_content_content).

-include("openapi.hrl").

-export([openapi_prediction_content_content/0]).

-export([openapi_prediction_content_content/1]).

-export_type([openapi_prediction_content_content/0]).

-type openapi_prediction_content_content() ::
  [ 
  ].


openapi_prediction_content_content() ->
    openapi_prediction_content_content([]).

openapi_prediction_content_content(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

