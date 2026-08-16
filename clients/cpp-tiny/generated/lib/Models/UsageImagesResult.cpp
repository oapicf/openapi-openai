

#include "UsageImagesResult.h"

using namespace Tiny;

UsageImagesResult::UsageImagesResult()
{
	object = std::string();
	images = int(0);
	num_model_requests = int(0);
	source = std::string();
	size = std::string();
	project_id = std::string();
	user_id = std::string();
	api_key_id = std::string();
	model = std::string();
}

UsageImagesResult::UsageImagesResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

UsageImagesResult::~UsageImagesResult()
{

}

void
UsageImagesResult::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *imagesKey = "images";

    if(object.has_key(imagesKey))
    {
        bourne::json value = object[imagesKey];



        jsonToValue(&images, value, "int");


    }

    const char *num_model_requestsKey = "num_model_requests";

    if(object.has_key(num_model_requestsKey))
    {
        bourne::json value = object[num_model_requestsKey];



        jsonToValue(&num_model_requests, value, "int");


    }

    const char *sourceKey = "source";

    if(object.has_key(sourceKey))
    {
        bourne::json value = object[sourceKey];



        jsonToValue(&source, value, "std::string");


    }

    const char *sizeKey = "size";

    if(object.has_key(sizeKey))
    {
        bourne::json value = object[sizeKey];



        jsonToValue(&size, value, "std::string");


    }

    const char *project_idKey = "project_id";

    if(object.has_key(project_idKey))
    {
        bourne::json value = object[project_idKey];



        jsonToValue(&project_id, value, "std::string");


    }

    const char *user_idKey = "user_id";

    if(object.has_key(user_idKey))
    {
        bourne::json value = object[user_idKey];



        jsonToValue(&user_id, value, "std::string");


    }

    const char *api_key_idKey = "api_key_id";

    if(object.has_key(api_key_idKey))
    {
        bourne::json value = object[api_key_idKey];



        jsonToValue(&api_key_id, value, "std::string");


    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];



        jsonToValue(&model, value, "std::string");


    }


}

bourne::json
UsageImagesResult::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["images"] = getImages();






    object["num_model_requests"] = getNumModelRequests();






    object["source"] = getSource();






    object["size"] = getSize();






    object["project_id"] = getProjectId();






    object["user_id"] = getUserId();






    object["api_key_id"] = getApiKeyId();






    object["model"] = getModel();



    return object;

}

std::string
UsageImagesResult::getObject()
{
	return object;
}

void
UsageImagesResult::setObject(std::string  object)
{
	this->object = object;
}

int
UsageImagesResult::getImages()
{
	return images;
}

void
UsageImagesResult::setImages(int  images)
{
	this->images = images;
}

int
UsageImagesResult::getNumModelRequests()
{
	return num_model_requests;
}

void
UsageImagesResult::setNumModelRequests(int  num_model_requests)
{
	this->num_model_requests = num_model_requests;
}

std::string
UsageImagesResult::getSource()
{
	return source;
}

void
UsageImagesResult::setSource(std::string  source)
{
	this->source = source;
}

std::string
UsageImagesResult::getSize()
{
	return size;
}

void
UsageImagesResult::setSize(std::string  size)
{
	this->size = size;
}

std::string
UsageImagesResult::getProjectId()
{
	return project_id;
}

void
UsageImagesResult::setProjectId(std::string  project_id)
{
	this->project_id = project_id;
}

std::string
UsageImagesResult::getUserId()
{
	return user_id;
}

void
UsageImagesResult::setUserId(std::string  user_id)
{
	this->user_id = user_id;
}

std::string
UsageImagesResult::getApiKeyId()
{
	return api_key_id;
}

void
UsageImagesResult::setApiKeyId(std::string  api_key_id)
{
	this->api_key_id = api_key_id;
}

std::string
UsageImagesResult::getModel()
{
	return model;
}

void
UsageImagesResult::setModel(std::string  model)
{
	this->model = model;
}



