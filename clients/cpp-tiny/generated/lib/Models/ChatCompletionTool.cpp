

#include "ChatCompletionTool.h"

using namespace Tiny;

ChatCompletionTool::ChatCompletionTool()
{
	type = std::string();
	function = FunctionObject();
}

ChatCompletionTool::ChatCompletionTool(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionTool::~ChatCompletionTool()
{

}

void
ChatCompletionTool::fromJson(std::string jsonObj)
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




        FunctionObject* obj = &function;
		obj->fromJson(value.dump());

    }


}

bourne::json
ChatCompletionTool::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["function"] = getFunction().toJson();


    return object;

}

std::string
ChatCompletionTool::getType()
{
	return type;
}

void
ChatCompletionTool::setType(std::string  type)
{
	this->type = type;
}

FunctionObject
ChatCompletionTool::getFunction()
{
	return function;
}

void
ChatCompletionTool::setFunction(FunctionObject  function)
{
	this->function = function;
}



