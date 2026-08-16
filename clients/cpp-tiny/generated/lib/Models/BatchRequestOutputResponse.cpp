

#include "BatchRequestOutput_response.h"

using namespace Tiny;

BatchRequestOutput_response::BatchRequestOutput_response()
{
	status_code = int(0);
	request_id = std::string();
	body = null;
}

BatchRequestOutput_response::BatchRequestOutput_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

BatchRequestOutput_response::~BatchRequestOutput_response()
{

}

void
BatchRequestOutput_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *status_codeKey = "status_code";

    if(object.has_key(status_codeKey))
    {
        bourne::json value = object[status_codeKey];



        jsonToValue(&status_code, value, "int");


    }

    const char *request_idKey = "request_id";

    if(object.has_key(request_idKey))
    {
        bourne::json value = object[request_idKey];



        jsonToValue(&request_id, value, "std::string");


    }

    const char *bodyKey = "body";

    if(object.has_key(bodyKey))
    {
        bourne::json value = object[bodyKey];




        Object* obj = &body;
		obj->fromJson(value.dump());

    }


}

bourne::json
BatchRequestOutput_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["status_code"] = getStatusCode();






    object["request_id"] = getRequestId();







	object["body"] = getBody().toJson();


    return object;

}

int
BatchRequestOutput_response::getStatusCode()
{
	return status_code;
}

void
BatchRequestOutput_response::setStatusCode(int  status_code)
{
	this->status_code = status_code;
}

std::string
BatchRequestOutput_response::getRequestId()
{
	return request_id;
}

void
BatchRequestOutput_response::setRequestId(std::string  request_id)
{
	this->request_id = request_id;
}

Object
BatchRequestOutput_response::getBody()
{
	return body;
}

void
BatchRequestOutput_response::setBody(Object  body)
{
	this->body = body;
}



