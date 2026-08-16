
#include "CreateCompletionRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_CreateCompletionRequest_best_of_is_assigned_from_json()
{
    bourne::json input =
    {
        "best_of", 1
    };

    CreateCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBestOf());








}


void test_CreateCompletionRequest_echo_is_assigned_from_json()
{




    bourne::json input =
    {
        "echo", true
    };

    CreateCompletionRequest obj(input.dump());

    TEST_ASSERT(true == obj.isEcho());




}


void test_CreateCompletionRequest_frequency_penalty_is_assigned_from_json()
{








}


void test_CreateCompletionRequest_logit_bias_is_assigned_from_json()
{








}


void test_CreateCompletionRequest_logprobs_is_assigned_from_json()
{
    bourne::json input =
    {
        "logprobs", 1
    };

    CreateCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLogprobs());








}


void test_CreateCompletionRequest_max_tokens_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_tokens", 1
    };

    CreateCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxTokens());








}


void test_CreateCompletionRequest_n_is_assigned_from_json()
{
    bourne::json input =
    {
        "n", 1
    };

    CreateCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getN());








}


void test_CreateCompletionRequest_presence_penalty_is_assigned_from_json()
{








}


void test_CreateCompletionRequest_seed_is_assigned_from_json()
{
    bourne::json input =
    {
        "seed", 1
    };

    CreateCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSeed());








}



void test_CreateCompletionRequest_stream_is_assigned_from_json()
{




    bourne::json input =
    {
        "stream", true
    };

    CreateCompletionRequest obj(input.dump());

    TEST_ASSERT(true == obj.isStream());




}



void test_CreateCompletionRequest_suffix_is_assigned_from_json()
{


    bourne::json input =
    {
        "suffix", "hello"
    };

    CreateCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSuffix().c_str());






}


void test_CreateCompletionRequest_temperature_is_assigned_from_json()
{








}


void test_CreateCompletionRequest_top_p_is_assigned_from_json()
{








}


void test_CreateCompletionRequest_user_is_assigned_from_json()
{


    bourne::json input =
    {
        "user", "hello"
    };

    CreateCompletionRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUser().c_str());






}





void test_CreateCompletionRequest_best_of_is_converted_to_json()
{
    bourne::json input =
    {
        "best_of", 1
    };

    CreateCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["best_of"] == output["best_of"]);




}


void test_CreateCompletionRequest_echo_is_converted_to_json()
{


    bourne::json input =
    {
        "echo", true
    };

    CreateCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["echo"] == output["echo"]);


}


void test_CreateCompletionRequest_frequency_penalty_is_converted_to_json()
{




}


void test_CreateCompletionRequest_logit_bias_is_converted_to_json()
{




}


void test_CreateCompletionRequest_logprobs_is_converted_to_json()
{
    bourne::json input =
    {
        "logprobs", 1
    };

    CreateCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["logprobs"] == output["logprobs"]);




}


void test_CreateCompletionRequest_max_tokens_is_converted_to_json()
{
    bourne::json input =
    {
        "max_tokens", 1
    };

    CreateCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_tokens"] == output["max_tokens"]);




}


void test_CreateCompletionRequest_n_is_converted_to_json()
{
    bourne::json input =
    {
        "n", 1
    };

    CreateCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["n"] == output["n"]);




}


void test_CreateCompletionRequest_presence_penalty_is_converted_to_json()
{




}


void test_CreateCompletionRequest_seed_is_converted_to_json()
{
    bourne::json input =
    {
        "seed", 1
    };

    CreateCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["seed"] == output["seed"]);




}



void test_CreateCompletionRequest_stream_is_converted_to_json()
{


    bourne::json input =
    {
        "stream", true
    };

    CreateCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stream"] == output["stream"]);


}



void test_CreateCompletionRequest_suffix_is_converted_to_json()
{

    bourne::json input =
    {
        "suffix", "hello"
    };

    CreateCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["suffix"] == output["suffix"]);



}


void test_CreateCompletionRequest_temperature_is_converted_to_json()
{




}


void test_CreateCompletionRequest_top_p_is_converted_to_json()
{




}


void test_CreateCompletionRequest_user_is_converted_to_json()
{

    bourne::json input =
    {
        "user", "hello"
    };

    CreateCompletionRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user"] == output["user"]);



}


