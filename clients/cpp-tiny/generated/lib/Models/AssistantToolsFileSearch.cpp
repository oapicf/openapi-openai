

#include "AssistantToolsFileSearch.h"

using namespace Tiny;

AssistantToolsFileSearch::AssistantToolsFileSearch()
{
	type = std::string();
	file_search = AssistantToolsFileSearch_file_search();
}

AssistantToolsFileSearch::AssistantToolsFileSearch(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssistantToolsFileSearch::~AssistantToolsFileSearch()
{

}

void
AssistantToolsFileSearch::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *file_searchKey = "file_search";

    if(object.has_key(file_searchKey))
    {
        bourne::json value = object[file_searchKey];




        AssistantToolsFileSearch_file_search* obj = &file_search;
		obj->fromJson(value.dump());

    }


}

bourne::json
AssistantToolsFileSearch::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["file_search"] = getFileSearch().toJson();


    return object;

}

std::string
AssistantToolsFileSearch::getType()
{
	return type;
}

void
AssistantToolsFileSearch::setType(std::string  type)
{
	this->type = type;
}

AssistantToolsFileSearch_file_search
AssistantToolsFileSearch::getFileSearch()
{
	return file_search;
}

void
AssistantToolsFileSearch::setFileSearch(AssistantToolsFileSearch_file_search  file_search)
{
	this->file_search = file_search;
}



