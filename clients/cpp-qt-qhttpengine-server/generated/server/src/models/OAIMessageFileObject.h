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
 * OAIMessageFileObject.h
 *
 * A list of files attached to a &#x60;message&#x60;.
 */

#ifndef OAIMessageFileObject_H
#define OAIMessageFileObject_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIMessageFileObject : public OAIObject {
public:
    OAIMessageFileObject();
    OAIMessageFileObject(QString json);
    ~OAIMessageFileObject() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getObject() const;
    void setObject(const QString &object);
    bool is_object_Set() const;
    bool is_object_Valid() const;

    qint32 getCreatedAt() const;
    void setCreatedAt(const qint32 &created_at);
    bool is_created_at_Set() const;
    bool is_created_at_Valid() const;

    QString getMessageId() const;
    void setMessageId(const QString &message_id);
    bool is_message_id_Set() const;
    bool is_message_id_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString object;
    bool m_object_isSet;
    bool m_object_isValid;

    qint32 created_at;
    bool m_created_at_isSet;
    bool m_created_at_isValid;

    QString message_id;
    bool m_message_id_isSet;
    bool m_message_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIMessageFileObject)

#endif // OAIMessageFileObject_H
