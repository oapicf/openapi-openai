

#include "CreateEmbeddingResponse.h"

using namespace Tiny;

CreateEmbeddingResponse::CreateEmbeddingResponse()
{
	data = std::list<Embedding>();
	model = std::string();
	object = std::string();
	usage = CreateEmbeddingResponse_usage();
}

CreateEmbeddingResponse::CreateEmbeddingResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateEmbeddingResponse::~CreateEmbeddingResponse()
{

}

void
CreateEmbeddingResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];


        std::list<Embedding> data_list;
        Embedding element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_list.push_back(element);
        }
        data = data_list;


    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];



        jsonToValue(&model, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *usageKey = "usage";

    if(object.has_key(usageKey))
    {
        bourne::json value = object[usageKey];




        CreateEmbeddingResponse_usage* obj = &usage;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateEmbeddingResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<Embedding> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        Embedding obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;







    object["model"] = getModel();






    object["object"] = getObject();







	object["usage"] = getUsage().toJson();


    return object;

}

std::list<Embedding>
CreateEmbeddingResponse::getData()
{
	return data;
}

void
CreateEmbeddingResponse::setData(std::list <Embedding> data)
{
	this->data = data;
}

std::string
CreateEmbeddingResponse::getModel()
{
	return model;
}

void
CreateEmbeddingResponse::setModel(std::string  model)
{
	this->model = model;
}

std::string
CreateEmbeddingResponse::getObject()
{
	return object;
}

void
CreateEmbeddingResponse::setObject(std::string  object)
{
	this->object = object;
}

CreateEmbeddingResponse_usage
CreateEmbeddingResponse::getUsage()
{
	return usage;
}

void
CreateEmbeddingResponse::setUsage(CreateEmbeddingResponse_usage  usage)
{
	this->usage = usage;
}



