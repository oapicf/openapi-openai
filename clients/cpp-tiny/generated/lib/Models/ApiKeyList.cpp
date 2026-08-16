

#include "ApiKeyList.h"

using namespace Tiny;

ApiKeyList::ApiKeyList()
{
	object = std::string();
	data = std::list<AdminApiKey>();
	has_more = bool(false);
	first_id = std::string();
	last_id = std::string();
}

ApiKeyList::ApiKeyList(std::string jsonString)
{
	this->fromJson(jsonString);
}

ApiKeyList::~ApiKeyList()
{

}

void
ApiKeyList::fromJson(std::string jsonObj)
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


        std::list<AdminApiKey> data_list;
        AdminApiKey element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_list.push_back(element);
        }
        data = data_list;


    }

    const char *has_moreKey = "has_more";

    if(object.has_key(has_moreKey))
    {
        bourne::json value = object[has_moreKey];



        jsonToValue(&has_more, value, "bool");


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


}

bourne::json
ApiKeyList::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();





    std::list<AdminApiKey> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        AdminApiKey obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;







    object["has_more"] = isHasMore();






    object["first_id"] = getFirstId();






    object["last_id"] = getLastId();



    return object;

}

std::string
ApiKeyList::getObject()
{
	return object;
}

void
ApiKeyList::setObject(std::string  object)
{
	this->object = object;
}

std::list<AdminApiKey>
ApiKeyList::getData()
{
	return data;
}

void
ApiKeyList::setData(std::list <AdminApiKey> data)
{
	this->data = data;
}

bool
ApiKeyList::isHasMore()
{
	return has_more;
}

void
ApiKeyList::setHasMore(bool  has_more)
{
	this->has_more = has_more;
}

std::string
ApiKeyList::getFirstId()
{
	return first_id;
}

void
ApiKeyList::setFirstId(std::string  first_id)
{
	this->first_id = first_id;
}

std::string
ApiKeyList::getLastId()
{
	return last_id;
}

void
ApiKeyList::setLastId(std::string  last_id)
{
	this->last_id = last_id;
}



