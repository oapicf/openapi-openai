
#include "MessageObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MessageObject_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    MessageObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_MessageObject_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    MessageObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_MessageObject_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    MessageObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_MessageObject_thread_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "thread_id", "hello"
    };

    MessageObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getThreadId().c_str());






}


void test_MessageObject_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    MessageObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}



void test_MessageObject_completed_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "completed_at", 1
    };

    MessageObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCompletedAt());








}


void test_MessageObject_incomplete_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "incomplete_at", 1
    };

    MessageObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIncompleteAt());








}


void test_MessageObject_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    MessageObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}



void test_MessageObject_assistant_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "assistant_id", "hello"
    };

    MessageObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssistantId().c_str());






}


void test_MessageObject_run_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "run_id", "hello"
    };

    MessageObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRunId().c_str());






}





void test_MessageObject_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    MessageObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_MessageObject_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    MessageObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_MessageObject_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    MessageObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_MessageObject_thread_id_is_converted_to_json()
{

    bourne::json input =
    {
        "thread_id", "hello"
    };

    MessageObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["thread_id"] == output["thread_id"]);



}


void test_MessageObject_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    MessageObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}



void test_MessageObject_completed_at_is_converted_to_json()
{
    bourne::json input =
    {
        "completed_at", 1
    };

    MessageObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["completed_at"] == output["completed_at"]);




}


void test_MessageObject_incomplete_at_is_converted_to_json()
{
    bourne::json input =
    {
        "incomplete_at", 1
    };

    MessageObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["incomplete_at"] == output["incomplete_at"]);




}


void test_MessageObject_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    MessageObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}



void test_MessageObject_assistant_id_is_converted_to_json()
{

    bourne::json input =
    {
        "assistant_id", "hello"
    };

    MessageObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["assistant_id"] == output["assistant_id"]);



}


void test_MessageObject_run_id_is_converted_to_json()
{

    bourne::json input =
    {
        "run_id", "hello"
    };

    MessageObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["run_id"] == output["run_id"]);



}




