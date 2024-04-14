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
 * Embedding.h
 *
 * Represents an embedding vector returned by embedding endpoint. 
 */

#ifndef Embedding_H_
#define Embedding_H_


#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Represents an embedding vector returned by embedding endpoint. 
/// </summary>
class  Embedding
{
public:
    Embedding();
    virtual ~Embedding() = default;


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

    bool operator==(const Embedding& rhs) const;
    bool operator!=(const Embedding& rhs) const;

    /////////////////////////////////////////////
    /// Embedding members

    /// <summary>
    /// The index of the embedding in the list of embeddings.
    /// </summary>
    int32_t getIndex() const;
    void setIndex(int32_t const value);
    /// <summary>
    /// The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
    /// </summary>
    std::vector<double> getEmbedding() const;
    void setEmbedding(std::vector<double> const value);
    /// <summary>
    /// The object type, which is always \&quot;embedding\&quot;.
    /// </summary>
    std::string getObject() const;
    void setObject(std::string const& value);

    friend  void to_json(nlohmann::json& j, const Embedding& o);
    friend  void from_json(const nlohmann::json& j, Embedding& o);
protected:
    int32_t m_Index;

    std::vector<double> m_Embedding;

    std::string m_object;

    
};

} // namespace org::openapitools::server::model

#endif /* Embedding_H_ */
