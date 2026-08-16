
#include "RunStepObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RunStepObject_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    RunStepObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_RunStepObject_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    RunStepObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_RunStepObject_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    RunStepObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_RunStepObject_assistant_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "assistant_id", "hello"
    };

    RunStepObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssistantId().c_str());






}


void test_RunStepObject_thread_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "thread_id", "hello"
    };

    RunStepObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getThreadId().c_str());






}


void test_RunStepObject_run_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "run_id", "hello"
    };

    RunStepObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRunId().c_str());






}


void test_RunStepObject_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RunStepObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RunStepObject_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    RunStepObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}




void test_RunStepObject_expired_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "expired_at", 1
    };

    RunStepObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExpiredAt());








}


void test_RunStepObject_cancelled_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "cancelled_at", 1
    };

    RunStepObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCancelledAt());








}


void test_RunStepObject_failed_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "failed_at", 1
    };

    RunStepObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFailedAt());








}


void test_RunStepObject_completed_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "completed_at", 1
    };

    RunStepObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCompletedAt());








}





void test_RunStepObject_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    RunStepObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_RunStepObject_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    RunStepObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_RunStepObject_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    RunStepObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_RunStepObject_assistant_id_is_converted_to_json()
{

    bourne::json input =
    {
        "assistant_id", "hello"
    };

    RunStepObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["assistant_id"] == output["assistant_id"]);



}


void test_RunStepObject_thread_id_is_converted_to_json()
{

    bourne::json input =
    {
        "thread_id", "hello"
    };

    RunStepObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["thread_id"] == output["thread_id"]);



}


void test_RunStepObject_run_id_is_converted_to_json()
{

    bourne::json input =
    {
        "run_id", "hello"
    };

    RunStepObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["run_id"] == output["run_id"]);



}


void test_RunStepObject_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RunStepObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RunStepObject_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    RunStepObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}




void test_RunStepObject_expired_at_is_converted_to_json()
{
    bourne::json input =
    {
        "expired_at", 1
    };

    RunStepObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["expired_at"] == output["expired_at"]);




}


void test_RunStepObject_cancelled_at_is_converted_to_json()
{
    bourne::json input =
    {
        "cancelled_at", 1
    };

    RunStepObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cancelled_at"] == output["cancelled_at"]);




}


void test_RunStepObject_failed_at_is_converted_to_json()
{
    bourne::json input =
    {
        "failed_at", 1
    };

    RunStepObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["failed_at"] == output["failed_at"]);




}


void test_RunStepObject_completed_at_is_converted_to_json()
{
    bourne::json input =
    {
        "completed_at", 1
    };

    RunStepObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["completed_at"] == output["completed_at"]);




}




