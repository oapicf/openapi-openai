
#include "CreateEmbeddingResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CreateEmbeddingResponse_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "model", "hello"
    };

    CreateEmbeddingResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getModel().c_str());






}


void test_CreateEmbeddingResponse_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    CreateEmbeddingResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}





void test_CreateEmbeddingResponse_model_is_converted_to_json()
{

    bourne::json input =
    {
        "model", "hello"
    };

    CreateEmbeddingResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["model"] == output["model"]);



}


void test_CreateEmbeddingResponse_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    CreateEmbeddingResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}



