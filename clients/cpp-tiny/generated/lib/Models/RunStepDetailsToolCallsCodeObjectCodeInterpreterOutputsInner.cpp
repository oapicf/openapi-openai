

#include "RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h"

using namespace Tiny;

RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner()
{
	type = std::string();
	logs = std::string();
	image = RunStepDetailsToolCallsCodeOutputImageObject_image();
}

RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::~RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner()
{

}

void
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *logsKey = "logs";

    if(object.has_key(logsKey))
    {
        bourne::json value = object[logsKey];



        jsonToValue(&logs, value, "std::string");


    }

    const char *imageKey = "image";

    if(object.has_key(imageKey))
    {
        bourne::json value = object[imageKey];




        RunStepDetailsToolCallsCodeOutputImageObject_image* obj = &image;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["logs"] = getLogs();







	object["image"] = getImage().toJson();


    return object;

}

std::string
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getType()
{
	return type;
}

void
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setType(std::string  type)
{
	this->type = type;
}

std::string
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getLogs()
{
	return logs;
}

void
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setLogs(std::string  logs)
{
	this->logs = logs;
}

RunStepDetailsToolCallsCodeOutputImageObject_image
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getImage()
{
	return image;
}

void
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setImage(RunStepDetailsToolCallsCodeOutputImageObject_image  image)
{
	this->image = image;
}



