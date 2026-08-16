

#include "RunObject_required_action.h"

using namespace Tiny;

RunObject_required_action::RunObject_required_action()
{
	type = std::string();
	submit_tool_outputs = RunObject_required_action_submit_tool_outputs();
}

RunObject_required_action::RunObject_required_action(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunObject_required_action::~RunObject_required_action()
{

}

void
RunObject_required_action::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *submit_tool_outputsKey = "submit_tool_outputs";

    if(object.has_key(submit_tool_outputsKey))
    {
        bourne::json value = object[submit_tool_outputsKey];




        RunObject_required_action_submit_tool_outputs* obj = &submit_tool_outputs;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunObject_required_action::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["submit_tool_outputs"] = getSubmitToolOutputs().toJson();


    return object;

}

std::string
RunObject_required_action::getType()
{
	return type;
}

void
RunObject_required_action::setType(std::string  type)
{
	this->type = type;
}

RunObject_required_action_submit_tool_outputs
RunObject_required_action::getSubmitToolOutputs()
{
	return submit_tool_outputs;
}

void
RunObject_required_action::setSubmitToolOutputs(RunObject_required_action_submit_tool_outputs  submit_tool_outputs)
{
	this->submit_tool_outputs = submit_tool_outputs;
}



