
#include "FineTuningJobEvent.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FineTuningJobEvent_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    FineTuningJobEvent obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_FineTuningJobEvent_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    FineTuningJobEvent obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_FineTuningJobEvent_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    FineTuningJobEvent obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_FineTuningJobEvent_level_is_assigned_from_json()
{


    bourne::json input =
    {
        "level", "hello"
    };

    FineTuningJobEvent obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLevel().c_str());






}


void test_FineTuningJobEvent_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    FineTuningJobEvent obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}


void test_FineTuningJobEvent_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    FineTuningJobEvent obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}




void test_FineTuningJobEvent_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    FineTuningJobEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_FineTuningJobEvent_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    FineTuningJobEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_FineTuningJobEvent_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    FineTuningJobEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_FineTuningJobEvent_level_is_converted_to_json()
{

    bourne::json input =
    {
        "level", "hello"
    };

    FineTuningJobEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["level"] == output["level"]);



}


void test_FineTuningJobEvent_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    FineTuningJobEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


void test_FineTuningJobEvent_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    FineTuningJobEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}



