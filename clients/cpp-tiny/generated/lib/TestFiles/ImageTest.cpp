
#include "Image.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Image_b64_json_is_assigned_from_json()
{


    bourne::json input =
    {
        "b64_json", "hello"
    };

    Image obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getB64Json().c_str());






}


void test_Image_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    Image obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}


void test_Image_revised_prompt_is_assigned_from_json()
{


    bourne::json input =
    {
        "revised_prompt", "hello"
    };

    Image obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRevisedPrompt().c_str());






}



void test_Image_b64_json_is_converted_to_json()
{

    bourne::json input =
    {
        "b64_json", "hello"
    };

    Image obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["b64_json"] == output["b64_json"]);



}


void test_Image_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    Image obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


void test_Image_revised_prompt_is_converted_to_json()
{

    bourne::json input =
    {
        "revised_prompt", "hello"
    };

    Image obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["revised_prompt"] == output["revised_prompt"]);



}


