

#include "AssistantsApiToolChoiceOption.h"

using namespace Tiny;

AssistantsApiToolChoiceOption::AssistantsApiToolChoiceOption()
{
	type = std::string();
	function = AssistantsNamedToolChoice_function();
}

AssistantsApiToolChoiceOption::AssistantsApiToolChoiceOption(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssistantsApiToolChoiceOption::~AssistantsApiToolChoiceOption()
{

}

void
AssistantsApiToolChoiceOption::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *functionKey = "function";

    if(object.has_key(functionKey))
    {
        bourne::json value = object[functionKey];




        AssistantsNamedToolChoice_function* obj = &function;
		obj->fromJson(value.dump());

    }


}

bourne::json
AssistantsApiToolChoiceOption::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["function"] = getFunction().toJson();


    return object;

}

std::string
AssistantsApiToolChoiceOption::getType()
{
	return type;
}

void
AssistantsApiToolChoiceOption::setType(std::string  type)
{
	this->type = type;
}

AssistantsNamedToolChoice_function
AssistantsApiToolChoiceOption::getFunction()
{
	return function;
}

void
AssistantsApiToolChoiceOption::setFunction(AssistantsNamedToolChoice_function  function)
{
	this->function = function;
}



