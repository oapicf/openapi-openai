

#include "Batch.h"

using namespace Tiny;

Batch::Batch()
{
	id = std::string();
	object = std::string();
	endpoint = std::string();
	errors = Batch_errors();
	input_file_id = std::string();
	completion_window = std::string();
	status = std::string();
	output_file_id = std::string();
	error_file_id = std::string();
	created_at = int(0);
	in_progress_at = int(0);
	expires_at = int(0);
	finalizing_at = int(0);
	completed_at = int(0);
	failed_at = int(0);
	expired_at = int(0);
	cancelling_at = int(0);
	cancelled_at = int(0);
	request_counts = Batch_request_counts();
	metadata = null;
}

Batch::Batch(std::string jsonString)
{
	this->fromJson(jsonString);
}

Batch::~Batch()
{

}

void
Batch::fromJson(std::string jsonObj)
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

    const char *endpointKey = "endpoint";

    if(object.has_key(endpointKey))
    {
        bourne::json value = object[endpointKey];



        jsonToValue(&endpoint, value, "std::string");


    }

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];




        Batch_errors* obj = &errors;
		obj->fromJson(value.dump());

    }

    const char *input_file_idKey = "input_file_id";

    if(object.has_key(input_file_idKey))
    {
        bourne::json value = object[input_file_idKey];



        jsonToValue(&input_file_id, value, "std::string");


    }

    const char *completion_windowKey = "completion_window";

    if(object.has_key(completion_windowKey))
    {
        bourne::json value = object[completion_windowKey];



        jsonToValue(&completion_window, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *output_file_idKey = "output_file_id";

    if(object.has_key(output_file_idKey))
    {
        bourne::json value = object[output_file_idKey];



        jsonToValue(&output_file_id, value, "std::string");


    }

    const char *error_file_idKey = "error_file_id";

    if(object.has_key(error_file_idKey))
    {
        bourne::json value = object[error_file_idKey];



        jsonToValue(&error_file_id, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


    }

    const char *in_progress_atKey = "in_progress_at";

    if(object.has_key(in_progress_atKey))
    {
        bourne::json value = object[in_progress_atKey];



        jsonToValue(&in_progress_at, value, "int");


    }

    const char *expires_atKey = "expires_at";

    if(object.has_key(expires_atKey))
    {
        bourne::json value = object[expires_atKey];



        jsonToValue(&expires_at, value, "int");


    }

    const char *finalizing_atKey = "finalizing_at";

    if(object.has_key(finalizing_atKey))
    {
        bourne::json value = object[finalizing_atKey];



        jsonToValue(&finalizing_at, value, "int");


    }

    const char *completed_atKey = "completed_at";

    if(object.has_key(completed_atKey))
    {
        bourne::json value = object[completed_atKey];



        jsonToValue(&completed_at, value, "int");


    }

    const char *failed_atKey = "failed_at";

    if(object.has_key(failed_atKey))
    {
        bourne::json value = object[failed_atKey];



        jsonToValue(&failed_at, value, "int");


    }

    const char *expired_atKey = "expired_at";

    if(object.has_key(expired_atKey))
    {
        bourne::json value = object[expired_atKey];



        jsonToValue(&expired_at, value, "int");


    }

    const char *cancelling_atKey = "cancelling_at";

    if(object.has_key(cancelling_atKey))
    {
        bourne::json value = object[cancelling_atKey];



        jsonToValue(&cancelling_at, value, "int");


    }

    const char *cancelled_atKey = "cancelled_at";

    if(object.has_key(cancelled_atKey))
    {
        bourne::json value = object[cancelled_atKey];



        jsonToValue(&cancelled_at, value, "int");


    }

    const char *request_countsKey = "request_counts";

    if(object.has_key(request_countsKey))
    {
        bourne::json value = object[request_countsKey];




        Batch_request_counts* obj = &request_counts;
		obj->fromJson(value.dump());

    }

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];




        Object* obj = &metadata;
		obj->fromJson(value.dump());

    }


}

bourne::json
Batch::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();






    object["endpoint"] = getEndpoint();







	object["errors"] = getErrors().toJson();





    object["input_file_id"] = getInputFileId();






    object["completion_window"] = getCompletionWindow();






    object["status"] = getStatus();






    object["output_file_id"] = getOutputFileId();






    object["error_file_id"] = getErrorFileId();






    object["created_at"] = getCreatedAt();






    object["in_progress_at"] = getInProgressAt();






    object["expires_at"] = getExpiresAt();






    object["finalizing_at"] = getFinalizingAt();






    object["completed_at"] = getCompletedAt();






    object["failed_at"] = getFailedAt();






    object["expired_at"] = getExpiredAt();






    object["cancelling_at"] = getCancellingAt();






    object["cancelled_at"] = getCancelledAt();







	object["request_counts"] = getRequestCounts().toJson();






	object["metadata"] = getMetadata().toJson();


    return object;

}

std::string
Batch::getId()
{
	return id;
}

void
Batch::setId(std::string  id)
{
	this->id = id;
}

std::string
Batch::getObject()
{
	return object;
}

void
Batch::setObject(std::string  object)
{
	this->object = object;
}

std::string
Batch::getEndpoint()
{
	return endpoint;
}

void
Batch::setEndpoint(std::string  endpoint)
{
	this->endpoint = endpoint;
}

Batch_errors
Batch::getErrors()
{
	return errors;
}

void
Batch::setErrors(Batch_errors  errors)
{
	this->errors = errors;
}

std::string
Batch::getInputFileId()
{
	return input_file_id;
}

void
Batch::setInputFileId(std::string  input_file_id)
{
	this->input_file_id = input_file_id;
}

std::string
Batch::getCompletionWindow()
{
	return completion_window;
}

void
Batch::setCompletionWindow(std::string  completion_window)
{
	this->completion_window = completion_window;
}

std::string
Batch::getStatus()
{
	return status;
}

void
Batch::setStatus(std::string  status)
{
	this->status = status;
}

std::string
Batch::getOutputFileId()
{
	return output_file_id;
}

void
Batch::setOutputFileId(std::string  output_file_id)
{
	this->output_file_id = output_file_id;
}

std::string
Batch::getErrorFileId()
{
	return error_file_id;
}

void
Batch::setErrorFileId(std::string  error_file_id)
{
	this->error_file_id = error_file_id;
}

int
Batch::getCreatedAt()
{
	return created_at;
}

void
Batch::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

int
Batch::getInProgressAt()
{
	return in_progress_at;
}

void
Batch::setInProgressAt(int  in_progress_at)
{
	this->in_progress_at = in_progress_at;
}

int
Batch::getExpiresAt()
{
	return expires_at;
}

void
Batch::setExpiresAt(int  expires_at)
{
	this->expires_at = expires_at;
}

int
Batch::getFinalizingAt()
{
	return finalizing_at;
}

void
Batch::setFinalizingAt(int  finalizing_at)
{
	this->finalizing_at = finalizing_at;
}

int
Batch::getCompletedAt()
{
	return completed_at;
}

void
Batch::setCompletedAt(int  completed_at)
{
	this->completed_at = completed_at;
}

int
Batch::getFailedAt()
{
	return failed_at;
}

void
Batch::setFailedAt(int  failed_at)
{
	this->failed_at = failed_at;
}

int
Batch::getExpiredAt()
{
	return expired_at;
}

void
Batch::setExpiredAt(int  expired_at)
{
	this->expired_at = expired_at;
}

int
Batch::getCancellingAt()
{
	return cancelling_at;
}

void
Batch::setCancellingAt(int  cancelling_at)
{
	this->cancelling_at = cancelling_at;
}

int
Batch::getCancelledAt()
{
	return cancelled_at;
}

void
Batch::setCancelledAt(int  cancelled_at)
{
	this->cancelled_at = cancelled_at;
}

Batch_request_counts
Batch::getRequestCounts()
{
	return request_counts;
}

void
Batch::setRequestCounts(Batch_request_counts  request_counts)
{
	this->request_counts = request_counts;
}

Object
Batch::getMetadata()
{
	return metadata;
}

void
Batch::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}



