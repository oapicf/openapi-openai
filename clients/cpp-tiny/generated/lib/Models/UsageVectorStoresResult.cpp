

#include "UsageVectorStoresResult.h"

using namespace Tiny;

UsageVectorStoresResult::UsageVectorStoresResult()
{
	object = std::string();
	usage_bytes = int(0);
	project_id = std::string();
}

UsageVectorStoresResult::UsageVectorStoresResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

UsageVectorStoresResult::~UsageVectorStoresResult()
{

}

void
UsageVectorStoresResult::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *usage_bytesKey = "usage_bytes";

    if(object.has_key(usage_bytesKey))
    {
        bourne::json value = object[usage_bytesKey];



        jsonToValue(&usage_bytes, value, "int");


    }

    const char *project_idKey = "project_id";

    if(object.has_key(project_idKey))
    {
        bourne::json value = object[project_idKey];



        jsonToValue(&project_id, value, "std::string");


    }


}

bourne::json
UsageVectorStoresResult::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["usage_bytes"] = getUsageBytes();






    object["project_id"] = getProjectId();



    return object;

}

std::string
UsageVectorStoresResult::getObject()
{
	return object;
}

void
UsageVectorStoresResult::setObject(std::string  object)
{
	this->object = object;
}

int
UsageVectorStoresResult::getUsageBytes()
{
	return usage_bytes;
}

void
UsageVectorStoresResult::setUsageBytes(int  usage_bytes)
{
	this->usage_bytes = usage_bytes;
}

std::string
UsageVectorStoresResult::getProjectId()
{
	return project_id;
}

void
UsageVectorStoresResult::setProjectId(std::string  project_id)
{
	this->project_id = project_id;
}



