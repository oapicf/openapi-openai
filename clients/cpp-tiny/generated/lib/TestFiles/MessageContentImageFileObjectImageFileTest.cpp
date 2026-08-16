
#include "MessageContentImageFileObject_image_file.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MessageContentImageFileObject_image_file_file_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "file_id", "hello"
    };

    MessageContentImageFileObject_image_file obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFileId().c_str());






}


void test_MessageContentImageFileObject_image_file_detail_is_assigned_from_json()
{


    bourne::json input =
    {
        "detail", "hello"
    };

    MessageContentImageFileObject_image_file obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDetail().c_str());






}



void test_MessageContentImageFileObject_image_file_file_id_is_converted_to_json()
{

    bourne::json input =
    {
        "file_id", "hello"
    };

    MessageContentImageFileObject_image_file obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["file_id"] == output["file_id"]);



}


void test_MessageContentImageFileObject_image_file_detail_is_converted_to_json()
{

    bourne::json input =
    {
        "detail", "hello"
    };

    MessageContentImageFileObject_image_file obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["detail"] == output["detail"]);



}


