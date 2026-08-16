

#include "ListRunsResponse.h"

using namespace Tiny;

ListRunsResponse::ListRunsResponse()
{
	object = std::string();
	data = std::list<RunObject>();
	first_id = std::string();
	last_id = std::string();
	has_more = bool(false);
}

ListRunsResponse::ListRunsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ListRunsResponse::~ListRunsResponse()
{

}

void
ListRunsResponse::fromJson(std::string jsonObj)
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


        std::list<RunObject> data_list;
        RunObject element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_list.push_back(element);
        }
        data = data_list;


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
ListRunsResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();





    std::list<RunObject> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        RunObject obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;







    object["first_id"] = getFirstId();






    object["last_id"] = getLastId();






    object["has_more"] = isHasMore();



    return object;

}

std::string
ListRunsResponse::getObject()
{
	return object;
}

void
ListRunsResponse::setObject(std::string  object)
{
	this->object = object;
}

std::list<RunObject>
ListRunsResponse::getData()
{
	return data;
}

void
ListRunsResponse::setData(std::list <RunObject> data)
{
	this->data = data;
}

std::string
ListRunsResponse::getFirstId()
{
	return first_id;
}

void
ListRunsResponse::setFirstId(std::string  first_id)
{
	this->first_id = first_id;
}

std::string
ListRunsResponse::getLastId()
{
	return last_id;
}

void
ListRunsResponse::setLastId(std::string  last_id)
{
	this->last_id = last_id;
}

bool
ListRunsResponse::isHasMore()
{
	return has_more;
}

void
ListRunsResponse::setHasMore(bool  has_more)
{
	this->has_more = has_more;
}



