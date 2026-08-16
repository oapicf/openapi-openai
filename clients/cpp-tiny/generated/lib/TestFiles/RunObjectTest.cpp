
#include "RunObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RunObject_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_RunObject_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_RunObject_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_RunObject_thread_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "thread_id", "hello"
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getThreadId().c_str());






}


void test_RunObject_assistant_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "assistant_id", "hello"
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssistantId().c_str());






}


void test_RunObject_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}




void test_RunObject_expires_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExpiresAt());








}


void test_RunObject_started_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "started_at", 1
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStartedAt());








}


void test_RunObject_cancelled_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "cancelled_at", 1
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCancelledAt());








}


void test_RunObject_failed_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "failed_at", 1
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFailedAt());








}


void test_RunObject_completed_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "completed_at", 1
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCompletedAt());








}



void test_RunObject_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "model", "hello"
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getModel().c_str());






}


void test_RunObject_instructions_is_assigned_from_json()
{


    bourne::json input =
    {
        "instructions", "hello"
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInstructions().c_str());






}





void test_RunObject_temperature_is_assigned_from_json()
{








}


void test_RunObject_top_p_is_assigned_from_json()
{








}


void test_RunObject_max_prompt_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_prompt_tokens", 1
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxPromptTokens());








}


void test_RunObject_max_completion_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_completion_tokens", 1
    };

    RunObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxCompletionTokens());








}




void test_RunObject_parallel_tool_calls_is_assigned_from_json()
{




    bourne::json input =
    {
        "parallel_tool_calls", true
    };

    RunObject obj(input.dump());

    TEST_ASSERT(true == obj.isParallelToolCalls());




}




void test_RunObject_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_RunObject_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_RunObject_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_RunObject_thread_id_is_converted_to_json()
{

    bourne::json input =
    {
        "thread_id", "hello"
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["thread_id"] == output["thread_id"]);



}


void test_RunObject_assistant_id_is_converted_to_json()
{

    bourne::json input =
    {
        "assistant_id", "hello"
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["assistant_id"] == output["assistant_id"]);



}


void test_RunObject_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}




void test_RunObject_expires_at_is_converted_to_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["expires_at"] == output["expires_at"]);




}


void test_RunObject_started_at_is_converted_to_json()
{
    bourne::json input =
    {
        "started_at", 1
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["started_at"] == output["started_at"]);




}


void test_RunObject_cancelled_at_is_converted_to_json()
{
    bourne::json input =
    {
        "cancelled_at", 1
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cancelled_at"] == output["cancelled_at"]);




}


void test_RunObject_failed_at_is_converted_to_json()
{
    bourne::json input =
    {
        "failed_at", 1
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["failed_at"] == output["failed_at"]);




}


void test_RunObject_completed_at_is_converted_to_json()
{
    bourne::json input =
    {
        "completed_at", 1
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["completed_at"] == output["completed_at"]);




}



void test_RunObject_model_is_converted_to_json()
{

    bourne::json input =
    {
        "model", "hello"
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["model"] == output["model"]);



}


void test_RunObject_instructions_is_converted_to_json()
{

    bourne::json input =
    {
        "instructions", "hello"
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["instructions"] == output["instructions"]);



}





void test_RunObject_temperature_is_converted_to_json()
{




}


void test_RunObject_top_p_is_converted_to_json()
{




}


void test_RunObject_max_prompt_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "max_prompt_tokens", 1
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_prompt_tokens"] == output["max_prompt_tokens"]);




}


void test_RunObject_max_completion_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "max_completion_tokens", 1
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_completion_tokens"] == output["max_completion_tokens"]);




}




void test_RunObject_parallel_tool_calls_is_converted_to_json()
{


    bourne::json input =
    {
        "parallel_tool_calls", true
    };

    RunObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parallel_tool_calls"] == output["parallel_tool_calls"]);


}



