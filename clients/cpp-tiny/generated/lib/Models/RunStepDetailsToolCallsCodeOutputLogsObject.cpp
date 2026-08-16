

#include "RunStepDetailsToolCallsCodeOutputLogsObject.h"

using namespace Tiny;

RunStepDetailsToolCallsCodeOutputLogsObject::RunStepDetailsToolCallsCodeOutputLogsObject()
{
	type = std::string();
	logs = std::string();
}

RunStepDetailsToolCallsCodeOutputLogsObject::RunStepDetailsToolCallsCodeOutputLogsObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsToolCallsCodeOutputLogsObject::~RunStepDetailsToolCallsCodeOutputLogsObject()
{

}

void
RunStepDetailsToolCallsCodeOutputLogsObject::fromJson(std::string jsonObj)
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


}

bourne::json
RunStepDetailsToolCallsCodeOutputLogsObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["logs"] = getLogs();



    return object;

}

std::string
RunStepDetailsToolCallsCodeOutputLogsObject::getType()
{
	return type;
}

void
RunStepDetailsToolCallsCodeOutputLogsObject::setType(std::string  type)
{
	this->type = type;
}

std::string
RunStepDetailsToolCallsCodeOutputLogsObject::getLogs()
{
	return logs;
}

void
RunStepDetailsToolCallsCodeOutputLogsObject::setLogs(std::string  logs)
{
	this->logs = logs;
}



