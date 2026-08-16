

#include "RunStepDeltaStepDetailsToolCallsFileSearchObject.h"

using namespace Tiny;

RunStepDeltaStepDetailsToolCallsFileSearchObject::RunStepDeltaStepDetailsToolCallsFileSearchObject()
{
	index = int(0);
	id = std::string();
	type = std::string();
	file_search = null;
}

RunStepDeltaStepDetailsToolCallsFileSearchObject::RunStepDeltaStepDetailsToolCallsFileSearchObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaStepDetailsToolCallsFileSearchObject::~RunStepDeltaStepDetailsToolCallsFileSearchObject()
{

}

void
RunStepDeltaStepDetailsToolCallsFileSearchObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

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




        Object* obj = &file_search;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDeltaStepDetailsToolCallsFileSearchObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["id"] = getId();






    object["type"] = getType();







	object["file_search"] = getFileSearch().toJson();


    return object;

}

int
RunStepDeltaStepDetailsToolCallsFileSearchObject::getIndex()
{
	return index;
}

void
RunStepDeltaStepDetailsToolCallsFileSearchObject::setIndex(int  index)
{
	this->index = index;
}

std::string
RunStepDeltaStepDetailsToolCallsFileSearchObject::getId()
{
	return id;
}

void
RunStepDeltaStepDetailsToolCallsFileSearchObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDeltaStepDetailsToolCallsFileSearchObject::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsFileSearchObject::setType(std::string  type)
{
	this->type = type;
}

Object
RunStepDeltaStepDetailsToolCallsFileSearchObject::getFileSearch()
{
	return file_search;
}

void
RunStepDeltaStepDetailsToolCallsFileSearchObject::setFileSearch(Object  file_search)
{
	this->file_search = file_search;
}



