/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/MessageDeltaContentTextObject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



MessageDeltaContentTextObject::MessageDeltaContentTextObject()
{
    m_Index = 0;
    m_IndexIsSet = false;
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_TextIsSet = false;
}

MessageDeltaContentTextObject::~MessageDeltaContentTextObject()
{
}

void MessageDeltaContentTextObject::validate()
{
    // TODO: implement validation
}

web::json::value MessageDeltaContentTextObject::toJson() const
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
    if(m_TextIsSet)
    {
        val[utility::conversions::to_string_t(U("text"))] = ModelBase::toJson(m_Text);
    }

    return val;
}

bool MessageDeltaContentTextObject::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("text"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("text")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<MessageDeltaContentTextObject_text> refVal_setText;
            ok &= ModelBase::fromJson(fieldValue, refVal_setText);
            setText(refVal_setText);
        }
    }
    return ok;
}

void MessageDeltaContentTextObject::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_TextIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("text")), m_Text));
    }
}

bool MessageDeltaContentTextObject::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("text"))))
    {
        std::shared_ptr<MessageDeltaContentTextObject_text> refVal_setText;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("text"))), refVal_setText );
        setText(refVal_setText);
    }
    return ok;
}

int32_t MessageDeltaContentTextObject::getIndex() const
{
    return m_Index;
}

void MessageDeltaContentTextObject::setIndex(int32_t value)
{
    m_Index = value;
    m_IndexIsSet = true;
}

bool MessageDeltaContentTextObject::indexIsSet() const
{
    return m_IndexIsSet;
}

void MessageDeltaContentTextObject::unsetIndex()
{
    m_IndexIsSet = false;
}
utility::string_t MessageDeltaContentTextObject::getType() const
{
    return m_Type;
}

void MessageDeltaContentTextObject::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool MessageDeltaContentTextObject::typeIsSet() const
{
    return m_TypeIsSet;
}

void MessageDeltaContentTextObject::unsetType()
{
    m_TypeIsSet = false;
}
std::shared_ptr<MessageDeltaContentTextObject_text> MessageDeltaContentTextObject::getText() const
{
    return m_Text;
}

void MessageDeltaContentTextObject::setText(const std::shared_ptr<MessageDeltaContentTextObject_text>& value)
{
    m_Text = value;
    m_TextIsSet = true;
}

bool MessageDeltaContentTextObject::textIsSet() const
{
    return m_TextIsSet;
}

void MessageDeltaContentTextObject::unsetText()
{
    m_TextIsSet = false;
}
}
}
}
}


