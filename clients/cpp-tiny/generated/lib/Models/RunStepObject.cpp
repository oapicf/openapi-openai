

#include "RunStepObject.h"

using namespace Tiny;

RunStepObject::RunStepObject()
{
	id = std::string();
	object = std::string();
	created_at = int(0);
	assistant_id = std::string();
	thread_id = std::string();
	run_id = std::string();
	type = std::string();
	status = std::string();
	step_details = RunStepObject_step_details();
	last_error = RunStepObject_last_error();
	expired_at = int(0);
	cancelled_at = int(0);
	failed_at = int(0);
	completed_at = int(0);
	metadata = null;
	usage = RunStepCompletionUsage();
}

RunStepObject::RunStepObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepObject::~RunStepObject()
{

}

void
RunStepObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


    }

    const char *assistant_idKey = "assistant_id";

    if(object.has_key(assistant_idKey))
    {
        bourne::json value = object[assistant_idKey];



        jsonToValue(&assistant_id, value, "std::string");


    }

    const char *thread_idKey = "thread_id";

    if(object.has_key(thread_idKey))
    {
        bourne::json value = object[thread_idKey];



        jsonToValue(&thread_id, value, "std::string");


    }

    const char *run_idKey = "run_id";

    if(object.has_key(run_idKey))
    {
        bourne::json value = object[run_idKey];



        jsonToValue(&run_id, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *step_detailsKey = "step_details";

    if(object.has_key(step_detailsKey))
    {
        bourne::json value = object[step_detailsKey];




        RunStepObject_step_details* obj = &step_details;
		obj->fromJson(value.dump());

    }

    const char *last_errorKey = "last_error";

    if(object.has_key(last_errorKey))
    {
        bourne::json value = object[last_errorKey];




        RunStepObject_last_error* obj = &last_error;
		obj->fromJson(value.dump());

    }

    const char *expired_atKey = "expired_at";

    if(object.has_key(expired_atKey))
    {
        bourne::json value = object[expired_atKey];



        jsonToValue(&expired_at, value, "int");


    }

    const char *cancelled_atKey = "cancelled_at";

    if(object.has_key(cancelled_atKey))
    {
        bourne::json value = object[cancelled_atKey];



        jsonToValue(&cancelled_at, value, "int");


    }

    const char *failed_atKey = "failed_at";

    if(object.has_key(failed_atKey))
    {
        bourne::json value = object[failed_atKey];



        jsonToValue(&failed_at, value, "int");


    }

    const char *completed_atKey = "completed_at";

    if(object.has_key(completed_atKey))
    {
        bourne::json value = object[completed_atKey];



        jsonToValue(&completed_at, value, "int");


    }

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];




        Object* obj = &metadata;
		obj->fromJson(value.dump());

    }

    const char *usageKey = "usage";

    if(object.has_key(usageKey))
    {
        bourne::json value = object[usageKey];




        RunStepCompletionUsage* obj = &usage;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();






    object["created_at"] = getCreatedAt();






    object["assistant_id"] = getAssistantId();






    object["thread_id"] = getThreadId();






    object["run_id"] = getRunId();






    object["type"] = getType();






    object["status"] = getStatus();







	object["step_details"] = getStepDetails().toJson();






	object["last_error"] = getLastError().toJson();





    object["expired_at"] = getExpiredAt();






    object["cancelled_at"] = getCancelledAt();






    object["failed_at"] = getFailedAt();






    object["completed_at"] = getCompletedAt();







	object["metadata"] = getMetadata().toJson();






	object["usage"] = getUsage().toJson();


    return object;

}

std::string
RunStepObject::getId()
{
	return id;
}

void
RunStepObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepObject::getObject()
{
	return object;
}

void
RunStepObject::setObject(std::string  object)
{
	this->object = object;
}

int
RunStepObject::getCreatedAt()
{
	return created_at;
}

void
RunStepObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
RunStepObject::getAssistantId()
{
	return assistant_id;
}

void
RunStepObject::setAssistantId(std::string  assistant_id)
{
	this->assistant_id = assistant_id;
}

std::string
RunStepObject::getThreadId()
{
	return thread_id;
}

void
RunStepObject::setThreadId(std::string  thread_id)
{
	this->thread_id = thread_id;
}

std::string
RunStepObject::getRunId()
{
	return run_id;
}

void
RunStepObject::setRunId(std::string  run_id)
{
	this->run_id = run_id;
}

std::string
RunStepObject::getType()
{
	return type;
}

void
RunStepObject::setType(std::string  type)
{
	this->type = type;
}

std::string
RunStepObject::getStatus()
{
	return status;
}

void
RunStepObject::setStatus(std::string  status)
{
	this->status = status;
}

RunStepObject_step_details
RunStepObject::getStepDetails()
{
	return step_details;
}

void
RunStepObject::setStepDetails(RunStepObject_step_details  step_details)
{
	this->step_details = step_details;
}

RunStepObject_last_error
RunStepObject::getLastError()
{
	return last_error;
}

void
RunStepObject::setLastError(RunStepObject_last_error  last_error)
{
	this->last_error = last_error;
}

int
RunStepObject::getExpiredAt()
{
	return expired_at;
}

void
RunStepObject::setExpiredAt(int  expired_at)
{
	this->expired_at = expired_at;
}

int
RunStepObject::getCancelledAt()
{
	return cancelled_at;
}

void
RunStepObject::setCancelledAt(int  cancelled_at)
{
	this->cancelled_at = cancelled_at;
}

int
RunStepObject::getFailedAt()
{
	return failed_at;
}

void
RunStepObject::setFailedAt(int  failed_at)
{
	this->failed_at = failed_at;
}

int
RunStepObject::getCompletedAt()
{
	return completed_at;
}

void
RunStepObject::setCompletedAt(int  completed_at)
{
	this->completed_at = completed_at;
}

Object
RunStepObject::getMetadata()
{
	return metadata;
}

void
RunStepObject::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}

RunStepCompletionUsage
RunStepObject::getUsage()
{
	return usage;
}

void
RunStepObject::setUsage(RunStepCompletionUsage  usage)
{
	this->usage = usage;
}



