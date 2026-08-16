

#include "SubmitToolOutputsRunRequest.h"

using namespace Tiny;

SubmitToolOutputsRunRequest::SubmitToolOutputsRunRequest()
{
	tool_outputs = std::list<SubmitToolOutputsRunRequest_tool_outputs_inner>();
	stream = bool(false);
}

SubmitToolOutputsRunRequest::SubmitToolOutputsRunRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SubmitToolOutputsRunRequest::~SubmitToolOutputsRunRequest()
{

}

void
SubmitToolOutputsRunRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *tool_outputsKey = "tool_outputs";

    if(object.has_key(tool_outputsKey))
    {
        bourne::json value = object[tool_outputsKey];


        std::list<SubmitToolOutputsRunRequest_tool_outputs_inner> tool_outputs_list;
        SubmitToolOutputsRunRequest_tool_outputs_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tool_outputs_list.push_back(element);
        }
        tool_outputs = tool_outputs_list;


    }

    const char *streamKey = "stream";

    if(object.has_key(streamKey))
    {
        bourne::json value = object[streamKey];



        jsonToValue(&stream, value, "bool");


    }


}

bourne::json
SubmitToolOutputsRunRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<SubmitToolOutputsRunRequest_tool_outputs_inner> tool_outputs_list = getToolOutputs();
    bourne::json tool_outputs_arr = bourne::json::array();

    for(auto& var : tool_outputs_list)
    {
        SubmitToolOutputsRunRequest_tool_outputs_inner obj = var;
        tool_outputs_arr.append(obj.toJson());
    }
    object["tool_outputs"] = tool_outputs_arr;







    object["stream"] = isStream();



    return object;

}

std::list<SubmitToolOutputsRunRequest_tool_outputs_inner>
SubmitToolOutputsRunRequest::getToolOutputs()
{
	return tool_outputs;
}

void
SubmitToolOutputsRunRequest::setToolOutputs(std::list <SubmitToolOutputsRunRequest_tool_outputs_inner> tool_outputs)
{
	this->tool_outputs = tool_outputs;
}

bool
SubmitToolOutputsRunRequest::isStream()
{
	return stream;
}

void
SubmitToolOutputsRunRequest::setStream(bool  stream)
{
	this->stream = stream;
}



