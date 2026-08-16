
#include "UsageAudioSpeechesResult.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UsageAudioSpeechesResult_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    UsageAudioSpeechesResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_UsageAudioSpeechesResult_characters_is_assigned_from_json()
{
    bourne::json input =
    {
        "characters", 1
    };

    UsageAudioSpeechesResult obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCharacters());








}


void test_UsageAudioSpeechesResult_num_model_requests_is_assigned_from_json()
{
    bourne::json input =
    {
        "num_model_requests", 1
    };

    UsageAudioSpeechesResult obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getNumModelRequests());








}


void test_UsageAudioSpeechesResult_project_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "project_id", "hello"
    };

    UsageAudioSpeechesResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProjectId().c_str());






}


void test_UsageAudioSpeechesResult_user_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "user_id", "hello"
    };

    UsageAudioSpeechesResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUserId().c_str());






}


void test_UsageAudioSpeechesResult_api_key_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "api_key_id", "hello"
    };

    UsageAudioSpeechesResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getApiKeyId().c_str());






}


void test_UsageAudioSpeechesResult_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "model", "hello"
    };

    UsageAudioSpeechesResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getModel().c_str());






}



void test_UsageAudioSpeechesResult_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    UsageAudioSpeechesResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_UsageAudioSpeechesResult_characters_is_converted_to_json()
{
    bourne::json input =
    {
        "characters", 1
    };

    UsageAudioSpeechesResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["characters"] == output["characters"]);




}


void test_UsageAudioSpeechesResult_num_model_requests_is_converted_to_json()
{
    bourne::json input =
    {
        "num_model_requests", 1
    };

    UsageAudioSpeechesResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["num_model_requests"] == output["num_model_requests"]);




}


void test_UsageAudioSpeechesResult_project_id_is_converted_to_json()
{

    bourne::json input =
    {
        "project_id", "hello"
    };

    UsageAudioSpeechesResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["project_id"] == output["project_id"]);



}


void test_UsageAudioSpeechesResult_user_id_is_converted_to_json()
{

    bourne::json input =
    {
        "user_id", "hello"
    };

    UsageAudioSpeechesResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user_id"] == output["user_id"]);



}


void test_UsageAudioSpeechesResult_api_key_id_is_converted_to_json()
{

    bourne::json input =
    {
        "api_key_id", "hello"
    };

    UsageAudioSpeechesResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["api_key_id"] == output["api_key_id"]);



}


void test_UsageAudioSpeechesResult_model_is_converted_to_json()
{

    bourne::json input =
    {
        "model", "hello"
    };

    UsageAudioSpeechesResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["model"] == output["model"]);



}


