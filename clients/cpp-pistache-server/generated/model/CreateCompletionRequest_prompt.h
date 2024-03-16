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
 * CreateCompletionRequest_prompt.h
 *
 * The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that &lt;|endoftext|&gt; is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
 */

#ifndef CreateCompletionRequest_prompt_H_
#define CreateCompletionRequest_prompt_H_


#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that &lt;|endoftext|&gt; is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
/// </summary>
class  CreateCompletionRequest_prompt
{
public:
    CreateCompletionRequest_prompt();
    virtual ~CreateCompletionRequest_prompt() = default;


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

    bool operator==(const CreateCompletionRequest_prompt& rhs) const;
    bool operator!=(const CreateCompletionRequest_prompt& rhs) const;

    /////////////////////////////////////////////
    /// CreateCompletionRequest_prompt members


    friend  void to_json(nlohmann::json& j, const CreateCompletionRequest_prompt& o);
    friend  void from_json(const nlohmann::json& j, CreateCompletionRequest_prompt& o);
protected:
    
};

} // namespace org::openapitools::server::model

#endif /* CreateCompletionRequest_prompt_H_ */
