

#include "CreateThreadRequest_tool_resources_file_search.h"

using namespace Tiny;

CreateThreadRequest_tool_resources_file_search::CreateThreadRequest_tool_resources_file_search()
{
	vector_store_ids = std::list<std::string>();
	vector_stores = std::list<CreateThreadRequest_tool_resources_file_search_vector_stores_inner>();
}

CreateThreadRequest_tool_resources_file_search::CreateThreadRequest_tool_resources_file_search(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateThreadRequest_tool_resources_file_search::~CreateThreadRequest_tool_resources_file_search()
{

}

void
CreateThreadRequest_tool_resources_file_search::fromJson(std::string jsonObj)
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

    const char *vector_storesKey = "vector_stores";

    if(object.has_key(vector_storesKey))
    {
        bourne::json value = object[vector_storesKey];


        std::list<CreateThreadRequest_tool_resources_file_search_vector_stores_inner> vector_stores_list;
        CreateThreadRequest_tool_resources_file_search_vector_stores_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            vector_stores_list.push_back(element);
        }
        vector_stores = vector_stores_list;


    }


}

bourne::json
CreateThreadRequest_tool_resources_file_search::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> vector_store_ids_list = getVectorStoreIds();
    bourne::json vector_store_ids_arr = bourne::json::array();

    for(auto& var : vector_store_ids_list)
    {
        vector_store_ids_arr.append(var);
    }
    object["vector_store_ids"] = vector_store_ids_arr;








    std::list<CreateThreadRequest_tool_resources_file_search_vector_stores_inner> vector_stores_list = getVectorStores();
    bourne::json vector_stores_arr = bourne::json::array();

    for(auto& var : vector_stores_list)
    {
        CreateThreadRequest_tool_resources_file_search_vector_stores_inner obj = var;
        vector_stores_arr.append(obj.toJson());
    }
    object["vector_stores"] = vector_stores_arr;




    return object;

}

std::list<std::string>
CreateThreadRequest_tool_resources_file_search::getVectorStoreIds()
{
	return vector_store_ids;
}

void
CreateThreadRequest_tool_resources_file_search::setVectorStoreIds(std::list <std::string> vector_store_ids)
{
	this->vector_store_ids = vector_store_ids;
}

std::list<CreateThreadRequest_tool_resources_file_search_vector_stores_inner>
CreateThreadRequest_tool_resources_file_search::getVectorStores()
{
	return vector_stores;
}

void
CreateThreadRequest_tool_resources_file_search::setVectorStores(std::list <CreateThreadRequest_tool_resources_file_search_vector_stores_inner> vector_stores)
{
	this->vector_stores = vector_stores;
}



