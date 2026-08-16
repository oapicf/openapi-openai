

#include "SubmitToolOutputsRunRequest_tool_outputs_inner.h"

using namespace Tiny;

SubmitToolOutputsRunRequest_tool_outputs_inner::SubmitToolOutputsRunRequest_tool_outputs_inner()
{
	tool_call_id = std::string();
	output = std::string();
}

SubmitToolOutputsRunRequest_tool_outputs_inner::SubmitToolOutputsRunRequest_tool_outputs_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

SubmitToolOutputsRunRequest_tool_outputs_inner::~SubmitToolOutputsRunRequest_tool_outputs_inner()
{

}

void
SubmitToolOutputsRunRequest_tool_outputs_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *tool_call_idKey = "tool_call_id";

    if(object.has_key(tool_call_idKey))
    {
        bourne::json value = object[tool_call_idKey];



        jsonToValue(&tool_call_id, value, "std::string");


    }

    const char *outputKey = "output";

    if(object.has_key(outputKey))
    {
        bourne::json value = object[outputKey];



        jsonToValue(&output, value, "std::string");


    }


}

bourne::json
SubmitToolOutputsRunRequest_tool_outputs_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["tool_call_id"] = getToolCallId();






    object["output"] = getOutput();



    return object;

}

std::string
SubmitToolOutputsRunRequest_tool_outputs_inner::getToolCallId()
{
	return tool_call_id;
}

void
SubmitToolOutputsRunRequest_tool_outputs_inner::setToolCallId(std::string  tool_call_id)
{
	this->tool_call_id = tool_call_id;
}

std::string
SubmitToolOutputsRunRequest_tool_outputs_inner::getOutput()
{
	return output;
}

void
SubmitToolOutputsRunRequest_tool_outputs_inner::setOutput(std::string  output)
{
	this->output = output;
}



