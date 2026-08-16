
#include "CreateMessageRequest_attachments_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateMessageRequest_attachments_inner_file_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "file_id", "hello"
    };

    CreateMessageRequest_attachments_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFileId().c_str());






}




void test_CreateMessageRequest_attachments_inner_file_id_is_converted_to_json()
{

    bourne::json input =
    {
        "file_id", "hello"
    };

    CreateMessageRequest_attachments_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["file_id"] == output["file_id"]);



}



