

#include "RunStepDeltaObject_delta_step_details.h"

using namespace Tiny;

RunStepDeltaObject_delta_step_details::RunStepDeltaObject_delta_step_details()
{
	type = std::string();
	message_creation = RunStepDeltaStepDetailsMessageCreationObject_message_creation();
	tool_calls = std::list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner>();
}

RunStepDeltaObject_delta_step_details::RunStepDeltaObject_delta_step_details(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaObject_delta_step_details::~RunStepDeltaObject_delta_step_details()
{

}

void
RunStepDeltaObject_delta_step_details::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *message_creationKey = "message_creation";

    if(object.has_key(message_creationKey))
    {
        bourne::json value = object[message_creationKey];




        RunStepDeltaStepDetailsMessageCreationObject_message_creation* obj = &message_creation;
		obj->fromJson(value.dump());

    }

    const char *tool_callsKey = "tool_calls";

    if(object.has_key(tool_callsKey))
    {
        bourne::json value = object[tool_callsKey];


        std::list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> tool_calls_list;
        RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tool_calls_list.push_back(element);
        }
        tool_calls = tool_calls_list;


    }


}

bourne::json
RunStepDeltaObject_delta_step_details::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["message_creation"] = getMessageCreation().toJson();




    std::list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> tool_calls_list = getToolCalls();
    bourne::json tool_calls_arr = bourne::json::array();

    for(auto& var : tool_calls_list)
    {
        RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner obj = var;
        tool_calls_arr.append(obj.toJson());
    }
    object["tool_calls"] = tool_calls_arr;




    return object;

}

std::string
RunStepDeltaObject_delta_step_details::getType()
{
	return type;
}

void
RunStepDeltaObject_delta_step_details::setType(std::string  type)
{
	this->type = type;
}

RunStepDeltaStepDetailsMessageCreationObject_message_creation
RunStepDeltaObject_delta_step_details::getMessageCreation()
{
	return message_creation;
}

void
RunStepDeltaObject_delta_step_details::setMessageCreation(RunStepDeltaStepDetailsMessageCreationObject_message_creation  message_creation)
{
	this->message_creation = message_creation;
}

std::list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner>
RunStepDeltaObject_delta_step_details::getToolCalls()
{
	return tool_calls;
}

void
RunStepDeltaObject_delta_step_details::setToolCalls(std::list <RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> tool_calls)
{
	this->tool_calls = tool_calls;
}



