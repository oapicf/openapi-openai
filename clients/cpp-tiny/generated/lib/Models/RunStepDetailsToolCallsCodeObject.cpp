

#include "RunStepDetailsToolCallsCodeObject.h"

using namespace Tiny;

RunStepDetailsToolCallsCodeObject::RunStepDetailsToolCallsCodeObject()
{
	id = std::string();
	type = std::string();
	code_interpreter = RunStepDetailsToolCallsCodeObject_code_interpreter();
}

RunStepDetailsToolCallsCodeObject::RunStepDetailsToolCallsCodeObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsToolCallsCodeObject::~RunStepDetailsToolCallsCodeObject()
{

}

void
RunStepDetailsToolCallsCodeObject::fromJson(std::string jsonObj)
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


}

bourne::json
RunStepDetailsToolCallsCodeObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["type"] = getType();







	object["code_interpreter"] = getCodeInterpreter().toJson();


    return object;

}

std::string
RunStepDetailsToolCallsCodeObject::getId()
{
	return id;
}

void
RunStepDetailsToolCallsCodeObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDetailsToolCallsCodeObject::getType()
{
	return type;
}

void
RunStepDetailsToolCallsCodeObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDetailsToolCallsCodeObject_code_interpreter
RunStepDetailsToolCallsCodeObject::getCodeInterpreter()
{
	return code_interpreter;
}

void
RunStepDetailsToolCallsCodeObject::setCodeInterpreter(RunStepDetailsToolCallsCodeObject_code_interpreter  code_interpreter)
{
	this->code_interpreter = code_interpreter;
}



