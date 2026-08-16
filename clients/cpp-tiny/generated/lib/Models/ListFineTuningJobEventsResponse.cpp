

#include "ListFineTuningJobEventsResponse.h"

using namespace Tiny;

ListFineTuningJobEventsResponse::ListFineTuningJobEventsResponse()
{
	data = std::list<FineTuningJobEvent>();
	object = std::string();
}

ListFineTuningJobEventsResponse::ListFineTuningJobEventsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ListFineTuningJobEventsResponse::~ListFineTuningJobEventsResponse()
{

}

void
ListFineTuningJobEventsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];


        std::list<FineTuningJobEvent> data_list;
        FineTuningJobEvent element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_list.push_back(element);
        }
        data = data_list;


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }


}

bourne::json
ListFineTuningJobEventsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<FineTuningJobEvent> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        FineTuningJobEvent obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;







    object["object"] = getObject();



    return object;

}

std::list<FineTuningJobEvent>
ListFineTuningJobEventsResponse::getData()
{
	return data;
}

void
ListFineTuningJobEventsResponse::setData(std::list <FineTuningJobEvent> data)
{
	this->data = data;
}

std::string
ListFineTuningJobEventsResponse::getObject()
{
	return object;
}

void
ListFineTuningJobEventsResponse::setObject(std::string  object)
{
	this->object = object;
}



