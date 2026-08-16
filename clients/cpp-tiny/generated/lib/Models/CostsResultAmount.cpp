

#include "CostsResult_amount.h"

using namespace Tiny;

CostsResult_amount::CostsResult_amount()
{
	value = float(0);
	currency = std::string();
}

CostsResult_amount::CostsResult_amount(std::string jsonString)
{
	this->fromJson(jsonString);
}

CostsResult_amount::~CostsResult_amount()
{

}

void
CostsResult_amount::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "long");


    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];



        jsonToValue(&currency, value, "std::string");


    }


}

bourne::json
CostsResult_amount::toJson()
{
    bourne::json object = bourne::json::object();





    object["value"] = getValue();






    object["currency"] = getCurrency();



    return object;

}

long
CostsResult_amount::getValue()
{
	return value;
}

void
CostsResult_amount::setValue(long  value)
{
	this->value = value;
}

std::string
CostsResult_amount::getCurrency()
{
	return currency;
}

void
CostsResult_amount::setCurrency(std::string  currency)
{
	this->currency = currency;
}



