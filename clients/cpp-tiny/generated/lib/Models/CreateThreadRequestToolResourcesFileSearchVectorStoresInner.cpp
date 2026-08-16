

#include "CreateThreadRequest_tool_resources_file_search_vector_stores_inner.h"

using namespace Tiny;

CreateThreadRequest_tool_resources_file_search_vector_stores_inner::CreateThreadRequest_tool_resources_file_search_vector_stores_inner()
{
	file_ids = std::list<std::string>();
	chunking_strategy = CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy();
	metadata = null;
}

CreateThreadRequest_tool_resources_file_search_vector_stores_inner::CreateThreadRequest_tool_resources_file_search_vector_stores_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateThreadRequest_tool_resources_file_search_vector_stores_inner::~CreateThreadRequest_tool_resources_file_search_vector_stores_inner()
{

}

void
CreateThreadRequest_tool_resources_file_search_vector_stores_inner::fromJson(std::string jsonObj)
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




        CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy* obj = &chunking_strategy;
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
CreateThreadRequest_tool_resources_file_search_vector_stores_inner::toJson()
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






	object["metadata"] = getMetadata().toJson();


    return object;

}

std::list<std::string>
CreateThreadRequest_tool_resources_file_search_vector_stores_inner::getFileIds()
{
	return file_ids;
}

void
CreateThreadRequest_tool_resources_file_search_vector_stores_inner::setFileIds(std::list <std::string> file_ids)
{
	this->file_ids = file_ids;
}

CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy
CreateThreadRequest_tool_resources_file_search_vector_stores_inner::getChunkingStrategy()
{
	return chunking_strategy;
}

void
CreateThreadRequest_tool_resources_file_search_vector_stores_inner::setChunkingStrategy(CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy  chunking_strategy)
{
	this->chunking_strategy = chunking_strategy;
}

Object
CreateThreadRequest_tool_resources_file_search_vector_stores_inner::getMetadata()
{
	return metadata;
}

void
CreateThreadRequest_tool_resources_file_search_vector_stores_inner::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}



