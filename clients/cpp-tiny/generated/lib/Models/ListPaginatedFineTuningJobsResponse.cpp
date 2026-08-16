

#include "ListPaginatedFineTuningJobsResponse.h"

using namespace Tiny;

ListPaginatedFineTuningJobsResponse::ListPaginatedFineTuningJobsResponse()
{
	data = std::list<FineTuningJob>();
	has_more = bool(false);
	object = std::string();
}

ListPaginatedFineTuningJobsResponse::ListPaginatedFineTuningJobsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ListPaginatedFineTuningJobsResponse::~ListPaginatedFineTuningJobsResponse()
{

}

void
ListPaginatedFineTuningJobsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];


        std::list<FineTuningJob> data_list;
        FineTuningJob element;
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

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }


}

bourne::json
ListPaginatedFineTuningJobsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<FineTuningJob> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        FineTuningJob obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;







    object["has_more"] = isHasMore();






    object["object"] = getObject();



    return object;

}

std::list<FineTuningJob>
ListPaginatedFineTuningJobsResponse::getData()
{
	return data;
}

void
ListPaginatedFineTuningJobsResponse::setData(std::list <FineTuningJob> data)
{
	this->data = data;
}

bool
ListPaginatedFineTuningJobsResponse::isHasMore()
{
	return has_more;
}

void
ListPaginatedFineTuningJobsResponse::setHasMore(bool  has_more)
{
	this->has_more = has_more;
}

std::string
ListPaginatedFineTuningJobsResponse::getObject()
{
	return object;
}

void
ListPaginatedFineTuningJobsResponse::setObject(std::string  object)
{
	this->object = object;
}



