

#include "RunObject_required_action_submit_tool_outputs.h"

using namespace Tiny;

RunObject_required_action_submit_tool_outputs::RunObject_required_action_submit_tool_outputs()
{
	tool_calls = std::list<RunToolCallObject>();
}

RunObject_required_action_submit_tool_outputs::RunObject_required_action_submit_tool_outputs(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunObject_required_action_submit_tool_outputs::~RunObject_required_action_submit_tool_outputs()
{

}

void
RunObject_required_action_submit_tool_outputs::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *tool_callsKey = "tool_calls";

    if(object.has_key(tool_callsKey))
    {
        bourne::json value = object[tool_callsKey];


        std::list<RunToolCallObject> tool_calls_list;
        RunToolCallObject element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tool_calls_list.push_back(element);
        }
        tool_calls = tool_calls_list;


    }


}

bourne::json
RunObject_required_action_submit_tool_outputs::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<RunToolCallObject> tool_calls_list = getToolCalls();
    bourne::json tool_calls_arr = bourne::json::array();

    for(auto& var : tool_calls_list)
    {
        RunToolCallObject obj = var;
        tool_calls_arr.append(obj.toJson());
    }
    object["tool_calls"] = tool_calls_arr;




    return object;

}

std::list<RunToolCallObject>
RunObject_required_action_submit_tool_outputs::getToolCalls()
{
	return tool_calls;
}

void
RunObject_required_action_submit_tool_outputs::setToolCalls(std::list <RunToolCallObject> tool_calls)
{
	this->tool_calls = tool_calls;
}



