
#include "UsageCodeInterpreterSessionsResult.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UsageCodeInterpreterSessionsResult_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    UsageCodeInterpreterSessionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_UsageCodeInterpreterSessionsResult_sessions_is_assigned_from_json()
{
    bourne::json input =
    {
        "sessions", 1
    };

    UsageCodeInterpreterSessionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSessions());








}


void test_UsageCodeInterpreterSessionsResult_project_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "project_id", "hello"
    };

    UsageCodeInterpreterSessionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProjectId().c_str());






}



void test_UsageCodeInterpreterSessionsResult_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    UsageCodeInterpreterSessionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_UsageCodeInterpreterSessionsResult_sessions_is_converted_to_json()
{
    bourne::json input =
    {
        "sessions", 1
    };

    UsageCodeInterpreterSessionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sessions"] == output["sessions"]);




}


void test_UsageCodeInterpreterSessionsResult_project_id_is_converted_to_json()
{

    bourne::json input =
    {
        "project_id", "hello"
    };

    UsageCodeInterpreterSessionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["project_id"] == output["project_id"]);



}


