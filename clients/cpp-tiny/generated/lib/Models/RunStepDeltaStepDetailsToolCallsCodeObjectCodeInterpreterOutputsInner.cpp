

#include "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h"

using namespace Tiny;

RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner()
{
	index = int(0);
	type = std::string();
	logs = std::string();
	image = RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image();
}

RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::~RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner()
{

}

void
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

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




        RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image* obj = &image;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["type"] = getType();






    object["logs"] = getLogs();







	object["image"] = getImage().toJson();


    return object;

}

int
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getIndex()
{
	return index;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setIndex(int  index)
{
	this->index = index;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setType(std::string  type)
{
	this->type = type;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getLogs()
{
	return logs;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setLogs(std::string  logs)
{
	this->logs = logs;
}

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getImage()
{
	return image;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setImage(RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image  image)
{
	this->image = image;
}



