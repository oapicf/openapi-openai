

#include "RunStepDetailsToolCallsObject_tool_calls_inner.h"

using namespace Tiny;

RunStepDetailsToolCallsObject_tool_calls_inner::RunStepDetailsToolCallsObject_tool_calls_inner()
{
	id = std::string();
	type = std::string();
	code_interpreter = RunStepDetailsToolCallsCodeObject_code_interpreter();
	file_search = RunStepDetailsToolCallsFileSearchObject_file_search();
	function = RunStepDetailsToolCallsFunctionObject_function();
}

RunStepDetailsToolCallsObject_tool_calls_inner::RunStepDetailsToolCallsObject_tool_calls_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsToolCallsObject_tool_calls_inner::~RunStepDetailsToolCallsObject_tool_calls_inner()
{

}

void
RunStepDetailsToolCallsObject_tool_calls_inner::fromJson(std::string jsonObj)
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

    const char *code_interpreterKey = "code_interpreter";

    if(object.has_key(code_interpreterKey))
    {
        bourne::json value = object[code_interpreterKey];




        RunStepDetailsToolCallsCodeObject_code_interpreter* obj = &code_interpreter;
		obj->fromJson(value.dump());

    }

    const char *file_searchKey = "file_search";

    if(object.has_key(file_searchKey))
    {
        bourne::json value = object[file_searchKey];




        RunStepDetailsToolCallsFileSearchObject_file_search* obj = &file_search;
		obj->fromJson(value.dump());

    }

    const char *functionKey = "function";

    if(object.has_key(functionKey))
    {
        bourne::json value = object[functionKey];




        RunStepDetailsToolCallsFunctionObject_function* obj = &function;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDetailsToolCallsObject_tool_calls_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["type"] = getType();







	object["code_interpreter"] = getCodeInterpreter().toJson();






	object["file_search"] = getFileSearch().toJson();






	object["function"] = getFunction().toJson();


    return object;

}

std::string
RunStepDetailsToolCallsObject_tool_calls_inner::getId()
{
	return id;
}

void
RunStepDetailsToolCallsObject_tool_calls_inner::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDetailsToolCallsObject_tool_calls_inner::getType()
{
	return type;
}

void
RunStepDetailsToolCallsObject_tool_calls_inner::setType(std::string  type)
{
	this->type = type;
}

RunStepDetailsToolCallsCodeObject_code_interpreter
RunStepDetailsToolCallsObject_tool_calls_inner::getCodeInterpreter()
{
	return code_interpreter;
}

void
RunStepDetailsToolCallsObject_tool_calls_inner::setCodeInterpreter(RunStepDetailsToolCallsCodeObject_code_interpreter  code_interpreter)
{
	this->code_interpreter = code_interpreter;
}

RunStepDetailsToolCallsFileSearchObject_file_search
RunStepDetailsToolCallsObject_tool_calls_inner::getFileSearch()
{
	return file_search;
}

void
RunStepDetailsToolCallsObject_tool_calls_inner::setFileSearch(RunStepDetailsToolCallsFileSearchObject_file_search  file_search)
{
	this->file_search = file_search;
}

RunStepDetailsToolCallsFunctionObject_function
RunStepDetailsToolCallsObject_tool_calls_inner::getFunction()
{
	return function;
}

void
RunStepDetailsToolCallsObject_tool_calls_inner::setFunction(RunStepDetailsToolCallsFunctionObject_function  function)
{
	this->function = function;
}



