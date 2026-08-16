

#include "ChatCompletionFunctionCallOption.h"

using namespace Tiny;

ChatCompletionFunctionCallOption::ChatCompletionFunctionCallOption()
{
	name = std::string();
}

ChatCompletionFunctionCallOption::ChatCompletionFunctionCallOption(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionFunctionCallOption::~ChatCompletionFunctionCallOption()
{

}

void
ChatCompletionFunctionCallOption::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
ChatCompletionFunctionCallOption::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();



    return object;

}

std::string
ChatCompletionFunctionCallOption::getName()
{
	return name;
}

void
ChatCompletionFunctionCallOption::setName(std::string  name)
{
	this->name = name;
}



