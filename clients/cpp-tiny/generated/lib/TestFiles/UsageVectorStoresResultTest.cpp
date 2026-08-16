
#include "UsageVectorStoresResult.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UsageVectorStoresResult_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    UsageVectorStoresResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_UsageVectorStoresResult_usage_bytes_is_assigned_from_json()
{
    bourne::json input =
    {
        "usage_bytes", 1
    };

    UsageVectorStoresResult obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUsageBytes());








}


void test_UsageVectorStoresResult_project_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "project_id", "hello"
    };

    UsageVectorStoresResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProjectId().c_str());






}



void test_UsageVectorStoresResult_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    UsageVectorStoresResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_UsageVectorStoresResult_usage_bytes_is_converted_to_json()
{
    bourne::json input =
    {
        "usage_bytes", 1
    };

    UsageVectorStoresResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["usage_bytes"] == output["usage_bytes"]);




}


void test_UsageVectorStoresResult_project_id_is_converted_to_json()
{

    bourne::json input =
    {
        "project_id", "hello"
    };

    UsageVectorStoresResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["project_id"] == output["project_id"]);



}


