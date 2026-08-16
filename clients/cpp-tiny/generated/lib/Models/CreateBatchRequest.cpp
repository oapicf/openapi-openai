

#include "CreateBatch_request.h"

using namespace Tiny;

CreateBatch_request::CreateBatch_request()
{
	input_file_id = std::string();
	endpoint = std::string();
	completion_window = std::string();
	metadata = null<std::string>();
}

CreateBatch_request::CreateBatch_request(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateBatch_request::~CreateBatch_request()
{

}

void
CreateBatch_request::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *input_file_idKey = "input_file_id";

    if(object.has_key(input_file_idKey))
    {
        bourne::json value = object[input_file_idKey];



        jsonToValue(&input_file_id, value, "std::string");


    }

    const char *endpointKey = "endpoint";

    if(object.has_key(endpointKey))
    {
        bourne::json value = object[endpointKey];



        jsonToValue(&endpoint, value, "std::string");


    }

    const char *completion_windowKey = "completion_window";

    if(object.has_key(completion_windowKey))
    {
        bourne::json value = object[completion_windowKey];



        jsonToValue(&completion_window, value, "std::string");


    }

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];


    }


}

bourne::json
CreateBatch_request::toJson()
{
    bourne::json object = bourne::json::object();





    object["input_file_id"] = getInputFileId();






    object["endpoint"] = getEndpoint();






    object["completion_window"] = getCompletionWindow();






    return object;

}

std::string
CreateBatch_request::getInputFileId()
{
	return input_file_id;
}

void
CreateBatch_request::setInputFileId(std::string  input_file_id)
{
	this->input_file_id = input_file_id;
}

std::string
CreateBatch_request::getEndpoint()
{
	return endpoint;
}

void
CreateBatch_request::setEndpoint(std::string  endpoint)
{
	this->endpoint = endpoint;
}

std::string
CreateBatch_request::getCompletionWindow()
{
	return completion_window;
}

void
CreateBatch_request::setCompletionWindow(std::string  completion_window)
{
	this->completion_window = completion_window;
}

Map<string, string>
CreateBatch_request::getMetadata()
{
	return metadata;
}

void
CreateBatch_request::setMetadata(Map <string, string> metadata)
{
	this->metadata = metadata;
}



