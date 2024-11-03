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



#include "CppRestOpenAPIClient/model/RunStepObject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



RunStepObject::RunStepObject()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_object = utility::conversions::to_string_t("");
    m_objectIsSet = false;
    m_Created_at = 0;
    m_Created_atIsSet = false;
    m_Assistant_id = utility::conversions::to_string_t("");
    m_Assistant_idIsSet = false;
    m_Thread_id = utility::conversions::to_string_t("");
    m_Thread_idIsSet = false;
    m_Run_id = utility::conversions::to_string_t("");
    m_Run_idIsSet = false;
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Status = utility::conversions::to_string_t("");
    m_StatusIsSet = false;
    m_Step_detailsIsSet = false;
    m_Last_errorIsSet = false;
    m_Expired_at = 0;
    m_Expired_atIsSet = false;
    m_Cancelled_at = 0;
    m_Cancelled_atIsSet = false;
    m_Failed_at = 0;
    m_Failed_atIsSet = false;
    m_Completed_at = 0;
    m_Completed_atIsSet = false;
    m_MetadataIsSet = false;
    m_UsageIsSet = false;
}

RunStepObject::~RunStepObject()
{
}

void RunStepObject::validate()
{
    // TODO: implement validation
}

web::json::value RunStepObject::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_objectIsSet)
    {
        val[utility::conversions::to_string_t(U("object"))] = ModelBase::toJson(m_object);
    }
    if(m_Created_atIsSet)
    {
        val[utility::conversions::to_string_t(U("created_at"))] = ModelBase::toJson(m_Created_at);
    }
    if(m_Assistant_idIsSet)
    {
        val[utility::conversions::to_string_t(U("assistant_id"))] = ModelBase::toJson(m_Assistant_id);
    }
    if(m_Thread_idIsSet)
    {
        val[utility::conversions::to_string_t(U("thread_id"))] = ModelBase::toJson(m_Thread_id);
    }
    if(m_Run_idIsSet)
    {
        val[utility::conversions::to_string_t(U("run_id"))] = ModelBase::toJson(m_Run_id);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t(U("status"))] = ModelBase::toJson(m_Status);
    }
    if(m_Step_detailsIsSet)
    {
        val[utility::conversions::to_string_t(U("step_details"))] = ModelBase::toJson(m_Step_details);
    }
    if(m_Last_errorIsSet)
    {
        val[utility::conversions::to_string_t(U("last_error"))] = ModelBase::toJson(m_Last_error);
    }
    if(m_Expired_atIsSet)
    {
        val[utility::conversions::to_string_t(U("expired_at"))] = ModelBase::toJson(m_Expired_at);
    }
    if(m_Cancelled_atIsSet)
    {
        val[utility::conversions::to_string_t(U("cancelled_at"))] = ModelBase::toJson(m_Cancelled_at);
    }
    if(m_Failed_atIsSet)
    {
        val[utility::conversions::to_string_t(U("failed_at"))] = ModelBase::toJson(m_Failed_at);
    }
    if(m_Completed_atIsSet)
    {
        val[utility::conversions::to_string_t(U("completed_at"))] = ModelBase::toJson(m_Completed_at);
    }
    if(m_MetadataIsSet)
    {
        val[utility::conversions::to_string_t(U("metadata"))] = ModelBase::toJson(m_Metadata);
    }
    if(m_UsageIsSet)
    {
        val[utility::conversions::to_string_t(U("usage"))] = ModelBase::toJson(m_Usage);
    }

    return val;
}

bool RunStepObject::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("object"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("object")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setObject;
            ok &= ModelBase::fromJson(fieldValue, refVal_setObject);
            setObject(refVal_setObject);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("created_at"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("created_at")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setCreatedAt;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreatedAt);
            setCreatedAt(refVal_setCreatedAt);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("assistant_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("assistant_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAssistantId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAssistantId);
            setAssistantId(refVal_setAssistantId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("thread_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("thread_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setThreadId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setThreadId);
            setThreadId(refVal_setThreadId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("run_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("run_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setRunId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRunId);
            setRunId(refVal_setRunId);
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
    if(val.has_field(utility::conversions::to_string_t(U("status"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("status")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setStatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStatus);
            setStatus(refVal_setStatus);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("step_details"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("step_details")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<RunStepObject_step_details> refVal_setStepDetails;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStepDetails);
            setStepDetails(refVal_setStepDetails);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("last_error"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("last_error")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<RunStepObject_last_error> refVal_setLastError;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLastError);
            setLastError(refVal_setLastError);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("expired_at"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("expired_at")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setExpiredAt;
            ok &= ModelBase::fromJson(fieldValue, refVal_setExpiredAt);
            setExpiredAt(refVal_setExpiredAt);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("cancelled_at"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("cancelled_at")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setCancelledAt;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCancelledAt);
            setCancelledAt(refVal_setCancelledAt);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("failed_at"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("failed_at")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setFailedAt;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFailedAt);
            setFailedAt(refVal_setFailedAt);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("completed_at"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("completed_at")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setCompletedAt;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCompletedAt);
            setCompletedAt(refVal_setCompletedAt);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("metadata"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("metadata")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> refVal_setMetadata;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMetadata);
            setMetadata(refVal_setMetadata);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("usage"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("usage")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<RunStepCompletionUsage> refVal_setUsage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUsage);
            setUsage(refVal_setUsage);
        }
    }
    return ok;
}

void RunStepObject::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_objectIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("object")), m_object));
    }
    if(m_Created_atIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("created_at")), m_Created_at));
    }
    if(m_Assistant_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("assistant_id")), m_Assistant_id));
    }
    if(m_Thread_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("thread_id")), m_Thread_id));
    }
    if(m_Run_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("run_id")), m_Run_id));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("status")), m_Status));
    }
    if(m_Step_detailsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("step_details")), m_Step_details));
    }
    if(m_Last_errorIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("last_error")), m_Last_error));
    }
    if(m_Expired_atIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("expired_at")), m_Expired_at));
    }
    if(m_Cancelled_atIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("cancelled_at")), m_Cancelled_at));
    }
    if(m_Failed_atIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("failed_at")), m_Failed_at));
    }
    if(m_Completed_atIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("completed_at")), m_Completed_at));
    }
    if(m_MetadataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("metadata")), m_Metadata));
    }
    if(m_UsageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("usage")), m_Usage));
    }
}

bool RunStepObject::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("object"))))
    {
        utility::string_t refVal_setObject;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("object"))), refVal_setObject );
        setObject(refVal_setObject);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("created_at"))))
    {
        int32_t refVal_setCreatedAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("created_at"))), refVal_setCreatedAt );
        setCreatedAt(refVal_setCreatedAt);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("assistant_id"))))
    {
        utility::string_t refVal_setAssistantId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("assistant_id"))), refVal_setAssistantId );
        setAssistantId(refVal_setAssistantId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("thread_id"))))
    {
        utility::string_t refVal_setThreadId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("thread_id"))), refVal_setThreadId );
        setThreadId(refVal_setThreadId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("run_id"))))
    {
        utility::string_t refVal_setRunId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("run_id"))), refVal_setRunId );
        setRunId(refVal_setRunId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("status"))))
    {
        utility::string_t refVal_setStatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("status"))), refVal_setStatus );
        setStatus(refVal_setStatus);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("step_details"))))
    {
        std::shared_ptr<RunStepObject_step_details> refVal_setStepDetails;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("step_details"))), refVal_setStepDetails );
        setStepDetails(refVal_setStepDetails);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("last_error"))))
    {
        std::shared_ptr<RunStepObject_last_error> refVal_setLastError;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("last_error"))), refVal_setLastError );
        setLastError(refVal_setLastError);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("expired_at"))))
    {
        int32_t refVal_setExpiredAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("expired_at"))), refVal_setExpiredAt );
        setExpiredAt(refVal_setExpiredAt);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("cancelled_at"))))
    {
        int32_t refVal_setCancelledAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("cancelled_at"))), refVal_setCancelledAt );
        setCancelledAt(refVal_setCancelledAt);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("failed_at"))))
    {
        int32_t refVal_setFailedAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("failed_at"))), refVal_setFailedAt );
        setFailedAt(refVal_setFailedAt);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("completed_at"))))
    {
        int32_t refVal_setCompletedAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("completed_at"))), refVal_setCompletedAt );
        setCompletedAt(refVal_setCompletedAt);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("metadata"))))
    {
        std::shared_ptr<Object> refVal_setMetadata;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("metadata"))), refVal_setMetadata );
        setMetadata(refVal_setMetadata);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("usage"))))
    {
        std::shared_ptr<RunStepCompletionUsage> refVal_setUsage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("usage"))), refVal_setUsage );
        setUsage(refVal_setUsage);
    }
    return ok;
}

utility::string_t RunStepObject::getId() const
{
    return m_Id;
}

void RunStepObject::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool RunStepObject::idIsSet() const
{
    return m_IdIsSet;
}

void RunStepObject::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t RunStepObject::getObject() const
{
    return m_object;
}

void RunStepObject::setObject(const utility::string_t& value)
{
    m_object = value;
    m_objectIsSet = true;
}

bool RunStepObject::objectIsSet() const
{
    return m_objectIsSet;
}

void RunStepObject::unsetobject()
{
    m_objectIsSet = false;
}
int32_t RunStepObject::getCreatedAt() const
{
    return m_Created_at;
}

void RunStepObject::setCreatedAt(int32_t value)
{
    m_Created_at = value;
    m_Created_atIsSet = true;
}

bool RunStepObject::createdAtIsSet() const
{
    return m_Created_atIsSet;
}

void RunStepObject::unsetCreated_at()
{
    m_Created_atIsSet = false;
}
utility::string_t RunStepObject::getAssistantId() const
{
    return m_Assistant_id;
}

void RunStepObject::setAssistantId(const utility::string_t& value)
{
    m_Assistant_id = value;
    m_Assistant_idIsSet = true;
}

bool RunStepObject::assistantIdIsSet() const
{
    return m_Assistant_idIsSet;
}

void RunStepObject::unsetAssistant_id()
{
    m_Assistant_idIsSet = false;
}
utility::string_t RunStepObject::getThreadId() const
{
    return m_Thread_id;
}

void RunStepObject::setThreadId(const utility::string_t& value)
{
    m_Thread_id = value;
    m_Thread_idIsSet = true;
}

bool RunStepObject::threadIdIsSet() const
{
    return m_Thread_idIsSet;
}

void RunStepObject::unsetThread_id()
{
    m_Thread_idIsSet = false;
}
utility::string_t RunStepObject::getRunId() const
{
    return m_Run_id;
}

void RunStepObject::setRunId(const utility::string_t& value)
{
    m_Run_id = value;
    m_Run_idIsSet = true;
}

bool RunStepObject::runIdIsSet() const
{
    return m_Run_idIsSet;
}

void RunStepObject::unsetRun_id()
{
    m_Run_idIsSet = false;
}
utility::string_t RunStepObject::getType() const
{
    return m_Type;
}

void RunStepObject::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool RunStepObject::typeIsSet() const
{
    return m_TypeIsSet;
}

void RunStepObject::unsetType()
{
    m_TypeIsSet = false;
}
utility::string_t RunStepObject::getStatus() const
{
    return m_Status;
}

void RunStepObject::setStatus(const utility::string_t& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool RunStepObject::statusIsSet() const
{
    return m_StatusIsSet;
}

void RunStepObject::unsetStatus()
{
    m_StatusIsSet = false;
}
std::shared_ptr<RunStepObject_step_details> RunStepObject::getStepDetails() const
{
    return m_Step_details;
}

void RunStepObject::setStepDetails(const std::shared_ptr<RunStepObject_step_details>& value)
{
    m_Step_details = value;
    m_Step_detailsIsSet = true;
}

bool RunStepObject::stepDetailsIsSet() const
{
    return m_Step_detailsIsSet;
}

void RunStepObject::unsetStep_details()
{
    m_Step_detailsIsSet = false;
}
std::shared_ptr<RunStepObject_last_error> RunStepObject::getLastError() const
{
    return m_Last_error;
}

void RunStepObject::setLastError(const std::shared_ptr<RunStepObject_last_error>& value)
{
    m_Last_error = value;
    m_Last_errorIsSet = true;
}

bool RunStepObject::lastErrorIsSet() const
{
    return m_Last_errorIsSet;
}

void RunStepObject::unsetLast_error()
{
    m_Last_errorIsSet = false;
}
int32_t RunStepObject::getExpiredAt() const
{
    return m_Expired_at;
}

void RunStepObject::setExpiredAt(int32_t value)
{
    m_Expired_at = value;
    m_Expired_atIsSet = true;
}

bool RunStepObject::expiredAtIsSet() const
{
    return m_Expired_atIsSet;
}

void RunStepObject::unsetExpired_at()
{
    m_Expired_atIsSet = false;
}
int32_t RunStepObject::getCancelledAt() const
{
    return m_Cancelled_at;
}

void RunStepObject::setCancelledAt(int32_t value)
{
    m_Cancelled_at = value;
    m_Cancelled_atIsSet = true;
}

bool RunStepObject::cancelledAtIsSet() const
{
    return m_Cancelled_atIsSet;
}

void RunStepObject::unsetCancelled_at()
{
    m_Cancelled_atIsSet = false;
}
int32_t RunStepObject::getFailedAt() const
{
    return m_Failed_at;
}

void RunStepObject::setFailedAt(int32_t value)
{
    m_Failed_at = value;
    m_Failed_atIsSet = true;
}

bool RunStepObject::failedAtIsSet() const
{
    return m_Failed_atIsSet;
}

void RunStepObject::unsetFailed_at()
{
    m_Failed_atIsSet = false;
}
int32_t RunStepObject::getCompletedAt() const
{
    return m_Completed_at;
}

void RunStepObject::setCompletedAt(int32_t value)
{
    m_Completed_at = value;
    m_Completed_atIsSet = true;
}

bool RunStepObject::completedAtIsSet() const
{
    return m_Completed_atIsSet;
}

void RunStepObject::unsetCompleted_at()
{
    m_Completed_atIsSet = false;
}
std::shared_ptr<Object> RunStepObject::getMetadata() const
{
    return m_Metadata;
}

void RunStepObject::setMetadata(const std::shared_ptr<Object>& value)
{
    m_Metadata = value;
    m_MetadataIsSet = true;
}

bool RunStepObject::metadataIsSet() const
{
    return m_MetadataIsSet;
}

void RunStepObject::unsetMetadata()
{
    m_MetadataIsSet = false;
}
std::shared_ptr<RunStepCompletionUsage> RunStepObject::getUsage() const
{
    return m_Usage;
}

void RunStepObject::setUsage(const std::shared_ptr<RunStepCompletionUsage>& value)
{
    m_Usage = value;
    m_UsageIsSet = true;
}

bool RunStepObject::usageIsSet() const
{
    return m_UsageIsSet;
}

void RunStepObject::unsetUsage()
{
    m_UsageIsSet = false;
}
}
}
}
}


