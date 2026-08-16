

#include "CreateThreadAndRunRequest.h"

using namespace Tiny;

CreateThreadAndRunRequest::CreateThreadAndRunRequest()
{
	assistant_id = std::string();
	thread = CreateThreadRequest();
	model = CreateRunRequest_model();
	instructions = std::string();
	tools = std::list<CreateThreadAndRunRequest_tools_inner>();
	tool_resources = CreateThreadAndRunRequest_tool_resources();
	metadata = null;
	temperature = float(0);
	top_p = float(0);
	stream = bool(false);
	max_prompt_tokens = int(0);
	max_completion_tokens = int(0);
	truncation_strategy = TruncationObject();
	tool_choice = AssistantsApiToolChoiceOption();
	parallel_tool_calls = bool(false);
	response_format = AssistantsApiResponseFormatOption();
}

CreateThreadAndRunRequest::CreateThreadAndRunRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateThreadAndRunRequest::~CreateThreadAndRunRequest()
{

}

void
CreateThreadAndRunRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *assistant_idKey = "assistant_id";

    if(object.has_key(assistant_idKey))
    {
        bourne::json value = object[assistant_idKey];



        jsonToValue(&assistant_id, value, "std::string");


    }

    const char *threadKey = "thread";

    if(object.has_key(threadKey))
    {
        bourne::json value = object[threadKey];




        CreateThreadRequest* obj = &thread;
		obj->fromJson(value.dump());

    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];




        CreateRunRequest_model* obj = &model;
		obj->fromJson(value.dump());

    }

    const char *instructionsKey = "instructions";

    if(object.has_key(instructionsKey))
    {
        bourne::json value = object[instructionsKey];



        jsonToValue(&instructions, value, "std::string");


    }

    const char *toolsKey = "tools";

    if(object.has_key(toolsKey))
    {
        bourne::json value = object[toolsKey];


        std::list<CreateThreadAndRunRequest_tools_inner> tools_list;
        CreateThreadAndRunRequest_tools_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tools_list.push_back(element);
        }
        tools = tools_list;


    }

    const char *tool_resourcesKey = "tool_resources";

    if(object.has_key(tool_resourcesKey))
    {
        bourne::json value = object[tool_resourcesKey];




        CreateThreadAndRunRequest_tool_resources* obj = &tool_resources;
		obj->fromJson(value.dump());

    }

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];




        Object* obj = &metadata;
		obj->fromJson(value.dump());

    }

    const char *temperatureKey = "temperature";

    if(object.has_key(temperatureKey))
    {
        bourne::json value = object[temperatureKey];



        jsonToValue(&temperature, value, "long");


    }

    const char *top_pKey = "top_p";

    if(object.has_key(top_pKey))
    {
        bourne::json value = object[top_pKey];



        jsonToValue(&top_p, value, "long");


    }

    const char *streamKey = "stream";

    if(object.has_key(streamKey))
    {
        bourne::json value = object[streamKey];



        jsonToValue(&stream, value, "bool");


    }

    const char *max_prompt_tokensKey = "max_prompt_tokens";

    if(object.has_key(max_prompt_tokensKey))
    {
        bourne::json value = object[max_prompt_tokensKey];



        jsonToValue(&max_prompt_tokens, value, "int");


    }

    const char *max_completion_tokensKey = "max_completion_tokens";

    if(object.has_key(max_completion_tokensKey))
    {
        bourne::json value = object[max_completion_tokensKey];



        jsonToValue(&max_completion_tokens, value, "int");


    }

    const char *truncation_strategyKey = "truncation_strategy";

    if(object.has_key(truncation_strategyKey))
    {
        bourne::json value = object[truncation_strategyKey];




        TruncationObject* obj = &truncation_strategy;
		obj->fromJson(value.dump());

    }

    const char *tool_choiceKey = "tool_choice";

    if(object.has_key(tool_choiceKey))
    {
        bourne::json value = object[tool_choiceKey];




        AssistantsApiToolChoiceOption* obj = &tool_choice;
		obj->fromJson(value.dump());

    }

    const char *parallel_tool_callsKey = "parallel_tool_calls";

    if(object.has_key(parallel_tool_callsKey))
    {
        bourne::json value = object[parallel_tool_callsKey];



        jsonToValue(&parallel_tool_calls, value, "bool");


    }

    const char *response_formatKey = "response_format";

    if(object.has_key(response_formatKey))
    {
        bourne::json value = object[response_formatKey];




        AssistantsApiResponseFormatOption* obj = &response_format;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateThreadAndRunRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["assistant_id"] = getAssistantId();







	object["thread"] = getThread().toJson();






	object["model"] = getModel().toJson();





    object["instructions"] = getInstructions();





    std::list<CreateThreadAndRunRequest_tools_inner> tools_list = getTools();
    bourne::json tools_arr = bourne::json::array();

    for(auto& var : tools_list)
    {
        CreateThreadAndRunRequest_tools_inner obj = var;
        tools_arr.append(obj.toJson());
    }
    object["tools"] = tools_arr;








	object["tool_resources"] = getToolResources().toJson();






	object["metadata"] = getMetadata().toJson();





    object["temperature"] = getTemperature();






    object["top_p"] = getTopP();






    object["stream"] = isStream();






    object["max_prompt_tokens"] = getMaxPromptTokens();






    object["max_completion_tokens"] = getMaxCompletionTokens();







	object["truncation_strategy"] = getTruncationStrategy().toJson();






	object["tool_choice"] = getToolChoice().toJson();





    object["parallel_tool_calls"] = isParallelToolCalls();







	object["response_format"] = getResponseFormat().toJson();


    return object;

}

std::string
CreateThreadAndRunRequest::getAssistantId()
{
	return assistant_id;
}

void
CreateThreadAndRunRequest::setAssistantId(std::string  assistant_id)
{
	this->assistant_id = assistant_id;
}

CreateThreadRequest
CreateThreadAndRunRequest::getThread()
{
	return thread;
}

void
CreateThreadAndRunRequest::setThread(CreateThreadRequest  thread)
{
	this->thread = thread;
}

CreateRunRequest_model
CreateThreadAndRunRequest::getModel()
{
	return model;
}

void
CreateThreadAndRunRequest::setModel(CreateRunRequest_model  model)
{
	this->model = model;
}

std::string
CreateThreadAndRunRequest::getInstructions()
{
	return instructions;
}

void
CreateThreadAndRunRequest::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::list<CreateThreadAndRunRequest_tools_inner>
CreateThreadAndRunRequest::getTools()
{
	return tools;
}

void
CreateThreadAndRunRequest::setTools(std::list <CreateThreadAndRunRequest_tools_inner> tools)
{
	this->tools = tools;
}

CreateThreadAndRunRequest_tool_resources
CreateThreadAndRunRequest::getToolResources()
{
	return tool_resources;
}

void
CreateThreadAndRunRequest::setToolResources(CreateThreadAndRunRequest_tool_resources  tool_resources)
{
	this->tool_resources = tool_resources;
}

Object
CreateThreadAndRunRequest::getMetadata()
{
	return metadata;
}

void
CreateThreadAndRunRequest::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}

long
CreateThreadAndRunRequest::getTemperature()
{
	return temperature;
}

void
CreateThreadAndRunRequest::setTemperature(long  temperature)
{
	this->temperature = temperature;
}

long
CreateThreadAndRunRequest::getTopP()
{
	return top_p;
}

void
CreateThreadAndRunRequest::setTopP(long  top_p)
{
	this->top_p = top_p;
}

bool
CreateThreadAndRunRequest::isStream()
{
	return stream;
}

void
CreateThreadAndRunRequest::setStream(bool  stream)
{
	this->stream = stream;
}

int
CreateThreadAndRunRequest::getMaxPromptTokens()
{
	return max_prompt_tokens;
}

void
CreateThreadAndRunRequest::setMaxPromptTokens(int  max_prompt_tokens)
{
	this->max_prompt_tokens = max_prompt_tokens;
}

int
CreateThreadAndRunRequest::getMaxCompletionTokens()
{
	return max_completion_tokens;
}

void
CreateThreadAndRunRequest::setMaxCompletionTokens(int  max_completion_tokens)
{
	this->max_completion_tokens = max_completion_tokens;
}

TruncationObject
CreateThreadAndRunRequest::getTruncationStrategy()
{
	return truncation_strategy;
}

void
CreateThreadAndRunRequest::setTruncationStrategy(TruncationObject  truncation_strategy)
{
	this->truncation_strategy = truncation_strategy;
}

AssistantsApiToolChoiceOption
CreateThreadAndRunRequest::getToolChoice()
{
	return tool_choice;
}

void
CreateThreadAndRunRequest::setToolChoice(AssistantsApiToolChoiceOption  tool_choice)
{
	this->tool_choice = tool_choice;
}

bool
CreateThreadAndRunRequest::isParallelToolCalls()
{
	return parallel_tool_calls;
}

void
CreateThreadAndRunRequest::setParallelToolCalls(bool  parallel_tool_calls)
{
	this->parallel_tool_calls = parallel_tool_calls;
}

AssistantsApiResponseFormatOption
CreateThreadAndRunRequest::getResponseFormat()
{
	return response_format;
}

void
CreateThreadAndRunRequest::setResponseFormat(AssistantsApiResponseFormatOption  response_format)
{
	this->response_format = response_format;
}



