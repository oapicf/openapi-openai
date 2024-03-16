/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * CreateEditResponse_choices_inner.h
 *
 * 
 */

#ifndef CreateEditResponse_choices_inner_H_
#define CreateEditResponse_choices_inner_H_


#include "CreateCompletionResponse_choices_inner_logprobs.h"
#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CreateEditResponse_choices_inner
{
public:
    CreateEditResponse_choices_inner();
    virtual ~CreateEditResponse_choices_inner() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const CreateEditResponse_choices_inner& rhs) const;
    bool operator!=(const CreateEditResponse_choices_inner& rhs) const;

    /////////////////////////////////////////////
    /// CreateEditResponse_choices_inner members

    /// <summary>
    /// 
    /// </summary>
    std::string getText() const;
    void setText(std::string const& value);
    bool textIsSet() const;
    void unsetText();
    /// <summary>
    /// 
    /// </summary>
    int32_t getIndex() const;
    void setIndex(int32_t const value);
    bool indexIsSet() const;
    void unsetIndex();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CreateCompletionResponse_choices_inner_logprobs getLogprobs() const;
    void setLogprobs(org::openapitools::server::model::CreateCompletionResponse_choices_inner_logprobs const& value);
    bool logprobsIsSet() const;
    void unsetLogprobs();
    /// <summary>
    /// 
    /// </summary>
    std::string getFinishReason() const;
    void setFinishReason(std::string const& value);
    bool finishReasonIsSet() const;
    void unsetFinish_reason();

    friend  void to_json(nlohmann::json& j, const CreateEditResponse_choices_inner& o);
    friend  void from_json(const nlohmann::json& j, CreateEditResponse_choices_inner& o);
protected:
    std::string m_Text;
    bool m_TextIsSet;
    int32_t m_Index;
    bool m_IndexIsSet;
    org::openapitools::server::model::CreateCompletionResponse_choices_inner_logprobs m_Logprobs;
    bool m_LogprobsIsSet;
    std::string m_Finish_reason;
    bool m_Finish_reasonIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CreateEditResponse_choices_inner_H_ */