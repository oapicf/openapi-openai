

#include "ThreadObject.h"

using namespace Tiny;

ThreadObject::ThreadObject()
{
	id = std::string();
	object = std::string();
	created_at = int(0);
	tool_resources = ModifyThreadRequest_tool_resources();
	metadata = null;
}

ThreadObject::ThreadObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

ThreadObject::~ThreadObject()
{

}

void
ThreadObject::fromJson(std::string jsonObj)
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
ThreadObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();






    object["created_at"] = getCreatedAt();







	object["tool_resources"] = getToolResources().toJson();






	object["metadata"] = getMetadata().toJson();


    return object;

}

std::string
ThreadObject::getId()
{
	return id;
}

void
ThreadObject::setId(std::string  id)
{
	this->id = id;
}

std::string
ThreadObject::getObject()
{
	return object;
}

void
ThreadObject::setObject(std::string  object)
{
	this->object = object;
}

int
ThreadObject::getCreatedAt()
{
	return created_at;
}

void
ThreadObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

ModifyThreadRequest_tool_resources
ThreadObject::getToolResources()
{
	return tool_resources;
}

void
ThreadObject::setToolResources(ModifyThreadRequest_tool_resources  tool_resources)
{
	this->tool_resources = tool_resources;
}

Object
ThreadObject::getMetadata()
{
	return metadata;
}

void
ThreadObject::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}



