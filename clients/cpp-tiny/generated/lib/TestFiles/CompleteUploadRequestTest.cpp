
#include "CompleteUploadRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CompleteUploadRequest_md5_is_assigned_from_json()
{


    bourne::json input =
    {
        "md5", "hello"
    };

    CompleteUploadRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMd5().c_str());






}




void test_CompleteUploadRequest_md5_is_converted_to_json()
{

    bourne::json input =
    {
        "md5", "hello"
    };

    CompleteUploadRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["md5"] == output["md5"]);



}


