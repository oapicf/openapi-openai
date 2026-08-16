

#include "ModifyThreadRequest_tool_resources_file_search.h"

using namespace Tiny;

ModifyThreadRequest_tool_resources_file_search::ModifyThreadRequest_tool_resources_file_search()
{
	vector_store_ids = std::list<std::string>();
}

ModifyThreadRequest_tool_resources_file_search::ModifyThreadRequest_tool_resources_file_search(std::string jsonString)
{
	this->fromJson(jsonString);
}

ModifyThreadRequest_tool_resources_file_search::~ModifyThreadRequest_tool_resources_file_search()
{

}

void
ModifyThreadRequest_tool_resources_file_search::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *vector_store_idsKey = "vector_store_ids";

    if(object.has_key(vector_store_idsKey))
    {
        bourne::json value = object[vector_store_idsKey];


        std::list<std::string> vector_store_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            vector_store_ids_list.push_back(element);
        }
        vector_store_ids = vector_store_ids_list;


    }


}

bourne::json
ModifyThreadRequest_tool_resources_file_search::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> vector_store_ids_list = getVectorStoreIds();
    bourne::json vector_store_ids_arr = bourne::json::array();

    for(auto& var : vector_store_ids_list)
    {
        vector_store_ids_arr.append(var);
    }
    object["vector_store_ids"] = vector_store_ids_arr;






    return object;

}

std::list<std::string>
ModifyThreadRequest_tool_resources_file_search::getVectorStoreIds()
{
	return vector_store_ids;
}

void
ModifyThreadRequest_tool_resources_file_search::setVectorStoreIds(std::list <std::string> vector_store_ids)
{
	this->vector_store_ids = vector_store_ids;
}



