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
 * OAICreateEmbeddingRequest_input.h
 *
 * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for &#x60;text-embedding-ada-002&#x60;), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
 */

#ifndef OAICreateEmbeddingRequest_input_H
#define OAICreateEmbeddingRequest_input_H

#include <QJsonObject>

#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateEmbeddingRequest_input : public OAIObject {
public:
    OAICreateEmbeddingRequest_input();
    OAICreateEmbeddingRequest_input(QString json);
    ~OAICreateEmbeddingRequest_input() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateEmbeddingRequest_input)

#endif // OAICreateEmbeddingRequest_input_H
