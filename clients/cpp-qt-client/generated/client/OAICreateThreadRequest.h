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
 * OAICreateThreadRequest.h
 *
 * 
 */

#ifndef OAICreateThreadRequest_H
#define OAICreateThreadRequest_H

#include <QJsonObject>

#include "OAICreateMessageRequest.h"
#include "OAIObject.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICreateMessageRequest;

class OAICreateThreadRequest : public OAIObject {
public:
    OAICreateThreadRequest();
    OAICreateThreadRequest(QString json);
    ~OAICreateThreadRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAICreateMessageRequest> getMessages() const;
    void setMessages(const QList<OAICreateMessageRequest> &messages);
    bool is_messages_Set() const;
    bool is_messages_Valid() const;

    OAIObject getMetadata() const;
    void setMetadata(const OAIObject &metadata);
    bool is_metadata_Set() const;
    bool is_metadata_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAICreateMessageRequest> m_messages;
    bool m_messages_isSet;
    bool m_messages_isValid;

    OAIObject m_metadata;
    bool m_metadata_isSet;
    bool m_metadata_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateThreadRequest)

#endif // OAICreateThreadRequest_H
