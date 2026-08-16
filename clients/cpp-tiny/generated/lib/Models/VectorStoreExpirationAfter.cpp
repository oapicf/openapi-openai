

#include "VectorStoreExpirationAfter.h"

using namespace Tiny;

VectorStoreExpirationAfter::VectorStoreExpirationAfter()
{
	anchor = std::string();
	days = int(0);
}

VectorStoreExpirationAfter::VectorStoreExpirationAfter(std::string jsonString)
{
	this->fromJson(jsonString);
}

VectorStoreExpirationAfter::~VectorStoreExpirationAfter()
{

}

void
VectorStoreExpirationAfter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *anchorKey = "anchor";

    if(object.has_key(anchorKey))
    {
        bourne::json value = object[anchorKey];



        jsonToValue(&anchor, value, "std::string");


    }

    const char *daysKey = "days";

    if(object.has_key(daysKey))
    {
        bourne::json value = object[daysKey];



        jsonToValue(&days, value, "int");


    }


}

bourne::json
VectorStoreExpirationAfter::toJson()
{
    bourne::json object = bourne::json::object();





    object["anchor"] = getAnchor();






    object["days"] = getDays();



    return object;

}

std::string
VectorStoreExpirationAfter::getAnchor()
{
	return anchor;
}

void
VectorStoreExpirationAfter::setAnchor(std::string  anchor)
{
	this->anchor = anchor;
}

int
VectorStoreExpirationAfter::getDays()
{
	return days;
}

void
VectorStoreExpirationAfter::setDays(int  days)
{
	this->days = days;
}



