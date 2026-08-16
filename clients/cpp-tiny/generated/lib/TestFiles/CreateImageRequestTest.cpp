
#include "CreateImageRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateImageRequest_prompt_is_assigned_from_json()
{


    bourne::json input =
    {
        "prompt", "hello"
    };

    CreateImageRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPrompt().c_str());






}



void test_CreateImageRequest_n_is_assigned_from_json()
{
    bourne::json input =
    {
        "n", 1
    };

    CreateImageRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getN());








}


void test_CreateImageRequest_quality_is_assigned_from_json()
{


    bourne::json input =
    {
        "quality", "hello"
    };

    CreateImageRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getQuality().c_str());






}


void test_CreateImageRequest_response_format_is_assigned_from_json()
{


    bourne::json input =
    {
        "response_format", "hello"
    };

    CreateImageRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResponseFormat().c_str());






}


void test_CreateImageRequest_size_is_assigned_from_json()
{


    bourne::json input =
    {
        "size", "hello"
    };

    CreateImageRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSize().c_str());






}


void test_CreateImageRequest_style_is_assigned_from_json()
{


    bourne::json input =
    {
        "style", "hello"
    };

    CreateImageRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStyle().c_str());






}


void test_CreateImageRequest_user_is_assigned_from_json()
{


    bourne::json input =
    {
        "user", "hello"
    };

    CreateImageRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUser().c_str());






}



void test_CreateImageRequest_prompt_is_converted_to_json()
{

    bourne::json input =
    {
        "prompt", "hello"
    };

    CreateImageRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["prompt"] == output["prompt"]);



}



void test_CreateImageRequest_n_is_converted_to_json()
{
    bourne::json input =
    {
        "n", 1
    };

    CreateImageRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["n"] == output["n"]);




}


void test_CreateImageRequest_quality_is_converted_to_json()
{

    bourne::json input =
    {
        "quality", "hello"
    };

    CreateImageRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["quality"] == output["quality"]);



}


void test_CreateImageRequest_response_format_is_converted_to_json()
{

    bourne::json input =
    {
        "response_format", "hello"
    };

    CreateImageRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["response_format"] == output["response_format"]);



}


void test_CreateImageRequest_size_is_converted_to_json()
{

    bourne::json input =
    {
        "size", "hello"
    };

    CreateImageRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["size"] == output["size"]);



}


void test_CreateImageRequest_style_is_converted_to_json()
{

    bourne::json input =
    {
        "style", "hello"
    };

    CreateImageRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["style"] == output["style"]);



}


void test_CreateImageRequest_user_is_converted_to_json()
{

    bourne::json input =
    {
        "user", "hello"
    };

    CreateImageRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user"] == output["user"]);



}


