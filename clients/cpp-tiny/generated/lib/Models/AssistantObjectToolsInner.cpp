

#include "AssistantObject_tools_inner.h"

using namespace Tiny;

AssistantObject_tools_inner::AssistantObject_tools_inner()
{
	type = std::string();
	file_search = AssistantToolsFileSearch_file_search();
	function = FunctionObject();
}

AssistantObject_tools_inner::AssistantObject_tools_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssistantObject_tools_inner::~AssistantObject_tools_inner()
{

}

void
AssistantObject_tools_inner::fromJson(std::string jsonObj)
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

    const char *functionKey = "function";

    if(object.has_key(functionKey))
    {
        bourne::json value = object[functionKey];




        FunctionObject* obj = &function;
		obj->fromJson(value.dump());

    }


}

bourne::json
AssistantObject_tools_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["file_search"] = getFileSearch().toJson();






	object["function"] = getFunction().toJson();


    return object;

}

std::string
AssistantObject_tools_inner::getType()
{
	return type;
}

void
AssistantObject_tools_inner::setType(std::string  type)
{
	this->type = type;
}

AssistantToolsFileSearch_file_search
AssistantObject_tools_inner::getFileSearch()
{
	return file_search;
}

void
AssistantObject_tools_inner::setFileSearch(AssistantToolsFileSearch_file_search  file_search)
{
	this->file_search = file_search;
}

FunctionObject
AssistantObject_tools_inner::getFunction()
{
	return function;
}

void
AssistantObject_tools_inner::setFunction(FunctionObject  function)
{
	this->function = function;
}



