

#include "ListModelsResponse.h"

using namespace Tiny;

ListModelsResponse::ListModelsResponse()
{
	object = std::string();
	data = std::list<Model>();
}

ListModelsResponse::ListModelsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ListModelsResponse::~ListModelsResponse()
{

}

void
ListModelsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];


        std::list<Model> data_list;
        Model element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_list.push_back(element);
        }
        data = data_list;


    }


}

bourne::json
ListModelsResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();





    std::list<Model> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        Model obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;




    return object;

}

std::string
ListModelsResponse::getObject()
{
	return object;
}

void
ListModelsResponse::setObject(std::string  object)
{
	this->object = object;
}

std::list<Model>
ListModelsResponse::getData()
{
	return data;
}

void
ListModelsResponse::setData(std::list <Model> data)
{
	this->data = data;
}



