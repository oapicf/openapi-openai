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



#include "CppRestOpenAPIClient/model/RunStepDetailsToolCallsObject_tool_calls_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



RunStepDetailsToolCallsObject_tool_calls_inner::RunStepDetailsToolCallsObject_tool_calls_inner()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Code_interpreterIsSet = false;
    m_RetrievalIsSet = false;
    m_FunctionIsSet = false;
}

RunStepDetailsToolCallsObject_tool_calls_inner::~RunStepDetailsToolCallsObject_tool_calls_inner()
{
}

void RunStepDetailsToolCallsObject_tool_calls_inner::validate()
{
    // TODO: implement validation
}

web::json::value RunStepDetailsToolCallsObject_tool_calls_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_Code_interpreterIsSet)
    {
        val[utility::conversions::to_string_t(U("code_interpreter"))] = ModelBase::toJson(m_Code_interpreter);
    }
    if(m_RetrievalIsSet)
    {
        val[utility::conversions::to_string_t(U("retrieval"))] = ModelBase::toJson(m_Retrieval);
    }
    if(m_FunctionIsSet)
    {
        val[utility::conversions::to_string_t(U("function"))] = ModelBase::toJson(m_Function);
    }

    return val;
}

bool RunStepDetailsToolCallsObject_tool_calls_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
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
    if(val.has_field(utility::conversions::to_string_t(U("code_interpreter"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("code_interpreter")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<RunStepDetailsToolCallsCodeObject_code_interpreter> refVal_setCodeInterpreter;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCodeInterpreter);
            setCodeInterpreter(refVal_setCodeInterpreter);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("retrieval"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("retrieval")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> refVal_setRetrieval;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRetrieval);
            setRetrieval(refVal_setRetrieval);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("function"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("function")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<RunStepDetailsToolCallsFunctionObject_function> refVal_setFunction;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFunction);
            setFunction(refVal_setFunction);
        }
    }
    return ok;
}

void RunStepDetailsToolCallsObject_tool_calls_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_Code_interpreterIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("code_interpreter")), m_Code_interpreter));
    }
    if(m_RetrievalIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("retrieval")), m_Retrieval));
    }
    if(m_FunctionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("function")), m_Function));
    }
}

bool RunStepDetailsToolCallsObject_tool_calls_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("code_interpreter"))))
    {
        std::shared_ptr<RunStepDetailsToolCallsCodeObject_code_interpreter> refVal_setCodeInterpreter;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("code_interpreter"))), refVal_setCodeInterpreter );
        setCodeInterpreter(refVal_setCodeInterpreter);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("retrieval"))))
    {
        std::shared_ptr<Object> refVal_setRetrieval;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("retrieval"))), refVal_setRetrieval );
        setRetrieval(refVal_setRetrieval);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("function"))))
    {
        std::shared_ptr<RunStepDetailsToolCallsFunctionObject_function> refVal_setFunction;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("function"))), refVal_setFunction );
        setFunction(refVal_setFunction);
    }
    return ok;
}

utility::string_t RunStepDetailsToolCallsObject_tool_calls_inner::getId() const
{
    return m_Id;
}

void RunStepDetailsToolCallsObject_tool_calls_inner::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool RunStepDetailsToolCallsObject_tool_calls_inner::idIsSet() const
{
    return m_IdIsSet;
}

void RunStepDetailsToolCallsObject_tool_calls_inner::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t RunStepDetailsToolCallsObject_tool_calls_inner::getType() const
{
    return m_Type;
}

void RunStepDetailsToolCallsObject_tool_calls_inner::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool RunStepDetailsToolCallsObject_tool_calls_inner::typeIsSet() const
{
    return m_TypeIsSet;
}

void RunStepDetailsToolCallsObject_tool_calls_inner::unsetType()
{
    m_TypeIsSet = false;
}
std::shared_ptr<RunStepDetailsToolCallsCodeObject_code_interpreter> RunStepDetailsToolCallsObject_tool_calls_inner::getCodeInterpreter() const
{
    return m_Code_interpreter;
}

void RunStepDetailsToolCallsObject_tool_calls_inner::setCodeInterpreter(const std::shared_ptr<RunStepDetailsToolCallsCodeObject_code_interpreter>& value)
{
    m_Code_interpreter = value;
    m_Code_interpreterIsSet = true;
}

bool RunStepDetailsToolCallsObject_tool_calls_inner::codeInterpreterIsSet() const
{
    return m_Code_interpreterIsSet;
}

void RunStepDetailsToolCallsObject_tool_calls_inner::unsetCode_interpreter()
{
    m_Code_interpreterIsSet = false;
}
std::shared_ptr<Object> RunStepDetailsToolCallsObject_tool_calls_inner::getRetrieval() const
{
    return m_Retrieval;
}

void RunStepDetailsToolCallsObject_tool_calls_inner::setRetrieval(const std::shared_ptr<Object>& value)
{
    m_Retrieval = value;
    m_RetrievalIsSet = true;
}

bool RunStepDetailsToolCallsObject_tool_calls_inner::retrievalIsSet() const
{
    return m_RetrievalIsSet;
}

void RunStepDetailsToolCallsObject_tool_calls_inner::unsetRetrieval()
{
    m_RetrievalIsSet = false;
}
std::shared_ptr<RunStepDetailsToolCallsFunctionObject_function> RunStepDetailsToolCallsObject_tool_calls_inner::getFunction() const
{
    return m_Function;
}

void RunStepDetailsToolCallsObject_tool_calls_inner::setFunction(const std::shared_ptr<RunStepDetailsToolCallsFunctionObject_function>& value)
{
    m_Function = value;
    m_FunctionIsSet = true;
}

bool RunStepDetailsToolCallsObject_tool_calls_inner::functionIsSet() const
{
    return m_FunctionIsSet;
}

void RunStepDetailsToolCallsObject_tool_calls_inner::unsetFunction()
{
    m_FunctionIsSet = false;
}
}
}
}
}


