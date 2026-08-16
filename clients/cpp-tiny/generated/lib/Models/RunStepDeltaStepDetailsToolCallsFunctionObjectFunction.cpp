

#include "RunStepDeltaStepDetailsToolCallsFunctionObject_function.h"

using namespace Tiny;

RunStepDeltaStepDetailsToolCallsFunctionObject_function::RunStepDeltaStepDetailsToolCallsFunctionObject_function()
{
	name = std::string();
	arguments = std::string();
	output = std::string();
}

RunStepDeltaStepDetailsToolCallsFunctionObject_function::RunStepDeltaStepDetailsToolCallsFunctionObject_function(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaStepDetailsToolCallsFunctionObject_function::~RunStepDeltaStepDetailsToolCallsFunctionObject_function()
{

}

void
RunStepDeltaStepDetailsToolCallsFunctionObject_function::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *argumentsKey = "arguments";

    if(object.has_key(argumentsKey))
    {
        bourne::json value = object[argumentsKey];



        jsonToValue(&arguments, value, "std::string");


    }

    const char *outputKey = "output";

    if(object.has_key(outputKey))
    {
        bourne::json value = object[outputKey];



        jsonToValue(&output, value, "std::string");


    }


}

bourne::json
RunStepDeltaStepDetailsToolCallsFunctionObject_function::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["arguments"] = getArguments();






    object["output"] = getOutput();



    return object;

}

std::string
RunStepDeltaStepDetailsToolCallsFunctionObject_function::getName()
{
	return name;
}

void
RunStepDeltaStepDetailsToolCallsFunctionObject_function::setName(std::string  name)
{
	this->name = name;
}

std::string
RunStepDeltaStepDetailsToolCallsFunctionObject_function::getArguments()
{
	return arguments;
}

void
RunStepDeltaStepDetailsToolCallsFunctionObject_function::setArguments(std::string  arguments)
{
	this->arguments = arguments;
}

std::string
RunStepDeltaStepDetailsToolCallsFunctionObject_function::getOutput()
{
	return output;
}

void
RunStepDeltaStepDetailsToolCallsFunctionObject_function::setOutput(std::string  output)
{
	this->output = output;
}



