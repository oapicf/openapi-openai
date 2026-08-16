
#include "RunStepDetailsToolCallsFileSearchRankingOptionsObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RunStepDetailsToolCallsFileSearchRankingOptionsObject_ranker_is_assigned_from_json()
{


    bourne::json input =
    {
        "ranker", "hello"
    };

    RunStepDetailsToolCallsFileSearchRankingOptionsObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRanker().c_str());






}


void test_RunStepDetailsToolCallsFileSearchRankingOptionsObject_score_threshold_is_assigned_from_json()
{








}



void test_RunStepDetailsToolCallsFileSearchRankingOptionsObject_ranker_is_converted_to_json()
{

    bourne::json input =
    {
        "ranker", "hello"
    };

    RunStepDetailsToolCallsFileSearchRankingOptionsObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ranker"] == output["ranker"]);



}


void test_RunStepDetailsToolCallsFileSearchRankingOptionsObject_score_threshold_is_converted_to_json()
{




}


