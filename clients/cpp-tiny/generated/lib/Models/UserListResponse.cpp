

#include "UserListResponse.h"

using namespace Tiny;

UserListResponse::UserListResponse()
{
	object = std::string();
	data = std::list<User>();
	first_id = std::string();
	last_id = std::string();
	has_more = bool(false);
}

UserListResponse::UserListResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserListResponse::~UserListResponse()
{

}

void
UserListResponse::fromJson(std::string jsonObj)
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


        std::list<User> data_list;
        User element;
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
UserListResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();





    std::list<User> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        User obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;







    object["first_id"] = getFirstId();






    object["last_id"] = getLastId();






    object["has_more"] = isHasMore();



    return object;

}

std::string
UserListResponse::getObject()
{
	return object;
}

void
UserListResponse::setObject(std::string  object)
{
	this->object = object;
}

std::list<User>
UserListResponse::getData()
{
	return data;
}

void
UserListResponse::setData(std::list <User> data)
{
	this->data = data;
}

std::string
UserListResponse::getFirstId()
{
	return first_id;
}

void
UserListResponse::setFirstId(std::string  first_id)
{
	this->first_id = first_id;
}

std::string
UserListResponse::getLastId()
{
	return last_id;
}

void
UserListResponse::setLastId(std::string  last_id)
{
	this->last_id = last_id;
}

bool
UserListResponse::isHasMore()
{
	return has_more;
}

void
UserListResponse::setHasMore(bool  has_more)
{
	this->has_more = has_more;
}



