

#include "Batch_request_counts.h"

using namespace Tiny;

Batch_request_counts::Batch_request_counts()
{
	total = int(0);
	completed = int(0);
	failed = int(0);
}

Batch_request_counts::Batch_request_counts(std::string jsonString)
{
	this->fromJson(jsonString);
}

Batch_request_counts::~Batch_request_counts()
{

}

void
Batch_request_counts::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *totalKey = "total";

    if(object.has_key(totalKey))
    {
        bourne::json value = object[totalKey];



        jsonToValue(&total, value, "int");


    }

    const char *completedKey = "completed";

    if(object.has_key(completedKey))
    {
        bourne::json value = object[completedKey];



        jsonToValue(&completed, value, "int");


    }

    const char *failedKey = "failed";

    if(object.has_key(failedKey))
    {
        bourne::json value = object[failedKey];



        jsonToValue(&failed, value, "int");


    }


}

bourne::json
Batch_request_counts::toJson()
{
    bourne::json object = bourne::json::object();





    object["total"] = getTotal();






    object["completed"] = getCompleted();






    object["failed"] = getFailed();



    return object;

}

int
Batch_request_counts::getTotal()
{
	return total;
}

void
Batch_request_counts::setTotal(int  total)
{
	this->total = total;
}

int
Batch_request_counts::getCompleted()
{
	return completed;
}

void
Batch_request_counts::setCompleted(int  completed)
{
	this->completed = completed;
}

int
Batch_request_counts::getFailed()
{
	return failed;
}

void
Batch_request_counts::setFailed(int  failed)
{
	this->failed = failed;
}



