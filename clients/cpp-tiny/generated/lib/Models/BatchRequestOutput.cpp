

#include "BatchRequestOutput.h"

using namespace Tiny;

BatchRequestOutput::BatchRequestOutput()
{
	id = std::string();
	custom_id = std::string();
	response = BatchRequestOutput_response();
	error = BatchRequestOutput_error();
}

BatchRequestOutput::BatchRequestOutput(std::string jsonString)
{
	this->fromJson(jsonString);
}

BatchRequestOutput::~BatchRequestOutput()
{

}

void
BatchRequestOutput::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *custom_idKey = "custom_id";

    if(object.has_key(custom_idKey))
    {
        bourne::json value = object[custom_idKey];



        jsonToValue(&custom_id, value, "std::string");


    }

    const char *responseKey = "response";

    if(object.has_key(responseKey))
    {
        bourne::json value = object[responseKey];




        BatchRequestOutput_response* obj = &response;
		obj->fromJson(value.dump());

    }

    const char *errorKey = "error";

    if(object.has_key(errorKey))
    {
        bourne::json value = object[errorKey];




        BatchRequestOutput_error* obj = &error;
		obj->fromJson(value.dump());

    }


}

bourne::json
BatchRequestOutput::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["custom_id"] = getCustomId();







	object["response"] = getResponse().toJson();






	object["error"] = getError().toJson();


    return object;

}

std::string
BatchRequestOutput::getId()
{
	return id;
}

void
BatchRequestOutput::setId(std::string  id)
{
	this->id = id;
}

std::string
BatchRequestOutput::getCustomId()
{
	return custom_id;
}

void
BatchRequestOutput::setCustomId(std::string  custom_id)
{
	this->custom_id = custom_id;
}

BatchRequestOutput_response
BatchRequestOutput::getResponse()
{
	return response;
}

void
BatchRequestOutput::setResponse(BatchRequestOutput_response  response)
{
	this->response = response;
}

BatchRequestOutput_error
BatchRequestOutput::getError()
{
	return error;
}

void
BatchRequestOutput::setError(BatchRequestOutput_error  error)
{
	this->error = error;
}



