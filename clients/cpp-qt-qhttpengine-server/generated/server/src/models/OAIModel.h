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
 * OAIModel.h
 *
 * Describes an OpenAI model offering that can be used with the API.
 */

#ifndef OAIModel_H
#define OAIModel_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIModel : public OAIObject {
public:
    OAIModel();
    OAIModel(QString json);
    ~OAIModel() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    qint32 getCreated() const;
    void setCreated(const qint32 &created);
    bool is_created_Set() const;
    bool is_created_Valid() const;

    QString getObject() const;
    void setObject(const QString &object);
    bool is_object_Set() const;
    bool is_object_Valid() const;

    QString getOwnedBy() const;
    void setOwnedBy(const QString &owned_by);
    bool is_owned_by_Set() const;
    bool is_owned_by_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    qint32 created;
    bool m_created_isSet;
    bool m_created_isValid;

    QString object;
    bool m_object_isSet;
    bool m_object_isValid;

    QString owned_by;
    bool m_owned_by_isSet;
    bool m_owned_by_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIModel)

#endif // OAIModel_H
