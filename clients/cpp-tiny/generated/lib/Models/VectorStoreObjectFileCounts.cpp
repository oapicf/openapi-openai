

#include "VectorStoreObject_file_counts.h"

using namespace Tiny;

VectorStoreObject_file_counts::VectorStoreObject_file_counts()
{
	in_progress = int(0);
	completed = int(0);
	failed = int(0);
	cancelled = int(0);
	total = int(0);
}

VectorStoreObject_file_counts::VectorStoreObject_file_counts(std::string jsonString)
{
	this->fromJson(jsonString);
}

VectorStoreObject_file_counts::~VectorStoreObject_file_counts()
{

}

void
VectorStoreObject_file_counts::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *in_progressKey = "in_progress";

    if(object.has_key(in_progressKey))
    {
        bourne::json value = object[in_progressKey];



        jsonToValue(&in_progress, value, "int");


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

    const char *cancelledKey = "cancelled";

    if(object.has_key(cancelledKey))
    {
        bourne::json value = object[cancelledKey];



        jsonToValue(&cancelled, value, "int");


    }

    const char *totalKey = "total";

    if(object.has_key(totalKey))
    {
        bourne::json value = object[totalKey];



        jsonToValue(&total, value, "int");


    }


}

bourne::json
VectorStoreObject_file_counts::toJson()
{
    bourne::json object = bourne::json::object();





    object["in_progress"] = getInProgress();






    object["completed"] = getCompleted();






    object["failed"] = getFailed();






    object["cancelled"] = getCancelled();






    object["total"] = getTotal();



    return object;

}

int
VectorStoreObject_file_counts::getInProgress()
{
	return in_progress;
}

void
VectorStoreObject_file_counts::setInProgress(int  in_progress)
{
	this->in_progress = in_progress;
}

int
VectorStoreObject_file_counts::getCompleted()
{
	return completed;
}

void
VectorStoreObject_file_counts::setCompleted(int  completed)
{
	this->completed = completed;
}

int
VectorStoreObject_file_counts::getFailed()
{
	return failed;
}

void
VectorStoreObject_file_counts::setFailed(int  failed)
{
	this->failed = failed;
}

int
VectorStoreObject_file_counts::getCancelled()
{
	return cancelled;
}

void
VectorStoreObject_file_counts::setCancelled(int  cancelled)
{
	this->cancelled = cancelled;
}

int
VectorStoreObject_file_counts::getTotal()
{
	return total;
}

void
VectorStoreObject_file_counts::setTotal(int  total)
{
	this->total = total;
}



