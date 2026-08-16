

#include "List_audit_logs_effective_at_parameter.h"

using namespace Tiny;

List_audit_logs_effective_at_parameter::List_audit_logs_effective_at_parameter()
{
	gt = int(0);
	gte = int(0);
	lt = int(0);
	lte = int(0);
}

List_audit_logs_effective_at_parameter::List_audit_logs_effective_at_parameter(std::string jsonString)
{
	this->fromJson(jsonString);
}

List_audit_logs_effective_at_parameter::~List_audit_logs_effective_at_parameter()
{

}

void
List_audit_logs_effective_at_parameter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *gtKey = "gt";

    if(object.has_key(gtKey))
    {
        bourne::json value = object[gtKey];



        jsonToValue(&gt, value, "int");


    }

    const char *gteKey = "gte";

    if(object.has_key(gteKey))
    {
        bourne::json value = object[gteKey];



        jsonToValue(&gte, value, "int");


    }

    const char *ltKey = "lt";

    if(object.has_key(ltKey))
    {
        bourne::json value = object[ltKey];



        jsonToValue(&lt, value, "int");


    }

    const char *lteKey = "lte";

    if(object.has_key(lteKey))
    {
        bourne::json value = object[lteKey];



        jsonToValue(&lte, value, "int");


    }


}

bourne::json
List_audit_logs_effective_at_parameter::toJson()
{
    bourne::json object = bourne::json::object();





    object["gt"] = getGt();






    object["gte"] = getGte();






    object["lt"] = getLt();






    object["lte"] = getLte();



    return object;

}

int
List_audit_logs_effective_at_parameter::getGt()
{
	return gt;
}

void
List_audit_logs_effective_at_parameter::setGt(int  gt)
{
	this->gt = gt;
}

int
List_audit_logs_effective_at_parameter::getGte()
{
	return gte;
}

void
List_audit_logs_effective_at_parameter::setGte(int  gte)
{
	this->gte = gte;
}

int
List_audit_logs_effective_at_parameter::getLt()
{
	return lt;
}

void
List_audit_logs_effective_at_parameter::setLt(int  lt)
{
	this->lt = lt;
}

int
List_audit_logs_effective_at_parameter::getLte()
{
	return lte;
}

void
List_audit_logs_effective_at_parameter::setLte(int  lte)
{
	this->lte = lte;
}



