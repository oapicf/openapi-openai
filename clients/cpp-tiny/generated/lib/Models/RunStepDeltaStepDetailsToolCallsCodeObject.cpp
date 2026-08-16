

#include "RunStepDeltaStepDetailsToolCallsCodeObject.h"

using namespace Tiny;

RunStepDeltaStepDetailsToolCallsCodeObject::RunStepDeltaStepDetailsToolCallsCodeObject()
{
	index = int(0);
	id = std::string();
	type = std::string();
	code_interpreter = RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter();
}

RunStepDeltaStepDetailsToolCallsCodeObject::RunStepDeltaStepDetailsToolCallsCodeObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaStepDetailsToolCallsCodeObject::~RunStepDeltaStepDetailsToolCallsCodeObject()
{

}

void
RunStepDeltaStepDetailsToolCallsCodeObject::fromJson(std::string jsonObj)
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


}

bourne::json
RunStepDeltaStepDetailsToolCallsCodeObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["id"] = getId();






    object["type"] = getType();







	object["code_interpreter"] = getCodeInterpreter().toJson();


    return object;

}

int
RunStepDeltaStepDetailsToolCallsCodeObject::getIndex()
{
	return index;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject::setIndex(int  index)
{
	this->index = index;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeObject::getId()
{
	return id;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeObject::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter
RunStepDeltaStepDetailsToolCallsCodeObject::getCodeInterpreter()
{
	return code_interpreter;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject::setCodeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter  code_interpreter)
{
	this->code_interpreter = code_interpreter;
}



