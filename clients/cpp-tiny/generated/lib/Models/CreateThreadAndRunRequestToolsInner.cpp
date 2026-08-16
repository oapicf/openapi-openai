

#include "CreateThreadAndRunRequest_tools_inner.h"

using namespace Tiny;

CreateThreadAndRunRequest_tools_inner::CreateThreadAndRunRequest_tools_inner()
{
	type = std::string();
	file_search = AssistantToolsFileSearch_file_search();
	function = FunctionObject();
}

CreateThreadAndRunRequest_tools_inner::CreateThreadAndRunRequest_tools_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateThreadAndRunRequest_tools_inner::~CreateThreadAndRunRequest_tools_inner()
{

}

void
CreateThreadAndRunRequest_tools_inner::fromJson(std::string jsonObj)
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
CreateThreadAndRunRequest_tools_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["file_search"] = getFileSearch().toJson();






	object["function"] = getFunction().toJson();


    return object;

}

std::string
CreateThreadAndRunRequest_tools_inner::getType()
{
	return type;
}

void
CreateThreadAndRunRequest_tools_inner::setType(std::string  type)
{
	this->type = type;
}

AssistantToolsFileSearch_file_search
CreateThreadAndRunRequest_tools_inner::getFileSearch()
{
	return file_search;
}

void
CreateThreadAndRunRequest_tools_inner::setFileSearch(AssistantToolsFileSearch_file_search  file_search)
{
	this->file_search = file_search;
}

FunctionObject
CreateThreadAndRunRequest_tools_inner::getFunction()
{
	return function;
}

void
CreateThreadAndRunRequest_tools_inner::setFunction(FunctionObject  function)
{
	this->function = function;
}



