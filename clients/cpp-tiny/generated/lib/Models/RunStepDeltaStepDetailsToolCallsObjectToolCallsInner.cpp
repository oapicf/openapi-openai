

#include "RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.h"

using namespace Tiny;

RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner()
{
	index = int(0);
	id = std::string();
	type = std::string();
	code_interpreter = RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter();
	file_search = null;
	function = RunStepDeltaStepDetailsToolCallsFunctionObject_function();
}

RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::~RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner()
{

}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::fromJson(std::string jsonObj)
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

    const char *code_interpreterKey = "code_interpreter";

    if(object.has_key(code_interpreterKey))
    {
        bourne::json value = object[code_interpreterKey];




        RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter* obj = &code_interpreter;
		obj->fromJson(value.dump());

    }

    const char *file_searchKey = "file_search";

    if(object.has_key(file_searchKey))
    {
        bourne::json value = object[file_searchKey];




        Object* obj = &file_search;
		obj->fromJson(value.dump());

    }

    const char *functionKey = "function";

    if(object.has_key(functionKey))
    {
        bourne::json value = object[functionKey];




        RunStepDeltaStepDetailsToolCallsFunctionObject_function* obj = &function;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["id"] = getId();






    object["type"] = getType();







	object["code_interpreter"] = getCodeInterpreter().toJson();






	object["file_search"] = getFileSearch().toJson();






	object["function"] = getFunction().toJson();


    return object;

}

int
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getIndex()
{
	return index;
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setIndex(int  index)
{
	this->index = index;
}

std::string
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getId()
{
	return id;
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setType(std::string  type)
{
	this->type = type;
}

RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getCodeInterpreter()
{
	return code_interpreter;
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setCodeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter  code_interpreter)
{
	this->code_interpreter = code_interpreter;
}

Object
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getFileSearch()
{
	return file_search;
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setFileSearch(Object  file_search)
{
	this->file_search = file_search;
}

RunStepDeltaStepDetailsToolCallsFunctionObject_function
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getFunction()
{
	return function;
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setFunction(RunStepDeltaStepDetailsToolCallsFunctionObject_function  function)
{
	this->function = function;
}



