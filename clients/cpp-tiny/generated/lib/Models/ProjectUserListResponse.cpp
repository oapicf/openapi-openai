

#include "ProjectUserListResponse.h"

using namespace Tiny;

ProjectUserListResponse::ProjectUserListResponse()
{
	object = std::string();
	data = std::list<ProjectUser>();
	first_id = std::string();
	last_id = std::string();
	has_more = bool(false);
}

ProjectUserListResponse::ProjectUserListResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectUserListResponse::~ProjectUserListResponse()
{

}

void
ProjectUserListResponse::fromJson(std::string jsonObj)
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


        std::list<ProjectUser> data_list;
        ProjectUser element;
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
ProjectUserListResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();





    std::list<ProjectUser> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        ProjectUser obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;







    object["first_id"] = getFirstId();






    object["last_id"] = getLastId();






    object["has_more"] = isHasMore();



    return object;

}

std::string
ProjectUserListResponse::getObject()
{
	return object;
}

void
ProjectUserListResponse::setObject(std::string  object)
{
	this->object = object;
}

std::list<ProjectUser>
ProjectUserListResponse::getData()
{
	return data;
}

void
ProjectUserListResponse::setData(std::list <ProjectUser> data)
{
	this->data = data;
}

std::string
ProjectUserListResponse::getFirstId()
{
	return first_id;
}

void
ProjectUserListResponse::setFirstId(std::string  first_id)
{
	this->first_id = first_id;
}

std::string
ProjectUserListResponse::getLastId()
{
	return last_id;
}

void
ProjectUserListResponse::setLastId(std::string  last_id)
{
	this->last_id = last_id;
}

bool
ProjectUserListResponse::isHasMore()
{
	return has_more;
}

void
ProjectUserListResponse::setHasMore(bool  has_more)
{
	this->has_more = has_more;
}



