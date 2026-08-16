

#include "CreateEmbeddingRequest.h"

using namespace Tiny;

CreateEmbeddingRequest::CreateEmbeddingRequest()
{
	input = CreateEmbeddingRequest_input();
	model = CreateEmbeddingRequest_model();
	encoding_format = std::string();
	dimensions = int(0);
	user = std::string();
}

CreateEmbeddingRequest::CreateEmbeddingRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateEmbeddingRequest::~CreateEmbeddingRequest()
{

}

void
CreateEmbeddingRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *inputKey = "input";

    if(object.has_key(inputKey))
    {
        bourne::json value = object[inputKey];




        CreateEmbeddingRequest_input* obj = &input;
		obj->fromJson(value.dump());

    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];




        CreateEmbeddingRequest_model* obj = &model;
		obj->fromJson(value.dump());

    }

    const char *encoding_formatKey = "encoding_format";

    if(object.has_key(encoding_formatKey))
    {
        bourne::json value = object[encoding_formatKey];



        jsonToValue(&encoding_format, value, "std::string");


    }

    const char *dimensionsKey = "dimensions";

    if(object.has_key(dimensionsKey))
    {
        bourne::json value = object[dimensionsKey];



        jsonToValue(&dimensions, value, "int");


    }

    const char *userKey = "user";

    if(object.has_key(userKey))
    {
        bourne::json value = object[userKey];



        jsonToValue(&user, value, "std::string");


    }


}

bourne::json
CreateEmbeddingRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["input"] = getInput().toJson();






	object["model"] = getModel().toJson();





    object["encoding_format"] = getEncodingFormat();






    object["dimensions"] = getDimensions();






    object["user"] = getUser();



    return object;

}

CreateEmbeddingRequest_input
CreateEmbeddingRequest::getInput()
{
	return input;
}

void
CreateEmbeddingRequest::setInput(CreateEmbeddingRequest_input  input)
{
	this->input = input;
}

CreateEmbeddingRequest_model
CreateEmbeddingRequest::getModel()
{
	return model;
}

void
CreateEmbeddingRequest::setModel(CreateEmbeddingRequest_model  model)
{
	this->model = model;
}

std::string
CreateEmbeddingRequest::getEncodingFormat()
{
	return encoding_format;
}

void
CreateEmbeddingRequest::setEncodingFormat(std::string  encoding_format)
{
	this->encoding_format = encoding_format;
}

int
CreateEmbeddingRequest::getDimensions()
{
	return dimensions;
}

void
CreateEmbeddingRequest::setDimensions(int  dimensions)
{
	this->dimensions = dimensions;
}

std::string
CreateEmbeddingRequest::getUser()
{
	return user;
}

void
CreateEmbeddingRequest::setUser(std::string  user)
{
	this->user = user;
}



