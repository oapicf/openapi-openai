
#include "CreateEmbeddingRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_CreateEmbeddingRequest_encoding_format_is_assigned_from_json()
{


    bourne::json input =
    {
        "encoding_format", "hello"
    };

    CreateEmbeddingRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEncodingFormat().c_str());






}


void test_CreateEmbeddingRequest_dimensions_is_assigned_from_json()
{
    bourne::json input =
    {
        "dimensions", 1
    };

    CreateEmbeddingRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDimensions());








}


void test_CreateEmbeddingRequest_user_is_assigned_from_json()
{


    bourne::json input =
    {
        "user", "hello"
    };

    CreateEmbeddingRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUser().c_str());






}





void test_CreateEmbeddingRequest_encoding_format_is_converted_to_json()
{

    bourne::json input =
    {
        "encoding_format", "hello"
    };

    CreateEmbeddingRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["encoding_format"] == output["encoding_format"]);



}


void test_CreateEmbeddingRequest_dimensions_is_converted_to_json()
{
    bourne::json input =
    {
        "dimensions", 1
    };

    CreateEmbeddingRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["dimensions"] == output["dimensions"]);




}


void test_CreateEmbeddingRequest_user_is_converted_to_json()
{

    bourne::json input =
    {
        "user", "hello"
    };

    CreateEmbeddingRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user"] == output["user"]);



}


