

#include "ModifyAssistantRequest.h"

using namespace Tiny;

ModifyAssistantRequest::ModifyAssistantRequest()
{
	model = std::string();
	name = std::string();
	description = std::string();
	instructions = std::string();
	tools = std::list<AssistantObject_tools_inner>();
	tool_resources = ModifyAssistantRequest_tool_resources();
	metadata = null;
	temperature = float(0);
	top_p = float(0);
	response_format = AssistantsApiResponseFormatOption();
}

ModifyAssistantRequest::ModifyAssistantRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ModifyAssistantRequest::~ModifyAssistantRequest()
{

}

void
ModifyAssistantRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];



        jsonToValue(&model, value, "std::string");


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




        ModifyAssistantRequest_tool_resources* obj = &tool_resources;
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
ModifyAssistantRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["model"] = getModel();






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

std::string
ModifyAssistantRequest::getModel()
{
	return model;
}

void
ModifyAssistantRequest::setModel(std::string  model)
{
	this->model = model;
}

std::string
ModifyAssistantRequest::getName()
{
	return name;
}

void
ModifyAssistantRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
ModifyAssistantRequest::getDescription()
{
	return description;
}

void
ModifyAssistantRequest::setDescription(std::string  description)
{
	this->description = description;
}

std::string
ModifyAssistantRequest::getInstructions()
{
	return instructions;
}

void
ModifyAssistantRequest::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::list<AssistantObject_tools_inner>
ModifyAssistantRequest::getTools()
{
	return tools;
}

void
ModifyAssistantRequest::setTools(std::list <AssistantObject_tools_inner> tools)
{
	this->tools = tools;
}

ModifyAssistantRequest_tool_resources
ModifyAssistantRequest::getToolResources()
{
	return tool_resources;
}

void
ModifyAssistantRequest::setToolResources(ModifyAssistantRequest_tool_resources  tool_resources)
{
	this->tool_resources = tool_resources;
}

Object
ModifyAssistantRequest::getMetadata()
{
	return metadata;
}

void
ModifyAssistantRequest::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}

long
ModifyAssistantRequest::getTemperature()
{
	return temperature;
}

void
ModifyAssistantRequest::setTemperature(long  temperature)
{
	this->temperature = temperature;
}

long
ModifyAssistantRequest::getTopP()
{
	return top_p;
}

void
ModifyAssistantRequest::setTopP(long  top_p)
{
	this->top_p = top_p;
}

AssistantsApiResponseFormatOption
ModifyAssistantRequest::getResponseFormat()
{
	return response_format;
}

void
ModifyAssistantRequest::setResponseFormat(AssistantsApiResponseFormatOption  response_format)
{
	this->response_format = response_format;
}



