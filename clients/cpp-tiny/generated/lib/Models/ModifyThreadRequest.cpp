

#include "ModifyThreadRequest.h"

using namespace Tiny;

ModifyThreadRequest::ModifyThreadRequest()
{
	tool_resources = ModifyThreadRequest_tool_resources();
	metadata = null;
}

ModifyThreadRequest::ModifyThreadRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ModifyThreadRequest::~ModifyThreadRequest()
{

}

void
ModifyThreadRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *tool_resourcesKey = "tool_resources";

    if(object.has_key(tool_resourcesKey))
    {
        bourne::json value = object[tool_resourcesKey];




        ModifyThreadRequest_tool_resources* obj = &tool_resources;
		obj->fromJson(value.dump());

    }

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];




        Object* obj = &metadata;
		obj->fromJson(value.dump());

    }


}

bourne::json
ModifyThreadRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["tool_resources"] = getToolResources().toJson();






	object["metadata"] = getMetadata().toJson();


    return object;

}

ModifyThreadRequest_tool_resources
ModifyThreadRequest::getToolResources()
{
	return tool_resources;
}

void
ModifyThreadRequest::setToolResources(ModifyThreadRequest_tool_resources  tool_resources)
{
	this->tool_resources = tool_resources;
}

Object
ModifyThreadRequest::getMetadata()
{
	return metadata;
}

void
ModifyThreadRequest::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}



