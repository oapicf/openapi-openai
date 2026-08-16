

#include "RunStepDetailsToolCallsObject.h"

using namespace Tiny;

RunStepDetailsToolCallsObject::RunStepDetailsToolCallsObject()
{
	type = std::string();
	tool_calls = std::list<RunStepDetailsToolCallsObject_tool_calls_inner>();
}

RunStepDetailsToolCallsObject::RunStepDetailsToolCallsObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsToolCallsObject::~RunStepDetailsToolCallsObject()
{

}

void
RunStepDetailsToolCallsObject::fromJson(std::string jsonObj)
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


        std::list<RunStepDetailsToolCallsObject_tool_calls_inner> tool_calls_list;
        RunStepDetailsToolCallsObject_tool_calls_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tool_calls_list.push_back(element);
        }
        tool_calls = tool_calls_list;


    }


}

bourne::json
RunStepDetailsToolCallsObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();





    std::list<RunStepDetailsToolCallsObject_tool_calls_inner> tool_calls_list = getToolCalls();
    bourne::json tool_calls_arr = bourne::json::array();

    for(auto& var : tool_calls_list)
    {
        RunStepDetailsToolCallsObject_tool_calls_inner obj = var;
        tool_calls_arr.append(obj.toJson());
    }
    object["tool_calls"] = tool_calls_arr;




    return object;

}

std::string
RunStepDetailsToolCallsObject::getType()
{
	return type;
}

void
RunStepDetailsToolCallsObject::setType(std::string  type)
{
	this->type = type;
}

std::list<RunStepDetailsToolCallsObject_tool_calls_inner>
RunStepDetailsToolCallsObject::getToolCalls()
{
	return tool_calls;
}

void
RunStepDetailsToolCallsObject::setToolCalls(std::list <RunStepDetailsToolCallsObject_tool_calls_inner> tool_calls)
{
	this->tool_calls = tool_calls;
}



