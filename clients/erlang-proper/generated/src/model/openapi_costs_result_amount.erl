-module(openapi_costs_result_amount).

-include("openapi.hrl").

-export([openapi_costs_result_amount/0]).

-export([openapi_costs_result_amount/1]).

-export_type([openapi_costs_result_amount/0]).

-type openapi_costs_result_amount() ::
  [ {'value', integer() }
  | {'currency', binary() }
  ].


openapi_costs_result_amount() ->
    openapi_costs_result_amount([]).

openapi_costs_result_amount(Fields) ->
  Default = [ {'value', integer() }
            , {'currency', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

