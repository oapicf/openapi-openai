

#include "CreateVectorStoreRequest.h"

using namespace Tiny;

CreateVectorStoreRequest::CreateVectorStoreRequest()
{
	file_ids = std::list<std::string>();
	name = std::string();
	expires_after = VectorStoreExpirationAfter();
	chunking_strategy = CreateVectorStoreRequest_chunking_strategy();
	metadata = null;
}

CreateVectorStoreRequest::CreateVectorStoreRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateVectorStoreRequest::~CreateVectorStoreRequest()
{

}

void
CreateVectorStoreRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *file_idsKey = "file_ids";

    if(object.has_key(file_idsKey))
    {
        bourne::json value = object[file_idsKey];


        std::list<std::string> file_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            file_ids_list.push_back(element);
        }
        file_ids = file_ids_list;


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *expires_afterKey = "expires_after";

    if(object.has_key(expires_afterKey))
    {
        bourne::json value = object[expires_afterKey];




        VectorStoreExpirationAfter* obj = &expires_after;
		obj->fromJson(value.dump());

    }

    const char *chunking_strategyKey = "chunking_strategy";

    if(object.has_key(chunking_strategyKey))
    {
        bourne::json value = object[chunking_strategyKey];




        CreateVectorStoreRequest_chunking_strategy* obj = &chunking_strategy;
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
CreateVectorStoreRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> file_ids_list = getFileIds();
    bourne::json file_ids_arr = bourne::json::array();

    for(auto& var : file_ids_list)
    {
        file_ids_arr.append(var);
    }
    object["file_ids"] = file_ids_arr;









    object["name"] = getName();







	object["expires_after"] = getExpiresAfter().toJson();






	object["chunking_strategy"] = getChunkingStrategy().toJson();






	object["metadata"] = getMetadata().toJson();


    return object;

}

std::list<std::string>
CreateVectorStoreRequest::getFileIds()
{
	return file_ids;
}

void
CreateVectorStoreRequest::setFileIds(std::list <std::string> file_ids)
{
	this->file_ids = file_ids;
}

std::string
CreateVectorStoreRequest::getName()
{
	return name;
}

void
CreateVectorStoreRequest::setName(std::string  name)
{
	this->name = name;
}

VectorStoreExpirationAfter
CreateVectorStoreRequest::getExpiresAfter()
{
	return expires_after;
}

void
CreateVectorStoreRequest::setExpiresAfter(VectorStoreExpirationAfter  expires_after)
{
	this->expires_after = expires_after;
}

CreateVectorStoreRequest_chunking_strategy
CreateVectorStoreRequest::getChunkingStrategy()
{
	return chunking_strategy;
}

void
CreateVectorStoreRequest::setChunkingStrategy(CreateVectorStoreRequest_chunking_strategy  chunking_strategy)
{
	this->chunking_strategy = chunking_strategy;
}

Object
CreateVectorStoreRequest::getMetadata()
{
	return metadata;
}

void
CreateVectorStoreRequest::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}



