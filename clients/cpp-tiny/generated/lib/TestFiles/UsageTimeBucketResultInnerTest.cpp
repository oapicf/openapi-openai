
#include "UsageTimeBucket_result_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UsageTimeBucket_result_inner_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_UsageTimeBucket_result_inner_input_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "input_tokens", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInputTokens());








}


void test_UsageTimeBucket_result_inner_input_cached_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "input_cached_tokens", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInputCachedTokens());








}


void test_UsageTimeBucket_result_inner_output_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "output_tokens", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOutputTokens());








}


void test_UsageTimeBucket_result_inner_input_audio_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "input_audio_tokens", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInputAudioTokens());








}


void test_UsageTimeBucket_result_inner_output_audio_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "output_audio_tokens", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOutputAudioTokens());








}


void test_UsageTimeBucket_result_inner_num_model_requests_is_assigned_from_json()
{
    bourne::json input =
    {
        "num_model_requests", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getNumModelRequests());








}


void test_UsageTimeBucket_result_inner_project_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "project_id", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProjectId().c_str());






}


void test_UsageTimeBucket_result_inner_user_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "user_id", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUserId().c_str());






}


void test_UsageTimeBucket_result_inner_api_key_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "api_key_id", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getApiKeyId().c_str());






}


void test_UsageTimeBucket_result_inner_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "model", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getModel().c_str());






}


void test_UsageTimeBucket_result_inner_batch_is_assigned_from_json()
{




    bourne::json input =
    {
        "batch", true
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT(true == obj.isBatch());




}


void test_UsageTimeBucket_result_inner_images_is_assigned_from_json()
{
    bourne::json input =
    {
        "images", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getImages());








}


void test_UsageTimeBucket_result_inner_source_is_assigned_from_json()
{


    bourne::json input =
    {
        "source", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSource().c_str());






}


void test_UsageTimeBucket_result_inner_size_is_assigned_from_json()
{


    bourne::json input =
    {
        "size", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSize().c_str());






}


void test_UsageTimeBucket_result_inner_characters_is_assigned_from_json()
{
    bourne::json input =
    {
        "characters", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCharacters());








}


void test_UsageTimeBucket_result_inner_seconds_is_assigned_from_json()
{
    bourne::json input =
    {
        "seconds", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSeconds());








}


void test_UsageTimeBucket_result_inner_usage_bytes_is_assigned_from_json()
{
    bourne::json input =
    {
        "usage_bytes", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUsageBytes());








}


void test_UsageTimeBucket_result_inner_sessions_is_assigned_from_json()
{
    bourne::json input =
    {
        "sessions", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSessions());








}



void test_UsageTimeBucket_result_inner_line_item_is_assigned_from_json()
{


    bourne::json input =
    {
        "line_item", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLineItem().c_str());






}



void test_UsageTimeBucket_result_inner_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_UsageTimeBucket_result_inner_input_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "input_tokens", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["input_tokens"] == output["input_tokens"]);




}


void test_UsageTimeBucket_result_inner_input_cached_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "input_cached_tokens", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["input_cached_tokens"] == output["input_cached_tokens"]);




}


void test_UsageTimeBucket_result_inner_output_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "output_tokens", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output_tokens"] == output["output_tokens"]);




}


void test_UsageTimeBucket_result_inner_input_audio_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "input_audio_tokens", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["input_audio_tokens"] == output["input_audio_tokens"]);




}


void test_UsageTimeBucket_result_inner_output_audio_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "output_audio_tokens", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output_audio_tokens"] == output["output_audio_tokens"]);




}


void test_UsageTimeBucket_result_inner_num_model_requests_is_converted_to_json()
{
    bourne::json input =
    {
        "num_model_requests", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["num_model_requests"] == output["num_model_requests"]);




}


void test_UsageTimeBucket_result_inner_project_id_is_converted_to_json()
{

    bourne::json input =
    {
        "project_id", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["project_id"] == output["project_id"]);



}


void test_UsageTimeBucket_result_inner_user_id_is_converted_to_json()
{

    bourne::json input =
    {
        "user_id", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user_id"] == output["user_id"]);



}


void test_UsageTimeBucket_result_inner_api_key_id_is_converted_to_json()
{

    bourne::json input =
    {
        "api_key_id", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["api_key_id"] == output["api_key_id"]);



}


void test_UsageTimeBucket_result_inner_model_is_converted_to_json()
{

    bourne::json input =
    {
        "model", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["model"] == output["model"]);



}


void test_UsageTimeBucket_result_inner_batch_is_converted_to_json()
{


    bourne::json input =
    {
        "batch", true
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["batch"] == output["batch"]);


}


void test_UsageTimeBucket_result_inner_images_is_converted_to_json()
{
    bourne::json input =
    {
        "images", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["images"] == output["images"]);




}


void test_UsageTimeBucket_result_inner_source_is_converted_to_json()
{

    bourne::json input =
    {
        "source", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["source"] == output["source"]);



}


void test_UsageTimeBucket_result_inner_size_is_converted_to_json()
{

    bourne::json input =
    {
        "size", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["size"] == output["size"]);



}


void test_UsageTimeBucket_result_inner_characters_is_converted_to_json()
{
    bourne::json input =
    {
        "characters", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["characters"] == output["characters"]);




}


void test_UsageTimeBucket_result_inner_seconds_is_converted_to_json()
{
    bourne::json input =
    {
        "seconds", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["seconds"] == output["seconds"]);




}


void test_UsageTimeBucket_result_inner_usage_bytes_is_converted_to_json()
{
    bourne::json input =
    {
        "usage_bytes", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["usage_bytes"] == output["usage_bytes"]);




}


void test_UsageTimeBucket_result_inner_sessions_is_converted_to_json()
{
    bourne::json input =
    {
        "sessions", 1
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sessions"] == output["sessions"]);




}



void test_UsageTimeBucket_result_inner_line_item_is_converted_to_json()
{

    bourne::json input =
    {
        "line_item", "hello"
    };

    UsageTimeBucket_result_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["line_item"] == output["line_item"]);



}


