

#include "CreateVectorStoreFileRequest.h"

using namespace Tiny;

CreateVectorStoreFileRequest::CreateVectorStoreFileRequest()
{
	file_id = std::string();
	chunking_strategy = ChunkingStrategyRequestParam();
}

CreateVectorStoreFileRequest::CreateVectorStoreFileRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateVectorStoreFileRequest::~CreateVectorStoreFileRequest()
{

}

void
CreateVectorStoreFileRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *file_idKey = "file_id";

    if(object.has_key(file_idKey))
    {
        bourne::json value = object[file_idKey];



        jsonToValue(&file_id, value, "std::string");


    }

    const char *chunking_strategyKey = "chunking_strategy";

    if(object.has_key(chunking_strategyKey))
    {
        bourne::json value = object[chunking_strategyKey];




        ChunkingStrategyRequestParam* obj = &chunking_strategy;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateVectorStoreFileRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["file_id"] = getFileId();







	object["chunking_strategy"] = getChunkingStrategy().toJson();


    return object;

}

std::string
CreateVectorStoreFileRequest::getFileId()
{
	return file_id;
}

void
CreateVectorStoreFileRequest::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}

ChunkingStrategyRequestParam
CreateVectorStoreFileRequest::getChunkingStrategy()
{
	return chunking_strategy;
}

void
CreateVectorStoreFileRequest::setChunkingStrategy(ChunkingStrategyRequestParam  chunking_strategy)
{
	this->chunking_strategy = chunking_strategy;
}



