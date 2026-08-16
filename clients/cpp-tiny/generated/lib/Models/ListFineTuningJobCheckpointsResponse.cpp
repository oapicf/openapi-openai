

#include "ListFineTuningJobCheckpointsResponse.h"

using namespace Tiny;

ListFineTuningJobCheckpointsResponse::ListFineTuningJobCheckpointsResponse()
{
	data = std::list<FineTuningJobCheckpoint>();
	object = std::string();
	first_id = std::string();
	last_id = std::string();
	has_more = bool(false);
}

ListFineTuningJobCheckpointsResponse::ListFineTuningJobCheckpointsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ListFineTuningJobCheckpointsResponse::~ListFineTuningJobCheckpointsResponse()
{

}

void
ListFineTuningJobCheckpointsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];


        std::list<FineTuningJobCheckpoint> data_list;
        FineTuningJobCheckpoint element;
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

    const char *first_idKey = "first_id";

    if(object.has_key(first_idKey))
    {
        bourne::json value = object[first_idKey];



        jsonToValue(&first_id, value, "std::string");


    }

    const char *last_idKey = "last_id";

    if(object.has_key(last_idKey))
    {
        bourne::json value = object[last_idKey];



        jsonToValue(&last_id, value, "std::string");


    }

    const char *has_moreKey = "has_more";

    if(object.has_key(has_moreKey))
    {
        bourne::json value = object[has_moreKey];



        jsonToValue(&has_more, value, "bool");


    }


}

bourne::json
ListFineTuningJobCheckpointsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<FineTuningJobCheckpoint> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        FineTuningJobCheckpoint obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;







    object["object"] = getObject();






    object["first_id"] = getFirstId();






    object["last_id"] = getLastId();






    object["has_more"] = isHasMore();



    return object;

}

std::list<FineTuningJobCheckpoint>
ListFineTuningJobCheckpointsResponse::getData()
{
	return data;
}

void
ListFineTuningJobCheckpointsResponse::setData(std::list <FineTuningJobCheckpoint> data)
{
	this->data = data;
}

std::string
ListFineTuningJobCheckpointsResponse::getObject()
{
	return object;
}

void
ListFineTuningJobCheckpointsResponse::setObject(std::string  object)
{
	this->object = object;
}

std::string
ListFineTuningJobCheckpointsResponse::getFirstId()
{
	return first_id;
}

void
ListFineTuningJobCheckpointsResponse::setFirstId(std::string  first_id)
{
	this->first_id = first_id;
}

std::string
ListFineTuningJobCheckpointsResponse::getLastId()
{
	return last_id;
}

void
ListFineTuningJobCheckpointsResponse::setLastId(std::string  last_id)
{
	this->last_id = last_id;
}

bool
ListFineTuningJobCheckpointsResponse::isHasMore()
{
	return has_more;
}

void
ListFineTuningJobCheckpointsResponse::setHasMore(bool  has_more)
{
	this->has_more = has_more;
}



