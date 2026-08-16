
#include "UsageCompletionsResult.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UsageCompletionsResult_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    UsageCompletionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_UsageCompletionsResult_input_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "input_tokens", 1
    };

    UsageCompletionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInputTokens());








}


void test_UsageCompletionsResult_input_cached_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "input_cached_tokens", 1
    };

    UsageCompletionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInputCachedTokens());








}


void test_UsageCompletionsResult_output_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "output_tokens", 1
    };

    UsageCompletionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOutputTokens());








}


void test_UsageCompletionsResult_input_audio_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "input_audio_tokens", 1
    };

    UsageCompletionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInputAudioTokens());








}


void test_UsageCompletionsResult_output_audio_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "output_audio_tokens", 1
    };

    UsageCompletionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOutputAudioTokens());








}


void test_UsageCompletionsResult_num_model_requests_is_assigned_from_json()
{
    bourne::json input =
    {
        "num_model_requests", 1
    };

    UsageCompletionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getNumModelRequests());








}


void test_UsageCompletionsResult_project_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "project_id", "hello"
    };

    UsageCompletionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProjectId().c_str());






}


void test_UsageCompletionsResult_user_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "user_id", "hello"
    };

    UsageCompletionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUserId().c_str());






}


void test_UsageCompletionsResult_api_key_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "api_key_id", "hello"
    };

    UsageCompletionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getApiKeyId().c_str());






}


void test_UsageCompletionsResult_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "model", "hello"
    };

    UsageCompletionsResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getModel().c_str());






}


void test_UsageCompletionsResult_batch_is_assigned_from_json()
{




    bourne::json input =
    {
        "batch", true
    };

    UsageCompletionsResult obj(input.dump());

    TEST_ASSERT(true == obj.isBatch());




}



void test_UsageCompletionsResult_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    UsageCompletionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_UsageCompletionsResult_input_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "input_tokens", 1
    };

    UsageCompletionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["input_tokens"] == output["input_tokens"]);




}


void test_UsageCompletionsResult_input_cached_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "input_cached_tokens", 1
    };

    UsageCompletionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["input_cached_tokens"] == output["input_cached_tokens"]);




}


void test_UsageCompletionsResult_output_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "output_tokens", 1
    };

    UsageCompletionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output_tokens"] == output["output_tokens"]);




}


void test_UsageCompletionsResult_input_audio_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "input_audio_tokens", 1
    };

    UsageCompletionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["input_audio_tokens"] == output["input_audio_tokens"]);




}


void test_UsageCompletionsResult_output_audio_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "output_audio_tokens", 1
    };

    UsageCompletionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output_audio_tokens"] == output["output_audio_tokens"]);




}


void test_UsageCompletionsResult_num_model_requests_is_converted_to_json()
{
    bourne::json input =
    {
        "num_model_requests", 1
    };

    UsageCompletionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["num_model_requests"] == output["num_model_requests"]);




}


void test_UsageCompletionsResult_project_id_is_converted_to_json()
{

    bourne::json input =
    {
        "project_id", "hello"
    };

    UsageCompletionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["project_id"] == output["project_id"]);



}


void test_UsageCompletionsResult_user_id_is_converted_to_json()
{

    bourne::json input =
    {
        "user_id", "hello"
    };

    UsageCompletionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user_id"] == output["user_id"]);



}


void test_UsageCompletionsResult_api_key_id_is_converted_to_json()
{

    bourne::json input =
    {
        "api_key_id", "hello"
    };

    UsageCompletionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["api_key_id"] == output["api_key_id"]);



}


void test_UsageCompletionsResult_model_is_converted_to_json()
{

    bourne::json input =
    {
        "model", "hello"
    };

    UsageCompletionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["model"] == output["model"]);



}


void test_UsageCompletionsResult_batch_is_converted_to_json()
{


    bourne::json input =
    {
        "batch", true
    };

    UsageCompletionsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["batch"] == output["batch"]);


}


