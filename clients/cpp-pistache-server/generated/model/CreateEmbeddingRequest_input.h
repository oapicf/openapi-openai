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
 * CreateEmbeddingRequest_input.h
 *
 * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for &#x60;text-embedding-ada-002&#x60;), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
 */

#ifndef CreateEmbeddingRequest_input_H_
#define CreateEmbeddingRequest_input_H_


#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for &#x60;text-embedding-ada-002&#x60;), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
/// </summary>
class  CreateEmbeddingRequest_input
{
public:
    CreateEmbeddingRequest_input();
    virtual ~CreateEmbeddingRequest_input() = default;


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

    bool operator==(const CreateEmbeddingRequest_input& rhs) const;
    bool operator!=(const CreateEmbeddingRequest_input& rhs) const;

    /////////////////////////////////////////////
    /// CreateEmbeddingRequest_input members


    friend  void to_json(nlohmann::json& j, const CreateEmbeddingRequest_input& o);
    friend  void from_json(const nlohmann::json& j, CreateEmbeddingRequest_input& o);
protected:
    
};

} // namespace org::openapitools::server::model

#endif /* CreateEmbeddingRequest_input_H_ */
