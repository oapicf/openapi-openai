

#include "CreateImageRequest.h"

using namespace Tiny;

CreateImageRequest::CreateImageRequest()
{
	prompt = std::string();
	model = CreateImageRequest_model();
	n = int(0);
	quality = std::string();
	response_format = std::string();
	size = std::string();
	style = std::string();
	user = std::string();
}

CreateImageRequest::CreateImageRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateImageRequest::~CreateImageRequest()
{

}

void
CreateImageRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *promptKey = "prompt";

    if(object.has_key(promptKey))
    {
        bourne::json value = object[promptKey];



        jsonToValue(&prompt, value, "std::string");


    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];




        CreateImageRequest_model* obj = &model;
		obj->fromJson(value.dump());

    }

    const char *nKey = "n";

    if(object.has_key(nKey))
    {
        bourne::json value = object[nKey];



        jsonToValue(&n, value, "int");


    }

    const char *qualityKey = "quality";

    if(object.has_key(qualityKey))
    {
        bourne::json value = object[qualityKey];



        jsonToValue(&quality, value, "std::string");


    }

    const char *response_formatKey = "response_format";

    if(object.has_key(response_formatKey))
    {
        bourne::json value = object[response_formatKey];



        jsonToValue(&response_format, value, "std::string");


    }

    const char *sizeKey = "size";

    if(object.has_key(sizeKey))
    {
        bourne::json value = object[sizeKey];



        jsonToValue(&size, value, "std::string");


    }

    const char *styleKey = "style";

    if(object.has_key(styleKey))
    {
        bourne::json value = object[styleKey];



        jsonToValue(&style, value, "std::string");


    }

    const char *userKey = "user";

    if(object.has_key(userKey))
    {
        bourne::json value = object[userKey];



        jsonToValue(&user, value, "std::string");


    }


}

bourne::json
CreateImageRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["prompt"] = getPrompt();







	object["model"] = getModel().toJson();





    object["n"] = getN();






    object["quality"] = getQuality();






    object["response_format"] = getResponseFormat();






    object["size"] = getSize();






    object["style"] = getStyle();






    object["user"] = getUser();



    return object;

}

std::string
CreateImageRequest::getPrompt()
{
	return prompt;
}

void
CreateImageRequest::setPrompt(std::string  prompt)
{
	this->prompt = prompt;
}

CreateImageRequest_model
CreateImageRequest::getModel()
{
	return model;
}

void
CreateImageRequest::setModel(CreateImageRequest_model  model)
{
	this->model = model;
}

int
CreateImageRequest::getN()
{
	return n;
}

void
CreateImageRequest::setN(int  n)
{
	this->n = n;
}

std::string
CreateImageRequest::getQuality()
{
	return quality;
}

void
CreateImageRequest::setQuality(std::string  quality)
{
	this->quality = quality;
}

std::string
CreateImageRequest::getResponseFormat()
{
	return response_format;
}

void
CreateImageRequest::setResponseFormat(std::string  response_format)
{
	this->response_format = response_format;
}

std::string
CreateImageRequest::getSize()
{
	return size;
}

void
CreateImageRequest::setSize(std::string  size)
{
	this->size = size;
}

std::string
CreateImageRequest::getStyle()
{
	return style;
}

void
CreateImageRequest::setStyle(std::string  style)
{
	this->style = style;
}

std::string
CreateImageRequest::getUser()
{
	return user;
}

void
CreateImageRequest::setUser(std::string  user)
{
	this->user = user;
}



