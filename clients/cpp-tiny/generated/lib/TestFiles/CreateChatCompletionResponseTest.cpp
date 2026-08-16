
#include "CreateChatCompletionResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateChatCompletionResponse_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    CreateChatCompletionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_CreateChatCompletionResponse_created_is_assigned_from_json()
{
    bourne::json input =
    {
        "created", 1
    };

    CreateChatCompletionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreated());








}


void test_CreateChatCompletionResponse_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "model", "hello"
    };

    CreateChatCompletionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getModel().c_str());






}


void test_CreateChatCompletionResponse_service_tier_is_assigned_from_json()
{


    bourne::json input =
    {
        "service_tier", "hello"
    };

    CreateChatCompletionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getServiceTier().c_str());






}


void test_CreateChatCompletionResponse_system_fingerprint_is_assigned_from_json()
{


    bourne::json input =
    {
        "system_fingerprint", "hello"
    };

    CreateChatCompletionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSystemFingerprint().c_str());






}


void test_CreateChatCompletionResponse_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    CreateChatCompletionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}




void test_CreateChatCompletionResponse_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    CreateChatCompletionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



void test_CreateChatCompletionResponse_created_is_converted_to_json()
{
    bourne::json input =
    {
        "created", 1
    };

    CreateChatCompletionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created"] == output["created"]);




}


void test_CreateChatCompletionResponse_model_is_converted_to_json()
{

    bourne::json input =
    {
        "model", "hello"
    };

    CreateChatCompletionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["model"] == output["model"]);



}


void test_CreateChatCompletionResponse_service_tier_is_converted_to_json()
{

    bourne::json input =
    {
        "service_tier", "hello"
    };

    CreateChatCompletionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["service_tier"] == output["service_tier"]);



}


void test_CreateChatCompletionResponse_system_fingerprint_is_converted_to_json()
{

    bourne::json input =
    {
        "system_fingerprint", "hello"
    };

    CreateChatCompletionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["system_fingerprint"] == output["system_fingerprint"]);



}


void test_CreateChatCompletionResponse_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    CreateChatCompletionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}



