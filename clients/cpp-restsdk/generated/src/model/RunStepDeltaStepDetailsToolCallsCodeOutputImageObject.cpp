/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::RunStepDeltaStepDetailsToolCallsCodeOutputImageObject()
{
    m_Index = 0;
    m_IndexIsSet = false;
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_ImageIsSet = false;
}

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::~RunStepDeltaStepDetailsToolCallsCodeOutputImageObject()
{
}

void RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::validate()
{
    // TODO: implement validation
}

web::json::value RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IndexIsSet)
    {
        val[utility::conversions::to_string_t(U("index"))] = ModelBase::toJson(m_Index);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_ImageIsSet)
    {
        val[utility::conversions::to_string_t(U("image"))] = ModelBase::toJson(m_Image);
    }

    return val;
}

bool RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("index"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("index")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIndex);
            setIndex(refVal_setIndex);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("image"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("image")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image> refVal_setImage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setImage);
            setImage(refVal_setImage);
        }
    }
    return ok;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IndexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("index")), m_Index));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_ImageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("image")), m_Image));
    }
}

bool RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("index"))))
    {
        int32_t refVal_setIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("index"))), refVal_setIndex );
        setIndex(refVal_setIndex);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("image"))))
    {
        std::shared_ptr<RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image> refVal_setImage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("image"))), refVal_setImage );
        setImage(refVal_setImage);
    }
    return ok;
}

int32_t RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::getIndex() const
{
    return m_Index;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::setIndex(int32_t value)
{
    m_Index = value;
    m_IndexIsSet = true;
}

bool RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::indexIsSet() const
{
    return m_IndexIsSet;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::unsetIndex()
{
    m_IndexIsSet = false;
}
utility::string_t RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::getType() const
{
    return m_Type;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::typeIsSet() const
{
    return m_TypeIsSet;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::unsetType()
{
    m_TypeIsSet = false;
}
std::shared_ptr<RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image> RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::getImage() const
{
    return m_Image;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::setImage(const std::shared_ptr<RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image>& value)
{
    m_Image = value;
    m_ImageIsSet = true;
}

bool RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::imageIsSet() const
{
    return m_ImageIsSet;
}

void RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::unsetImage()
{
    m_ImageIsSet = false;
}
}
}
}
}

