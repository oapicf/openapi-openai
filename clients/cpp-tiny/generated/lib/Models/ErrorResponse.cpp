

#include "ErrorResponse.h"

using namespace Tiny;

ErrorResponse::ErrorResponse()
{
	error = Error();
}

ErrorResponse::ErrorResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ErrorResponse::~ErrorResponse()
{

}

void
ErrorResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *errorKey = "error";

    if(object.has_key(errorKey))
    {
        bourne::json value = object[errorKey];




        Error* obj = &error;
		obj->fromJson(value.dump());

    }


}

bourne::json
ErrorResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["error"] = getError().toJson();


    return object;

}

Error
ErrorResponse::getError()
{
	return error;
}

void
ErrorResponse::setError(Error  error)
{
	this->error = error;
}



