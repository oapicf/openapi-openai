

#include "CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy.h"

using namespace Tiny;

CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy()
{
	type = std::string();
	r_static = Static_Chunking_Strategy_static();
}

CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::~CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy()
{

}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *r_staticKey = "static";

    if(object.has_key(r_staticKey))
    {
        bourne::json value = object[r_staticKey];




        Static_Chunking_Strategy_static* obj = &r_static;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["r_static"] = getRStatic().toJson();


    return object;

}

std::string
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::getType()
{
	return type;
}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::setType(std::string  type)
{
	this->type = type;
}

Static_Chunking_Strategy_static
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::getRStatic()
{
	return r_static;
}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::setRStatic(Static_Chunking_Strategy_static  r_static)
{
	this->r_static = r_static;
}



