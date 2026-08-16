

#include "Batch_errors.h"

using namespace Tiny;

Batch_errors::Batch_errors()
{
	object = std::string();
	data = std::list<Batch_errors_data_inner>();
}

Batch_errors::Batch_errors(std::string jsonString)
{
	this->fromJson(jsonString);
}

Batch_errors::~Batch_errors()
{

}

void
Batch_errors::fromJson(std::string jsonObj)
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


        std::list<Batch_errors_data_inner> data_list;
        Batch_errors_data_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_list.push_back(element);
        }
        data = data_list;


    }


}

bourne::json
Batch_errors::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();





    std::list<Batch_errors_data_inner> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        Batch_errors_data_inner obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;




    return object;

}

std::string
Batch_errors::getObject()
{
	return object;
}

void
Batch_errors::setObject(std::string  object)
{
	this->object = object;
}

std::list<Batch_errors_data_inner>
Batch_errors::getData()
{
	return data;
}

void
Batch_errors::setData(std::list <Batch_errors_data_inner> data)
{
	this->data = data;
}



