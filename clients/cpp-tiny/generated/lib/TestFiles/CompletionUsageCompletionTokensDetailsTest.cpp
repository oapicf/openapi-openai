
#include "CompletionUsage_completion_tokens_details.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CompletionUsage_completion_tokens_details_accepted_prediction_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "accepted_prediction_tokens", 1
    };

    CompletionUsage_completion_tokens_details obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAcceptedPredictionTokens());








}


void test_CompletionUsage_completion_tokens_details_audio_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "audio_tokens", 1
    };

    CompletionUsage_completion_tokens_details obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAudioTokens());








}


void test_CompletionUsage_completion_tokens_details_reasoning_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "reasoning_tokens", 1
    };

    CompletionUsage_completion_tokens_details obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getReasoningTokens());








}


void test_CompletionUsage_completion_tokens_details_rejected_prediction_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "rejected_prediction_tokens", 1
    };

    CompletionUsage_completion_tokens_details obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRejectedPredictionTokens());








}



void test_CompletionUsage_completion_tokens_details_accepted_prediction_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "accepted_prediction_tokens", 1
    };

    CompletionUsage_completion_tokens_details obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["accepted_prediction_tokens"] == output["accepted_prediction_tokens"]);




}


void test_CompletionUsage_completion_tokens_details_audio_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "audio_tokens", 1
    };

    CompletionUsage_completion_tokens_details obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["audio_tokens"] == output["audio_tokens"]);




}


void test_CompletionUsage_completion_tokens_details_reasoning_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "reasoning_tokens", 1
    };

    CompletionUsage_completion_tokens_details obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["reasoning_tokens"] == output["reasoning_tokens"]);




}


void test_CompletionUsage_completion_tokens_details_rejected_prediction_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "rejected_prediction_tokens", 1
    };

    CompletionUsage_completion_tokens_details obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rejected_prediction_tokens"] == output["rejected_prediction_tokens"]);




}


