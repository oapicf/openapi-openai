

#include "CreateVectorStoreFileBatchRequest.h"

using namespace Tiny;

CreateVectorStoreFileBatchRequest::CreateVectorStoreFileBatchRequest()
{
	file_ids = std::list<std::string>();
	chunking_strategy = ChunkingStrategyRequestParam();
}

CreateVectorStoreFileBatchRequest::CreateVectorStoreFileBatchRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateVectorStoreFileBatchRequest::~CreateVectorStoreFileBatchRequest()
{

}

void
CreateVectorStoreFileBatchRequest::fromJson(std::string jsonObj)
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

    const char *chunking_strategyKey = "chunking_strategy";

    if(object.has_key(chunking_strategyKey))
    {
        bourne::json value = object[chunking_strategyKey];




        ChunkingStrategyRequestParam* obj = &chunking_strategy;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateVectorStoreFileBatchRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> file_ids_list = getFileIds();
    bourne::json file_ids_arr = bourne::json::array();

    for(auto& var : file_ids_list)
    {
        file_ids_arr.append(var);
    }
    object["file_ids"] = file_ids_arr;










	object["chunking_strategy"] = getChunkingStrategy().toJson();


    return object;

}

std::list<std::string>
CreateVectorStoreFileBatchRequest::getFileIds()
{
	return file_ids;
}

void
CreateVectorStoreFileBatchRequest::setFileIds(std::list <std::string> file_ids)
{
	this->file_ids = file_ids;
}

ChunkingStrategyRequestParam
CreateVectorStoreFileBatchRequest::getChunkingStrategy()
{
	return chunking_strategy;
}

void
CreateVectorStoreFileBatchRequest::setChunkingStrategy(ChunkingStrategyRequestParam  chunking_strategy)
{
	this->chunking_strategy = chunking_strategy;
}



