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
 * OAIDeleteAssistantResponse.h
 *
 * 
 */

#ifndef OAIDeleteAssistantResponse_H
#define OAIDeleteAssistantResponse_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIDeleteAssistantResponse : public OAIObject {
public:
    OAIDeleteAssistantResponse();
    OAIDeleteAssistantResponse(QString json);
    ~OAIDeleteAssistantResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    bool isDeleted() const;
    void setDeleted(const bool &deleted);
    bool is_deleted_Set() const;
    bool is_deleted_Valid() const;

    QString getObject() const;
    void setObject(const QString &object);
    bool is_object_Set() const;
    bool is_object_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    bool deleted;
    bool m_deleted_isSet;
    bool m_deleted_isValid;

    QString object;
    bool m_object_isSet;
    bool m_object_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIDeleteAssistantResponse)

#endif // OAIDeleteAssistantResponse_H