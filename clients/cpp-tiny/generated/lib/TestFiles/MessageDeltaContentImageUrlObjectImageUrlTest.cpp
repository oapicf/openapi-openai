
#include "MessageDeltaContentImageUrlObject_image_url.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MessageDeltaContentImageUrlObject_image_url_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    MessageDeltaContentImageUrlObject_image_url obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}


void test_MessageDeltaContentImageUrlObject_image_url_detail_is_assigned_from_json()
{


    bourne::json input =
    {
        "detail", "hello"
    };

    MessageDeltaContentImageUrlObject_image_url obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDetail().c_str());






}



void test_MessageDeltaContentImageUrlObject_image_url_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    MessageDeltaContentImageUrlObject_image_url obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


void test_MessageDeltaContentImageUrlObject_image_url_detail_is_converted_to_json()
{

    bourne::json input =
    {
        "detail", "hello"
    };

    MessageDeltaContentImageUrlObject_image_url obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["detail"] == output["detail"]);



}


