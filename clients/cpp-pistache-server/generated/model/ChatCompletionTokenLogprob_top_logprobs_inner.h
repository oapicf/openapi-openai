/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * ChatCompletionTokenLogprob_top_logprobs_inner.h
 *
 * 
 */

#ifndef ChatCompletionTokenLogprob_top_logprobs_inner_H_
#define ChatCompletionTokenLogprob_top_logprobs_inner_H_


#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ChatCompletionTokenLogprob_top_logprobs_inner
{
public:
    ChatCompletionTokenLogprob_top_logprobs_inner();
    virtual ~ChatCompletionTokenLogprob_top_logprobs_inner() = default;


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

    bool operator==(const ChatCompletionTokenLogprob_top_logprobs_inner& rhs) const;
    bool operator!=(const ChatCompletionTokenLogprob_top_logprobs_inner& rhs) const;

    /////////////////////////////////////////////
    /// ChatCompletionTokenLogprob_top_logprobs_inner members

    /// <summary>
    /// The token.
    /// </summary>
    std::string getToken() const;
    void setToken(std::string const& value);
    /// <summary>
    /// The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.
    /// </summary>
    double getLogprob() const;
    void setLogprob(double const value);
    /// <summary>
    /// A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.
    /// </summary>
    std::vector<int32_t> getBytes() const;
    void setBytes(std::vector<int32_t> const value);

    friend  void to_json(nlohmann::json& j, const ChatCompletionTokenLogprob_top_logprobs_inner& o);
    friend  void from_json(const nlohmann::json& j, ChatCompletionTokenLogprob_top_logprobs_inner& o);
protected:
    std::string m_Token;

    double m_Logprob;

    std::vector<int32_t> m_Bytes;

    
};

} // namespace org::openapitools::server::model

#endif /* ChatCompletionTokenLogprob_top_logprobs_inner_H_ */
