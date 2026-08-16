

#include "RunStepDeltaStepDetailsToolCallsObject.h"

using namespace Tiny;

RunStepDeltaStepDetailsToolCallsObject::RunStepDeltaStepDetailsToolCallsObject()
{
	type = std::string();
	tool_calls = std::list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner>();
}

RunStepDeltaStepDetailsToolCallsObject::RunStepDeltaStepDetailsToolCallsObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaStepDetailsToolCallsObject::~RunStepDeltaStepDetailsToolCallsObject()
{

}

void
RunStepDeltaStepDetailsToolCallsObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


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
RunStepDeltaStepDetailsToolCallsObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();





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
RunStepDeltaStepDetailsToolCallsObject::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsObject::setType(std::string  type)
{
	this->type = type;
}

std::list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner>
RunStepDeltaStepDetailsToolCallsObject::getToolCalls()
{
	return tool_calls;
}

void
RunStepDeltaStepDetailsToolCallsObject::setToolCalls(std::list <RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> tool_calls)
{
	this->tool_calls = tool_calls;
}



