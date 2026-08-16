

#include "ListBatchesResponse.h"

using namespace Tiny;

ListBatchesResponse::ListBatchesResponse()
{
	data = std::list<Batch>();
	first_id = std::string();
	last_id = std::string();
	has_more = bool(false);
	object = std::string();
}

ListBatchesResponse::ListBatchesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ListBatchesResponse::~ListBatchesResponse()
{

}

void
ListBatchesResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];


        std::list<Batch> data_list;
        Batch element;
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

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }


}

bourne::json
ListBatchesResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<Batch> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        Batch obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;







    object["first_id"] = getFirstId();






    object["last_id"] = getLastId();






    object["has_more"] = isHasMore();






    object["object"] = getObject();



    return object;

}

std::list<Batch>
ListBatchesResponse::getData()
{
	return data;
}

void
ListBatchesResponse::setData(std::list <Batch> data)
{
	this->data = data;
}

std::string
ListBatchesResponse::getFirstId()
{
	return first_id;
}

void
ListBatchesResponse::setFirstId(std::string  first_id)
{
	this->first_id = first_id;
}

std::string
ListBatchesResponse::getLastId()
{
	return last_id;
}

void
ListBatchesResponse::setLastId(std::string  last_id)
{
	this->last_id = last_id;
}

bool
ListBatchesResponse::isHasMore()
{
	return has_more;
}

void
ListBatchesResponse::setHasMore(bool  has_more)
{
	this->has_more = has_more;
}

std::string
ListBatchesResponse::getObject()
{
	return object;
}

void
ListBatchesResponse::setObject(std::string  object)
{
	this->object = object;
}



