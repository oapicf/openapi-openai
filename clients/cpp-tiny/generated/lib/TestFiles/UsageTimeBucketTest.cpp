
#include "UsageTimeBucket.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UsageTimeBucket_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    UsageTimeBucket obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_UsageTimeBucket_start_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    UsageTimeBucket obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStartTime());








}


void test_UsageTimeBucket_end_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    UsageTimeBucket obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEndTime());








}




void test_UsageTimeBucket_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    UsageTimeBucket obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_UsageTimeBucket_start_time_is_converted_to_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    UsageTimeBucket obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_time"] == output["start_time"]);




}


void test_UsageTimeBucket_end_time_is_converted_to_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    UsageTimeBucket obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_time"] == output["end_time"]);




}



