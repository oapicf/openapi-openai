

#include "AssistantObject.h"

using namespace Tiny;

AssistantObject::AssistantObject()
{
	id = std::string();
	object = std::string();
	created_at = int(0);
	name = std::string();
	description = std::string();
	model = std::string();
	instructions = std::string();
	tools = std::list<AssistantObject_tools_inner>();
	tool_resources = AssistantObject_tool_resources();
	metadata = null;
	temperature = float(0);
	top_p = float(0);
	response_format = AssistantsApiResponseFormatOption();
}

AssistantObject::AssistantObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssistantObject::~AssistantObject()
{

}

void
AssistantObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


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

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];



        jsonToValue(&model, value, "std::string");


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




        AssistantObject_tool_resources* obj = &tool_resources;
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
AssistantObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();






    object["created_at"] = getCreatedAt();






    object["name"] = getName();






    object["description"] = getDescription();






    object["model"] = getModel();






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
AssistantObject::getId()
{
	return id;
}

void
AssistantObject::setId(std::string  id)
{
	this->id = id;
}

std::string
AssistantObject::getObject()
{
	return object;
}

void
AssistantObject::setObject(std::string  object)
{
	this->object = object;
}

int
AssistantObject::getCreatedAt()
{
	return created_at;
}

void
AssistantObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
AssistantObject::getName()
{
	return name;
}

void
AssistantObject::setName(std::string  name)
{
	this->name = name;
}

std::string
AssistantObject::getDescription()
{
	return description;
}

void
AssistantObject::setDescription(std::string  description)
{
	this->description = description;
}

std::string
AssistantObject::getModel()
{
	return model;
}

void
AssistantObject::setModel(std::string  model)
{
	this->model = model;
}

std::string
AssistantObject::getInstructions()
{
	return instructions;
}

void
AssistantObject::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::list<AssistantObject_tools_inner>
AssistantObject::getTools()
{
	return tools;
}

void
AssistantObject::setTools(std::list <AssistantObject_tools_inner> tools)
{
	this->tools = tools;
}

AssistantObject_tool_resources
AssistantObject::getToolResources()
{
	return tool_resources;
}

void
AssistantObject::setToolResources(AssistantObject_tool_resources  tool_resources)
{
	this->tool_resources = tool_resources;
}

Object
AssistantObject::getMetadata()
{
	return metadata;
}

void
AssistantObject::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}

long
AssistantObject::getTemperature()
{
	return temperature;
}

void
AssistantObject::setTemperature(long  temperature)
{
	this->temperature = temperature;
}

long
AssistantObject::getTopP()
{
	return top_p;
}

void
AssistantObject::setTopP(long  top_p)
{
	this->top_p = top_p;
}

AssistantsApiResponseFormatOption
AssistantObject::getResponseFormat()
{
	return response_format;
}

void
AssistantObject::setResponseFormat(AssistantsApiResponseFormatOption  response_format)
{
	this->response_format = response_format;
}



