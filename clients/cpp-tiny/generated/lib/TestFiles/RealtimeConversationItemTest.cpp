
#include "RealtimeConversationItem.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeConversationItem_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_RealtimeConversationItem_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RealtimeConversationItem_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_RealtimeConversationItem_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}


void test_RealtimeConversationItem_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}



void test_RealtimeConversationItem_call_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "call_id", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCallId().c_str());






}


void test_RealtimeConversationItem_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_RealtimeConversationItem_arguments_is_assigned_from_json()
{


    bourne::json input =
    {
        "arguments", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getArguments().c_str());






}


void test_RealtimeConversationItem_output_is_assigned_from_json()
{


    bourne::json input =
    {
        "output", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOutput().c_str());






}



void test_RealtimeConversationItem_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_RealtimeConversationItem_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RealtimeConversationItem_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_RealtimeConversationItem_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


void test_RealtimeConversationItem_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}



void test_RealtimeConversationItem_call_id_is_converted_to_json()
{

    bourne::json input =
    {
        "call_id", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["call_id"] == output["call_id"]);



}


void test_RealtimeConversationItem_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_RealtimeConversationItem_arguments_is_converted_to_json()
{

    bourne::json input =
    {
        "arguments", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["arguments"] == output["arguments"]);



}


void test_RealtimeConversationItem_output_is_converted_to_json()
{

    bourne::json input =
    {
        "output", "hello"
    };

    RealtimeConversationItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output"] == output["output"]);



}


