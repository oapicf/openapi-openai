
#include "RunStepDeltaStepDetailsMessageCreationObject_message_creation.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RunStepDeltaStepDetailsMessageCreationObject_message_creation_message_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "message_id", "hello"
    };

    RunStepDeltaStepDetailsMessageCreationObject_message_creation obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessageId().c_str());






}



void test_RunStepDeltaStepDetailsMessageCreationObject_message_creation_message_id_is_converted_to_json()
{

    bourne::json input =
    {
        "message_id", "hello"
    };

    RunStepDeltaStepDetailsMessageCreationObject_message_creation obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message_id"] == output["message_id"]);



}


