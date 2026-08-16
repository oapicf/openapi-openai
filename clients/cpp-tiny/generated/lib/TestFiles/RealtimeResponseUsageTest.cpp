
#include "RealtimeResponse_usage.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeResponse_usage_total_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "total_tokens", 1
    };

    RealtimeResponse_usage obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotalTokens());








}


void test_RealtimeResponse_usage_input_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "input_tokens", 1
    };

    RealtimeResponse_usage obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInputTokens());








}


void test_RealtimeResponse_usage_output_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "output_tokens", 1
    };

    RealtimeResponse_usage obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOutputTokens());








}





void test_RealtimeResponse_usage_total_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "total_tokens", 1
    };

    RealtimeResponse_usage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["total_tokens"] == output["total_tokens"]);




}


void test_RealtimeResponse_usage_input_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "input_tokens", 1
    };

    RealtimeResponse_usage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["input_tokens"] == output["input_tokens"]);




}


void test_RealtimeResponse_usage_output_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "output_tokens", 1
    };

    RealtimeResponse_usage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output_tokens"] == output["output_tokens"]);




}




