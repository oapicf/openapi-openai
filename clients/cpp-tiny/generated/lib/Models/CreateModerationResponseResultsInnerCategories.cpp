

#include "CreateModerationResponse_results_inner_categories.h"

using namespace Tiny;

CreateModerationResponse_results_inner_categories::CreateModerationResponse_results_inner_categories()
{
	hate = bool(false);
	hatethreatening = bool(false);
	harassment = bool(false);
	harassmentthreatening = bool(false);
	illicit = bool(false);
	illicitviolent = bool(false);
	selfharm = bool(false);
	selfharmintent = bool(false);
	selfharminstructions = bool(false);
	sexual = bool(false);
	sexualminors = bool(false);
	violence = bool(false);
	violencegraphic = bool(false);
}

CreateModerationResponse_results_inner_categories::CreateModerationResponse_results_inner_categories(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateModerationResponse_results_inner_categories::~CreateModerationResponse_results_inner_categories()
{

}

void
CreateModerationResponse_results_inner_categories::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hateKey = "hate";

    if(object.has_key(hateKey))
    {
        bourne::json value = object[hateKey];



        jsonToValue(&hate, value, "bool");


    }

    const char *hatethreateningKey = "hate/threatening";

    if(object.has_key(hatethreateningKey))
    {
        bourne::json value = object[hatethreateningKey];



        jsonToValue(&hatethreatening, value, "bool");


    }

    const char *harassmentKey = "harassment";

    if(object.has_key(harassmentKey))
    {
        bourne::json value = object[harassmentKey];



        jsonToValue(&harassment, value, "bool");


    }

    const char *harassmentthreateningKey = "harassment/threatening";

    if(object.has_key(harassmentthreateningKey))
    {
        bourne::json value = object[harassmentthreateningKey];



        jsonToValue(&harassmentthreatening, value, "bool");


    }

    const char *illicitKey = "illicit";

    if(object.has_key(illicitKey))
    {
        bourne::json value = object[illicitKey];



        jsonToValue(&illicit, value, "bool");


    }

    const char *illicitviolentKey = "illicit/violent";

    if(object.has_key(illicitviolentKey))
    {
        bourne::json value = object[illicitviolentKey];



        jsonToValue(&illicitviolent, value, "bool");


    }

    const char *selfharmKey = "self-harm";

    if(object.has_key(selfharmKey))
    {
        bourne::json value = object[selfharmKey];



        jsonToValue(&selfharm, value, "bool");


    }

    const char *selfharmintentKey = "self-harm/intent";

    if(object.has_key(selfharmintentKey))
    {
        bourne::json value = object[selfharmintentKey];



        jsonToValue(&selfharmintent, value, "bool");


    }

    const char *selfharminstructionsKey = "self-harm/instructions";

    if(object.has_key(selfharminstructionsKey))
    {
        bourne::json value = object[selfharminstructionsKey];



        jsonToValue(&selfharminstructions, value, "bool");


    }

    const char *sexualKey = "sexual";

    if(object.has_key(sexualKey))
    {
        bourne::json value = object[sexualKey];



        jsonToValue(&sexual, value, "bool");


    }

    const char *sexualminorsKey = "sexual/minors";

    if(object.has_key(sexualminorsKey))
    {
        bourne::json value = object[sexualminorsKey];



        jsonToValue(&sexualminors, value, "bool");


    }

    const char *violenceKey = "violence";

    if(object.has_key(violenceKey))
    {
        bourne::json value = object[violenceKey];



        jsonToValue(&violence, value, "bool");


    }

    const char *violencegraphicKey = "violence/graphic";

    if(object.has_key(violencegraphicKey))
    {
        bourne::json value = object[violencegraphicKey];



        jsonToValue(&violencegraphic, value, "bool");


    }


}

bourne::json
CreateModerationResponse_results_inner_categories::toJson()
{
    bourne::json object = bourne::json::object();





    object["hate"] = isHate();






    object["hatethreatening"] = isHatethreatening();






    object["harassment"] = isHarassment();






    object["harassmentthreatening"] = isHarassmentthreatening();






    object["illicit"] = isIllicit();






    object["illicitviolent"] = isIllicitviolent();






    object["selfharm"] = isSelfharm();






    object["selfharmintent"] = isSelfharmintent();






    object["selfharminstructions"] = isSelfharminstructions();






    object["sexual"] = isSexual();






    object["sexualminors"] = isSexualminors();






    object["violence"] = isViolence();






    object["violencegraphic"] = isViolencegraphic();



    return object;

}

bool
CreateModerationResponse_results_inner_categories::isHate()
{
	return hate;
}

void
CreateModerationResponse_results_inner_categories::setHate(bool  hate)
{
	this->hate = hate;
}

bool
CreateModerationResponse_results_inner_categories::isHatethreatening()
{
	return hatethreatening;
}

void
CreateModerationResponse_results_inner_categories::setHatethreatening(bool  hatethreatening)
{
	this->hatethreatening = hatethreatening;
}

bool
CreateModerationResponse_results_inner_categories::isHarassment()
{
	return harassment;
}

void
CreateModerationResponse_results_inner_categories::setHarassment(bool  harassment)
{
	this->harassment = harassment;
}

bool
CreateModerationResponse_results_inner_categories::isHarassmentthreatening()
{
	return harassmentthreatening;
}

void
CreateModerationResponse_results_inner_categories::setHarassmentthreatening(bool  harassmentthreatening)
{
	this->harassmentthreatening = harassmentthreatening;
}

bool
CreateModerationResponse_results_inner_categories::isIllicit()
{
	return illicit;
}

void
CreateModerationResponse_results_inner_categories::setIllicit(bool  illicit)
{
	this->illicit = illicit;
}

bool
CreateModerationResponse_results_inner_categories::isIllicitviolent()
{
	return illicitviolent;
}

void
CreateModerationResponse_results_inner_categories::setIllicitviolent(bool  illicitviolent)
{
	this->illicitviolent = illicitviolent;
}

bool
CreateModerationResponse_results_inner_categories::isSelfharm()
{
	return selfharm;
}

void
CreateModerationResponse_results_inner_categories::setSelfharm(bool  selfharm)
{
	this->selfharm = selfharm;
}

bool
CreateModerationResponse_results_inner_categories::isSelfharmintent()
{
	return selfharmintent;
}

void
CreateModerationResponse_results_inner_categories::setSelfharmintent(bool  selfharmintent)
{
	this->selfharmintent = selfharmintent;
}

bool
CreateModerationResponse_results_inner_categories::isSelfharminstructions()
{
	return selfharminstructions;
}

void
CreateModerationResponse_results_inner_categories::setSelfharminstructions(bool  selfharminstructions)
{
	this->selfharminstructions = selfharminstructions;
}

bool
CreateModerationResponse_results_inner_categories::isSexual()
{
	return sexual;
}

void
CreateModerationResponse_results_inner_categories::setSexual(bool  sexual)
{
	this->sexual = sexual;
}

bool
CreateModerationResponse_results_inner_categories::isSexualminors()
{
	return sexualminors;
}

void
CreateModerationResponse_results_inner_categories::setSexualminors(bool  sexualminors)
{
	this->sexualminors = sexualminors;
}

bool
CreateModerationResponse_results_inner_categories::isViolence()
{
	return violence;
}

void
CreateModerationResponse_results_inner_categories::setViolence(bool  violence)
{
	this->violence = violence;
}

bool
CreateModerationResponse_results_inner_categories::isViolencegraphic()
{
	return violencegraphic;
}

void
CreateModerationResponse_results_inner_categories::setViolencegraphic(bool  violencegraphic)
{
	this->violencegraphic = violencegraphic;
}



