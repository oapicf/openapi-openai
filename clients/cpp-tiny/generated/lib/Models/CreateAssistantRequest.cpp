

#include "CreateAssistantRequest.h"

using namespace Tiny;

CreateAssistantRequest::CreateAssistantRequest()
{
	model = CreateAssistantRequest_model();
	name = std::string();
	description = std::string();
	instructions = std::string();
	tools = std::list<AssistantObject_tools_inner>();
	tool_resources = CreateAssistantRequest_tool_resources();
	metadata = null;
	temperature = float(0);
	top_p = float(0);
	response_format = AssistantsApiResponseFormatOption();
}

CreateAssistantRequest::CreateAssistantRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateAssistantRequest::~CreateAssistantRequest()
{

}

void
CreateAssistantRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];




        CreateAssistantRequest_model* obj = &model;
		obj->fromJson(value.dump());

    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


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


        std::list<AssistantObject_tools_inner> tools_list;
        AssistantObject_tools_inner element;
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




        CreateAssistantRequest_tool_resources* obj = &tool_resources;
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

    const char *response_formatKey = "response_format";

    if(object.has_key(response_formatKey))
    {
        bourne::json value = object[response_formatKey];




        AssistantsApiResponseFormatOption* obj = &response_format;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateAssistantRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["model"] = getModel().toJson();





    object["name"] = getName();






    object["description"] = getDescription();






    object["instructions"] = getInstructions();





    std::list<AssistantObject_tools_inner> tools_list = getTools();
    bourne::json tools_arr = bourne::json::array();

    for(auto& var : tools_list)
    {
        AssistantObject_tools_inner obj = var;
        tools_arr.append(obj.toJson());
    }
    object["tools"] = tools_arr;








	object["tool_resources"] = getToolResources().toJson();






	object["metadata"] = getMetadata().toJson();





    object["temperature"] = getTemperature();






    object["top_p"] = getTopP();







	object["response_format"] = getResponseFormat().toJson();


    return object;

}

CreateAssistantRequest_model
CreateAssistantRequest::getModel()
{
	return model;
}

void
CreateAssistantRequest::setModel(CreateAssistantRequest_model  model)
{
	this->model = model;
}

std::string
CreateAssistantRequest::getName()
{
	return name;
}

void
CreateAssistantRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
CreateAssistantRequest::getDescription()
{
	return description;
}

void
CreateAssistantRequest::setDescription(std::string  description)
{
	this->description = description;
}

std::string
CreateAssistantRequest::getInstructions()
{
	return instructions;
}

void
CreateAssistantRequest::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::list<AssistantObject_tools_inner>
CreateAssistantRequest::getTools()
{
	return tools;
}

void
CreateAssistantRequest::setTools(std::list <AssistantObject_tools_inner> tools)
{
	this->tools = tools;
}

CreateAssistantRequest_tool_resources
CreateAssistantRequest::getToolResources()
{
	return tool_resources;
}

void
CreateAssistantRequest::setToolResources(CreateAssistantRequest_tool_resources  tool_resources)
{
	this->tool_resources = tool_resources;
}

Object
CreateAssistantRequest::getMetadata()
{
	return metadata;
}

void
CreateAssistantRequest::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}

long
CreateAssistantRequest::getTemperature()
{
	return temperature;
}

void
CreateAssistantRequest::setTemperature(long  temperature)
{
	this->temperature = temperature;
}

long
CreateAssistantRequest::getTopP()
{
	return top_p;
}

void
CreateAssistantRequest::setTopP(long  top_p)
{
	this->top_p = top_p;
}

AssistantsApiResponseFormatOption
CreateAssistantRequest::getResponseFormat()
{
	return response_format;
}

void
CreateAssistantRequest::setResponseFormat(AssistantsApiResponseFormatOption  response_format)
{
	this->response_format = response_format;
}



