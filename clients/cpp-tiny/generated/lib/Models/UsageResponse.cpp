

#include "UsageResponse.h"

using namespace Tiny;

UsageResponse::UsageResponse()
{
	object = std::string();
	data = std::list<UsageTimeBucket>();
	has_more = bool(false);
	next_page = std::string();
}

UsageResponse::UsageResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

UsageResponse::~UsageResponse()
{

}

void
UsageResponse::fromJson(std::string jsonObj)
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


        std::list<UsageTimeBucket> data_list;
        UsageTimeBucket element;
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

    const char *next_pageKey = "next_page";

    if(object.has_key(next_pageKey))
    {
        bourne::json value = object[next_pageKey];



        jsonToValue(&next_page, value, "std::string");


    }


}

bourne::json
UsageResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();





    std::list<UsageTimeBucket> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        UsageTimeBucket obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;







    object["has_more"] = isHasMore();






    object["next_page"] = getNextPage();



    return object;

}

std::string
UsageResponse::getObject()
{
	return object;
}

void
UsageResponse::setObject(std::string  object)
{
	this->object = object;
}

std::list<UsageTimeBucket>
UsageResponse::getData()
{
	return data;
}

void
UsageResponse::setData(std::list <UsageTimeBucket> data)
{
	this->data = data;
}

bool
UsageResponse::isHasMore()
{
	return has_more;
}

void
UsageResponse::setHasMore(bool  has_more)
{
	this->has_more = has_more;
}

std::string
UsageResponse::getNextPage()
{
	return next_page;
}

void
UsageResponse::setNextPage(std::string  next_page)
{
	this->next_page = next_page;
}



