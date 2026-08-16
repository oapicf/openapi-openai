

#include "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.h"

using namespace Tiny;

RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject()
{
	index = int(0);
	type = std::string();
	logs = std::string();
}

RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::~RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject()
{

}

void
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::fromJson(std::string jsonObj)
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


}

bourne::json
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["type"] = getType();






    object["logs"] = getLogs();



    return object;

}

int
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::getIndex()
{
	return index;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::setIndex(int  index)
{
	this->index = index;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::setType(std::string  type)
{
	this->type = type;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::getLogs()
{
	return logs;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::setLogs(std::string  logs)
{
	this->logs = logs;
}



