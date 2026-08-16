
#include "RealtimeServerEventRateLimitsUpdated_rate_limits_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeServerEventRateLimitsUpdated_rate_limits_inner_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    RealtimeServerEventRateLimitsUpdated_rate_limits_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_RealtimeServerEventRateLimitsUpdated_rate_limits_inner_limit_is_assigned_from_json()
{
    bourne::json input =
    {
        "limit", 1
    };

    RealtimeServerEventRateLimitsUpdated_rate_limits_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLimit());








}


void test_RealtimeServerEventRateLimitsUpdated_rate_limits_inner_remaining_is_assigned_from_json()
{
    bourne::json input =
    {
        "remaining", 1
    };

    RealtimeServerEventRateLimitsUpdated_rate_limits_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRemaining());








}


void test_RealtimeServerEventRateLimitsUpdated_rate_limits_inner_reset_seconds_is_assigned_from_json()
{








}



void test_RealtimeServerEventRateLimitsUpdated_rate_limits_inner_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    RealtimeServerEventRateLimitsUpdated_rate_limits_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_RealtimeServerEventRateLimitsUpdated_rate_limits_inner_limit_is_converted_to_json()
{
    bourne::json input =
    {
        "limit", 1
    };

    RealtimeServerEventRateLimitsUpdated_rate_limits_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["limit"] == output["limit"]);




}


void test_RealtimeServerEventRateLimitsUpdated_rate_limits_inner_remaining_is_converted_to_json()
{
    bourne::json input =
    {
        "remaining", 1
    };

    RealtimeServerEventRateLimitsUpdated_rate_limits_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["remaining"] == output["remaining"]);




}


void test_RealtimeServerEventRateLimitsUpdated_rate_limits_inner_reset_seconds_is_converted_to_json()
{




}


