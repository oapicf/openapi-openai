

#include "RunStepDetailsToolCallsFileSearchObject.h"

using namespace Tiny;

RunStepDetailsToolCallsFileSearchObject::RunStepDetailsToolCallsFileSearchObject()
{
	id = std::string();
	type = std::string();
	file_search = RunStepDetailsToolCallsFileSearchObject_file_search();
}

RunStepDetailsToolCallsFileSearchObject::RunStepDetailsToolCallsFileSearchObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsToolCallsFileSearchObject::~RunStepDetailsToolCallsFileSearchObject()
{

}

void
RunStepDetailsToolCallsFileSearchObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

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




        RunStepDetailsToolCallsFileSearchObject_file_search* obj = &file_search;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDetailsToolCallsFileSearchObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["type"] = getType();







	object["file_search"] = getFileSearch().toJson();


    return object;

}

std::string
RunStepDetailsToolCallsFileSearchObject::getId()
{
	return id;
}

void
RunStepDetailsToolCallsFileSearchObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDetailsToolCallsFileSearchObject::getType()
{
	return type;
}

void
RunStepDetailsToolCallsFileSearchObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDetailsToolCallsFileSearchObject_file_search
RunStepDetailsToolCallsFileSearchObject::getFileSearch()
{
	return file_search;
}

void
RunStepDetailsToolCallsFileSearchObject::setFileSearch(RunStepDetailsToolCallsFileSearchObject_file_search  file_search)
{
	this->file_search = file_search;
}



