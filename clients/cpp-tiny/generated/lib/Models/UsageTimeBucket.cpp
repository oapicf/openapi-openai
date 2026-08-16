

#include "UsageTimeBucket.h"

using namespace Tiny;

UsageTimeBucket::UsageTimeBucket()
{
	object = std::string();
	start_time = int(0);
	end_time = int(0);
	result = std::list<UsageTimeBucket_result_inner>();
}

UsageTimeBucket::UsageTimeBucket(std::string jsonString)
{
	this->fromJson(jsonString);
}

UsageTimeBucket::~UsageTimeBucket()
{

}

void
UsageTimeBucket::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *start_timeKey = "start_time";

    if(object.has_key(start_timeKey))
    {
        bourne::json value = object[start_timeKey];



        jsonToValue(&start_time, value, "int");


    }

    const char *end_timeKey = "end_time";

    if(object.has_key(end_timeKey))
    {
        bourne::json value = object[end_timeKey];



        jsonToValue(&end_time, value, "int");


    }

    const char *resultKey = "result";

    if(object.has_key(resultKey))
    {
        bourne::json value = object[resultKey];


        std::list<UsageTimeBucket_result_inner> result_list;
        UsageTimeBucket_result_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            result_list.push_back(element);
        }
        result = result_list;


    }


}

bourne::json
UsageTimeBucket::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["start_time"] = getStartTime();






    object["end_time"] = getEndTime();





    std::list<UsageTimeBucket_result_inner> result_list = getResult();
    bourne::json result_arr = bourne::json::array();

    for(auto& var : result_list)
    {
        UsageTimeBucket_result_inner obj = var;
        result_arr.append(obj.toJson());
    }
    object["result"] = result_arr;




    return object;

}

std::string
UsageTimeBucket::getObject()
{
	return object;
}

void
UsageTimeBucket::setObject(std::string  object)
{
	this->object = object;
}

int
UsageTimeBucket::getStartTime()
{
	return start_time;
}

void
UsageTimeBucket::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

int
UsageTimeBucket::getEndTime()
{
	return end_time;
}

void
UsageTimeBucket::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

std::list<UsageTimeBucket_result_inner>
UsageTimeBucket::getResult()
{
	return result;
}

void
UsageTimeBucket::setResult(std::list <UsageTimeBucket_result_inner> result)
{
	this->result = result;
}



