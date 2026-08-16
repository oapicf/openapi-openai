

#include "UsageCodeInterpreterSessionsResult.h"

using namespace Tiny;

UsageCodeInterpreterSessionsResult::UsageCodeInterpreterSessionsResult()
{
	object = std::string();
	sessions = int(0);
	project_id = std::string();
}

UsageCodeInterpreterSessionsResult::UsageCodeInterpreterSessionsResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

UsageCodeInterpreterSessionsResult::~UsageCodeInterpreterSessionsResult()
{

}

void
UsageCodeInterpreterSessionsResult::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *sessionsKey = "sessions";

    if(object.has_key(sessionsKey))
    {
        bourne::json value = object[sessionsKey];



        jsonToValue(&sessions, value, "int");


    }

    const char *project_idKey = "project_id";

    if(object.has_key(project_idKey))
    {
        bourne::json value = object[project_idKey];



        jsonToValue(&project_id, value, "std::string");


    }


}

bourne::json
UsageCodeInterpreterSessionsResult::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["sessions"] = getSessions();






    object["project_id"] = getProjectId();



    return object;

}

std::string
UsageCodeInterpreterSessionsResult::getObject()
{
	return object;
}

void
UsageCodeInterpreterSessionsResult::setObject(std::string  object)
{
	this->object = object;
}

int
UsageCodeInterpreterSessionsResult::getSessions()
{
	return sessions;
}

void
UsageCodeInterpreterSessionsResult::setSessions(int  sessions)
{
	this->sessions = sessions;
}

std::string
UsageCodeInterpreterSessionsResult::getProjectId()
{
	return project_id;
}

void
UsageCodeInterpreterSessionsResult::setProjectId(std::string  project_id)
{
	this->project_id = project_id;
}



